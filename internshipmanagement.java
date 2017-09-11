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
   
		
	static	Company [] com=new Company [40];// þirketler için verileri elde tutacak dizi nesnesi oluþturuyoruz
	static department  dep = new department ();
		
	public static void main(String[] args) {
		
		  companyadded();//ilk baþta temel olarak þirket ve ögrenci ekledik
		  Intershipadded ();
		 int choice=0;// kullanýcýdan alýnacak deðiþken için bunu tanýmlamalýyýz
	
		
		do {
			
			
			
				 choice=menu();//menu methodunu burada çaðýrýyoruz
				
				 if (choice==1) {
						choices_1();// ögrenci için ögrenci ekleme iþlemlerini yapýyoruz
						
						input3.nextLine();// ögrenci kayýt ettikten sonra tekrar baþa dönmesini enterla saðlýoruz
						
				  }
				 else if (choice==2)
				 {
					 choices_2();//company ekleme için  company methodunu caðýrýyoruz
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
		//ekran menu deðerini yazdýrmak için bir method oluþturuyoruz
		int choice=0;
		String choices;
		boolean loop=true;
		
		do {
			newConsole.getTextWindow().setCursorPosition(0, 0);// set cursor iþleminin baþlangýcý
			for (int i = 0; i <50; i++) {
				System.out.println("                                                                                                                      "
						+ "                                                                                                  ");
			}
			newConsole.getTextWindow().setCursorPosition(0, 0);// set cursor iþleminin sonucu
			
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
		
		choice=Integer.parseInt(choices);//alýnan string deðerini integere çeviriyoruz
		
		
		
		return choice;
		
		
	}
	public static void companyadded() { // þirket eklemek için bunu kullaýyoruzzzzz
		
		 Adress ad = new Adress("Doktorlar ",40,"Merkez","Denizli");//adress blogunu taslak olarak companye kayýt etmek için taslak þeklinde nesne oluþturuyoruz
		 Phone phone= new Phone("+90", "258", "3717682");// company telefonunu taslak olarak atmak için her seferinde gecici nesne oluþturuluyor
		 com[0]=new Company("Teknosa", ad,phone, "Software","Ýsmail Alpay");
		 Adress ad2 = new Adress("Cumhuriyet",26,"Salihli","Manisa");//adress blogunu taslak olarak companye kayýt etmek için taslak þeklinde nesne oluþturuyoruz
		 Phone phone2= new Phone("+90", "242", "356487");// company telefonunu taslak olarak atmak için her seferinde gecici nesne oluþturuluyor
		 com[1]=new Company("Aktif Biliþim", ad2,phone2, "Hardware","Seyhan Tuncer");
		 Adress ad3 = new Adress("Yenisehir ",24,"Buca","Ýzmir");//adress blogunu taslak olarak companye kayýt etmek için taslak þeklinde nesne oluþturuyoruz
		 Phone phone3= new Phone("+90", "232", "125464");// company telefonunu taslak olarak atmak için her seferinde gecici nesne oluþturuluyor
		 com[2]=new Company("Bimeks", ad3,phone3, "Software","Halime Yýlmaz");
		
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
	public static int rightdate( Calender dt2,Calender dt1) {// burada tarih hesaplatmasý yapýyoruz böylece girilen hafta aralýklarýný giriyoruz 
		
		   
		    long IlkGun=new Date(dt1.getYear(),dt1.getMonth(),dt1.getDay(),00,00).getTime();
	        long SonGun=new Date(dt2.getYear(),dt2.getMonth(),dt2.getDay(),00,00).getTime();//date nesnesi oluþtuyoruz.Bugün kü tarihi almak için.

	        long Fark=SonGun-IlkGun;//iki tarih arasýndaki farký hesaplýyoruz.
	        int weekcount=(int)(Fark/(1000*60*60*24))/7;
	        
			return weekcount;
		
	 
	}
	//ekran menusunu oluþturmak için bunu kllanýyoruz
	
	
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
			for (int i = 0; i < dep.getCounterogr(); i++) {//girilen ögrenci numarasýnýn daha önceden kayýtlý olup olmamasýna bakýp ona göre iþlem yapacaðýz 
				if (dep.getStudentlist()[i].getStudentNo()==no) {
					correct=false;
					break;
				}
				else
					correct=true;
			}// eger ögrenci yoksa önceden kayýlý deðilse o zaman direk  isim alarak iþleme baþlanýr
			if (correct==true) {
				
				System.out.print("Student Name = ");
				String name=input.nextLine();
				System.out.print("Student Surname = ");
				String surname=input.nextLine();
				System.out.print("Class = ");
				int classes=input2.nextInt();
				
			    Student	d = new Student(no, name, surname, classes);
			  
				dep.ogrAdd(d);// alýnan ögrenci isimlerini kalýp olarak ögrenciye kayýt ediliyor
				dep.ogrList();// alýnan her ögrenciyi tekrar kayýt ettiriyoruz
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
				
				 Adress ad = new Adress(cstreet,cno,ctown,ccity);//adress blogunu taslak olarak companye kayýt etmek için taslak þeklinde nesne oluþturuyoruz
				 Phone phone= new Phone(cphonecon, cphonear, cphonenum);// company telefonunu taslak olarak atmak için her seferinde gecici nesne oluþturuluyor
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
		 for (int i = 0; i < dep.getCounterogr(); i++) {// staj eklerken girilen ögrenci nin kayýtlý olup olmadýgýna bakýlýr
			if (dep.getStudentlist()[i].getStudentNo()==studentNo) {
				rightno=true;
				ogrplace=i;//giirlen numarnaýn ögrencinin kacýncý kiþisiyse ona kayýt eder
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
				 weekcount=rightdate(dt2,dt1);// burada tarih hesaplatmasý yapýyoruz
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
			 totalsoft=0;//her ögrenciye ait toplam software sayýsýný tutmak için 
			 totalhard=0;//her ögrenciye ait toplam hardware sayýný tutmak için bu deðiþkeni kullanýrýz ve her ögrenci için baþtan sýfýrlamak için buray tanýmlanýr
			 unappsoft=0;unapphard=0;
			 for (int k = 0; k <dep.getStudentlist()[i].getCount() ; k++) {//burada da her ögrenci için  staj sayýsýný dönüyoruz
				 
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
		 
		 for (int i = 0; i < dep.getCounterogr(); i++) {// her bölüm için butun ögrencileri tek tek tatýyoruz
			for (int j = 0; j < dep.getStudentlist()[i].getCount() ; j++) {// her bir ögrenciye ait staj sayýsýný aratýyoruz
				 if (dep.getStudentlist()[i].getIntership()[j].getInternshipType().equalsIgnoreCase(type)) {// girilen staj tipinin önceden kayýlý girilen yapýlan stajdakki type eþitmi diye aranýr 
						if (dep.getStudentlist()[i].getIntership()[j].getBeginDate().getYear()==year) {// girilen staj yýlýnýn önceden kayýltlý olan stajlarda var olan  yýllar eþitmi diye bakýlýr 
							
							if (com[(dep.getStudentlist()[i].getIntership()[j].getCompanyNo())-1].getAdress().getCity().equalsIgnoreCase(city)) {// önceden kayýtlý olan stajda company numarasý alýnýr ve o numradaki þirketin þehri ile kýyaslama yapýlýr
								comName=com[(dep.getStudentlist()[i].getIntership()[j].getCompanyNo())-1].getCompanyName();
								dep.getStudentlist() [i].internshipsearch(comName,j);// burada sadece ismi herþeyi ait olan kiþinin bilgilerini yazdýrýr ve o sýradaki kiþinin staj bilgilerini girsin diye 
							}                                                         // için j sayýsýný gönderiyoruz . burdaki amac sadece  o sýradaki kiþiyi yazdýrmaktýr bunun için intershipsearch methoduna
							//bu verileri gönderiyoruz
						}
					 
					
					 
				}
			}
		}
	}
  
}
