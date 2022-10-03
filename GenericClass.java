package santhiya.myhome;
public class GenericClass {

    public static void main(String[] args) {
        FirstClass first = new FirstClass("santhiya name");
        System.out.println("FirstClass name is " + first.getName());
        first.name = "new name";
    }
}


package santhiya.myhome;
public class FirstClass {

    protected String name;

    protected FirstClass(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}




package santhiya1.myhome1;
import santhiya.myhome.FirstClass;
public class SecondGenericClass {

    public static void main(String[] args) {
        FirstClass first = new FirstClass("random name");
        System.out.println("FirstClass name is "+ first.getName());
        first.name = "new name";
    }
}
