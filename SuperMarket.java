class SuperMarket
{
static String name = "santhiya";
static int offer = 10;//Delaration and instalization
int price;// variable declaration
public static void main(String[] args)
{
SuperMarket product1 = new SuperMarket();
SuperMarket product2 = new SuperMarket();
product1.price = 100;
product2.price = 120; 
product1.sell();// method calling statement
System.out.println(product1.price); 
System.out.println(product2.price);
//we can access static values using class name
System.out.println(SuperMarket.name); 
// we can access static values using instance name
System.out.println(product1.name);
// we can access static values directly in the same class 
System.out.println(name);
give_offer();


}
void sell()// method signature,sell - method name
// () - aruguments
{// method body - definition
System.out.println("product price is"+price);
}
static void give_offer()
{
System.out.println("Offer % is "+ offer); 
}
}

