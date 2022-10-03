//Package

class Lalitha_Chennai
{
int offer=500; 
public Lalitha_Chennai()
{
System.out.println("Samy Photo Calendar"); 
}
public Lalitha_Chennai(int offer)
{
//this();// if want calendar to child class especially using super remove command
//this.offer=offer;
System.out.println("Chennai Offer " + this.offer); 
}
public void Customer_handling()
{
System.out.println("CCP");
}
//public static void main(String[] args)//my try
//{
//Lalitha_Chennai lc = new Lalitha_Chennai(2000); 

//}

}



class Lalitha_Kumbakonam extends Lalitha_Chennai
{
int offer; 
public Lalitha_Kumbakonam(int offer)
{
this.offer = offer; 
System.out.println("KK Offer " + this.offer); 
}
public static void main(String[] args)
{
Lalitha_Kumbakonam lk = new Lalitha_Kumbakonam(2000); 

}

}



class Lalitha_Thiruvarur extends Lalitha_Chennai
{
int offer; 
public Lalitha_Thiruvarur(int offer)
{
super(offer);  // Explicit call of super class constructor
this.offer = offer; 
System.out.println("KK Offer " + this.offer); 
}
public static void main(String[] args)
{
Lalitha_Thiruvarur lk = new Lalitha_Thiruvarur(2000); 
lk.buy(); 
//lk.Customer_handling();//if want child method use this one 
Lalitha_Chennai lc = new Lalitha_Chennai();// if want access parent method use this and calling also
lc.Customer_handling();//parent method calling
}
void buy()
{
System.out.println("KK --> "+ this.offer); 
System.out.println("LC --> "+ super.offer); 
}
public void Customer_handling()
{
System.out.println("Valet Parking");
}
}
