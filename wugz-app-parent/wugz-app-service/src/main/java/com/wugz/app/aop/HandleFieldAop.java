package com.wugz.app.aop;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.wugz.app.common.utils.Encryption;
import com.wugz.app.tool.rulz.ObjectIsNullUtil;

@Component  
public class HandleFieldAop {
	
	private static Logger logger = LoggerFactory.getLogger(HandleFieldAop.class);
	
	private static final String SECRET_KEY = "wugztest"; //秘钥
	
	private String HANDLE_FIELD_NAME = "instuCde"; 
	
    public Object parameterCheck(ProceedingJoinPoint joinPoint) throws Throwable{
		 
		Object target = joinPoint.getTarget();//返回被织入增强处理的目标对象       getThis：返回AOP框架为目标对象生成的代理对象
		Object[] args = joinPoint.getArgs(); //获取目标对象方法参数
		//遍历参数 修改带有idNo字段对象的值 （map list<domain> domain）
		for (Object _obj : args) {
			try{
				changValue(_obj);
			}catch (Exception e) {  //使用异常机制来验证 _obj中 是否有idNo 字段
				logger.error("修改目标方法参数字段值异常。目标类："
						+target.getClass()+"方法："+joinPoint.getSignature().getName()+"修改的值："+_obj,e);
			}
		}
        //执行方法，以新的参数（如果不带args就是用原先的参数；这里带不带都可以是，上面方法获取原先参数的引用做的修改）
        Object returnValue = joinPoint.proceed(args); 
        //若未设置，则不需要解密
        if(!ObjectIsNullUtil.isNullOrEmpty(returnValue)){
        	//修改
        	returnValue = changValue(returnValue);
        }
        return returnValue;  
	}  
	/***
	 * 
	 * @Description(功能描述)    :  修改对象idNo字段的值
	 * @author(作者)             ：  吴桂镇
	 * @date (开发日期)          :  2017-9-13 下午5:30:07 
	 * @exception                : 
	 * @param _obj
	 * @throws Exception  void
	 */
	@SuppressWarnings("unchecked")
	private Object changValue(Object _obj) throws Exception{
		//基本类型不作操作
		if(_obj instanceof Map){
    		Map<String,Object> map = (Map<String,Object>) _obj;
    		Object fieldValue = map.get(HANDLE_FIELD_NAME);
    		map.put(HANDLE_FIELD_NAME, Encryption.encode(SECRET_KEY, fieldValue.toString()));
    	}else if(_obj instanceof List){
    		List<Object> list = (List<Object>) _obj;
    		for (Object obj : list) {
    			if(obj instanceof Map){
    				Map<String,Object> map = (Map<String, Object>) obj;
            		Object fieldValue = map.get(HANDLE_FIELD_NAME);
            		map.put(HANDLE_FIELD_NAME, Encryption.encode(SECRET_KEY, fieldValue.toString()));
    			}else{
            		Class<?> resultClz = _obj.getClass();
        			Field field = resultClz.getDeclaredField(HANDLE_FIELD_NAME);
        			field.setAccessible(true); //成员变量为private,故必须进行此操
            		Object fieldValue = field.get(obj);
            		field.set(_obj, Encryption.encode(SECRET_KEY, fieldValue.toString()));
    			}
			}
    	}else{
    		Class<?> resultClz = _obj.getClass();
			Field field = resultClz.getDeclaredField(HANDLE_FIELD_NAME);
			field.setAccessible(true); //成员变量为private,故必须进行此操
    		Object fieldValue = field.get(_obj);
    		field.set(_obj, Encryption.encode(SECRET_KEY, fieldValue.toString()));
    	}
		return _obj;
	}
}