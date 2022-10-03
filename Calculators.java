class Calculators
{
public static void main(String[] args)
{
Calculators calc = new Calculators();
float result = calc.add(); //return result assign in float datatype result 
System.out.println(result);
calc.subtract(result, 5.25f);//compulsary denote 'f' for decimal value 
}
void subtract(float no1, float no2)
{
System.out.println(no1-no2);
return; 
}
float add()
{
//return 5+10+25;
float no1 = 5.75f, no2 = 10, no3 = 25; //not compulsory denote 'f' for int type contain in float type
return no1/no2+no3;//this result
//System.out.println("Hi");
}

}

