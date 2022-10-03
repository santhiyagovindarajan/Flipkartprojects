class Shop{
int price; //int price, discount; 
int discount; 
Shop(int price, int discount)
{
this.price = price; 
this.discount = discount;
System.out.println(" I am Constructor ");
}
public static void main(String[] args)
{
Shop prod1 = new Shop(35, 3); 
Shop prod2 = new Shop(40, 5); 
prod1.add_to_cart();
prod2.add_to_cart();
prod1.make_payment(); 
}
void add_to_cart(){
System.out.println(price); 
System.out.println(discount);	
}
void make_payment()
{
System.out.println("Actual price is "+ (price-discount)); 
}

}

