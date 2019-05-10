package com.model;

/**
 * AllDiscussionChatObjectId entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionChatObjectId implements java.io.Serializable {

	// Fields

	private AllDiscussionVip allDiscussionVip;
	private AllDiscussionVip allDiscussionVip_1;
	private AllDiscussionChat allDiscussionChat;

	// Constructors

	/** default constructor */
	public AllDiscussionChatObjectId() {
	}

	/** full constructor */
	public AllDiscussionChatObjectId(AllDiscussionVip allDiscussionVip, AllDiscussionVip allDiscussionVip_1,
			AllDiscussionChat allDiscussionChat) {
		this.allDiscussionVip = allDiscussionVip;
		this.allDiscussionVip_1 = allDiscussionVip_1;
		this.allDiscussionChat = allDiscussionChat;
	}

	// Property accessors

	public AllDiscussionVip getAllDiscussionVip() {
		return this.allDiscussionVip;
	}

	public void setAllDiscussionVip(AllDiscussionVip allDiscussionVip) {
		this.allDiscussionVip = allDiscussionVip;
	}

	public AllDiscussionVip getAllDiscussionVip_1() {
		return this.allDiscussionVip_1;
	}

	public void setAllDiscussionVip_1(AllDiscussionVip allDiscussionVip_1) {
		this.allDiscussionVip_1 = allDiscussionVip_1;
	}

	public AllDiscussionChat getAllDiscussionChat() {
		return this.allDiscussionChat;
	}

	public void setAllDiscussionChat(AllDiscussionChat allDiscussionChat) {
		this.allDiscussionChat = allDiscussionChat;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AllDiscussionChatObjectId))
			return false;
		AllDiscussionChatObjectId castOther = (AllDiscussionChatObjectId) other;

		return ((this.getAllDiscussionVip() == castOther.getAllDiscussionVip())
				|| (this.getAllDiscussionVip() != null && castOther.getAllDiscussionVip() != null
						&& this.getAllDiscussionVip().equals(castOther.getAllDiscussionVip())))
				&& ((this.getAllDiscussionVip_1() == castOther.getAllDiscussionVip_1())
						|| (this.getAllDiscussionVip_1() != null && castOther.getAllDiscussionVip_1() != null
								&& this.getAllDiscussionVip_1().equals(castOther.getAllDiscussionVip_1())))
				&& ((this.getAllDiscussionChat() == castOther.getAllDiscussionChat())
						|| (this.getAllDiscussionChat() != null && castOther.getAllDiscussionChat() != null
								&& this.getAllDiscussionChat().equals(castOther.getAllDiscussionChat())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAllDiscussionVip() == null ? 0 : this.getAllDiscussionVip().hashCode());
		result = 37 * result + (getAllDiscussionVip_1() == null ? 0 : this.getAllDiscussionVip_1().hashCode());
		result = 37 * result + (getAllDiscussionChat() == null ? 0 : this.getAllDiscussionChat().hashCode());
		return result;
	}

}