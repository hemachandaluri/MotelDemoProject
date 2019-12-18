package MotelDemoProject;
import java.util.Date;

public class EmployeeReq {
	long employee_id; // (long)
	String employee_name; // (String)
	String employee_address; // (String)
	String employee_role; // (String)
	String employee_phone_number; // (String)
	Date date_of_birth; // (date)
	float rate_per_role; // (float)
	String proof_of_identity; // (String)
	Date joining_date; // (date)
	Date date_of_exiting; // (Date)
	
	//Constructors
	public EmployeeReq(long employee_id, String employee_name, String employee_address, String employee_role,
			String employee_phone_number, Date date_of_birth, float rate_per_role, String proof_of_identity,
			Date joining_date, Date date_of_exiting) {
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_address = employee_address;
		this.employee_role = employee_role;
		this.employee_phone_number = employee_phone_number;
		this.date_of_birth = date_of_birth;
		this.rate_per_role = rate_per_role;
		this.proof_of_identity = proof_of_identity;
		this.joining_date = joining_date;
		this.date_of_exiting = date_of_exiting;
	}
	//Getters and Setters
	public long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_address() {
		return employee_address;
	}

	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}

	public String getEmployee_role() {
		return employee_role;
	}

	public void setEmployee_role(String employee_role) {
		this.employee_role = employee_role;
	}

	public String getEmployee_phone_number() {
		return employee_phone_number;
	}

	public void setEmployee_phone_number(String employee_phone_number) {
		this.employee_phone_number = employee_phone_number;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public float getRate_per_role() {
		return rate_per_role;
	}

	public void setRate_per_role(float rate_per_role) {
		this.rate_per_role = rate_per_role;
	}

	public String getProof_of_identity() {
		return proof_of_identity;
	}

	public void setProof_of_identity(String proof_of_identity) {
		this.proof_of_identity = proof_of_identity;
	}

	public Date getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}

	public Date getDate_of_exiting() {
		return date_of_exiting;
	}

	public void setDate_of_exiting(Date date_of_exiting) {
		this.date_of_exiting = date_of_exiting;
	}
	@Override
	public String toString() {
		return "EmployeeReq [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_address="
				+ employee_address + ", employee_role=" + employee_role + ", employee_phone_number="
				+ employee_phone_number + ", date_of_birth=" + date_of_birth + ", rate_per_role=" + rate_per_role
				+ ", proof_of_identity=" + proof_of_identity + ", joining_date=" + joining_date + ", date_of_exiting="
				+ date_of_exiting + "]";
	}
	
	//toString()

}
