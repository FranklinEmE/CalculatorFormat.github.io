package calculatorpackage;
import java.util.*;
public class CalculatorApp {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
System.out.println("Enter any two digit number and press enter");
     int a, b, c, selection;
     a = scan.nextInt();
     b = scan.nextInt();
     
     System.out.println("PLEASE SELECT TASK FUNCTION!");
     
     System.out.println("1.addition");
     System.out.println("2.substraction");
     System.out.println("3.multiplication");
     System.out.println("4.division");

     selection = scan.nextInt();
     if(selection<1) {
    	System.out.println("please enter the correct digit");
    	selection = scan.nextInt();

	}
     
    Calculator cal = new Calculator();
     if(selection==1) {
    	c=cal.add(a,b);
    	System.out.println("your answer is "+c);
     }else
    	 if(selection==2) {
    	 c=cal.sub(a,b);
     	System.out.println("your answer is "+c);
     }else
    	 if(selection==3) {
        c=cal.multi(a,b);
    	System.out.println("your answer is "+c);
   	 }else
   		 if(selection==4) {
   			c=cal.div(a,b);
   	    System.out.println("your answer is "+c);
   		 }
	}

}
