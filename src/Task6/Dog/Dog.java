package Task6.Dog;

import Task6.Animal;

public class Dog extends Animal {
    @Override
    public int run(int r) {
        if (r > 0 && r <= 500) {
            System.out.println("Собака пробежала " + r + " м.");
        } else {
            System.out.println("Собака устала и пробежала только 500 м.");
        }
        return r;
    }
    @Override
    public void swim(int s) {
        if (s > 0 && s <= 10) {
            System.out.println("Собака проплыла " + s + " м.");
        } else {
            System.out.println("Собака устала и проплыла только 10 м.");
        }
    }
}
