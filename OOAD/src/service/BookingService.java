package service;
import model.CabType;
import model.Driver;
import model.Location;
import model.Trip;

public interface BookingService {
	
	public float estimateFare(Location location, CabType cabType);
	public String makeBooking(String netId,Location location,float fare);
	//public Driver allocateRide(String bookingId);

}
