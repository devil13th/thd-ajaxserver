package com.thd.ajaxserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.thd.ajaxserver.yml.PropertiesExample;
import com.thd.ajaxserver.yml.YmlExample;

/**
 * 使用yml文件配置 和 properties文件配置的例子
 * @author wangl
 */
@Controller
@RequestMapping(value="/ymlController")
public class YmlController {
	
	//ymlExample的属性值是在application.yml中进行配置的 ,参见YmlExample类
	@Autowired
	private YmlExample ymlExample;
	//propertiesExample的属性值是在propertiesExample.properties中进行配置的 ,参见PropertiesExample类
	@Autowired
	private PropertiesExample propertiesExample;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	@ResponseBody
	/**
	 * url : http://127.0.0.1:8000/ajaxserver/ymlController/test
	 * @return
	 */
	public String test(){
		Gson gson = new Gson();
		String ymlExampleStr = gson.toJson(ymlExample);
		System.out.println(ymlExampleStr);
		
		String propertiesExampleStr = gson.toJson(this.propertiesExample);
		
		return ymlExampleStr + " ||||| " + propertiesExampleStr;
	}
}
