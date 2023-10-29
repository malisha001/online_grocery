package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Policy;

public class PolicyDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/onlinegrocerystore";
	private String jdbcuserName = "root";
	private String jdbcpassword = "1175";
	
	private static final String INSERT_POLICY_SQL ="INSERT INTO policy" + "(policytype,description) VALUES " + "(?,?);";
	
	private static final String SELECT_POLICY_BY_ID = "select id,policytype,description from policy where id = ?";
	private static final String SELECT_ALL_POLICY ="select * from policy";
	private static final String DELETE_POLICY_SQL ="delete from policy where id = ?;";
	private static final String UPDATE_POLICY_SQL = "update policy set policytype = ?,description = ? where id = ?;";
	
	// Constructor
	public PolicyDAO() {
		
	}
	
	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcuserName, jdbcpassword);	
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	//methods
	//Create or insert policy
	public void insertPolicy(Policy policy)throws SQLException {
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_POLICY_SQL)){
			preparedStatement.setString(1,policy.getPolicyType() );
			preparedStatement.setString(2,policy.getDescription());
			preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//update policy 							to be consistent with its SQL operations.
	public boolean updatePolicy(Policy policy) throws SQLException{
		boolean rowUpdated;
		try (Connection connection = getConnection ();
				PreparedStatement statement = connection.prepareStatement(UPDATE_POLICY_SQL);){
			statement.setString(1, policy.getPolicyType());
			statement.setString(2, policy.getDescription());
			statement.setInt(3,policy.getId());
			
			rowUpdated = statement.executeUpdate() >0;
		}
		return rowUpdated;
	}
	
	//select policy by id
	public  Policy selectPolicy(int id) {
		Policy policy = null;
		//Step 1:Establishing Connection
		try(Connection connection = getConnection();
				//Step 2:Create a statement using connection.object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_POLICY_BY_ID);){
			preparedStatement.setInt(1,id);
			System.out.println(preparedStatement);
			//Step 3: Execute the query or update the query
			ResultSet rs = preparedStatement.executeQuery();
			
			//Step 4:Process the Resultset object:
			while(rs.next()) {
				String policytype = rs.getString("policytype");
				String description = rs.getString("description");
				//create policy object pass values to the policy object
				policy = new Policy (id,policytype,description);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		return policy;
	}                                                  
	
	//select policies
	public List<Policy> selectAllPolicy() {
		List<Policy> policies = new ArrayList<>();
		//Step 1:Establishing Connection
		try(Connection connection = getConnection();
				//Step 2:Create a statement using connection.object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_POLICY);){
			System.out.println(preparedStatement);
			//Step 3: Execute the query or update the query
			ResultSet rs = preparedStatement.executeQuery();
			
			//Step 4:Process the Resultset object:
			while(rs.next()) {
				int id = rs.getInt("id");
				String policytype = rs.getString("policytype");
				String description = rs.getString("description");
				//create policy object pass values to the policy object
				policies.add(new Policy (id,policytype,description));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		return policies;
	}            
	
	//delete policy
	public boolean deletePolicy(int id)throws SQLException {
		boolean rowDeleted;
		try(Connection connection =getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_POLICY_SQL);){
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate()> 0;
		}
		return rowDeleted;
	}
}
