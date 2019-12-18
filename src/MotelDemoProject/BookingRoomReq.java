package MotelDemoProject;
import java.sql.Timestamp;

public class BookingRoomReq {
	long room_booking_id; //(long)
	long guest_id; //(long)
	long room_id; //(long)
	Timestamp checkin_time; // (time stamp)
	Timestamp checkout_time; //  (time stamp)
	long checkin_employee_id; // (long)
	long checkout_employee_id; // (long)
	int number_of_guests; // (int)
	float amount; // (float)
	public long getRoom_booking_id() {
		return room_booking_id;
	}
	public void setRoom_booking_id(long room_booking_id) {
		this.room_booking_id = room_booking_id;
	}
	public long getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(long guest_id) {
		this.guest_id = guest_id;
	}
	public long getRoom_id() {
		return room_id;
	}
	public void setRoom_id(long room_id) {
		this.room_id = room_id;
	}
	public Timestamp getCheckin_time() {
		return checkin_time;
	}
	public void setCheckin_time(Timestamp checkin_time) {
		this.checkin_time = checkin_time;
	}
	public Timestamp getCheckout_time() {
		return checkout_time;
	}
	public void setCheckout_time(Timestamp checkout_time) {
		this.checkout_time = checkout_time;
	}
	public long getCheckin_employee_id() {
		return checkin_employee_id;
	}
	public void setCheckin_employee_id(long checkin_employee_id) {
		this.checkin_employee_id = checkin_employee_id;
	}
	public long getCheckout_employee_id() {
		return checkout_employee_id;
	}
	public void setCheckout_employee_id(long checkout_employee_id) {
		this.checkout_employee_id = checkout_employee_id;
	}
	public int getNumber_of_guests() {
		return number_of_guests;
	}
	public void setNumber_of_guests(int number_of_guests) {
		this.number_of_guests = number_of_guests;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public BookingRoomReq(long room_booking_id, long guest_id, long room_id, Timestamp checkin_time,
			Timestamp checkout_time, long checkin_employee_id, long checkout_employee_id, int number_of_guests,
			float amount) {
		this.room_booking_id = room_booking_id;
		this.guest_id = guest_id;
		this.room_id = room_id;
		this.checkin_time = checkin_time;
		this.checkout_time = checkout_time;
		this.checkin_employee_id = checkin_employee_id;
		this.checkout_employee_id = checkout_employee_id;
		this.number_of_guests = number_of_guests;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BookingRoomReq [room_booking_id=" + room_booking_id + ", guest_id=" + guest_id + ", room_id=" + room_id
				+ ", checkin_time=" + checkin_time + ", checkout_time=" + checkout_time + ", checkin_employee_id="
				+ checkin_employee_id + ", checkout_employee_id=" + checkout_employee_id + ", number_of_guests="
				+ number_of_guests + ", amount=" + amount + "]";
	}
	
}
