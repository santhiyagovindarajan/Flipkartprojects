package tamilnadu.chennai1;

public class ProgrammingBasics {
	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  ProgrammingBasics pb = new ProgrammingBasics(); 
		  //pb.learn_if();
		  //pb.learn_if2(); 
		  //pb.learn_while(); 
		  //pb.digits_in_reverse(1234);
		  pb.count_of_digits(123456);
		  //pb.sum_of_digits(65738);
		  //pb.sum_of_digits_until_single(65738);
		  //pb.reverse_number(3435728); 
		  //pb.find_palindrome(12321); 
		  //pb.perfect_Number(); 
		 }

		 

		private void perfect_Number() {
		// TODO Auto-generated method stub
			int no = 6, sum = 0; 
			  int div = 1; 
			 /* while(div<no)
			  {
			      if(no%div == 0)
			          {
			          sum = sum + div; 
			          }
			  div = div+1; 
			  }
			  if(no == sum)
			      System.out.println("Perfect Number"); 
			  else
			      System.out.println("Not Perfect Number");*/
			  
			  
			  for(;div<no;div++)
			  {
				  if(no%div == 0)
		          {
		          sum = sum + div; 
		          }  
			  }
			  if(no == sum)
			      System.out.println("Perfect Number"); 
			  else
			      System.out.println("Not Perfect Number");
	}



		private void find_palindrome(int no) {
		// TODO Auto-generated method stub
			int no2 = no; 
			  int reverse = 0; 
			  /*while(no>0)
			  {
			  int rem = no%10;    // rem = 4
			  reverse = (reverse*10)  +    rem;   //reverse = 4
			  no = no/10;     //  no = 5
			  }
			  System.out.println("Reversed Number is " + reverse);
			  if(no2 == reverse)
			   System.out.println("Palindrome Number"); 
			  else
			   System.out.println("Not Palindrome Number");*/
			  
			  for(;no>0;no = no/10)
			  {
				  int rem = no%10;    // rem = 4
				  reverse = (reverse*10)  +    rem;   //reverse = 4  
			  }
			  System.out.println("Reversed Number is " + reverse);
			  if(no2 == reverse)
			   System.out.println("Palindrome Number"); 
			  else
			   System.out.println("Not Palindrome Number");
	}



		private void reverse_number(int no) {
		// TODO Auto-generated method stub
			int reverse = 0; 
			  /*while(no>0)
			  {
			  int rem = no%10;    // rem = 4
			  reverse = (reverse*10)  +    rem;   //reverse = 4
			  no = no/10;     //  no = 5
			  }
			  System.out.println("Reversed Number is " + reverse);*/
			
			for(;no>0;no = no/10)
			{
				int rem = no%10;    // rem = 4
				  reverse = (reverse*10)  +    rem; 	
			}
			System.out.println("Reversed Number is " + reverse);
	}



		private void sum_of_digits_until_single(int cake) {
		// TODO Auto-generated method stub
			 int sum_of_digits = 0;
			  /*while(cake>0)
			  {
			  sum_of_digits = sum_of_digits + cake%10; 
			  cake = cake/10; 
			  }
			  System.out.println("Sum of Digits is "+ sum_of_digits);
			  if(sum_of_digits>9)
			  {
			   cake = sum_of_digits; 
			   sum_of_digits_until_single(cake); 
			  }*/
			 for(;cake>0;cake = cake/10)
			 {
				 sum_of_digits = sum_of_digits + cake%10;  
			 }
			 System.out.println("Sum of Digits is "+ sum_of_digits);
			  if(sum_of_digits>9)
			  {
			   cake = sum_of_digits; 
			   sum_of_digits_until_single(cake); 
			  } 
	}

		private void sum_of_digits(int cake) {
		// TODO Auto-generated method stub
			 int sum_of_digits = 0;
			  /*while(cake>0)
			  {
			  sum_of_digits = sum_of_digits + cake%10; 
			  cake = cake/10; 
			  }
			  System.out.println("Sum of Digits is "+ sum_of_digits);*/
			 //int sum_of_digits = 1;
			 for(;cake>0;cake = cake/10)
			 {
				 sum_of_digits = sum_of_digits + cake%10; 
				 //sum_of_digits = sum_of_digits * (cake%10);
			 }
			 System.out.println("Sum of Digits is "+ sum_of_digits);
			
			
			
	}

		private void count_of_digits(int cake) {
		// TODO Auto-generated method stub
			 int count_of_digits = 0;
			  /*while(cake>0)
			  {
			  //System.out.println(cake%10); //4    3   2   1
			  cake = cake/10; 
			  count_of_digits = count_of_digits + 1; 
			  }
			  System.out.println("Count of Digits is "+ count_of_digits); */
			 
			 for(;cake>0;cake = cake/10)
			 {
				 count_of_digits = count_of_digits + 1; 
			 }
			 System.out.println("Count of Digits is "+ count_of_digits);
	}

		private void digits_in_reverse(int cake) {
		// TODO Auto-generated method stub
			 /*while(cake>0)
			  {
			  System.out.println(cake%10); //4
			  cake = cake/10; 
			  }*/
			 
			 for(;cake>0;cake= cake/10)
			 {
				 System.out.println(cake%10);  
			 }
	}

		private void learn_while() {
		  // TODO Auto-generated method stub
		  int beats = 512; 
		  int count = 0; 
		  while(beats>1) //2>1
		  {
		  //System.out.println(beats/2); //1
		  beats = beats/2; //256
		  count = count+1; 
		  }
		  System.out.println("No. of Securities "+ count);
		  
		 }

		 private void learn_if2() {
		  // TODO Auto-generated method stub
		  
		  
		  
		 }

		 private void learn_if() {
		  // TODO Auto-generated method stub
		  int mark = 30; 
		  if(mark==100)
		  {
		  System.out.println("Bike"); 
		  }
		  else if(mark>=80)
		  { System.out.println("Mobile");  }
		  else if(mark>=35)
		  {
		  System.out.println("Gear Bicycle");  }
		  else
		  {
		   System.out.println("Work Hard");
		  }
		 }

}
