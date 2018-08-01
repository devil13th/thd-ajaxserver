package com.thd.ajaxserver.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thd.ajaxserver.pojo.SysUser;
import com.thd.ajaxserver.repository.SysUserRepository;
import com.thd.ajaxserver.service.SysUserService;
import com.thd.tool.bean.AjaxReturnBean;
import com.thd.tool.bean.StaticVar;

@RestController
@RequestMapping(value="/SysUser")
public class SysUserController {
	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private SysUserRepository sysUserRepository;
	
	
	/**
	 * 根据id查询用户
	 * url : http://127.0.0.1:8899/ajaxserver/SysUser/queryById/402881e846e119dc0146e119e1ed0006
	 * @param id 用户ID
	 * @return
	 */
	@RequestMapping(value="/queryById/{id}",method=RequestMethod.GET)
	public AjaxReturnBean queryById(@PathVariable String id){
		AjaxReturnBean arb = new AjaxReturnBean();
		arb.setStatus(StaticVar.STATUS_SUCCESS);
		
		try{
			SysUser u = this.sysUserService.querySysUserById(id);
			arb.setResult(u);
		}catch(Exception e){
			arb.setMessage(e.getMessage());
			arb.setStatus(StaticVar.STATUS_FAILURE);
		}
		return arb;		
	}
	
	/**
	 * 根据姓名模糊匹配查询SysUser - 带有分页信息
	 * url : http://127.0.0.1:8899/ajaxserver/SysUser/pageByNameLike/devil13th/1/2
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/pageByNameLike/{name}/{page}/{size}",method=RequestMethod.GET)
	public Page<SysUser> pageByNameLike(@PathVariable String name,@PathVariable Integer page,@PathVariable Integer size){
		return sysUserRepository.pageByNameLike("%" + name + "%", PageRequest.of(page, size));
	}
	
	/**
	 * 根据姓名精确SysUser
	 * url : http://127.0.0.1:8899/ajaxserver/SysUser/queryByName/devil13th_23
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/queryByName/{name}",method=RequestMethod.GET)
	public List<SysUser> queryByName(@PathVariable String name){
		return sysUserRepository.findByUserName(name);
	}
	
	/**
	 * 根据姓名模糊匹配查询SysUser
	 * url : http://127.0.0.1:8899/ajaxserver/SysUser/queryByNameLike/devil13th_2
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/queryByNameLike/{name}",method=RequestMethod.GET)
	public List<SysUser> queryByNameLike(@PathVariable String name){
		return sysUserRepository.findByUserNameLike("%" + name + "%");
	}
	
	
	/**
	 * 根据姓名模糊匹配查询SysUser
	 * url : http://127.0.0.1:8899/ajaxserver/SysUser/query/select * from sys_user where user_name='devil13th_0'
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/query/{sql}",method=RequestMethod.GET)
	public List<SysUser> query(@PathVariable String sql){
		return sysUserService.query(sql);
	}
	
	/**
	 * 保存用户
	 * url : http://127.0.0.1:8899/ajaxserver/SysUser/saveSysUser
	 * request body : 
{
"userName":"aaa",
"userSex":"1",
"userMail":"aaa@ccc.com",
"userTel":"1234",
"userStatus":"1",
"userBirthday":"2015-01-01",
"orgId":"5"
}
	 * 
	 * @param request
	 * @param user 需要保存的用户
	 * @return
	 */
	@RequestMapping(value="/saveSysUser",method=RequestMethod.POST)
	public AjaxReturnBean saveSysUser(HttpServletRequest request,@Valid @RequestBody SysUser sysUser){
		AjaxReturnBean arb = new AjaxReturnBean();
		arb.setStatus(StaticVar.STATUS_SUCCESS);
		try{
			this.sysUserService.saveSysUser(sysUser);
			arb.setResult(sysUser);
		}catch(Exception e){
			arb.setMessage(e.getMessage());
			arb.setStatus(StaticVar.STATUS_FAILURE);
		}
		return arb;	
	};
	
	
	/**
	 * 修改用户
	 * url : http://127.0.0.1:8899/ajaxserver/SysUser/updateSysUser
	 * request body : 
{
"userName":"aaa",
"userSex":"1",
"userMail":"aaa@ccc.com",
"userTel":"1234",
"userStatus":"1",
"userBirthday":"2015-01-01",
"orgId":"5"
}
	 * 
	 * @param request
	 * @param user 需要保存的用户
	 * @return
	 */
	@RequestMapping(value="/updateSysUser",method=RequestMethod.POST)
	public AjaxReturnBean updateSysUser(HttpServletRequest request,@Valid @RequestBody SysUser sysUser){
		AjaxReturnBean arb = new AjaxReturnBean();
		arb.setStatus(StaticVar.STATUS_SUCCESS);
		try{
			this.sysUserService.updateSysUser(sysUser);
			arb.setResult(sysUser);
		}catch(Exception e){
			e.printStackTrace();
			arb.setMessage(e.getMessage());
			arb.setStatus(StaticVar.STATUS_FAILURE);
		}
		return arb;	
	};
	
	/**
	 * 根据ID删除用户
	 * url : http://127.0.0.1:8899/ajaxserver/SysUser/deleteSysUser/402881e846e139fa0146e13cd2d50003
	 * @param id 用户ID
	 * @return
	 */
	@RequestMapping(value="/deleteSysUser/{id}",method=RequestMethod.DELETE)
	public AjaxReturnBean deleteSysUser(@PathVariable String id){
		AjaxReturnBean arb = new AjaxReturnBean();
		arb.setStatus(StaticVar.STATUS_SUCCESS);
		try{
			this.sysUserService.deleteSysUser(id);
		}catch(Exception e){
			arb.setMessage(e.getMessage());
			arb.setStatus(StaticVar.STATUS_FAILURE);
		}
		return arb;	
	};
	
	
	
}
