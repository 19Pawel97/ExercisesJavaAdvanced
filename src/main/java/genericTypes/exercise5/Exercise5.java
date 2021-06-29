package genericTypes.exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        Dog dog = new Dog("Dogie", "American Leopard Hound");
        Dog dog1 = new Dog("Rex", "English Setter");
        Cat cat = new Cat("Tonny", 10);
        Cat cat1 = new Cat("Tom", 15);

        List<Animal> animals = new ArrayList<>(Arrays.asList(dog, dog1, cat, cat1));
        House<Animal> animalHouse = new House<>(animals);

        for (Animal animal : animalHouse.getAnimals()) {
            System.out.println(animal);
        }
    }
}
