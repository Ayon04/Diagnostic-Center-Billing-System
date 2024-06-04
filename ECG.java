import java.util.*;
class ECG{
	
		private int bill;
		
	    public void SetBill(int bill){
		
		//System.out.println("\n-----ECG----- ");
		//super.input();
		
		this.bill=bill;
		//Scanner sc= new Scanner(System.in); 
		//System.out.print("Enter ECH charge: ");
		//bill=sc.nextInt();
	
	
}

	
	public int GetBill(){
		return this.bill;
	}
		 
		 public void ShowInfo(){
		
		//super.ShowInfo();
	    System.out.println("\nECG charge                     : "+this.GetBill()+" TK");
		
		//System.out.println("==================================");
		
		
	}
	
	
}