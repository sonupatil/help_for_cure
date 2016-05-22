package help.models;

public class Doctor {

	private int id;
	private String name;
	private String address;
	private String mobileNo;
	private String medicalRegistrationId;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private String email;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getMedicalRegistrationId() {
		return medicalRegistrationId;
	}
	public void setMedicalRegistrationId(String medicalRegistrationId) {
		this.medicalRegistrationId = medicalRegistrationId;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
	public Doctor(int id, String name, String address, String mobileNo, String medicalRegistrationId, String city,
			String state, String country, String pincode, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.medicalRegistrationId = medicalRegistrationId;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.email = email;
	}
	
	public Doctor() {
		super();
	}
	
	
	
}
