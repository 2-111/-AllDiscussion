package com.model;

import java.sql.Timestamp;

/**
 * AllDiscussionUser entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionUser implements java.io.Serializable {

	// Fields

	private String userId;
	private AllDiscussionMananger allDiscussionMananger;
	private AllDiscussionVip allDiscussionVip;
	private String userName;
	private String passWord;
	private Integer deleteFlag;
	private String operater;
	private Timestamp nowTime;

	// Constructors

	/** default constructor */
	public AllDiscussionUser() {
	}

	/** minimal constructor */
	public AllDiscussionUser(String userId, AllDiscussionMananger allDiscussionMananger,
			AllDiscussionVip allDiscussionVip, String userName, String passWord, Integer deleteFlag,
			Timestamp nowTime) {
		this.userId = userId;
		this.allDiscussionMananger = allDiscussionMananger;
		this.allDiscussionVip = allDiscussionVip;
		this.userName = userName;
		this.passWord = passWord;
		this.deleteFlag = deleteFlag;
		this.nowTime = nowTime;
	}

	/** full constructor */
	public AllDiscussionUser(String userId, AllDiscussionMananger allDiscussionMananger,
			AllDiscussionVip allDiscussionVip, String userName, String passWord, Integer deleteFlag, String operater,
			Timestamp nowTime) {
		this.userId = userId;
		this.allDiscussionMananger = allDiscussionMananger;
		this.allDiscussionVip = allDiscussionVip;
		this.userName = userName;
		this.passWord = passWord;
		this.deleteFlag = deleteFlag;
		this.operater = operater;
		this.nowTime = nowTime;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public AllDiscussionMananger getAllDiscussionMananger() {
		return this.allDiscussionMananger;
	}

	public void setAllDiscussionMananger(AllDiscussionMananger allDiscussionMananger) {
		this.allDiscussionMananger = allDiscussionMananger;
	}

	public AllDiscussionVip getAllDiscussionVip() {
		return this.allDiscussionVip;
	}

	public void setAllDiscussionVip(AllDiscussionVip allDiscussionVip) {
		this.allDiscussionVip = allDiscussionVip;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Integer getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getOperater() {
		return this.operater;
	}

	public void setOperater(String operater) {
		this.operater = operater;
	}

	public Timestamp getNowTime() {
		return this.nowTime;
	}

	public void setNowTime(Timestamp nowTime) {
		this.nowTime = nowTime;
	}

}