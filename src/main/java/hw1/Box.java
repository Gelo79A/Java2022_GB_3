package hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits;

    public Box() {this.fruits = new ArrayList<>();}

    public Box(T... fruits) {this.fruits = new ArrayList<>(Arrays.asList(fruits));}

    public Box(List<T> fruits) {
        this.fruits = new ArrayList<>(fruits);
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public double getWeight() {
        double weight = 0.0;
        for (T fruit: fruits) {
            weight = weight + fruit.getWeight();
        }
        return weight;
    }

    public boolean equalsByWeight(Box<?> another) {
        return Math.abs(getWeight() -another.getWeight()) < 0.0001;
    }

    public void oversleeping(Box<? super T> another) {
        if (this == another) return;
        another.fruits.addAll(fruits);
        fruits.clear();
    }

    public List<T> getFruits() {return fruits;}

}
