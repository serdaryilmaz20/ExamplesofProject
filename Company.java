package management;



public class Company { // þireket için gerekli deðiþkenler tanýmlanýr
	private  static int comNo=0;
	private String companyName;
	private Adress adress;
	private Phone   phoneNumber;
	private String facilityArea;
	private String contactPerson;
	
	
	public Company(String companyName, Adress adress, Phone phoneNumber,
			String facilityArea, String contactPerson) {
		
		this.companyName = companyName;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.facilityArea = facilityArea;
		this.contactPerson = contactPerson;
		comNo++;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public Phone getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Phone phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFacilityArea() {
		return facilityArea;
	}

	public void setFacilityArea(String facilityArea) {
		this.facilityArea = facilityArea;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public static int getComNo() {
		return comNo;
	}

	public static void setComNo(int comNo) {
		Company.comNo = comNo;
	}

	

	
}