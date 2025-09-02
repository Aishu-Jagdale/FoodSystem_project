package com.dao;

import java.util.List;

import com.pojo.FeedBack;

public interface FeedBackDao {
	boolean addFeedBack(FeedBack fd);
	List<FeedBack> getAllFeedback();
	boolean deleteFeedBack(String emailId);
	
	
	

}
