package model;

public class Location {

	private String pickUpLocation;
	private String dropOffLocation;

	public Location(String pickUpLocation, String dropOffLocation) {
		super();
		this.pickUpLocation = pickUpLocation;
		this.dropOffLocation = dropOffLocation;
	}

	public String getPickUpLocation() {
		return pickUpLocation;
	}

	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	public String getDropOffLocation() {
		return dropOffLocation;
	}

	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}
}
