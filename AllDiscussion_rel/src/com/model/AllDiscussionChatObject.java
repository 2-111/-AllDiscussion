package com.model;

/**
 * AllDiscussionChatObject entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionChatObject implements java.io.Serializable {

	// Fields

	private AllDiscussionChatObjectId id;
	private Integer deletFlag;
	private Integer isFriends;

	// Constructors

	/** default constructor */
	public AllDiscussionChatObject() {
	}

	/** minimal constructor */
	public AllDiscussionChatObject(AllDiscussionChatObjectId id) {
		this.id = id;
	}

	/** full constructor */
	public AllDiscussionChatObject(AllDiscussionChatObjectId id, Integer deletFlag, Integer isFriends) {
		this.id = id;
		this.deletFlag = deletFlag;
		this.isFriends = isFriends;
	}

	// Property accessors

	public AllDiscussionChatObjectId getId() {
		return this.id;
	}

	public void setId(AllDiscussionChatObjectId id) {
		this.id = id;
	}

	public Integer getDeletFlag() {
		return this.deletFlag;
	}

	public void setDeletFlag(Integer deletFlag) {
		this.deletFlag = deletFlag;
	}

	public Integer getIsFriends() {
		return this.isFriends;
	}

	public void setIsFriends(Integer isFriends) {
		this.isFriends = isFriends;
	}

}