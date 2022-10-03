class Animal 
{
   void animalSound() //method overriding
{
    System.out.println("The animal makes a sound");
  }
}


class Dog extends Animal 
{
  
public static void main(String[] args) 
{
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
    void animalSound() // method overriding
{
 System.out.println("The dog says: bow wow");
  }
}



class Pig extends Animal
 {
   void animalSound()// method overriding 
{
    System.out.println("The pig says: wee wee");
  }
}
