package com.thd.ajaxserver.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
		Optional<SysUser> opt = sysUserRepository.findById(id);
		return opt.isPresent() ? opt.get() : null;
		//return sysUserRepository.findById(id).get();
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
		SysUser u = (SysUser)entityDao.queryById(SysUser.class, sysUser.getUserId());
		if(u == null){
			throw new RuntimeException("未找到用户");
		}
		
		if(this.existSameName(sysUser.getUserName(),sysUser.getUserId())){
			throw new RuntimeException("存在相同的用户名");
		}else{
			entityDao.update(sysUser);
		}
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
				+ " org_name as orgName, "
				+ " user_birthday as userBirthday "
				+ " from sys_user u left join sys_org o on u.org_id = o.org_id where 1=1";
		
		
		
		if(MyStringUtils.isNotEmpty(tableBean.getSortColumn())){
			String order = "desc";
			if(MyStringUtils.isNotEmpty(tableBean.getSortOrder())){
				order = tableBean.getSortOrder();
			}
			sql += " order by " + tableBean.getSortColumn() + " " + order;
			
		}
		
		List params = new ArrayList();
		if(tableBean.getConditions() != null){
			Map m = tableBean.getConditions();
			
			if(m.get("userName") != null){
				String userName = m.get("userName").toString();
				if(MyStringUtils.isNotEmpty(userName)){
					sql += " and user_name like ? ";
					params.add("%" + userName.trim() + "%");
				}
			}
			
			if(m.get("userSex") != null){
				String userSex = m.get("userSex").toString();
				if(MyStringUtils.isNotEmpty(userSex)){
					sql += " and user_sex = ? ";
					params.add(userSex.trim());
				}
			}
		}
		
		
		Page p = new Page();
		p.setPageSize(tableBean.getPageSize());
		p.setCurrentPage(tableBean.getCurrent());
		List l = this.jdbcDao.query(sql, params.toArray(),p);
		tableBean.setResult(l);
		tableBean.setTotal(p.getListSize());
		
		return tableBean;
	}
	
	@Override
	public Boolean existSameName(String name,String id){
		String sql = "select user_id from sys_user u where u.user_name = ? and u.user_id <> ? ";
		List params = new ArrayList();
		params.add(name);
		params.add(id);
		List l  = this.jdbcDao.query(sql, params.toArray(), null);
		return MyListUtils.isNotEmpty(l);
	};
	
	
	public List queryOrg(String orgName){
		String sql = "select org_id,org_code,org_name from sys_org where 1=1";
		List params = new ArrayList();
		if(MyStringUtils.isNotEmpty(orgName)){
			sql += " and ( org_name like ? or org_code like ? )";
			params.add("%" + orgName.trim() + "%");
			params.add("%" + orgName.trim().toUpperCase() + "%");
		}
		
		List l = this.jdbcDao.query(sql,params.toArray(),null);
		
		return l;
	};
	
	
	
	
	
	

	

}
