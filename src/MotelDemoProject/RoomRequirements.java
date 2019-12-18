package MotelDemoProject;

public class RoomRequirements {
	long room_id; //(long)
	String room_number; //(String)
	boolean enabel; //(bool)
	long categoryid; // (bool)
	
	//Getter and Setter Methods
	
	
	//Constructors 
	public RoomRequirements(long room_id, String room_number, boolean enabel, long categoryid) {
		super();
		this.room_id = room_id;
		this.room_number = room_number;
		this.enabel = enabel;
		this.categoryid = categoryid;
	}

	public long getRoom_id() {
		return room_id;
	}

	public void setRoom_id(long room_id) {
		this.room_id = room_id;
	}

	public String getRoom_number() {
		return room_number;
	}

	public void setRoom_number(String room_number) {
		this.room_number = room_number;
	}

	public boolean isEnabel() {
		return enabel;
	}

	public void setEnabel(boolean enabel) {
		this.enabel = enabel;
	}

	public long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(long categoryid) {
		this.categoryid = categoryid;
	}

	@Override
	public String toString() {
		return "RoomRequirements [room_id=" + room_id + ", room_number=" + room_number + ", enabel=" + enabel
				+ ", categoryid=" + categoryid + "]";
	}

}
