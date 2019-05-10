package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * AllDiscussionMananger entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionMananger implements java.io.Serializable {

	// Fields

	private String managerId;
	private String name;
	private String remark;
	private Integer deleteFlag;
	private Set allDiscussionUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public AllDiscussionMananger() {
	}

	/** minimal constructor */
	public AllDiscussionMananger(String managerId, String name) {
		this.managerId = managerId;
		this.name = name;
	}

	/** full constructor */
	public AllDiscussionMananger(String managerId, String name, String remark, Integer deleteFlag,
			Set allDiscussionUsers) {
		this.managerId = managerId;
		this.name = name;
		this.remark = remark;
		this.deleteFlag = deleteFlag;
		this.allDiscussionUsers = allDiscussionUsers;
	}

	// Property accessors

	public String getManagerId() {
		return this.managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Set getAllDiscussionUsers() {
		return this.allDiscussionUsers;
	}

	public void setAllDiscussionUsers(Set allDiscussionUsers) {
		this.allDiscussionUsers = allDiscussionUsers;
	}

}