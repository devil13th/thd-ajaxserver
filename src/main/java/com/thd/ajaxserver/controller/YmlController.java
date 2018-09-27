package com.thd.ajaxserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thd.ajaxserver.yml.Children;

/**
 * yml文件配置
 * 
 * @author wangl
 *
 */
@Controller
@RequestMapping(value="/ymlController")
public class YmlController {
	
	//children的属性值是在application.yml中进行配置的 ,参见Children类
	@Autowired
	private Children children;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	@ResponseBody
	/**
	 * url : http://127.0.0.1:8000/ajaxserver/ymlController/test
	 * @return
	 */
	public String test(){
		
		System.out.println(children);
		
		return "aaa";
	}
}
