package com.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AllDiscussionVip entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionVip implements java.io.Serializable {

	// Fields

	private String vipid;
	private AllDiscussionCity allDiscussionCity;
	private AllDiscussionSign allDiscussionSign;
	private AllDiscussionHead allDiscussionHead;
	private String userId;
	private String name;
	private String sex;
	private Long phoneNumber;
	private String personalText;
	private Timestamp brithday;
	private String email;
	private Integer deletwFlag;
	private String operater;
	private Integer private_;
	private Set allDiscussionCradses = new HashSet(0);
	private Set allDiscussionUsers = new HashSet(0);
	private Set allDiscussionChatObjectsForPersonalId = new HashSet(0);
	private Set allDiscussionChats = new HashSet(0);
	private Set allDiscussionCradses_1 = new HashSet(0);
	private Set allDiscussionHatesForPersonalId = new HashSet(0);
	private Set allDiscussionChatObjectsForObjectId = new HashSet(0);
	private Set allDiscussionHatesForObjectHateId = new HashSet(0);
	private Set allDiscussionRecrods = new HashSet(0);

	// Constructors

	/** default constructor */
	public AllDiscussionVip() {
	}

	/** minimal constructor */
	public AllDiscussionVip(String vipid, AllDiscussionCity allDiscussionCity, AllDiscussionSign allDiscussionSign,
			AllDiscussionHead allDiscussionHead, String userId, String name, String sex, String email,
			Integer deletwFlag, Integer private_) {
		this.vipid = vipid;
		this.allDiscussionCity = allDiscussionCity;
		this.allDiscussionSign = allDiscussionSign;
		this.allDiscussionHead = allDiscussionHead;
		this.userId = userId;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.deletwFlag = deletwFlag;
		this.private_ = private_;
	}

	/** full constructor */
	public AllDiscussionVip(String vipid, AllDiscussionCity allDiscussionCity, AllDiscussionSign allDiscussionSign,
			AllDiscussionHead allDiscussionHead, String userId, String name, String sex, Long phoneNumber,
			String personalText, Timestamp brithday, String email, Integer deletwFlag, String operater,
			Integer private_, Set allDiscussionCradses, Set allDiscussionUsers,
			Set allDiscussionChatObjectsForPersonalId, Set allDiscussionChats, Set allDiscussionCradses_1,
			Set allDiscussionHatesForPersonalId, Set allDiscussionChatObjectsForObjectId,
			Set allDiscussionHatesForObjectHateId, Set allDiscussionRecrods) {
		this.vipid = vipid;
		this.allDiscussionCity = allDiscussionCity;
		this.allDiscussionSign = allDiscussionSign;
		this.allDiscussionHead = allDiscussionHead;
		this.userId = userId;
		this.name = name;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.personalText = personalText;
		this.brithday = brithday;
		this.email = email;
		this.deletwFlag = deletwFlag;
		this.operater = operater;
		this.private_ = private_;
		this.allDiscussionCradses = allDiscussionCradses;
		this.allDiscussionUsers = allDiscussionUsers;
		this.allDiscussionChatObjectsForPersonalId = allDiscussionChatObjectsForPersonalId;
		this.allDiscussionChats = allDiscussionChats;
		this.allDiscussionCradses_1 = allDiscussionCradses_1;
		this.allDiscussionHatesForPersonalId = allDiscussionHatesForPersonalId;
		this.allDiscussionChatObjectsForObjectId = allDiscussionChatObjectsForObjectId;
		this.allDiscussionHatesForObjectHateId = allDiscussionHatesForObjectHateId;
		this.allDiscussionRecrods = allDiscussionRecrods;
	}

	// Property accessors

	public String getVipid() {
		return this.vipid;
	}

	public void setVipid(String vipid) {
		this.vipid = vipid;
	}

	public AllDiscussionCity getAllDiscussionCity() {
		return this.allDiscussionCity;
	}

	public void setAllDiscussionCity(AllDiscussionCity allDiscussionCity) {
		this.allDiscussionCity = allDiscussionCity;
	}

	public AllDiscussionSign getAllDiscussionSign() {
		return this.allDiscussionSign;
	}

	public void setAllDiscussionSign(AllDiscussionSign allDiscussionSign) {
		this.allDiscussionSign = allDiscussionSign;
	}

	public AllDiscussionHead getAllDiscussionHead() {
		return this.allDiscussionHead;
	}

	public void setAllDiscussionHead(AllDiscussionHead allDiscussionHead) {
		this.allDiscussionHead = allDiscussionHead;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Long getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPersonalText() {
		return this.personalText;
	}

	public void setPersonalText(String personalText) {
		this.personalText = personalText;
	}

	public Timestamp getBrithday() {
		return this.brithday;
	}

	public void setBrithday(Timestamp brithday) {
		this.brithday = brithday;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getDeletwFlag() {
		return this.deletwFlag;
	}

	public void setDeletwFlag(Integer deletwFlag) {
		this.deletwFlag = deletwFlag;
	}

	public String getOperater() {
		return this.operater;
	}

	public void setOperater(String operater) {
		this.operater = operater;
	}

	public Integer getPrivate_() {
		return this.private_;
	}

	public void setPrivate_(Integer private_) {
		this.private_ = private_;
	}

	public Set getAllDiscussionCradses() {
		return this.allDiscussionCradses;
	}

	public void setAllDiscussionCradses(Set allDiscussionCradses) {
		this.allDiscussionCradses = allDiscussionCradses;
	}

	public Set getAllDiscussionUsers() {
		return this.allDiscussionUsers;
	}

	public void setAllDiscussionUsers(Set allDiscussionUsers) {
		this.allDiscussionUsers = allDiscussionUsers;
	}

	public Set getAllDiscussionChatObjectsForPersonalId() {
		return this.allDiscussionChatObjectsForPersonalId;
	}

	public void setAllDiscussionChatObjectsForPersonalId(Set allDiscussionChatObjectsForPersonalId) {
		this.allDiscussionChatObjectsForPersonalId = allDiscussionChatObjectsForPersonalId;
	}

	public Set getAllDiscussionChats() {
		return this.allDiscussionChats;
	}

	public void setAllDiscussionChats(Set allDiscussionChats) {
		this.allDiscussionChats = allDiscussionChats;
	}

	public Set getAllDiscussionCradses_1() {
		return this.allDiscussionCradses_1;
	}

	public void setAllDiscussionCradses_1(Set allDiscussionCradses_1) {
		this.allDiscussionCradses_1 = allDiscussionCradses_1;
	}

	public Set getAllDiscussionHatesForPersonalId() {
		return this.allDiscussionHatesForPersonalId;
	}

	public void setAllDiscussionHatesForPersonalId(Set allDiscussionHatesForPersonalId) {
		this.allDiscussionHatesForPersonalId = allDiscussionHatesForPersonalId;
	}

	public Set getAllDiscussionChatObjectsForObjectId() {
		return this.allDiscussionChatObjectsForObjectId;
	}

	public void setAllDiscussionChatObjectsForObjectId(Set allDiscussionChatObjectsForObjectId) {
		this.allDiscussionChatObjectsForObjectId = allDiscussionChatObjectsForObjectId;
	}

	public Set getAllDiscussionHatesForObjectHateId() {
		return this.allDiscussionHatesForObjectHateId;
	}

	public void setAllDiscussionHatesForObjectHateId(Set allDiscussionHatesForObjectHateId) {
		this.allDiscussionHatesForObjectHateId = allDiscussionHatesForObjectHateId;
	}

	public Set getAllDiscussionRecrods() {
		return this.allDiscussionRecrods;
	}

	public void setAllDiscussionRecrods(Set allDiscussionRecrods) {
		this.allDiscussionRecrods = allDiscussionRecrods;
	}

}