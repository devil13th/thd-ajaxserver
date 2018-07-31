package com.thd.ajaxserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thd.ajaxserver.pojo.SysUser;
import com.thd.ajaxserver.repository.SysUserRepository;
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
		sysUserRepository.save(sysUser);
	}

	@Override
	public void deleteSysUser(String id) {
		sysUserRepository.delete(this.querySysUserById(id));
	}
	
	@Override
	public List query(String sql){
		return this.jdbcDao.query(sql, null,null);
	};
	
	
	

	

}
