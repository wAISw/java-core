package sorts;

import java.util.Arrays;

/**
 * Created by iabdulov on 21-Sep-16.
 */
public class Sorts {
    public static void main(String[] args) {
        int[] data = {4, 5, 17, 18, 19, 20, 6, 7, 8, 9, 1, 10, 11, 12, 13, 14, 15, 16, 2, 3};
        int[] data1 = {4, 5, 17, 18, 19, 20, 6, 12, 13, 14, 15, 16, 2, 3};
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data1));
//        bubbleSort(data);
//        System.out.println(Arrays.toString(data));

//        bubbleSortAdditional(data);
//        System.out.println(Arrays.toString(data));
        selectionSort(data);
        insertionSort(data1);
//        System.out.println(Arrays.toString(data));

        int[] res = merger(data, data1);
        System.out.println(Arrays.toString(res));
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

    public static void insertionSort(int[] arr) {
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int newElement = arr[barrier];
            int location = barrier - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }

    public static void mergeSort(int[] arr) {

    }

    public static void quickSort(int[] arr) {

    }

    public static int[] merger(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        while (aIndex + bIndex != result.length) {
            if (aIndex < a.length && bIndex < b.length) {
                if (a[aIndex] < b[bIndex]) {
                    result[aIndex + bIndex] = a[aIndex++];
                } else {
                    result[aIndex + bIndex] = b[bIndex++];
                }
            } else {
                int from = aIndex + bIndex;
                int count = result.length - from;
                if (aIndex == a.length) {
                    System.arraycopy(b, bIndex, result, from, count);
                } else if (bIndex == b.length) {
                    System.arraycopy(a, aIndex, result, from, count);
                }
                break;
            }
        }
        return result;
    }

}
