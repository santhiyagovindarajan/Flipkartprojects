class Bank
{
int interest_rate = 4; 
final int minimum_balance = 2000; 

void deposit()
{
System.out.println("Deposit"); 
}

void withdraw()
{
System.out.println("Withdraw");
}
}


class Customer
{ //javac Customer.java
public static void main(String[] args)
{
Bank indian_bank = new Bank(); 
indian_bank.deposit(); 
indian_bank.withdraw();
System.out.println(indian_bank.minimum_balance);
//indian_bank.minimum_balance = 500; //we can't assign the value for final so it show error
//System.out.println(indian_bank.minimum_balance);
}

}
