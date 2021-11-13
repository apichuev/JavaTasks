package Task6.Cat;

import Task6.Animal;

public class Cat extends Animal {
    @Override
    public int run(int r) {
        if (r > 0 && r <= 200) {
            System.out.println("Кошка пробежала " + r +" м.");
        } else { System.out.println("Кошка устала и пробежала только 200 м.");
                }
        return r;
    }
    @Override
    public void swim(int s) {
        if (s > 0) {
            System.out.println("Кошка утонула, Вы плохой человек.");
        }
    }
}