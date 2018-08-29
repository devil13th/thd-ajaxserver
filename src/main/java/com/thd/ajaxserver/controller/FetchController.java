package com.thd.ajaxserver.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thd.ajaxserver.pojo.SysUser;
import com.thd.tool.bean.RestfulResponseResult;

@Controller
@RequestMapping(value="/fetch")
public class FetchController {
	
	@RequestMapping(value = "/index")
    public String index()
    {
		System.out.println("1234");
        return "fetchTest";
    }
	
	@ResponseBody
	@RequestMapping(value="/testFetchPost",method=RequestMethod.POST)
	public ResponseEntity<?> testFetchPost(@RequestBody SysUser user){
		try{
			System.out.println(user.getUserBirthday());
			return RestfulResponseResult.returnSuccess(user);
		}catch(Exception e){
			return RestfulResponseResult.returnFailure(e);
		}
	}
	@ResponseBody
	@RequestMapping(value="/testFormPost",method=RequestMethod.POST)
	public ResponseEntity<?> testFormPost(@ModelAttribute("user")  SysUser user){
		try{
			System.out.println(user.getUserBirthday());
			return RestfulResponseResult.returnSuccess(user);
		}catch(Exception e){
			return RestfulResponseResult.returnFailure(e);
		}
	}
	
	
	@ResponseBody
	@RequestMapping(value="/testFetchGet")
	public ResponseEntity<?> testFetchGet(@RequestBody SysUser user){
		try{
			System.out.println(user.getUserBirthday());
			return RestfulResponseResult.returnSuccess(user);
		}catch(Exception e){
			return RestfulResponseResult.returnFailure(e);
		}
	}
	
	
	/**
	 * 通过@PathVariable获取路径中的参数
	 * @param username
	 * @param password
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/testGetPathVariable/{name}",method=RequestMethod.GET)
	public ResponseEntity<?> testGetPathVariable(@PathVariable String name) {
		try{
			SysUser user =  new SysUser();
			user.setUserName(name);
			user.setUserBirthday(new Date());
			System.out.println(user.getUserBirthday());
			return RestfulResponseResult.returnSuccess(user);
		}catch(Exception e){
			return RestfulResponseResult.returnFailure(e);
		}
	}
	
	@ResponseBody
	@RequestMapping(value="/testGetRequestParam",method=RequestMethod.GET)
/*
@RequestParam加与不加区别
	 

@RequestMapping("/list")
public String test(int userId) {
    return "list";
}

@RequestMapping("/list")
public String test(@RequestParam int userId) {
    return "list";
}
 
不加：写法参数为非必传

加：参数为必传。参数名为userId。
可以通过@RequestParam(required = false)设置为非必传。因为required值默认是true，所以默认必传。
可以通过@RequestParam("userId")或者@RequestParam(value = "userId")指定参数名。
可以通过@RequestParam(defaultValue = "0")指定参数默认值
	 
	 */
	public ResponseEntity<?> testGetRequestParam(@RequestParam("name") String name) {
		try{
			SysUser user =  new SysUser();
			user.setUserName(name);
			user.setUserBirthday(new Date());
			System.out.println(user.getUserBirthday());
			return RestfulResponseResult.returnSuccess(user);
		}catch(Exception e){
			return RestfulResponseResult.returnFailure(e);
		}
	}
	
	@ResponseBody
	@RequestMapping(value="/testFetchDelete/{name}",method=RequestMethod.DELETE)
	public ResponseEntity<?> testFetchDelete(@PathVariable String name){
		try{
			SysUser user =  new SysUser();
			user.setUserName(name);
			user.setUserBirthday(new Date());
			System.out.println(user.getUserBirthday());
			System.out.println("delete user ...");
			return RestfulResponseResult.returnSuccess(user);
		}catch(Exception e){
			return RestfulResponseResult.returnFailure(e);
		}
	}
	
	
	
}
