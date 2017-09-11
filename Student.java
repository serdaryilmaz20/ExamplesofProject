package management;



public class Student {
	
	private long studentNo;
	private String studentName;
	private String studentSurName;
	private int classes;
	private InternShipes  [] intership=new InternShipes [4];
	private  int count=0;
	

	
	public Student(long studentNo, String studentName, String studentSurName,int classes) 
	{
		
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentSurName = studentSurName;
		this.classes = classes;
		
		
		
	}
	
	public void internAdd(InternShipes intershipe)
	{
		
		intership [count] =  intershipe;
		count++;
	}
	public void internshipList()
	{
		
		for (int i = 0; i < count; i++) {
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Student No = "+studentNo+" Student Name = "+studentName+" "+studentSurName+" Class = "+classes+" Company No = "+intership[i].getCompanyNo()+" Internship Type = "+intership[i].getInternshipType()+
					" Begin Calender = "+intership[i].getBeginDate().getDay()+"/"+intership[i].getBeginDate().getMonth()+"/"
					+ intership[i].getBeginDate().getYear()+" Finish Calender = "+intership[i].getFinishDate().getDay()+"/"+intership[i].getFinishDate().getMonth()+"/"
					+ intership[i].getFinishDate().getYear()+" "+" Approved Week = "+intership[i].getApprovedWeek()+" Unapproved Week = "+intership[i].getUnapprovedWeek());
			
		}
	}
	public void internshipsearch(String companyName,int sira) {
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
			       System.out.println("Student No = "+studentNo+" Student Name = "+studentName+" "+studentSurName+" Company Name = "+companyName+" Internship Type = "+intership[sira].getInternshipType()+
					" Begin Calender = "+intership[sira].getBeginDate().getDay()+"/"+intership[sira].getBeginDate().getMonth()+"/"
					+ intership[sira].getBeginDate().getYear()+" Finish Calender = "+intership[sira].getFinishDate().getDay()+"/"+intership[sira].getFinishDate().getMonth()+"/"
					+ intership[sira].getFinishDate().getYear());
			
		
	}

	public long getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(long studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurName() {
		return studentSurName;
	}

	public void setStudentSurName(String studentSurName) {
		this.studentSurName = studentSurName;
	}

	public int getClasses() {
		return classes;
	}

	public void setClasses(int classes) {
		this.classes = classes;
	}
  
public InternShipes  [] getIntership() {
	return intership;
}
public void setIntership(InternShipes  [] intership) {
	this.intership = intership;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}
	

}
