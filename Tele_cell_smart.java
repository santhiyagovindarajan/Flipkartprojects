//Inheritance-Single,Multilevel,Hierachy


package chennai.myhome;

public class Telephone
{
//public static void main(String[] args)  //used in inheritance so main is in command
//{
//Telephone ppp = new Telephone(); 
//ppp.make_calls(); 
//ppp.receive_calls(); 

//}

public void make_calls()
{
System.out.println("Call to friends"); 
}

public void receive_calls()
{
System.out.println("receive calls from friends"); 
}
}


//Single Inheritance
package chennai.myhome; 

public class CellPhone extends Telephone
{
// Single Inheritance

public static void main(String[] args)
{
CellPhone mobile = new CellPhone(); 
mobile.make_calls(); 
mobile.receive_calls(); 
}
public void send_messsage()
{
System.out.println("Send SMS"); 
}

}




// Multilevel Inheritance
package chennai.myhome; 

public class SmartPhone extends CellPhone
{
// Multilevel Inheritance

public static void main(String[] args)
{
SmartPhone v25 = new SmartPhone(); 
v25.make_calls(); 
v25.receive_calls(); 
v25.send_messsage(); 
v25.browse(); 
}
public void browse()
{
System.out.println("Browse"); 
}
}



//Hierachy Inheritance

package santhiya.myhome; 

public class Samsung extends SmartPhones
{

public static void main(String[] args)
{
Samsung f21 = new Samsung(); 
f21.make_calls(); 
f21.receive_calls(); 
f21.send_messsage(); 
f21.browse();
f21.take_photo(); 
f21.battery();
}
public void battery()
{
System.out.println("battery"); 
}
}



///Hierachy Inheritance

package santhiya.myhome; 
public class Apple extends SmartPhones
{

public static void main(String[] args)
{
Apple pro13 = new Apple(); 
pro13.make_calls(); 
pro13.receive_calls(); 
pro13.send_messsage(); 
pro13.browse(); 
pro13.take_photo();
}
public void take_photo()
{
System.out.println("Take_Photo"); 
}
}
