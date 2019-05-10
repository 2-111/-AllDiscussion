package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * AllDiscussionCity entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionCity implements java.io.Serializable {

	// Fields

	private Integer cityId;
	private String name;
	private Short type;
	private String path;
	private String opterstor;
	private Set allDiscussionVips = new HashSet(0);
	private Set allDiscussionConversations = new HashSet(0);

	// Constructors

	/** default constructor */
	public AllDiscussionCity() {
	}

	/** minimal constructor */
	public AllDiscussionCity(Integer cityId, String name, Short type) {
		this.cityId = cityId;
		this.name = name;
		this.type = type;
	}

	/** full constructor */
	public AllDiscussionCity(Integer cityId, String name, Short type, String path, String opterstor,
			Set allDiscussionVips, Set allDiscussionConversations) {
		this.cityId = cityId;
		this.name = name;
		this.type = type;
		this.path = path;
		this.opterstor = opterstor;
		this.allDiscussionVips = allDiscussionVips;
		this.allDiscussionConversations = allDiscussionConversations;
	}

	// Property accessors

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getOpterstor() {
		return this.opterstor;
	}

	public void setOpterstor(String opterstor) {
		this.opterstor = opterstor;
	}

	public Set getAllDiscussionVips() {
		return this.allDiscussionVips;
	}

	public void setAllDiscussionVips(Set allDiscussionVips) {
		this.allDiscussionVips = allDiscussionVips;
	}

	public Set getAllDiscussionConversations() {
		return this.allDiscussionConversations;
	}

	public void setAllDiscussionConversations(Set allDiscussionConversations) {
		this.allDiscussionConversations = allDiscussionConversations;
	}

}