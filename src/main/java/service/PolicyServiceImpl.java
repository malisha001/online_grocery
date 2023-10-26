package service;

import java.util.List;

import model.Policy;

public class PolicyServiceImpl implements iPolicyService{
	private static final String INSERT_POLICY_SQL ="INSERT INTO policy" + "(policytype,description) VALUES " + "(?,?);";
	
	private static final String SELECT_POLICY_BY_ID = "select id,policytype,description from policy where id = ?";
	private static final String SELECT_ALL_POLICY ="select * from policy";
	private static final String DELETE_POLICY_SQL ="delete from policy where id = ?;";
	private static final String UPDATE_POLICY_SQL = "update policy set policytype = ?,description = ? where id = ?;";
	
	//add policy
	@Override
	public void insertPolicy(Policy policy) {
		// TODO Auto-generated method stub	
		
	}

	@Override
	public boolean updatePolicy(Policy policy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Policy selectPolicy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> selectAllPolicy() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
