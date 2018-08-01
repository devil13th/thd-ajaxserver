package com.thd.ajaxserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thd.ajaxserver.pojo.SysUser;
import com.thd.ajaxserver.repository.SysUserRepository;
import com.thd.tool.MyListUtils;
import com.thd.util.dao.JdbcDao;
import com.thd.util.repository.EntityDao;
@Service
public class SysUserServiceImpl implements SysUserService {
	@Autowired
	private SysUserRepository sysUserRepository;
	@Autowired
	private EntityDao entityDao;
	@Autowired
	private JdbcDao jdbcDao;

	@Override
	@Transactional
	public SysUser querySysUserById(String id) {
		return sysUserRepository.findById(id).get();
	}

	@Override
	public List querySysUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSysUser(SysUser sysUser) {
		List l = this.sysUserRepository.findByUserName(sysUser.getUserName());
		if(MyListUtils.isNotEmpty(l)){
			throw new RuntimeException("存在相同的用户名");
		}
		sysUserRepository.save(sysUser);
	}

	@Override
	public void deleteSysUser(String id) {
		sysUserRepository.delete(this.querySysUserById(id));
	}
	@Override
	public void updateSysUser(SysUser sysUser){
		Object u = entityDao.queryById(SysUser.class, sysUser.getUserId());
		if(u == null){
			throw new RuntimeException("未找到用户");
		}
		List l = this.sysUserRepository.findByUserName(sysUser.getUserName());
		if(MyListUtils.isNotEmpty(l)){
			throw new RuntimeException("存在相同的用户名");
		}
		entityDao.update(sysUser);
	};
	
	@Override
	public List query(String sql){
		return this.jdbcDao.query(sql, null,null);
	};
	
	
	
	
	

	

}
