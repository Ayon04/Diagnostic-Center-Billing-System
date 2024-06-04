import java.util.*;
class Test{
	
	private String name;
	private int age;
	private String adress;
	//private int phoneNumber;
	
	public void input(){
		 
		
		System.out.print("\n--------Patient's Information----- ");
		
		Scanner sc= new Scanner(System.in); 
		
		this.name=name;
		System.out.print("\n\nEnter Patient Name         : ");
		name= sc.nextLine(); 
		
		this.adress=adress;
		
		System.out.print("\nEnter Patient Adress       : ");
		adress= sc.nextLine(); 
		
		this.age=age;
		
		System.out.print("\nEnter Patient Age          : ");
		age=sc.nextInt();
		
		
	}
	
	public String GetName(){
		
				this.name=name;
				
				return this.name;
				
	}
	
	public String GetAdress(){
		
		
				this.adress=adress;
				
				return this.adress;
				
	}
	
	public int GetAge(){
		
		
				this.age=age;
				
				return this.age;
				
	}
	

	public void ShowInfo(){
		
		System.out.println("\n---------------Bill Summary--------------");
		System.out.println("-----------------------------------------");
		System.out.println("\nPatient Name                   : "+this.name);
		System.out.println("\nPatient Age                    : "+this.age);
		System.out.println("\nPatient Adress                 : "+this.adress);
		
		
		
		
	}
	
	
}