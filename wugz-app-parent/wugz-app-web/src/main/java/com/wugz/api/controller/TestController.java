package com.wugz.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wugz.app.base.domain.sUsr;
import com.wugz.app.base.service.ISusrService;

@RestController
public class TestController {
	
	@Autowired
	private ISusrService susr;
	
	@RequestMapping("/test")
	public Object test(){
		sUsr su = new sUsr();
		su.setUsrCde("admin");
		
		return susr.selectOneByObject(su);
	}
}
