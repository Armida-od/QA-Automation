package HW7;

public class ArrayFunctionality {

    public static int[] extensionArray(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = element;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public static int[] extensionArray(int[] arr, int element, int position) {

        int i;
        int[] newArr = new int[arr.length + 1];
        for (i = 0; i < arr.length + 1; i++) {
            if (i < position - 1)
                newArr[i] = arr[i];
            else if (i == position - 1)
                newArr[i] = element;
            else
                newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}
