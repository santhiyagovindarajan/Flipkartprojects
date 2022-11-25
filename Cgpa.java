package patterns1;

import java.util.Scanner;

public class Cgpa {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter total number of Papers ");
    int given = sc.nextInt();
    int[] num = new int[given];
for (int i = 0; i < num.length; i++) {
        System.out.println("Enter " + (i + 1) + "st mark");
       
        num[i]=sc.nextInt();
}
int sum_of_papers = 0;
Float average;

// access all elements using for each loop
// add each element in sum
for (int number: num) {
  sum_of_papers += number;
}

// get the total number of elements
int total_number_of_papers = num.length;

// calculate the average
// convert the average from int to float
average =  ((float)sum_of_papers / (float)total_number_of_papers);

System.out.println("Sum = " + sum_of_papers);
System.out.println("Average = " + average);

float f =average ; 
int number1;
number1 = (int)f;

if(number1>90)
{
	System.out.println("Your Grade is o and Grade Point is 10");
}
else if(number1>80){
	System.out.println("Your Grade is A and Grade Point is 9");
}
else if(number1>75){
	System.out.println("Your Grade is A+ and Grade Point is 8");
}
else if(number1>70){
	System.out.println("Your Grade is B and Grade Point is 7");
}
else if(number1>65){
	System.out.println("Your Grade is C and Grade Point is 6");
}
else if(number1>60){
	System.out.println("Your Grade is D and Grade Point is 5");
}
else {
	System.out.println("Your Grade is E and Grade Point is 4");
}
System.out.println("All the best!!");

  }
 
}  

