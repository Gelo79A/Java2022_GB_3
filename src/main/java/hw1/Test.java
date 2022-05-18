package hw1;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new  Apple());
        Box<Orange> oranges = new Box<>(new Orange(), new Orange(), new Orange(), new Orange());
        System.out.println(appleBox.equalsByWeight(oranges));

        Box<Orange> orangeBox = new Box<>(new Orange());

        System.out.println(oranges.getWeight());
        oranges.oversleeping(orangeBox);
        System.out.println(orangeBox.getWeight());
        System.out.println(oranges.getWeight());

    }
}
