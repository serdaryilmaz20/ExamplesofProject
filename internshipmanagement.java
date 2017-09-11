package management;



import java.util.Date;
import java.util.Scanner;






import enigma.core.Enigma;

    public class internshipmanagement {
    	
	public static enigma.console.Console
	newConsole=Enigma.getConsole("InternShip");
	static Scanner input =new Scanner(System.in);
	static Scanner input2=new Scanner(System.in);
	static Scanner input3=new Scanner(System.in);
	
	static	int countercom=3;
   
		
	static	Company [] com=new Company [40];// �irketler i�in verileri elde tutacak dizi nesnesi olu�turuyoruz
	static department  dep = new department ();
		
	public static void main(String[] args) {
		
		  companyadded();//ilk ba�ta temel olarak �irket ve �grenci ekledik
		  Intershipadded ();
		 int choice=0;// kullan�c�dan al�nacak de�i�ken i�in bunu tan�mlamal�y�z
	
		
		do {
			
			
			
				 choice=menu();//menu methodunu burada �a��r�yoruz
				
				 if (choice==1) {
						choices_1();// �grenci i�in �grenci ekleme i�lemlerini yap�yoruz
						
						input3.nextLine();// �grenci kay�t ettikten sonra tekrar ba�a d�nmesini enterla sa�l�oruz
						
				  }
				 else if (choice==2)
				 {
					 choices_2();//company ekleme i�in  company methodunu ca��r�yoruz
					 input3.nextLine();
				 }
				 else if(choice==3)
				 {
					 choices_3();
					 input3.nextLine();
					 
				 }
				 else if (choice==4)
				 {
					 choices_4();
					 input3.nextLine();
				 }
				 else if (choice==5)
				 {
					 choices_5();
					 input3.nextLine();
				 }
				 else if (choice==6) {
					System.exit(1);
				}
				 
		    } while (choice!=6);
		
		
		
		
		
		

	}
	public static int menu() {
		//ekran menu de�erini yazd�rmak i�in bir method olu�turuyoruz
		int choice=0;
		String choices;
		boolean loop=true;
		
		do {
			newConsole.getTextWindow().setCursorPosition(0, 0);// set cursor i�leminin ba�lang�c�
			for (int i = 0; i <50; i++) {
				System.out.println("                                                                                                                      "
						+ "                                                                                                  ");
			}
			newConsole.getTextWindow().setCursorPosition(0, 0);// set cursor i�leminin sonucu
			
		System.out.println("       MENU");
		System.out.println("      ------");
		System.out.println("1.Student Add/List");
		System.out.println("2.Company Add/List");
		System.out.println("3.Internship Add");
		System.out.println("4.Incomplete Internships");
		System.out.println("5.Search on Internships");
		System.out.println("6.Exit");
		System.out.println();
		System.out.print("Enter your choice = ");
		
			
			newConsole.getTextWindow().setCursorPosition(19, 9);
			
			choices=input.nextLine();
			
			if ( choices.equals("1") || choices.equals("2") || choices.equals("3") || choices.equals("4") || choices.equals("5") || choices.equals("6") ) {
				loop=false;
			}
			else {
				newConsole.getTextWindow().setCursorPosition(19, 9);
				newConsole.getTextWindow().output("                                                   ");
			}
			
		} while (loop);
		
		choice=Integer.parseInt(choices);//al�nan string de�erini integere �eviriyoruz
		
		
		
		return choice;
		
		
	}
	public static void companyadded() { // �irket eklemek i�in bunu kulla�yoruzzzzz
		
		 Adress ad = new Adress("Doktorlar ",40,"Merkez","Denizli");//adress blogunu taslak olarak companye kay�t etmek i�in taslak �eklinde nesne olu�turuyoruz
		 Phone phone= new Phone("+90", "258", "3717682");// company telefonunu taslak olarak atmak i�in her seferinde gecici nesne olu�turuluyor
		 com[0]=new Company("Teknosa", ad,phone, "Software","�smail Alpay");
		 Adress ad2 = new Adress("Cumhuriyet",26,"Salihli","Manisa");//adress blogunu taslak olarak companye kay�t etmek i�in taslak �eklinde nesne olu�turuyoruz
		 Phone phone2= new Phone("+90", "242", "356487");// company telefonunu taslak olarak atmak i�in her seferinde gecici nesne olu�turuluyor
		 com[1]=new Company("Aktif Bili�im", ad2,phone2, "Hardware","Seyhan Tuncer");
		 Adress ad3 = new Adress("Yenisehir ",24,"Buca","�zmir");//adress blogunu taslak olarak companye kay�t etmek i�in taslak �eklinde nesne olu�turuyoruz
		 Phone phone3= new Phone("+90", "232", "125464");// company telefonunu taslak olarak atmak i�in her seferinde gecici nesne olu�turuluyor
		 com[2]=new Company("Bimeks", ad3,phone3, "Software","Halime Y�lmaz");
		
	}
	public static void Intershipadded () {
		Calender d1=new Calender("00/07/2014");
		Calender d2=new Calender("30/07/2014");
		Calender d3=new Calender("02/08/2014");
		Calender d4=new Calender("22/09/2014");
		Calender d5=new Calender("04/09/2014");
		Calender d6=new Calender("19/10/2014");
		Calender d7=new Calender("07/03/2014");
		Calender d8=new Calender("30/03/2014");
		InternShipes in1= new InternShipes(3, "software", d1,d2, 4, 0);
		InternShipes in2= new InternShipes(2, "hardware", d3,d4, 5, 2);
		InternShipes in3= new InternShipes(1, "software", d5,d6, 6, 0);
		InternShipes in4= new InternShipes(3, "hardware", d7,d8, 3, 1);
		dep.getStudentlist()[0].internAdd(in1);
		dep.getStudentlist()[0].internAdd(in2);
		dep.getStudentlist()[1].internAdd(in3);
		dep.getStudentlist()[1].internAdd(in4);
	}
	public static int rightdate( Calender dt2,Calender dt1) {// burada tarih hesaplatmas� yap�yoruz b�ylece girilen hafta aral�klar�n� giriyoruz 
		
		   
		    long IlkGun=new Date(dt1.getYear(),dt1.getMonth(),dt1.getDay(),00,00).getTime();
	        long SonGun=new Date(dt2.getYear(),dt2.getMonth(),dt2.getDay(),00,00).getTime();//date nesnesi olu�tuyoruz.Bug�n k� tarihi almak i�in.

	        long Fark=SonGun-IlkGun;//iki tarih aras�ndaki fark� hesapl�yoruz.
	        int weekcount=(int)(Fark/(1000*60*60*24))/7;
	        
			return weekcount;
		
	 
	}
	//ekran menusunu olu�turmak i�in bunu kllan�yoruz
	
	
	public static void choices_1 ()
	{
		System.out.println("1=Student Add ");
		System.out.println("2=Student List");
		System.out.print("Enter Your Choice = ");
		int ch=input2.nextInt();
		
		if (ch==1) {
			boolean correct=true;
			System.out.print("Student No = ");
			long no=input2.nextLong();
			for (int i = 0; i < dep.getCounterogr(); i++) {//girilen �grenci numaras�n�n daha �nceden kay�tl� olup olmamas�na bak�p ona g�re i�lem yapaca��z 
				if (dep.getStudentlist()[i].getStudentNo()==no) {
					correct=false;
					break;
				}
				else
					correct=true;
			}// eger �grenci yoksa �nceden kay�l� de�ilse o zaman direk  isim alarak i�leme ba�lan�r
			if (correct==true) {
				
				System.out.print("Student Name = ");
				String name=input.nextLine();
				System.out.print("Student Surname = ");
				String surname=input.nextLine();
				System.out.print("Class = ");
				int classes=input2.nextInt();
				
			    Student	d = new Student(no, name, surname, classes);
			  
				dep.ogrAdd(d);// al�nan �grenci isimlerini kal�p olarak �grenciye kay�t ediliyor
				dep.ogrList();// al�nan her �grenciyi tekrar kay�t ettiriyoruz
			}
			else
				System.out.println("This Student is exist ");
			
		}
		else if (ch==2) {
			dep.ogrList();
		}
		
		
	}
	public static  void choices_2 ()
	{
		boolean rightcom=true;
		System.out.println("1=Company Add ");
		System.out.println("2=Company List");
		System.out.print("Enter Your Choice = ");
		int chcompany=input2.nextInt();
		if (chcompany==1) {
			 System.out.print("Company Name = ");
			 String cname=input.nextLine();
			 for (int i = 0; i < countercom; i++) {
				if (com[i].getCompanyName().equalsIgnoreCase(cname)) {
					rightcom=false;
					break;
				}
				else
					rightcom=true;
			}
			 if (rightcom==true) {
				 System.out.print("Company Facility Area = ");
				 String carea=input.nextLine();
				 System.out.print("Company Contact Person = ");
				 String cperson=input.nextLine();
				 System.out.print("Company Adress/street = ");
				 String cstreet=input.nextLine();
				 System.out.print("Company Adress/no = ");
				 int cno=input2.nextInt();
				 System.out.print("Company Adress/town = ");
				 String ctown=input.nextLine();
				 System.out.print("Company Adress/city = ");
				 String ccity=input.nextLine();
				 System.out.print("Company Phone Number/Country Code  = ");
				 String cphonecon=input.nextLine();
				 System.out.print("Company Phone Number/Area Code  = ");
				 String cphonear=input.nextLine();
				 System.out.print("Company Phone Number/Number  = ");
				 String cphonenum=input.nextLine();
				
				 Adress ad = new Adress(cstreet,cno,ctown,ccity);//adress blogunu taslak olarak companye kay�t etmek i�in taslak �eklinde nesne olu�turuyoruz
				 Phone phone= new Phone(cphonecon, cphonear, cphonenum);// company telefonunu taslak olarak atmak i�in her seferinde gecici nesne olu�turuluyor
				 com[countercom]=new Company(cname, ad,phone, carea, cperson);
				 countercom++;
				 for (int i = 0; i < countercom; i++) {
					 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("NO = "+(i+1)+" NAME = "+com[i].getCompanyName()+" FACILITY-AREA = "+com[i].getFacilityArea()+" CONTACT-PERSON = "+com[i].getContactPerson()
							+" PHONE-NUMBER = "+com[i].getPhoneNumber().getCountryCode()+
							" "+com[i].getPhoneNumber().getAreaCode()+" "+com[i].getPhoneNumber().getNumber()+
							" ADRESS = "+"(street) "+com[i].getAdress().getStreet()+" (door_no) "+com[i].getAdress().getNo()+" (town) "+com[i].getAdress().getTown()+" (city) "+
							com[i].getAdress().getCity());
					}
			}
			 else
				 System.out.println("This Compnay is exist !! ");
				 
			
			
		}
		 else if (chcompany==2) {
			 if (countercom==0) {
						System.out.println("Company List is null ");
					}
					 else
					{
					  for (int i = 0; i < countercom; i++) {
						  System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
							System.out.println("NO = "+(i+1)+" NAME = "+com[i].getCompanyName()+" FACILITY-AREA = "+com[i].getFacilityArea()+" CONTACT-PERSON = "+com[i].getContactPerson()
									+" PHONE-NUMBER = "+com[i].getPhoneNumber().getCountryCode()+
									" "+com[i].getPhoneNumber().getAreaCode()+" "+com[i].getPhoneNumber().getNumber()+
									" ADRESS = "+"(street) "+com[i].getAdress().getStreet()+" (door_no) "+com[i].getAdress().getNo()+" (town) "+com[i].getAdress().getTown()+" (city) "+
									com[i].getAdress().getCity());
						}
					}
			}
		
	}
	
	public static void choices_3()
	{
		 int ogrplace=0;
		 boolean rightno=true;
		 System.out.print("Enter Student No = ");
		 int studentNo=input2.nextInt();
		 for (int i = 0; i < dep.getCounterogr(); i++) {// staj eklerken girilen �grenci nin kay�tl� olup olmad�g�na bak�l�r
			if (dep.getStudentlist()[i].getStudentNo()==studentNo) {
				rightno=true;
				ogrplace=i;//giirlen numarna�n �grencinin kac�nc� ki�isiyse ona kay�t eder
				break;
			}
			else
				rightno=false;
		}
		if (rightno==true)
		{  boolean comloop=true;
		   int comNo=0;
			do {
				
			newConsole.getTextWindow().setCursorPosition(0, 11);
			for (int i = 0; i < 2; i++) {
				System.out.println("                                                       ");
			}
			
			newConsole.getTextWindow().setCursorPosition(0, 11);
			System.out.print("Company No = ");
			 comNo=input2.nextInt();
			if (comNo <= countercom) {
				comloop=false;
			}
			else {
				System.out.println("Company is not avaible !!!");
				input.nextLine();
			}

			
		} while (comloop);
			int weekcount=0;
			System.out.print("Internship Type = ");
			String type=input.next();
			boolean exist=true;
			Calender dt1,dt2;
			do {
				newConsole.getTextWindow().setCursorPosition(0, 13);
				for (int i = 0; i < 3; i++) {
					System.out.println("                                                       ");
				}
				newConsole.getTextWindow().setCursorPosition(0, 13);
				System.out.print("Begin date (DD/MM/YYYY) = ");
				String begindate=input.next();
				System.out.print("Finish Calender (DD/MM/YYYY)  = ");
				String finishdate=input.next();
				
				 dt1= new Calender(begindate);
				 dt2= new Calender(finishdate);
				 weekcount=rightdate(dt2,dt1);// burada tarih hesaplatmas� yap�yoruz
				 if (weekcount<4 || weekcount>8) {
					System.out.println("Enter The date between min 4 and max 8 week ");
					exist=true;
					input3.nextLine();
				}
				 else
					 exist=false;
				 
			} while (exist);
			
			int appweek,unapweek;//kabul edilen ve edilmeyen haftalar
			
			 exist=true;
			do {
				newConsole.getTextWindow().setCursorPosition(0, 15);
				for (int i = 0; i < 3; i++) {
					System.out.println("                                                       ");
				}
				newConsole.getTextWindow().setCursorPosition(0, 15);
				System.out.print("Approved Week = ");
				appweek=input2.nextInt();
				System.out.print("Unapproved Week = ");
				unapweek=input2.nextInt();
				 
				 if (weekcount != appweek+unapweek ){
					 System.out.println("Enter the sum of week is  "+weekcount);
					 input3.nextLine();
					 exist=true;
					} 
				 else {
					exist=false;
				}
			       
			       
				
			} while (exist);
			
			InternShipes intern= new InternShipes(comNo, type, dt1, dt2,appweek,unapweek);
			dep.getStudentlist()[ogrplace].internAdd(intern);
			dep.getStudentlist()[ogrplace].internshipList();
			input3.nextLine();
			
		}
		else {
			System.out.println("That Student No is not avalible");
		}
		
	}
	
	public static void choices_4() {
		 int totalsoft=0,totalhard=0;
		 int unappsoft=0,unapphard=0;
		 for (int i = 0; i < dep.getCounterogr(); i++) {
			 totalsoft=0;//her �grenciye ait toplam software say�s�n� tutmak i�in 
			 totalhard=0;//her �grenciye ait toplam hardware say�n� tutmak i�in bu de�i�keni kullan�r�z ve her �grenci i�in ba�tan s�f�rlamak i�in buray tan�mlan�r
			 unappsoft=0;unapphard=0;
			 for (int k = 0; k <dep.getStudentlist()[i].getCount() ; k++) {//burada da her �grenci i�in  staj say�s�n� d�n�yoruz
				 
				 if (dep.getStudentlist()[i].getIntership()[k].getInternshipType().equalsIgnoreCase("software")) {
					
						totalsoft=totalsoft+dep.getStudentlist()[i].getIntership()[k].getApprovedWeek();
						unappsoft=unappsoft+dep.getStudentlist()[i].getIntership()[k].getUnapprovedWeek();
					 
				}
				 else if (dep.getStudentlist()[i].getIntership()[k].getInternshipType().equalsIgnoreCase("hardware")) {
						
						totalhard=totalhard+dep.getStudentlist()[i].getIntership()[k].getApprovedWeek();
						unapphard=unapphard+dep.getStudentlist()[i].getIntership()[k].getUnapprovedWeek();
					 
				}
				 
				 
			}
			
			if (totalsoft<4  || totalhard<2 || (totalhard+totalsoft<12)  ) {
				if ((totalhard+totalsoft!=0) || ( unapphard+unappsoft != 0)) {
					System.out.print("No = "+dep.getStudentlist() [i].getStudentNo() +" Name = "+dep.getStudentlist() [i].getStudentName()+" "+dep.getStudentlist() [i].getStudentSurName()+
							" Type  (Software) = "+totalsoft+" "+" Type (Hardware)= "+totalhard+" "+" Order = "+ (12-(totalhard+totalsoft))+" Total UnapprovedWeek = "+ (unapphard+unappsoft));
				}
			}
			System.out.println();
				
			
		}
		 
	}
	
	public static void choices_5() {
		 
		 System.out.print("City = ");
		 String city = input.nextLine();
		 System.out.print("Year = ");
		 int year=input2.nextInt();
		 System.out.print("Type = ");
		 String type = input.nextLine();
		 String comName=" ";
		 
		 for (int i = 0; i < dep.getCounterogr(); i++) {// her b�l�m i�in butun �grencileri tek tek tat�yoruz
			for (int j = 0; j < dep.getStudentlist()[i].getCount() ; j++) {// her bir �grenciye ait staj say�s�n� arat�yoruz
				 if (dep.getStudentlist()[i].getIntership()[j].getInternshipType().equalsIgnoreCase(type)) {// girilen staj tipinin �nceden kay�l� girilen yap�lan stajdakki type e�itmi diye aran�r 
						if (dep.getStudentlist()[i].getIntership()[j].getBeginDate().getYear()==year) {// girilen staj y�l�n�n �nceden kay�ltl� olan stajlarda var olan  y�llar e�itmi diye bak�l�r 
							
							if (com[(dep.getStudentlist()[i].getIntership()[j].getCompanyNo())-1].getAdress().getCity().equalsIgnoreCase(city)) {// �nceden kay�tl� olan stajda company numaras� al�n�r ve o numradaki �irketin �ehri ile k�yaslama yap�l�r
								comName=com[(dep.getStudentlist()[i].getIntership()[j].getCompanyNo())-1].getCompanyName();
								dep.getStudentlist() [i].internshipsearch(comName,j);// burada sadece ismi her�eyi ait olan ki�inin bilgilerini yazd�r�r ve o s�radaki ki�inin staj bilgilerini girsin diye 
							}                                                         // i�in j say�s�n� g�nderiyoruz . burdaki amac sadece  o s�radaki ki�iyi yazd�rmakt�r bunun i�in intershipsearch methoduna
							//bu verileri g�nderiyoruz
						}
					 
					
					 
				}
			}
		}
	}
  
}
