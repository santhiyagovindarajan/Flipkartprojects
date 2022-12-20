package patterns1;

import java.util.Scanner;

public class ATM_Machine {
	// long Account_number;


	static 
    { 
        
        System.out.println("Welcome");
        System.out.println("Insert Your Card");
        System.out.println("Cardless Transaction");
        System.out.println("Do you want Cardless Transaction press 5");
        
        
    }
	


public static void main(String[] args) {
	int balance = 100000, withdraw, deposit;  
    
    //create scanner class object to get choice of user  
    Scanner sc = new Scanner(System.in);  
	while(true)  
    {  
        System.out.println("Available is "+balance);  
        System.out.println("Press 1 for Withdraw");  
        System.out.println("Press 2 for Deposit");  
        System.out.println("Press 3 for Balance enquiry");  
        System.out.println("Press 4 for Pin generation");
        
        System.out.print("Press the what do you want to perform:");  
          
        //get choice from user  
        int choice = sc.nextInt();  
        int num1;
		int num2;
		int withdraw1;
		switch(choice)  
        {  
            case 1:  
            	 System.out.print("Enter money to be withdrawn:");  
                 withdraw = sc.nextInt();
                 System.out.println("Enter your 4 digit Pin:"); 
                 int Pin_Number = sc.nextInt();  
    if(balance >= withdraw)  
    {  
        //remove the withdrawl amount from the total balance  
        balance = balance - withdraw;  
        System.out.println("Please Enter your Account if Savings Account enter 1 or Current Account enter 2 ");
        
        
        int account_type = sc.nextInt();
        
        if(account_type==1) {
        	System.out.println(" Processing please wait ");
        	 System.out.println("Please collect your money"); 
        }
        else  {
        	System.out.println(" Processing please wait ");
        	 System.out.println("Please collect your money"); 
        }
        }  
    else  
    {  
        //show custom error message   
        System.out.println("Insufficient Balance");  
    }  
    System.out.println("");  
    break;  

            case 2:  
                  
            	System.out.print("Enter money to be deposited:");  
                deposit = sc.nextInt();  
                System.out.println("Enter your 4 digit Pin:"); 
                Pin_Number = sc.nextInt();
                balance = balance + deposit;  
                System.out.println("Your Money has been successfully depsited");  
                System.out.println("");  
    break;  

            case 3:  
            	System.out.println("Enter your 4 digit Pin:"); 
                Pin_Number = sc.nextInt();
    //displaying the total balance of the user  
    System.out.println("Balance : "+balance);  
    System.out.println("");  
    break; 
    
            case 4:
            	System.out.println("Enter your old pin number : ");
            	num1 = sc.nextInt();
            	
            	System.out.println("Enter your new pin number : ");
            	num2=sc.nextInt();
            	
            	System.out.println("Enter your confirm new pin number : ");
            	int num3 = sc.nextInt();
            	
            	if(num2==num3) {
                	
                System.out.println("Enter your OTP number : ");
            	}
            	else {
            		System.out.println("Please check confirm pin number ");
            	}
            	sc.nextLine();
            	int num4 = sc.nextInt();
            	if(num4>=4) {
            		System.out.println(" Processing please wait ");
            		System.out.println(" Your Pin is Successfully Generated ");
            		
            	}
            	else {
            		System.out.println(" Sorry Try Again Later ");
            	}
            	
            	break;
            	
            case 5:
            	System.out.println("Enter your Account_number");
                sc.nextLine();
                
                String no=sc.next();
                int length=no.length();
                
                
                if((length==18)||(length==16)||(length==15)||(length==14)||(length==13)||(length==12)||(length==11)||(length==10)||(length==8))
                {
                  System.out.println("processing please wait");
                }           
                System.out.println("Enter your OTP Number");
                String OTP_Number = sc.next();
                int length1=OTP_Number.length();
                if((length1==4)||(length1==6)) {
                	System.out.println("processing please wait");
                	System.out.println("your money has been Sussefully deposited");
                }
                else {
                	System.out.println("Check your OTP");
                }
                
                System.out.println("");
              
   break;  

           
            	
           
        } 
		System.out.println("Do you want to continue your Transaction ,Yes means press 6 or No means press 7 ");
		int yes = sc.nextInt();
		if(yes==6) {
			continue;
		}
		
		System.out.println("Thankyou For Your Transaction!!");
		break;
    }  
}   

}

