package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * AllDiscussionHead entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionHead implements java.io.Serializable {

	// Fields

	private String headId;
	private String nowhead;
	private String lasthead;

	// Constructors

	/** default constructor */
	public AllDiscussionHead() {
	}

	/** minimal constructor */
	public AllDiscussionHead(String headId, String nowhead, String lasthead) {
		this.headId = headId;
		this.nowhead = nowhead;
		this.lasthead = lasthead;
	}

	
	// Property accessors

	public String getHeadId() {
		return this.headId;
	}

	public void setHeadId(String headId) {
		this.headId = headId;
	}

	public String getNowhead() {
		return this.nowhead;
	}

	public void setNowhead(String nowhead) {
		this.nowhead = nowhead;
	}

	public String getLasthead() {
		return this.lasthead;
	}

	public void setLasthead(String lasthead) {
		this.lasthead = lasthead;
	}

}