package com.model;

/**
 * AllDiscussionRecrodId entity. @author MyEclipse Persistence Tools
 */

public class AllDiscussionRecrodId implements java.io.Serializable {

	// Fields

	private AllDiscussionCrads allDiscussionCrads;
	private AllDiscussionVip allDiscussionVip;

	// Constructors

	/** default constructor */
	public AllDiscussionRecrodId() {
	}

	/** full constructor */
	public AllDiscussionRecrodId(AllDiscussionCrads allDiscussionCrads, AllDiscussionVip allDiscussionVip) {
		this.allDiscussionCrads = allDiscussionCrads;
		this.allDiscussionVip = allDiscussionVip;
	}

	// Property accessors

	public AllDiscussionCrads getAllDiscussionCrads() {
		return this.allDiscussionCrads;
	}

	public void setAllDiscussionCrads(AllDiscussionCrads allDiscussionCrads) {
		this.allDiscussionCrads = allDiscussionCrads;
	}

	public AllDiscussionVip getAllDiscussionVip() {
		return this.allDiscussionVip;
	}

	public void setAllDiscussionVip(AllDiscussionVip allDiscussionVip) {
		this.allDiscussionVip = allDiscussionVip;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AllDiscussionRecrodId))
			return false;
		AllDiscussionRecrodId castOther = (AllDiscussionRecrodId) other;

		return ((this.getAllDiscussionCrads() == castOther.getAllDiscussionCrads())
				|| (this.getAllDiscussionCrads() != null && castOther.getAllDiscussionCrads() != null
						&& this.getAllDiscussionCrads().equals(castOther.getAllDiscussionCrads())))
				&& ((this.getAllDiscussionVip() == castOther.getAllDiscussionVip())
						|| (this.getAllDiscussionVip() != null && castOther.getAllDiscussionVip() != null
								&& this.getAllDiscussionVip().equals(castOther.getAllDiscussionVip())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAllDiscussionCrads() == null ? 0 : this.getAllDiscussionCrads().hashCode());
		result = 37 * result + (getAllDiscussionVip() == null ? 0 : this.getAllDiscussionVip().hashCode());
		return result;
	}

}