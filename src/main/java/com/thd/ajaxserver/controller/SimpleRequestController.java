package com.thd.ajaxserver.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thd.ajaxserver.pojo.SysUser;
import com.thd.tool.bean.AjaxReturnBean;
import com.thd.tool.bean.StaticVar;

@Controller
@RequestMapping(value="/SimpleRequest")
public class SimpleRequestController {	
	
	@RequestMapping(value="/dataForGet")
	@ResponseBody
	/**
	 * url : http://127.0.0.1:8000/ajaxserver/SimbleRequest/dataForGet?name=devil13th
	 * @param name
	 * @return
	 */
	public String dataForGet(String name){		
		GsonBuilder builder = new GsonBuilder();
		//yyyy-MM-dd HH:mm:ss
		//Gson gson = builder.setDateFormat("yyyy/MM/dd HH:mm:ss").create();
		Gson gson = builder.create();
		
		AjaxReturnBean arb = new AjaxReturnBean();
		arb.setMessage("Hello " + name + " ! ");
		arb.setStatus(StaticVar.STATUS_SUCCESS);	
		
		SysUser su = new SysUser();
		su.setUserBirthday(new Date());
		su.setUserId("1");
		su.setUserMail(name+"@163.com");
		su.setUserSex(1);
		su.setUserStatus("1");
		su.setUserTel("13800138000");
		su.setUserName(name);
		arb.setResult(su);
		return gson.toJson(arb);		
	}	
}
