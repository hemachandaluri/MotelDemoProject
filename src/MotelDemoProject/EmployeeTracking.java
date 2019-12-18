package MotelDemoProject;
import java.sql.Timestamp;

public class EmployeeTracking {
	long tracking_id;  //(long)
	long employee_id; //(long)
	Timestamp Signin_time; //(time stamp)
	Timestamp Signout_time; //(time stamp)
	
	//GettersandSetters
	public long getTracking_id() {
		return tracking_id;
	}
	public void setTracking_id(long tracking_id) {
		this.tracking_id = tracking_id;
	}
	public long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}
	public Timestamp getSignin_time() {
		return Signin_time;
	}
	public void setSignin_time(Timestamp signin_time) {
		Signin_time = signin_time;
	}
	public Timestamp getSignout_time() {
		return Signout_time;
	}
	public void setSignout_time(Timestamp signout_time) {
		Signout_time = signout_time;
	}
	
	//Constructors
	public EmployeeTracking(long tracking_id, long employee_id, Timestamp signin_time, Timestamp signout_time) {
		this.tracking_id = tracking_id;
		this.employee_id = employee_id;
		Signin_time = signin_time;
		Signout_time = signout_time;
	}
	@Override
	public String toString() {
		return "EmployeeTracking [tracking_id=" + tracking_id + ", employee_id=" + employee_id + ", Signin_time="
				+ Signin_time + ", Signout_time=" + Signout_time + "]";
	}
}
