package com.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AllDiscussionSign entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionSign implements java.io.Serializable {

	// Fields

	private Integer signId;
	private Timestamp nowTime;
	private Integer countNumber;
	private Timestamp lastTime;
	private String operater;
	private Set allDiscussionVips = new HashSet(0);

	// Constructors

	/** default constructor */
	public AllDiscussionSign() {
	}

	/** minimal constructor */
	public AllDiscussionSign(Integer signId, Timestamp nowTime, Integer countNumber, Timestamp lastTime) {
		this.signId = signId;
		this.nowTime = nowTime;
		this.countNumber = countNumber;
		this.lastTime = lastTime;
	}

	/** full constructor */
	public AllDiscussionSign(Integer signId, Timestamp nowTime, Integer countNumber, Timestamp lastTime,
			String operater, Set allDiscussionVips) {
		this.signId = signId;
		this.nowTime = nowTime;
		this.countNumber = countNumber;
		this.lastTime = lastTime;
		this.operater = operater;
		this.allDiscussionVips = allDiscussionVips;
	}

	// Property accessors

	public Integer getSignId() {
		return this.signId;
	}

	public void setSignId(Integer signId) {
		this.signId = signId;
	}

	public Timestamp getNowTime() {
		return this.nowTime;
	}

	public void setNowTime(Timestamp nowTime) {
		this.nowTime = nowTime;
	}

	public Integer getCountNumber() {
		return this.countNumber;
	}

	public void setCountNumber(Integer countNumber) {
		this.countNumber = countNumber;
	}

	public Timestamp getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Timestamp lastTime) {
		this.lastTime = lastTime;
	}

	public String getOperater() {
		return this.operater;
	}

	public void setOperater(String operater) {
		this.operater = operater;
	}

	public Set getAllDiscussionVips() {
		return this.allDiscussionVips;
	}

	public void setAllDiscussionVips(Set allDiscussionVips) {
		this.allDiscussionVips = allDiscussionVips;
	}

}