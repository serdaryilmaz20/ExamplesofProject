package management;



public class InternShipes {
	 
	 private int studentNo;
	 private int companyNo;
	 private String internshipType;
	 private Calender  beginDate;
	 private Calender  finishDate;
	 private int approvedWeek;
	 private int unapprovedWeek;
	 private   int total=12;
	
	public InternShipes(int companyNo, String internshipType,Calender beginDate,
			Calender finishDate ,int approvedWeek, int unapprovedWeek) {
		
		this.companyNo = companyNo;
		this.internshipType = internshipType;
		this.beginDate = beginDate;
		this.finishDate = finishDate;
		this.approvedWeek=approvedWeek;
		this.unapprovedWeek=unapprovedWeek;
				//calc(beginDate.getDay(),beginDate.getMonth(),finishDate.getDay(),finishDate.getMonth());
	}
	
	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	public int getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(int companyNo) {
		this.companyNo = companyNo;
	}
	public String getInternshipType() {
		return internshipType;
	}
	public void setInternshipType(String internshipType) {
		this.internshipType = internshipType;
	}
	
	public int getApprovedWeek() {
		return approvedWeek;
	}
	public void setApprovedWeek(int approvedWeek) {
		this.approvedWeek = approvedWeek;
	}
	public int getUnapprovedWeek() {
		return unapprovedWeek;
	}
	public void setUnapprovedWeek(int unapprovedWeek) {
		this.unapprovedWeek = unapprovedWeek;
	}
	public Calender getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Calender beginDate) {
		this.beginDate = beginDate;
	}
	public Calender getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Calender finishDate) {
		this.finishDate = finishDate;
	}

	
	

}


