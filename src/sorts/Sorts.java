package sorts;

import java.util.Arrays;

/**
 * Created by iabdulov on 21-Sep-16.
 */
public class Sorts {
    public static void main(String[] args) {
        int[] data = {4, 5, 17, 18, 19, 20, 6, 7, 8, 9, 1, 10, 11, 12, 13, 14, 15, 16, 2, 3};
        System.out.println(Arrays.toString(data));
        bubbleSort(data);
        System.out.println(Arrays.toString(data));

        bubbleSortAdditional(data);
        System.out.println(Arrays.toString(data));
    }

    public static void bubbleSort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = arr.length - 2; index >= barrier; index--) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }

    public static void bubbleSortAdditional(int[] arr) {
        for (int barrier = arr.length - 1; barrier > 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
    }

}
