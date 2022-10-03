class StaticDemo
{
static
{
System.out.println("Static Block");
}
static
{
System.out.println("Static Block 2");
}
{
System.out.println("Non Static Block");

}

public static void main(String[] args)
{
StaticDemo sd1 = new StaticDemo();
StaticDemo sd2 = new StaticDemo();
System.out.println("Static main");
}


}
