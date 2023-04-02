import java.util.Random;

public class Lesson4 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();
        System.out.println("General array:");

        int sum;
        for (sum = 0; sum < arr.length; ++sum) {
            arr[sum] = rand.nextInt(0, 100);
            System.out.print(arr[sum] + " | ");
        }

        System.out.println("\n\nRange of array elements from 5 to 45: ");
        sum = 0;

        int i;
        for (i = 0; i < arr.length; ++i) {
            if (arr[i] >= 5 && arr[i] <= 45) {
                System.out.print(arr[i] + " | ");
                sum += arr[i];
            }
        }

        System.out.println("\n\nThe sum of the Range array's elements:");
        System.out.println("Sum: " + sum + "\n");
        System.out.println("All positive elements of general array: ");

        for (i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                System.out.print(arr[i] + " | ");
            }
        }

    }
}