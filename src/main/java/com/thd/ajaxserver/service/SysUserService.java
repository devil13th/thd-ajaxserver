package com.thd.ajaxserver.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thd.ajaxserver.pojo.SysUser;
import com.thd.tool.bean.TableBean;

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
	/**
	 * 更新sysUser
	 * @param sysUser 实体
	 */
	@Transactional
	public void updateSysUser(SysUser sysUser);
	@Transactional
	public List query(String sql);
	@Transactional
	public TableBean queryAll(TableBean tableBean);
	/**
	 * 是否存在姓名为name且id不是参数中id的用户
	 * @param name 姓名
	 * @param id 主键
	 * @return 存在：true  不存在:false
	 */
	@Transactional
	public Boolean existSameName(String name,String id);
	
	/**
	 * 查询所有组织机构
	 * @param orgName 组织机构名称
	 * @return
	 */
	@Transactional
	public List queryOrg(String orgName);
}
