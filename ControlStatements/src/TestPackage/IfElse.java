package TestPackage;

public class IfElse {
	int num;
	IfElse(){
		num=5;
	}
	
	void display() {
		if((num%2==0))
			System.out.println("even number");
		else
			System.out.println("odd number");	
	}
	
	public static void main(String[] args) {
		IfElse i = new IfElse();
		i.display();
		
	}

	

}
