package com.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AllDiscussionChat entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionChat implements java.io.Serializable {

	// Fields

	private String chatId;
	private AllDiscussionVip allDiscussionVip;
	private String parentId;
	private String context;
	private String image;
	private Integer deleteFlag;
	private Timestamp time;


	// Constructors

	/** default constructor */
	public AllDiscussionChat() {
	}

	/** minimal constructor */
	public AllDiscussionChat(String chatId, AllDiscussionVip allDiscussionVip, String parentId, Integer deleteFlag,
			Timestamp time) {
		this.chatId = chatId;
		this.allDiscussionVip = allDiscussionVip;
		this.parentId = parentId;
		this.deleteFlag = deleteFlag;
		this.time = time;
	}

	/** full constructor */
	public AllDiscussionChat(String chatId, AllDiscussionVip allDiscussionVip, String parentId, String context,
			String image, Integer deleteFlag, Timestamp time) {
		this.chatId = chatId;
		this.allDiscussionVip = allDiscussionVip;
		this.parentId = parentId;
		this.context = context;
		this.image = image;
		this.deleteFlag = deleteFlag;
		this.time = time;
	}

	// Property accessors

	public String getChatId() {
		return this.chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public AllDiscussionVip getAllDiscussionVip() {
		return this.allDiscussionVip;
	}

	public void setAllDiscussionVip(AllDiscussionVip allDiscussionVip) {
		this.allDiscussionVip = allDiscussionVip;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	

}