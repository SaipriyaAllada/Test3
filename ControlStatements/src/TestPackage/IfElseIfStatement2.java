package TestPackage; 

import java.util.Scanner;


public class IfElseIfStatement2 {
	public static void main(String[] args) {
		
	int num1,num2,num3;
		
		Scanner read = new Scanner(System.in);
		System.out.println("enter three number");

	   	num1 = read.nextInt();    
		num2 = read.nextInt(); 	
		num3 = read.nextInt();
	if((num1>=num2)&&(num1>=num3)) 
		  {
			System.out.println("largest number"+ num1);
			}
	   else if((num2>=num3)&&(num2>=num1)){
			System.out.println("largest number"+ num2);
		    }

	  else {
				System.out.println("largest number"+ num3);
					
		
			    }
		



}
}