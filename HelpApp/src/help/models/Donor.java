package help.models;

public class Donor {

	private int id;
	private String type;
	private String name;
	private String address;
	private String mobileNo;
	private String donationType;
	private String eamilId;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDonationType() {
		return donationType;
	}
	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}
	public String getEamilId() {
		return eamilId;
	}
	public void setEamilId(String eamilId) {
		this.eamilId = eamilId;
	}
	
	
	
	public Donor(int id, String type, String name, String address, String mobileNo, String donationType, String eamilId,
			String city, String state, String country, String pinCode) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.donationType = donationType;
		this.eamilId = eamilId;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}
	public Donor() {
		super();
	}

	
	
	
	
}
