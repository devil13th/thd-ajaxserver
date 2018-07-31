package com.thd.ajaxserver.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thd.ajaxserver.pojo.SysUser;

@Service
public interface SysUserService {
	
	
	
	/**
	 * 根据id查询sysUser
	 * @param id 主键
	 * @return
	 */
	@Transactional
	public SysUser querySysUserById(String id);
	/**
	 * 查询所有sysUser
	 * @return
	 */
	@Transactional
	public List querySysUser();
	/**
	 * 保存sysUser
	 * @param sysUser 实体
	 */
	@Transactional
	public void saveSysUser(SysUser sysUser);
	/**
	 * 根据id删除sysUser
	 * @param id 主键
	 */
	@Transactional
	public void deleteSysUser(String id);
	
	public List query(String sql);
}