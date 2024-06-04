import java.util.*;
class ETT {
	
	
	private int bill;
	
	public void SetBill(int bill){
		
		//System.out.println("\n-----Blood Group Test----- ");
		//super.input();
		
		this.bill=bill;
		//Scanner sc= new Scanner(System.in); 
		//System.out.print("Enter Blood Group Testing charge: ");
		//bill=sc.nextInt();
		
		//Diagnostic Center
		
	}
	
	
	public int GetBill(){
		return this.bill;
	}
	
	public void ShowInfo(){
		   
		//super.ShowInfo();
	    System.out.println("\nETT charge                     : "+GetBill()+" TK");
		
	
		//System.out.println("==================================");
		
		
	}
	

	
	
	
}