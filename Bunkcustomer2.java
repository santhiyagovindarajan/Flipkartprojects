class Petrol_Bunk
{
private int petrol_price = 107; 
//getter setter
//1000 
int getPetrol_price() // default 
{
return this.petrol_price; 
}


}




class Customer2
{ //javac Customer2.java
//java Customer2
public static void main(String[] args)
{
Petrol_Bunk cust = new Petrol_Bunk(); 
cust.petrol_price = 50; 
//Petrol_Bunk cust = new Petrol_Bunk(); 
int price = cust.getPetrol_price();
System.out.println(price); 



}

}

