package help.models;

public class Patient {
	
	private int id;
	private String name;
	private String address;
	private String eamilId;
	private String mobileNo;
	private String diseaseName;
	private String stage;
	private String diseaseDetails;
	private String note;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	private String expectedExpenses;
	private String referalDoctorName;
	private String referalDoctorAddress;
	private String referalDoctorMobileNo;
	private String referalDoctorCity;
	private String referalDoctorState;
	private String referalDoctorCountry;
	private String referalDoctorPinCode;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
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
	public String getExpectedExpenses() {
		return expectedExpenses;
	}
	public void setExpectedExpenses(String expectedExpenses) {
		this.expectedExpenses = expectedExpenses;
	}
	
	
	
	public String getReferalDoctorName() {
		return referalDoctorName;
	}
	public void setReferalDoctorName(String referalDoctorName) {
		this.referalDoctorName = referalDoctorName;
	}
	public String getReferalDoctorAddress() {
		return referalDoctorAddress;
	}
	public void setReferalDoctorAddress(String referalDoctorAddress) {
		this.referalDoctorAddress = referalDoctorAddress;
	}
	public String getReferalDoctorMobileNo() {
		return referalDoctorMobileNo;
	}
	public void setReferalDoctorMobileNo(String referalDoctorMobileNo) {
		this.referalDoctorMobileNo = referalDoctorMobileNo;
	}
	public String getReferalDoctorCity() {
		return referalDoctorCity;
	}
	public void setReferalDoctorCity(String referalDoctorCity) {
		this.referalDoctorCity = referalDoctorCity;
	}
	public String getReferalDoctorState() {
		return referalDoctorState;
	}
	public void setReferalDoctorState(String referalDoctorState) {
		this.referalDoctorState = referalDoctorState;
	}
	public String getReferalDoctorCountry() {
		return referalDoctorCountry;
	}
	public void setReferalDoctorCountry(String referalDoctorCountry) {
		this.referalDoctorCountry = referalDoctorCountry;
	}
	public String getReferalDoctorPinCode() {
		return referalDoctorPinCode;
	}
	public void setReferalDoctorPinCode(String referalDoctorPinCode) {
		this.referalDoctorPinCode = referalDoctorPinCode;
	}
	public String getEamilId() {
		return eamilId;
	}
	public void setEamilId(String eamilId) {
		this.eamilId = eamilId;
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
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getDiseaseDetails() {
		return diseaseDetails;
	}
	public void setDiseaseDetails(String diseaseDetails) {
		this.diseaseDetails = diseaseDetails;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	
	
	
	
	
	
	public Patient(int id, String name, String address, String eamilId, String mobileNo, String diseaseName,
			String stage, String diseaseDetails, String note, String city, String state, String country, String pinCode,
			String expectedExpenses, String referalDoctorName, String referalDoctorAddress,
			String referalDoctorMobileNo, String referalDoctorCity, String referalDoctorState,
			String referalDoctorCountry, String referalDoctorPinCode) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.eamilId = eamilId;
		this.mobileNo = mobileNo;
		this.diseaseName = diseaseName;
		this.stage = stage;
		this.diseaseDetails = diseaseDetails;
		this.note = note;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
		this.expectedExpenses = expectedExpenses;
		this.referalDoctorName = referalDoctorName;
		this.referalDoctorAddress = referalDoctorAddress;
		this.referalDoctorMobileNo = referalDoctorMobileNo;
		this.referalDoctorCity = referalDoctorCity;
		this.referalDoctorState = referalDoctorState;
		this.referalDoctorCountry = referalDoctorCountry;
		this.referalDoctorPinCode = referalDoctorPinCode;
	}
	public Patient() {
		super();
	}
	
	
	
	
	

}
