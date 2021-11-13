package Task6;

import Task6.Cat.Cat;
import Task6.Dog.Dog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Результаты испытуемых хвостатых следующие: ");
        Animal[] animals = {new Cat(), new Dog()};
        for (Animal animal : animals) {
                    animal.run(201);
                    animal.swim(8);
        }
    }
}