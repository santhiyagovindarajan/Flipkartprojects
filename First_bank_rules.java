package tamilnadu.chennai;

public class First implements Rules {
	int a,b;
	public First(int a, int b, String s) {
		
		this.a = a;
		this.b = b;
		this.s = s;
	}

	public First() {
		// TODO Auto-generated constructor stub
	}

	String s;
public static void main(String[] args) {
	Bank bank = new Bank();
	int interest = bank.getInterestRate();
	bank.setInterestRate(0);
	System.out.println("Hello");
    First first = new First();
    first.add(10,20);
	
}

private void add(int no1, int no2) {
	// TODO Auto-generated method stub
	
}

@Override
public void work() {
	// TODO Auto-generated method stub
	
}

@Override
public void getsalary() {
	// TODO Auto-generated method stub
	
}
}




package tamilnadu.chennai;

public class Bank {
	private int interestRate= 5;

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		if(interestRate<5)
		this.interestRate = interestRate;
	}

}




package tamilnadu.chennai;

public interface Rules {

void work();
void getsalary();
}
