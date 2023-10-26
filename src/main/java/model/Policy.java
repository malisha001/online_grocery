package model;

public class Policy {
	private int id;
	private String policyType;
	private String description;
	
	public Policy(int id, String policyType, String description) {
		super();
		this.id = id;
		this.policyType = policyType;
		this.description = description;
	}
	public Policy(String policyType, String description) {
		super();
		this.policyType = policyType;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Policy [id=" + id + ", policyType=" + policyType + ", description=" + description + "]";
	}
	
}
