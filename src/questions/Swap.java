package questions;

import java.util.Arrays;

/**
 * Created by iabdulov on 21-Sep-16.
 */
public class Swap {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 7, 8, 9, 11, 12, 13, 17, 10, 19, 20, 18, 3, 4, 5, 14, 15, 16};
        System.out.println(Arrays.toString(array));
        for (int k = 0; k < array.length - 1; k++) {
            swap(array, k, k + 1);
        }
        System.out.println(Arrays.toString(array));
        int tmp = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < tmp; k++) {
                conditionalSwap(array, k, k + 1);
            }
            tmp--;

        }
        System.out.println(Arrays.toString(array));

    }

    public static void swap(int[] array, int fst, int snd) {
        int tmp = array[fst];
        array[fst] = array[snd];
        array[snd] = tmp;

    }

    public static void conditionalSwap(int[] array, int fst, int snd) {
        if (array[fst] > array[snd]) {
            int tmp = array[fst];
            array[fst] = array[snd];
            array[snd] = tmp;
        }
    }
}
