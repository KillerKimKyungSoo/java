package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이" , 150);
        Cat cat = new Cat("냐옹이" ,200);
        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog fingDog = dogBox.get();
        System.out.println("findDog : " + fingDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findcat = catBox.get();
        System.out.println("Cat find " + findcat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
