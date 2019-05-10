package com.model;

/**
 * AllDiscussionHate entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionHate implements java.io.Serializable {

	// Fields

	private AllDiscussionHateId id;
	private Integer deleteFlag;

	// Constructors

	/** default constructor */
	public AllDiscussionHate() {
	}

	/** minimal constructor */
	public AllDiscussionHate(AllDiscussionHateId id) {
		this.id = id;
	}

	/** full constructor */
	public AllDiscussionHate(AllDiscussionHateId id, Integer deleteFlag) {
		this.id = id;
		this.deleteFlag = deleteFlag;
	}

	// Property accessors

	public AllDiscussionHateId getId() {
		return this.id;
	}

	public void setId(AllDiscussionHateId id) {
		this.id = id;
	}

	public Integer getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}