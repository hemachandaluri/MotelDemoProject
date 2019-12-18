package MotelDemoProject;

public class BookingServiceReq {
	long service_booking_id;// (long)
	long service_id;// (long)
	long request_receiver_employee_id;//(long)
	long service_delivery_employee_id;//(long)
	long room_booking_id; //(long)
	public long getService_booking_id() {
		return service_booking_id;
	}
	public void setService_booking_id(long service_booking_id) {
		this.service_booking_id = service_booking_id;
	}
	public long getService_id() {
		return service_id;
	}
	public void setService_id(long service_id) {
		this.service_id = service_id;
	}
	public long getRequest_receiver_employee_id() {
		return request_receiver_employee_id;
	}
	public void setRequest_receiver_employee_id(long request_receiver_employee_id) {
		this.request_receiver_employee_id = request_receiver_employee_id;
	}
	public long getService_delivery_employee_id() {
		return service_delivery_employee_id;
	}
	public void setService_delivery_employee_id(long service_delivery_employee_id) {
		this.service_delivery_employee_id = service_delivery_employee_id;
	}
	public long getRoom_booking_id() {
		return room_booking_id;
	}
	public void setRoom_booking_id(long room_booking_id) {
		this.room_booking_id = room_booking_id;
	}
	public BookingServiceReq(long service_booking_id, long service_id, long request_receiver_employee_id,
			long service_delivery_employee_id, long room_booking_id) {
		this.service_booking_id = service_booking_id;
		this.service_id = service_id;
		this.request_receiver_employee_id = request_receiver_employee_id;
		this.service_delivery_employee_id = service_delivery_employee_id;
		this.room_booking_id = room_booking_id;
	}
	
	@Override
	public String toString() {
		return "BookingServiceReq [service_booking_id=" + service_booking_id + ", service_id=" + service_id
				+ ", request_receiver_employee_id=" + request_receiver_employee_id + ", service_delivery_employee_id="
				+ service_delivery_employee_id + ", room_booking_id=" + room_booking_id + "]";
	}
	

}
