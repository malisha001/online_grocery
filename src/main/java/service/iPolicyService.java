package service;

import java.util.List;

import model.Policy;

public interface iPolicyService {
	//add policy 
	public void insertPolicy(Policy policy);
	
	//update policies
	public boolean updatePolicy(Policy policy);
	
	//select one policy
	public  Policy selectPolicy(int id);
	//select policy
	public List<Policy> selectAllPolicy();
}
