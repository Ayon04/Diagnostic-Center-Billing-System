import java.util.*;
import java.util.Date;
import java.io.FileWriter;

class TestMain{
	
	public static void main(String args []){
		
		int c=0;
		while(c<1){
	
	System.out.println("\nJ.N Nova Diagnostic Center\nKhulna 9220");
	System.out.println("===============================================");	
	System.out.println("\n    Availavle Tests            |       Charge");
	System.out.println("\nPress 1 for Blood Group Test   |       100 TK");
	System.out.println("Press 2 for Suger Test         |       80  TK");
	System.out.println("Press 3 for X-RAY              |       800 TK");
	System.out.println("Press 4 for ECG                |       650 TK");
	System.out.println("Press 5 for ETT                |       900 TK");
	System.out.println("Press 6 for Urine Test         |       70  TK");
	System.out.println("Press 7 for MRI                |       470 TK");
	System.out.println("Press 8 for PCR                |       500 TK");
	System.out.println("Press 9 for Ultrasonography    |       850 TK");
	System.out.println("Press 10 for Hormon Test       |       350 TK");
	System.out.println("Press 0 for Exit               |             ");
   
	System.out.println("===============================================");
	
	
	 Test t1=new Test();
	 
     
	 BloodGroup b1=new BloodGroup();
	 SugerTest s1=new SugerTest();
	 Xray x1=new Xray();
	 ECG e1=new ECG();
	 ETT et=new ETT();
	 UrineTest u1=new UrineTest();
	 MRI m1=new MRI();
	 PCR p1=new PCR();
	 Ultrasonography u2=new Ultrasonography();
	 HormonTest h1=new HormonTest();
	 
	 
	   
	 
	Scanner sc= new Scanner(System.in);
	
	
	
	//int sum=0;
	System.out.print("\nHow many tests do you need : ");
	int n=sc.nextInt();
	
	if(n==0 || n>10) {
		  
		 // h1.SetBill(330);
		 System.out.println("System Exit");
		 System.exit(0);
		 
		
	  }
	
	
	
	//int n1;


	for(int a=0;a<n;a++){
		
	System.out.print("\nPress Test number (1-10): ");
	int n1=sc.nextInt();
	
	
	
	if (n1==1){
		

		b1.SetBill(100);
		
	}
	 
		  
	  
	  else if(n1==2){
		  
		  //s1.input();
		  s1.SetBill(80);
		  
		  
	  }
	  
	  else if (n1==3){
		  
		 // x1.input();
		  x1.SetBill(800);
		  
		  
		  
	  }
	  else if(n1==4){
		  
		 // e1.input();
		  e1.SetBill(650);
		  
		  
	  }
	  
	  else if(n1==5){
		  
		  et.SetBill(900);
	  }
	  
	  else if(n1==6){
		  
		  u1.SetBill(150);
	  }
	  
	  else if(n1==7){
		  
		  m1.SetBill(550);
	  }
	  
	  else if(n1==8){
		  
		  p1.SetBill(350);
	  }
	 
	 else if(n1==9){
		  
		  u2.SetBill(780);
	  }
	    
		else if(n1==10){
		  
		  h1.SetBill(330);
	  }
	  
	   else {
		  
		 // h1.SetBill(330);
		 System.out.println("\n         wrong Info");
		 System.out.println("\n         System Exit");
		 System.exit(0);
		 
		
	  }
	  
	  
	}
	
	   t1.input();
	
	    t1.ShowInfo();
		b1.ShowInfo();
		s1.ShowInfo();
		x1.ShowInfo();
	    e1.ShowInfo();
		et.ShowInfo();
		u1.ShowInfo();
		m1.ShowInfo();
		p1.ShowInfo();
		u2.ShowInfo();
		h1.ShowInfo();

		//sum=b1.GetBill+s1.GetBill();
		
		
	//System.out.println(sum);
	
	
	
	  int total=b1.GetBill()+s1.GetBill()+x1.GetBill()+e1.GetBill()+et.GetBill()+u1.GetBill()+m1.GetBill()+p1.GetBill()+u2.GetBill()+h1.GetBill();
	  //System.out.println("\nYour Net Total Bill is :"+total+" TK");
	  
	  int distotal=0;
	  
	  if(total>=2000){
		  
		int discount=total*10/100;
		distotal=total-discount;
		
		System.out.println("\n---------------------------------------------");
		System.out.println("\nYour Net Total Bill is         : "+total+" TK");
		System.out.println("\nYou Have Got Discount          : "+discount+" TK");
		System.out.println("\nYour Total Bill is (10% Less)  : "+distotal+" TK");
		
		  
	  }
	  
	  else {
			    System.out.println("\n---------------------------------------------");
				System.out.println("\nYour Net Total Bill is (0% Less):"+total+" TK");
		  }
	 
	 Date date=new Date();
	 
	 System.out.println("\nDate Time And :");
	 //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
     //LocalDateTime now = LocalDateTime.now();  
     //System.out.println(dtf.format(now));
	
	 System.out.println("\n"+date.toString());
	 System.out.println("\nCell Phone : 01813775261,01813776588");	
     System.out.println("\nTHANK YOU");	 
	 System.out.println("==========================================");
	 
	 
	 try {
		 
		 
		// FileOutputStream fout=new FileOutputStream("input.txt");
		 
		 
		  FileWriter fout=new  FileWriter("Data.txt");
		  
		 fout.write("\nName                     : "+t1.GetName());
		 fout.write("\nAge                      : "+t1.GetAge());
		 fout.write("\nAddress                  : "+t1.GetAdress());
		 fout.write("\nTotal Bill(10% less)     : "+distotal);
		 fout.write("\nTotal Bill(0%  less)     : "+total+" TK");
		 
		 ///fout.ShowInfo();
		 fout.close();
		 
		 
		
       // byte e[]=name.
		 
		 
		  //System.out.println("\nSuccess..........");
		 
	 }
	 
	 catch(Exception e){
		 
		 System.out.println(e);
		 
	 }
	 
	
	 
	        }//loop ended 
	
		}
	
}