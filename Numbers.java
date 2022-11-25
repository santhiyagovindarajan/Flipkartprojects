package tamilnadu.chennaiz;

public class Numbers {
public static void main(String[] args) {
	Numbers nu = new Numbers();
	//nu.Armstrong(371);
	//nu.Neon(9);
	nu.Strong();
	}

private void Strong() {
	// TODO Auto-generated method stub
	int num =144 ,originalNum,rem,fact,i,sum=0;
    originalNum=num;
    while (num>0)//145>0  14>0 1>0
    {
        rem=num%10;
        fact=1;
        for(i=1;i<=rem;i++){
            fact*=i;//fact=fact*i
        }
        //System.out.println("fact : "+fact);
        sum+=fact;
        num=num/10;
    }
    if (sum == originalNum) 
        System.out.println(originalNum + " is STRONG NUMBER");
     else 
        System.out.println(originalNum + " is not a STRONG NUMBER");
}

private void Neon(int num) {
	// TODO Auto-generated method stub
	int sum =0, sqr = num*num; //9*9=81
	int rem = 0;
	while(sqr>0){
		rem = sqr%10;
        sum =sum + rem;   //sum up digit
        sqr = sqr/10;    //remove digit which has been added
    }

    if(sum == num)
        System.out.println("Neon Number");
    else
        System.out.println("Not a Neon Number");

	
}

private void Armstrong(int no) {
	// TODO Auto-generated method stub
	int no2=no;
	int rem=0;
	int arm=0;
	while(no>0)
	{
	rem=(no%10);
	arm=arm+(rem*rem*rem);//(1+343+27=371)
	no=no/10;
	}
	System.out.println("Armstrong number is"+ arm);
	if(arm==no2)
	System.out.println("Armstrong number ");
	else
	System.out.println("Not a Armstrong number");
	}
}

