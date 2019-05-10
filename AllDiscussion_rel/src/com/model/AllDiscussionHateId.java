package com.model;

/**
 * AllDiscussionHateId entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionHateId implements java.io.Serializable {

	// Fields

	private AllDiscussionVip allDiscussionVip;
	private AllDiscussionVip allDiscussionVip_1;

	// Constructors

	/** default constructor */
	public AllDiscussionHateId() {
	}

	/** full constructor */
	public AllDiscussionHateId(AllDiscussionVip allDiscussionVip, AllDiscussionVip allDiscussionVip_1) {
		this.allDiscussionVip = allDiscussionVip;
		this.allDiscussionVip_1 = allDiscussionVip_1;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AllDiscussionHateId))
			return false;
		AllDiscussionHateId castOther = (AllDiscussionHateId) other;

		return ((this.getAllDiscussionVip() == castOther.getAllDiscussionVip())
				|| (this.getAllDiscussionVip() != null && castOther.getAllDiscussionVip() != null
						&& this.getAllDiscussionVip().equals(castOther.getAllDiscussionVip())))
				&& ((this.getAllDiscussionVip_1() == castOther.getAllDiscussionVip_1())
						|| (this.getAllDiscussionVip_1() != null && castOther.getAllDiscussionVip_1() != null
								&& this.getAllDiscussionVip_1().equals(castOther.getAllDiscussionVip_1())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAllDiscussionVip() == null ? 0 : this.getAllDiscussionVip().hashCode());
		result = 37 * result + (getAllDiscussionVip_1() == null ? 0 : this.getAllDiscussionVip_1().hashCode());
		return result;
	}

}