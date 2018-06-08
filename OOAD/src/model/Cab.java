package model;

public class Cab {
	private String vehicleType;
	private String licensePlateNo;
	private float ratePerMile;
	private String model;

	public Cab(String vehicleType, String licensePlateNo, float ratePerMile,String model) {
		super();
		this.vehicleType = vehicleType;
		this.licensePlateNo = licensePlateNo;
		this.ratePerMile = ratePerMile;
		this.model=model;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getLicensePlateNo() {
		return licensePlateNo;
	}

	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}

	public float getRatePerMile() {
		return ratePerMile;
	}

	public void setRatePerMile(float ratePerMile) {
		this.ratePerMile = ratePerMile;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
