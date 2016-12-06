package com.alexbaek.web.sample.vo;

import java.io.Serializable;

public class SampleDataVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2655842729375731653L;
	
	private String adminId;
	private String rightId;
	private String adminName;
	private String passwd;
	private String passwdChangeDate;
	private String isUse;
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getRightId() {
		return rightId;
	}
	public void setRightId(String rightId) {
		this.rightId = rightId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getPasswdChangeDate() {
		return passwdChangeDate;
	}
	public void setPasswdChangeDate(String passwdChangeDate) {
		this.passwdChangeDate = passwdChangeDate;
	}
	public String getIsUse() {
		return isUse;
	}
	public void setIsUse(String isUse) {
		this.isUse = isUse;
	}
	
	
}
