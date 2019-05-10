package com.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AllDiscussionCrads entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionCrads implements java.io.Serializable {

	// Fields

	private String cardsId;
	private AllDiscussionConversation allDiscussionConversation;
	private AllDiscussionVip allDiscussionVip;
	private String parentId;
	private String context;
	private Timestamp nowTime;
	private String image;
	private Integer goods;
	private Integer deleteFlag;
	private String title;
	private Integer permission;
	private Integer relyN;
	private Integer version;
	private Set allDiscussionVips = new HashSet(0);
	private Set allDiscussionRecrods = new HashSet(0);

	// Constructors

	/** default constructor */
	public AllDiscussionCrads() {
	}

	/** minimal constructor */
	public AllDiscussionCrads(String cardsId, AllDiscussionConversation allDiscussionConversation,
			AllDiscussionVip allDiscussionVip, String parentId, Timestamp nowTime, Integer goods, Integer deleteFlag,
			String title, Integer permission, Integer relyN, Integer version) {
		this.cardsId = cardsId;
		this.allDiscussionConversation = allDiscussionConversation;
		this.allDiscussionVip = allDiscussionVip;
		this.parentId = parentId;
		this.nowTime = nowTime;
		this.goods = goods;
		this.deleteFlag = deleteFlag;
		this.title = title;
		this.permission = permission;
		this.relyN = relyN;
		this.version = version;
	}

	/** full constructor */
	public AllDiscussionCrads(String cardsId, AllDiscussionConversation allDiscussionConversation,
			AllDiscussionVip allDiscussionVip, String parentId, String context, Timestamp nowTime, String image,
			Integer goods, Integer deleteFlag, String title, Integer permission, Integer relyN, Integer version,
			Set allDiscussionVips, Set allDiscussionRecrods) {
		this.cardsId = cardsId;
		this.allDiscussionConversation = allDiscussionConversation;
		this.allDiscussionVip = allDiscussionVip;
		this.parentId = parentId;
		this.context = context;
		this.nowTime = nowTime;
		this.image = image;
		this.goods = goods;
		this.deleteFlag = deleteFlag;
		this.title = title;
		this.permission = permission;
		this.relyN = relyN;
		this.version = version;
		this.allDiscussionVips = allDiscussionVips;
		this.allDiscussionRecrods = allDiscussionRecrods;
	}

	// Property accessors

	public String getCardsId() {
		return this.cardsId;
	}

	public void setCardsId(String cardsId) {
		this.cardsId = cardsId;
	}

	public AllDiscussionConversation getAllDiscussionConversation() {
		return this.allDiscussionConversation;
	}

	public void setAllDiscussionConversation(AllDiscussionConversation allDiscussionConversation) {
		this.allDiscussionConversation = allDiscussionConversation;
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

	public Timestamp getNowTime() {
		return this.nowTime;
	}

	public void setNowTime(Timestamp nowTime) {
		this.nowTime = nowTime;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getGoods() {
		return this.goods;
	}

	public void setGoods(Integer goods) {
		this.goods = goods;
	}

	public Integer getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPermission() {
		return this.permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	public Integer getRelyN() {
		return this.relyN;
	}

	public void setRelyN(Integer relyN) {
		this.relyN = relyN;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Set getAllDiscussionVips() {
		return this.allDiscussionVips;
	}

	public void setAllDiscussionVips(Set allDiscussionVips) {
		this.allDiscussionVips = allDiscussionVips;
	}

	public Set getAllDiscussionRecrods() {
		return this.allDiscussionRecrods;
	}

	public void setAllDiscussionRecrods(Set allDiscussionRecrods) {
		this.allDiscussionRecrods = allDiscussionRecrods;
	}

}