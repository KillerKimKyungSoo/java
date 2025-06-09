package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<Dog>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<Cat>();
        Dog dog = new Dog("멍멍이1" , 200);
        Cat cat = new Cat("냐옹잉1" , 300);
        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        Dog bigger = dogHospital.getBigger(new Dog("멍멍이 2" , 50));
        System.out.println("bigger Dog " + bigger);
    }
}
