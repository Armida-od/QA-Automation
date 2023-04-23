package HW7;

import java.util.Arrays;
import java.util.Random;

public class ArrayMain {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] ourArray = new int[7];

        for (int i = 0; i < ourArray.length; i++) {
            ourArray[i] = rand.nextInt(2);
        }
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(ourArray));

        System.out.println("-----------------");
        System.out.println("We have our Array and element = 100: ");

        int[] newArr = ArrayFunctionality.extensionArray(ourArray, 100);
        System.out.println(Arrays.toString(newArr));
        System.out.println("------------------------");

        System.out.println("We have our Array, element = 500 and position = 7:");

        int[] newArr1 = ArrayFunctionality.extensionArray(ourArray, 500, 7);
        System.out.println(Arrays.toString(newArr1));
    }

}