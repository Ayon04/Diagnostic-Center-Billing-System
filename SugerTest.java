import java.util.*;
class SugerTest {
	
	
	private int bill;
	
	public void SetBill(int bill){
		
		//System.out.println("\n-----Suger Test----- ");
		//super.input();
		
		this.bill=bill;
		////Scanner sc= new Scanner(System.in); 
		//System.out.print("Enter Suger Testing charge: ");
		//bill=sc.nextInt();
	
	
	
}

		public int GetBill(){
		return this.bill;
	}
		 
		 public void ShowInfo(){
		
		//super.ShowInfo();
	    System.out.println("\nSuger Testing charge           : "+this.GetBill()+" TK");
		
		//System.out.println("==================================");
		
		
	}





}