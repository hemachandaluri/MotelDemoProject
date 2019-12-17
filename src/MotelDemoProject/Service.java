package MotelDemoProject;

public class Service {
	long service_id; // (long)
	String service_type; // (String)
	float price; //(float)
	
	public long getService_id() {
		return service_id;
	}
	public void setService_id(long service_id) {
		this.service_id = service_id;
	}
	public String getService_type() {
		return service_type;
	}
	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Service(long service_id, String service_type, float price) {
		super();
		this.service_id = service_id;
		this.service_type = service_type;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Service [service_id=" + service_id + ", service_type=" + service_type + ", price=" + price + "]";
	}
	
	
}
