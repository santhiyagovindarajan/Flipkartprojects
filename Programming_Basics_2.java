package tamilnadu.chennai1;

public class Programming_Basics_2 {
public static void main(String[] args) {
	Programming_Basics_2 pb = new Programming_Basics_2();
	//pb.learn_operators();
	//pb.learn_operators2();
	//pb.learn_operators3();
	//pb.for_loop();
	pb.divisors_of_number(100);
	//pb.count_divisors(100);
	//pb.find_prime_or_not(17);
	//pb.find_prime_or_not2(1231);
	
}

private void find_prime_or_not2(int no) {
	// TODO Auto-generated method stub
	int div = 2; 
	int count = 0; 
	while(div<no)
	{
	if(no%div==0)  { 
		System.out.println(div); 
		System.out.println("Not Prime Number");
		count++; 
		break; 
		
		}
	div++; 
	}
	//System.out.println("No. of divisors are "+ count);
	if(count==0)
		System.out.println("Prime Number");
	else
		System.out.println("Not Prime Number");
}
	/*for(;div<no;div++)
	{
		if(no%div==0)  { 
			//System.out.println(div); 
			System.out.println("Not Prime Number");
			count++; 
			break; 
			
			}
	}
	//System.out.println("No. of divisors are "+ count);
	if(count==0)
		System.out.println("Prime Number");
	else
		System.out.println("Not Prime Number");*/
	//}


private void find_prime_or_not(int no) {
	// TODO Auto-generated method stub
	int div = 2; //1 and that number we know is divided so not take 1
	int count = 0; 
	/*while(div<no)
	{
	if(no%div==0)  { 
		System.out.println(div); 
		count++; 
		}
	div++; 
	}
	System.out.println("No. of divisors are "+ count);
	if(count==0)
		System.out.println("Prime Number");
	else
		System.out.println("Not Prime Number");*/
	for(;div<0;div++)
    {
    if(no%div==0)
   {
   //System.out.println(div);
    count++;
    }
  
   }
  System.out.println("No. of divisors are "+ count);
    if(count==0)
     System.out.println("Prime Number");
    else
     System.out.println("Not Prime Number");
	}
	
	


private void count_divisors(int no) {
	// TODO Auto-generated method stub
	int div = 2; 
	int count = 0; 
	while(div<no)
	{
	if(no%div==0)  { 
		System.out.println(div); 
		count++; 
		}
	div++; 
	}
	System.out.println("No. of divisors are "+ count);
}

private void divisors_of_number(int no) {
	// TODO Auto-generated method stub
	int div = 2; 
	while(div<no)
	{
	if(no%div==0)   
		System.out.println(div); 
	div++; 
	}
}

private void for_loop() {
	// TODO Auto-generated method stub
	
}

private void learn_operators3() {
	// TODO Auto-generated method stub
	int no = 10; 
	//System.out.println(++no + --no); //pre increment
	System.out.println(++no + --no + no++ + no--);//11+10+10+11=42
	System.out.println(no);//11-1=10
}

private void learn_operators2() {
	// TODO Auto-generated method stub
	int no = 5; 
	System.out.println(no++); // 5 - post increment
	System.out.println(no);	//6
	System.out.println(no--);	//6 - post decrement
	System.out.println(no);// 5
	int no2 = 10; 
	System.out.println(no2++ + no2--);
					//10	+ 11--
	System.out.println(no2);
}

private void learn_operators() {
	// TODO Auto-generated method stub
	int no = 5; 
	no++; 	// no = no + 1
	System.out.println(no);//6
	no--; // no =  no-1
	System.out.println(no);//5
	no+=2; 
	System.out.println(no);//7
	no-=3; 
	System.out.println(no);//4
	no*=3; // no = no*3
	System.out.println(no);	//12
	no/=2; 
	System.out.println(no);	
	no%=2; 
	System.out.println(no);
}
}
