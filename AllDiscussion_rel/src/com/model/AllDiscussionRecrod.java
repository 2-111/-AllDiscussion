package com.model;

import java.sql.Timestamp;

/**
 * AllDiscussionRecrod entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionRecrod implements java.io.Serializable {

	// Fields

	private AllDiscussionRecrodId id;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public AllDiscussionRecrod() {
	}

	/** minimal constructor */
	public AllDiscussionRecrod(AllDiscussionRecrodId id) {
		this.id = id;
	}

	/** full constructor */
	public AllDiscussionRecrod(AllDiscussionRecrodId id, Timestamp time) {
		this.id = id;
		this.time = time;
	}

	// Property accessors

	public AllDiscussionRecrodId getId() {
		return this.id;
	}

	public void setId(AllDiscussionRecrodId id) {
		this.id = id;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}