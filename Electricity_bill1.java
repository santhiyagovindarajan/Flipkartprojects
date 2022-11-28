package patterns1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Electricity_bill1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
	 System.out.println("Please enter the occupation such as Farmer,Handloom,Others ");
		
		String occupation =sc.nextLine();
		sc.nextLine();
		
    System.out.println("Total no of units");
    int unit = sc.nextInt();
	}
	catch(ArithmeticException ae)
	  { 
	  System.out.println("Please check your unit value "); 
	  
	  }
	catch(InputMismatchException ime)
	  {
	   System.out.println("Check your inputs ");
	  }
	catch(Exception e)
	  {        
	   System.out.println("Something went wrong"); 
	  }
	
    String occupation1 = "Farmer";
    String occupation2 = "Handloom";
    String occupation3 = "Others";
    
    
    String occupation = "";
	int unit=0;
	if(occupation1.equals(occupation)) {
    	System.out.println("your unit is free");
    }
    
    
    else if(occupation2.equals(occupation)) {
        if(unit<=200)
        {
          System.out.println("your unit is free");
        }
        
        else if(unit<=300)
        {
          System.out.println("bill of amount is "+((100*0)+(100*0)+(unit-200)*4.50));
        }
        else if(unit<=400)
        {
          System.out.println("bill of amount is "+((100*0)+(100*0)+(100*4.50)+(unit-300)*4.50));
        }
        else if(unit<=500)
        {
          System.out.println("bill of amount is "+((100*0)+(100*0)+(100*4.50)+(100*4.50)+(unit-400)*6));
        }
        else if(unit<=600)
        {
          System.out.println("bill of amount is "+((100*0)+(100*0)+(100*4.50)+(100*4.50)+(100*6)+(unit-500)*8));

        }
        else if(unit<=700)
        {
          System.out.println("bill of amount is "+((100*0)+(100*0)+(100*4.50)+(100*4.50)+(100*6)+(100*8)+(unit-600)*9));

        }
        else if(unit<=800)
        {
          System.out.println("bill of amount is "+((100*0)+(100*0)+(100*4.50)+(100*4.50)+(100*6)+(100*8)+(100*9)+(unit-700)*9));

        }
        else if(unit<=900)
        {
          System.out.println("bill of amount is "+((100*0)+(100*0)+(100*4.50)+(100*4.50)+(100*6)+(100*8)+(100*9)+(100*9)+(unit-800)*9));
        
        }
        else
          System.out.println("bill of amount is "+((100*0)+(100*0)+(100*4.50)+(100*4.50)+(100*6)+(100*8)+(100*9)+(100*9)+(unit-900)*11));

    	    
    }
    
	
    else if(occupation3.equals(occupation)) {
    if(unit<=100)
    {
      System.out.println("your unit is free");
    }
    else if(unit<=200)
    {
      System.out.println("bill of amount is "+((100*0)+(unit-100)*2.25));
    }
    else if(unit<=300)
    {
      System.out.println("bill of amount is "+((100*0)+(100*2.25)+(unit-200)*4.50));
    }
    else if(unit<=400)
    {
      System.out.println("bill of amount is "+((100*0)+(100*2.25)+(100*4.50)+(unit-300)*4.50));
    }
    else if(unit<=500)
    {
      System.out.println("bill of amount is "+((100*0)+(100*2.25)+(100*4.50)+(100*4.50)+(unit-400)*6));
    }
    else if(unit<=600)
    {
      System.out.println("bill of amount is "+((100*0)+(100*2.25)+(100*4.50)+(100*4.50)+(100*6)+(unit-500)*8));

    }
    else if(unit<=700)
    {
      System.out.println("bill of amount is "+((100*0)+(100*2.25)+(100*4.50)+(100*4.50)+(100*6)+(100*8)+(unit-600)*9));

    }
    else if(unit<=800)
    {
      System.out.println("bill of amount is "+((100*0)+(100*2.25)+(100*4.50)+(100*4.50)+(100*6)+(100*8)+(100*9)+(unit-700)*9));

    }
    else if(unit<=900)
    {
      System.out.println("bill of amount is "+((100*0)+(100*2.25)+(100*4.50)+(100*4.50)+(100*6)+(100*8)+(100*9)+(100*9)+(unit-800)*9));
    
    }
    else
      System.out.println("bill of amount is "+((100*0)+(100*2.25)+(100*4.50)+(100*4.50)+(100*6)+(100*8)+(100*9)+(100*9)+(unit-900)*11));

	    
}
    /*else {
    	System.out.println("check your inputs");}
    }*/
    
}}
