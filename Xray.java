import java.util.*;
class Xray{
	
	  private int bill;
	
	  public void SetBill(int bill){
		
		//System.out.println("\n-----X-RAY----- ");
		//super.input();
		
		this.bill=bill;
		//Scanner sc= new Scanner(System.in); 
		//System.out.print("Enter X-RAY charge: ");
		//bill=sc.nextInt();
	
	
}

		
	public int GetBill(){
		return this.bill;
	}

		 public void ShowInfo(){
		
		//super.ShowInfo();
	    System.out.println("\nX-RAY charge                   : "+this.GetBill()+" TK");
		
		//System.out.println("==================================");
		
		
	}
	
	
	
	
}