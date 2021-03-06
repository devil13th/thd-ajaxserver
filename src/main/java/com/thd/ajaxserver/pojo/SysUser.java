package com.thd.ajaxserver.pojo;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * cn.thd.pojo.se.SysUser entity. 
 * file autogenerated by ThirdteenDevils's CodeGenUtil
 */
 
@Entity
@Table(name="sys_user")
public class SysUser implements Serializable {


	@Id
	@GeneratedValue(generator="uuid.hex")
	@GenericGenerator(name="uuid.hex",strategy="uuid.hex")
	@Column(name="user_id")		
    private java.lang.String userId;
    
    
		// 
		@Column(name="user_name")
		private java.lang.String userName;
		// 
		@Column(name="user_sex")
		private java.lang.Integer userSex;
		// 
		@Column(name="user_mail")
		private java.lang.String userMail;
		// 
		@Column(name="user_tel")
		private java.lang.String userTel;
		// 
		@Column(name="user_birthday")
		@DateTimeFormat(pattern="yyyy-MM-dd") 
		private java.util.Date userBirthday;
		// 
		@Column(name="user_status")
		private java.lang.String userStatus;
		// 
		@Column(name="org_id")
		private java.lang.String orgId;


    
	public void setUserId(java.lang.String userId){
		this.userId = userId;
	}
	public java.lang.String getUserId(){
		return this.userId;
	}
	
		public void setUserName(java.lang.String userName){
			this.userName = userName;
		}
		public java.lang.String getUserName(){
			return this.userName;
		}
		public void setUserSex(java.lang.Integer userSex){
			this.userSex = userSex;
		}
		public java.lang.Integer getUserSex(){
			return this.userSex;
		}
		public void setUserMail(java.lang.String userMail){
			this.userMail = userMail;
		}
		public java.lang.String getUserMail(){
			return this.userMail;
		}
		public void setUserTel(java.lang.String userTel){
			this.userTel = userTel;
		}
		public java.lang.String getUserTel(){
			return this.userTel;
		}
		public void setUserBirthday(java.util.Date userBirthday){
			this.userBirthday = userBirthday;
		}
		public java.util.Date getUserBirthday(){
			return this.userBirthday;
		}
		public void setUserStatus(java.lang.String userStatus){
			this.userStatus = userStatus;
		}
		public java.lang.String getUserStatus(){
			return this.userStatus;
		}
		public void setOrgId(java.lang.String orgId){
			this.orgId = orgId;
		}
		public java.lang.String getOrgId(){
			return this.orgId;
		}
	
}




