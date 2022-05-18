//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);

package hw1;

import java.util.Arrays;
import java.util.List;

public class App{
    //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    private static <T> void movingElements (T[]arr,int index1, int index2){
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }

    //2. Написать метод, который преобразует массив в ArrayList;
    private static <E > List < E > transformation(E[]arr){
        return Arrays.asList(arr);
    }

    public static void main(String[] args) {

        String[] arrStr = {"a", "b", "c"};
        Integer[] arrInt = {1, 2, 3};

        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(arrInt));

        movingElements(arrStr, 1, 2);
        movingElements(arrInt, 1, 0);

        System.out.println(transformation(arrStr));

    }
}

