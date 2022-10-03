abstract class Parent1
{
public static void main(String[] args)
{
System.out.println("Hi"); 

}
void eat()
{
System.out.println("Eating"); 
}
void work()
{
System.out.println("Working "); 
}
abstract void study();  
//abstract void engineer(); 

}


abstract class Child1 extends Parent1
{
public static void main(String[] args)
{
//Child1 ch = new Child1(); 
//ch.eat(); 
//ch.work(); 
//ch.study();
}
//void study()
//{
//System.out.println(" Degree"); 
//}
//abstract void engineer();
abstract void study(); 
//void engineer()
//{
//System.out.println(" e.Degree"); 
//}
}



class Child_baby extends Child1
{

public static void main(String[] args)
{
Child_baby ch1 = new Child_baby();
//Parent1 p1 = new Parent1();//this is abstract class cannot create object .We can create only child class is not abstract access parent class only by child object.  
//ch1.eat(); 
//ch1.work(); 
//ch1.engineer();
ch1.study(); 
}
//void engineer()
//{
//System.out.println(" e.Degree"); 
//}
void study()
{
System.out.println(" Degree"); 
}
}
