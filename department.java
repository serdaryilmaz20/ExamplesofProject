package management;


public class department {
	private int code;
	private String name;
	private Student [] studentlist;
	private academic [] academicperson;
	private internshipperiod [] period;
	private static int counterogr;
	
	
	public department ()
	{
		studentlist=new Student [400];
		counterogr=4;
		academicperson=new academic [4] ;
		
		 period=new internshipperiod [3];
		
		 //------------------------------------------
		name="computer";
		code=20010;
		//-------------------------------------------
		academicperson[0]=new academic ("Yalçýn","ÇEBÝ","Prof. Dr.") ;
		academicperson[1]=new academic ("Yunus","DOÐAN","Res. Asst") ;
		//--------------------------------------------------------------
		period[0]=new internshipperiod("SOFTWARE", 4);
		period[1]= new internshipperiod("HARDWARE", 2);
		period[2]=new internshipperiod("HARDWARE OR SOFTWARE ", 6);
		//-------------------------------------------------------------------
		studentlist[0]=new Student(2012510105, "Serdar", "YILMAZ", 4);
		studentlist[1]=new Student(2012510030, "Eren", "ERTEN", 3);
		studentlist[2]=new Student(2012510106, "Gizem", "ÇÝPÝLOÐLU", 2);
		studentlist[3]=new Student(2012510003, "Hasan", "AKGUN", 1);
		//---------------------------------------------------------
		
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Student[] getStudentlist() {
		return studentlist;
	}
	public void setStudentlist(Student[] studentlist) {
		this.studentlist = studentlist;
	}
	
	
	public void ogrAdd(Student stundentlister) {
		studentlist [counterogr] = stundentlister;
		counterogr++;
		
	}
	
	public void ogrList()
	{
		for (int i = 0; i < counterogr; i++) {
			System.out.println("----------------------------------------------------------");
			System.out.println("NO = "+studentlist[i].getStudentNo()+" NAME SURNAME = "+studentlist[i].getStudentName()+" "+
		studentlist[i].getStudentSurName()+" CLASS = "+studentlist[i].getClasses());
			
		}
		
	}
	public void academicList()
	{
		for (int i = 0; i < 2; i++) {
			System.out.println("Role = "+academicperson[i].getRole()+" Name Surname = "+academicperson[i].getName()+" " +academicperson[i].getSurname());
		}
		
	}
	public void periodList()
	{
		for (int i = 0; i < 3; i++) {
			System.out.println("Period Type = "+period[i].getType()+" Period Week = "+period[i].getWeek());
		}
		
	}


	public static int getCounterogr() {
		return counterogr;
	}


	public static void setCounterogr(int counterogr) {
		department.counterogr = counterogr;
	}
	
	
	
	
	

}
