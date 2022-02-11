package TestPackage;

public class IfElseIfStatement {
	public static void main(String[] args) {
		
	
	int a=40,b=30,c= 20;
	


	if((a<b)&&(a>c))
	  {
		System.out.println("a greater than b and c");
		}
   else if((b>c)||(b>a)){
		System.out.println("b greater than c and less than a");
	    }

  else {
			System.out.println("c less than b and c");
		    }
	

}
}