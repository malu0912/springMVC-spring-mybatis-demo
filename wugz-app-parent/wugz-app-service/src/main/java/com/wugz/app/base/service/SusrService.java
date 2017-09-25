package com.wugz.app.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wugz.app.aop.annotation.HandleField;
import com.wugz.app.base.dao.SusrDao;
import com.wugz.app.base.domain.sUsr;

@Component
public class SusrService implements ISusrService{
	
	@Autowired
	private SusrDao susrDao;
	
	@Override
	@HandleField(encrypFieldNameInfo={"usrCde"},decrypResultFieldName="usrCde")
	public sUsr selectOneByObject(sUsr su) {
		return susrDao.selectOneByObject(su);
	}
}
