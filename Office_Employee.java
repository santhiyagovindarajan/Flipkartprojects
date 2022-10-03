package tamilnadu.chennai; 

public class Office// not declare public is called default package (indirectly said private package)
{
void travel_allowance()
{
System.out.println("100 Rs Daily"); 

}
public void develop()
{
System.out.println("Development"); 
}
public void test()
{
System.out.println("Testing"); 
}
protected void do_project()
{
System.out.println("Project Strategies"); 
}
}




package tamilnadu.chennai; 
//javac -d . Employee.java
class Employee
{
public static void main(String[] args)
{
Office engineer = new Office(); 
engineer.develop(); 
engineer.test();
engineer.do_project();
// 1. protected methods can be accessed from any class in same package.
}

}


package tamilnadu.madurai;
import tamilnadu.chennai.Office; 
//javac -d . Employee2.java
class Employee2 extends Office
{
public static void main(String[] args)
{
//Office engineer = new Office(); 
Employee2 engineer = new Employee2();
engineer.develop(); 
engineer.test();
engineer.do_project();
//2. From other packages, other(means not child class) classes cannot access protected methods. 
}

}


package tamilnadu.dindigul; 
import tamilnadu.chennai.Office; 
class Branch extends Office
{

public static void main(String[] args)
{
//Office engineer = new Office(); 
//engineer.develop(); 
//engineer.do_project();
Branch br = new Branch();
br.do_project();
//3. Child class from other package can access protected methods.
}

}
