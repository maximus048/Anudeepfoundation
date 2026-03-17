/*

2.Write a Java program that demonstrates method overriding by creating a superclass called Animal and two subclasses called Dog and Cat. ● TheAnimal class should have a method called makeSound(), which simply prints "The animal makes a sound." ● TheDogandCatclasses should override this method to print "TheCat/The dog meows/barks" respectively. ● Theprogram should allow the user to create and display objects of each class. [Hint:Use multilevel inheritance]

Code:
package Practice;

//Superclass
class Animal {
	void makeSound() {
		System.out.println("The animal makes a sound.");
	}
}

//Subclass 1
class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("The Dog barks.");
	}
}

//Subclass 2 (Multilevel Inheritance)
class Cat extends Dog {
	@Override
	void makeSound() {
		System.out.println("The Cat meows.");
	}


	//Main class

	public static void main(String[] args) {

		// Calling using parent class reference (Runtime Polymorphism)

		Animal a;

		a = new Animal();
		a.makeSound();

		a = new Dog();
		a.makeSound();

		a = new Cat();
		a.makeSound();
	}
}

output:
The animal makes a sound.
The Dog barks.
The Cat meows.

*/