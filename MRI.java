class MRI{
	
	
	private int bill;
	
	public int SetBill(int bill){
		
		//System.out.println("\n-----Blood Group Test----- ");
		//super.input();
		
		this.bill=bill;
		//Scanner sc= new Scanner(System.in); 
		//System.out.print("Enter Blood Group Testing charge: ");
		//bill=sc.nextInt();
		
		//Diagnostic Center
		
		return this.bill;
		
		
	}
	
	
	public int GetBill(){
		return this.bill;
	}
	
	public void ShowInfo(){
		
		//super.ShowInfo();
	    System.out.println("\nMRI Test charge                : "+GetBill()+" TK");
		                                                 //hold
	
		//System.out.println("==================================");
		
		
	}
	
	
	
	
	
	
	
	
	
}