package TestPackage; 


import java.util.Scanner;


public class NestedIf {
	
	public static void main(String[] args) {

		
			Scanner read = new Scanner(System.in);
			System.out.println("enter any number:");

			int num=read.nextInt();
			if(num<100) {

				System.out.println("\ngiven number is below 100");

			if((num%2==0))
			  {
				System.out.println("evennumber");
				}
	       else {
				System.out.println("odd number");
			    }
			}
	      else {
					System.out.println("given number is above 100");
				    }
			

		}
			
	}
		
		


}
