package com.pojo;

public class FeedBack {
	
	private String emailId;
	private String review;
	private int  rank;
	private String Suggestion;
	
	
	public FeedBack() {
		super();
	}

	public FeedBack(String emailId, String review, int rank, String suggestion) {
		super();
		this.emailId = emailId;
		this.review = review;
		this.rank = rank;
		Suggestion = suggestion;
	}


	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getSuggestion() {
		return Suggestion;
	}

	public void setSuggestion(String suggestion) {
		Suggestion = suggestion;
	}

	@Override
	public String toString() {
		return "FeedBack [emailId=" + emailId + ", review=" + review + ", rank=" + rank
				+ ", Suggestion=" + Suggestion + "]";
	}
	
	
	
	

}
