package MotelDemoProject;

public class GuestDetailsreq {
	long guest_id; // (Long)
	String name; // (String)
	String address; // (String)
	String proof_of_identity; // (String-path of file)
	String phone_number; // (String) 
	int number_of_guests; //(int)
	float amount_paid; // (float)\
	float total_amount; // (sum of selected rooms) (float)
	public long getGuest_id() { 
		return guest_id;
	}
	public void setGuest_id(long guest_id) {
		this.guest_id = guest_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProof_of_identity() {
		return proof_of_identity;
	}
	public void setProof_of_identity(String proof_of_identity) {
		this.proof_of_identity = proof_of_identity;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public int getNumber_of_guests() {
		return number_of_guests;
	}
	public void setNumber_of_guests(int number_of_guests) {
		this.number_of_guests = number_of_guests;
	}
	public float getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(float amount_paid) {
		this.amount_paid = amount_paid;
	}
	public float getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}
	public GuestDetailsreq(long guest_id, String name, String address, String proof_of_identity, String phone_number,
			int number_of_guests, float amount_paid, float total_amount) {
		this.guest_id = guest_id;
		this.name = name;
		this.address = address;
		this.proof_of_identity = proof_of_identity;
		this.phone_number = phone_number;
		this.number_of_guests = number_of_guests;
		this.amount_paid = amount_paid;
		this.total_amount = total_amount;
	}
	@Override
	public String toString() {
		return "GuestDetailsreq [guest_id=" + guest_id + ", name=" + name + ", address=" + address
				+ ", proof_of_identity=" + proof_of_identity + ", phone_number=" + phone_number + ", number_of_guests="
				+ number_of_guests + ", amount_paid=" + amount_paid + ", total_amount=" + total_amount + "]";
	}
}

