package com.thd.ajaxserver.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thd.ajaxserver.pojo.SysUser;
import com.thd.ajaxserver.repository.SysUserRepository;
import com.thd.tool.MyListUtils;
import com.thd.tool.MyStringUtils;
import com.thd.tool.bean.Page;
import com.thd.tool.bean.TableBean;
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
	
	
	@Override
	public TableBean queryAll(TableBean tableBean){
		String sql = "select "
				+ " user_id as userId, "
				+ " user_name as userName, "
				+ " user_sex as userSex, "
				+ " user_mail as userMail, "
				+ " user_tel as userTel, "
				+ " user_birthday as userBirthday "
				+ " from sys_user u where 1=1";
		
		
		
		if(MyStringUtils.isNotEmpty(tableBean.getSortColumn())){
			String order = "desc";
			if(MyStringUtils.isNotEmpty(tableBean.getSortOrder())){
				order = tableBean.getSortOrder();
			}
			sql += " order by " + tableBean.getSortColumn() + " " + order;
			
		}
		
		if(tableBean.getConditions() != null){
			Map m = tableBean.getConditions();
			List params = new ArrayList();
			if(m.get("userName") != null){
				String userName = m.get("userName").toString();
				if(MyStringUtils.isNotEmpty(userName)){
					sql += " and user_name like ? ";
					params.add("%" + userName.trim() + "%");
				}
			}
		}
		
		
		Page p = new Page();
		p.setPageSize(tableBean.getPageSize());
		p.setCurrentPage(tableBean.getCurrent());
		List l = this.jdbcDao.query(sql, null,p);
		tableBean.setResult(l);
		tableBean.setTotal(p.getListSize());
		
		return tableBean;
	}
	
	
	
	
	
	

	

}
