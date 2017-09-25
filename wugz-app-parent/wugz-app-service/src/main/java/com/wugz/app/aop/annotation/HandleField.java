package com.wugz.app.aop.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.web.bind.annotation.Mapping;

@Target({ElementType.METHOD, ElementType.TYPE})  
@Retention(RetentionPolicy.RUNTIME)  
@Documented  
@Mapping 
public @interface HandleField {
	
	//方法参数加密字段（顺序与方法参数顺序一致；字段类型为string）
	public String[] encrypFieldNameInfo();
	
	//解密方法返回值字段（支持 map的key domain 和list<domain>） 字段类型为string
	public String decrypResultFieldName() default "";
	
}
