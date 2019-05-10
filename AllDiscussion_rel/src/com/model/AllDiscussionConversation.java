package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * AllDiscussionConversation entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionConversation implements java.io.Serializable {

	// Fields

	private String conversationId;
	private AllDiscussionCity allDiscussionCity;
	private String title;
	private String context;
	private Integer deleteFlag;
	private Integer hot;
	private Integer chatTag;
	private Set allDiscussionCradses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AllDiscussionConversation() {
	}

	/** minimal constructor */
	public AllDiscussionConversation(String conversationId, AllDiscussionCity allDiscussionCity, String title,
			String context, Integer deleteFlag, Integer hot) {
		this.conversationId = conversationId;
		this.allDiscussionCity = allDiscussionCity;
		this.title = title;
		this.context = context;
		this.deleteFlag = deleteFlag;
		this.hot = hot;
	}

	/** full constructor */
	public AllDiscussionConversation(String conversationId, AllDiscussionCity allDiscussionCity, String title,
			String context, Integer deleteFlag, Integer hot, Integer chatTag, Set allDiscussionCradses) {
		this.conversationId = conversationId;
		this.allDiscussionCity = allDiscussionCity;
		this.title = title;
		this.context = context;
		this.deleteFlag = deleteFlag;
		this.hot = hot;
		this.chatTag = chatTag;
		this.allDiscussionCradses = allDiscussionCradses;
	}

	// Property accessors

	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public AllDiscussionCity getAllDiscussionCity() {
		return this.allDiscussionCity;
	}

	public void setAllDiscussionCity(AllDiscussionCity allDiscussionCity) {
		this.allDiscussionCity = allDiscussionCity;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Integer getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Integer getHot() {
		return this.hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public Integer getChatTag() {
		return this.chatTag;
	}

	public void setChatTag(Integer chatTag) {
		this.chatTag = chatTag;
	}

	public Set getAllDiscussionCradses() {
		return this.allDiscussionCradses;
	}

	public void setAllDiscussionCradses(Set allDiscussionCradses) {
		this.allDiscussionCradses = allDiscussionCradses;
	}

}