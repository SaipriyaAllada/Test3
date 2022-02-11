package TestPackage;
public class ControlStatements {
	
	
	
	public static void main(String[] args) {
		
		
		ControlStatements.checkVoteElgibility();

	}
	
	
	
	public static void checkVoteElgibility()
	{
		
		int age=17;
		if(age>18)
			System.out.println("eligible for vote");
		else
			System.out.println("Not eligible for vote");	
		
		System.out.println("thank you");
		
	}
	

}
