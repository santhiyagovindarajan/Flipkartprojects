class GrandFather    
{    
public void showG()    
{    
System.out.println("He is grandfather.");    
}    
}   


class Father extends GrandFather    
{    
public void showF()    
{    
System.out.println("He is father.");    
}    
}    



public class Daughter extends Father    
{    
public void showD()    
{    
System.out.println("She is daughter.");    
}    
public static void main(String args[])    
{    
//Daughter obj = new Daughter();    
//obj.show();    
//Son obj = new Son();  
//obj.showS();  // Accessing Son class method  
//obj.showF();  // Accessing Father class method  
//obj.showG();  // Accessing GrandFather class method  
Daughter obj2 = new Daughter();  
obj2.showD();  // Accessing Daughter class method  
obj2.showF();    // Accessing Father class method  
obj2.showG();   // Accessing GrandFather class method  
}    
} 



public class Daughter_baby extends Daughter
{
public void showDB()    
{    
System.out.println("She is granddaughter.");    
}   
public static void main(String args[])    
{    
//Daughter obj = new Daughter();    
//obj.show();
Daughter_baby db = new Daughter_baby();
db.showDB();
//obj.showS();    
Son obj = new Son();  
obj.showS();  // Accessing Son class method  
//obj.showF();  // Accessing Father class method  
//obj.showG();
}
}
