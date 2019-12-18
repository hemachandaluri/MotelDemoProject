package MotelDemoProject;

public class CatergoryRequirements 
{
	
	long id; //(long)
	String bed; //(String)
	int rooms; //  (int)
	boolean bathroom; //  (bool)
	boolean private_pool; //  (bool)
	boolean mini_Kitchen; //  (bool)
	int number_of_guests; //  (int)
	float rate; //  (float)
	float rate_for_additional_guests; // (float)
	boolean balcony; //  (bool)
	boolean shared_room; //  (bool)
	boolean enable; // (bool)
	
	public CatergoryRequirements(long id, String bed, int rooms, boolean bathroom, boolean private_pool,
			boolean mini_Kitchen, int number_of_guests, float rate, float rate_for_additional_guests, boolean balcony,
			boolean shared_room, boolean enable) {
		this.id = id;
		this.bed = bed;
		this.rooms = rooms;
		this.bathroom = bathroom;
		this.private_pool = private_pool;
		this.mini_Kitchen = mini_Kitchen;
		this.number_of_guests = number_of_guests;
		this.rate = rate;
		this.rate_for_additional_guests = rate_for_additional_guests;
		this.balcony = balcony;
		this.shared_room = shared_room;
		this.enable = enable;
	}
	//getID()
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	//getBed()
	public String getBed() {
		return bed;
	}
	public void setBed(String bed) {
		this.bed = bed;
	}
	
	//getRooms()
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	//isbathroom()
	public boolean isBathroom() {
		return bathroom;
	}
	public void setBathroom(boolean bathroom) {
		this.bathroom = bathroom;
	}
	
	//privatepool
	public boolean isPrivate_pool() {
		return private_pool;
	}
	public void setPrivate_pool(boolean private_pool) {
		this.private_pool = private_pool;
	}
	
	//miniKitchen
	public boolean isMini_Kitchen() {
		return mini_Kitchen;
	}
	public void setMini_Kitchen(boolean mini_Kitchen) {
		this.mini_Kitchen = mini_Kitchen;
	}
	
	//GetNumberOfGuests
	public int getNumber_of_guests() {
		return number_of_guests;
	}
	public void setNumber_of_guests(int number_of_guests) {
		this.number_of_guests = number_of_guests;
	}
	//getrate
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	//getRate_for_additional_guests
	public float getRate_for_additional_guests() {
		return rate_for_additional_guests;
	}
	public void setRate_for_additional_guests(float rate_for_additional_guests) {
		this.rate_for_additional_guests = rate_for_additional_guests;
	}
	//isBalcony
	public boolean isBalcony() {
		return balcony;
	}
	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}
	//isShared_room
	public boolean isShared_room() {
		return shared_room;
	}
	public void setShared_room(boolean shared_room) {
		this.shared_room = shared_room;
	}
	//isEnable
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	@Override
	public String toString() {
		return "CatergoryRequirements [id=" + id + ", bed=" + bed + ", rooms=" + rooms + ", bathroom=" + bathroom
				+ ", private_pool=" + private_pool + ", mini_Kitchen=" + mini_Kitchen + ", number_of_guests="
				+ number_of_guests + ", rate=" + rate + ", rate_for_additional_guests=" + rate_for_additional_guests
				+ ", balcony=" + balcony + ", shared_room=" + shared_room + ", enable=" + enable + "]";
	}
	
	
}
