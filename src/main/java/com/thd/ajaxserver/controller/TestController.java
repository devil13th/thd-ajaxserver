package com.thd.ajaxserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thd.ajaxserver.pojo.SysUser;
import com.thd.tool.bean.RestfulResponseResult;

@RestController
@RequestMapping(value="/Test")
public class TestController {
	
	/**
	 * 根据id查询用户
	 * url : http://127.0.0.1:8899/ajaxserver/test/transfer?d=
	 * @param id 用户ID
	 * @return
	 */
	@RequestMapping(value="/transfer",method=RequestMethod.POST)
	public ResponseEntity<?> transfer(@RequestBody SysUser user){
		try{
			System.out.println(user.getUserBirthday());
			return RestfulResponseResult.returnSuccess(user);
		}catch(Exception e){
			return RestfulResponseResult.returnFailure(e);
			
		}
		/**
		 * 测试脚本
function send(){

  fetch("http://127.0.0.1:8080/ajaxserver/Test/transfer",{
      method: 'POST',
      headers:{
        'Content-Type': 'application/json',
      },
      body:JSON.stringify({userBirthday:1535472519000})
  }).then(function(res){
    console.log(res);
    return res.text();
  }).then(function(res){
    console.log(res);
  })

}

send();
		 */
	}
	
	
	
	
	
	
	
	
}
