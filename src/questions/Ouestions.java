package questions;

import java.util.Arrays;

/**
 * Created by iabdulov on 21-Sep-16.
 */
public class Ouestions {
    public static void main(String[] args) {
        // Напишите код который инвертирует массив
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(invertDown(data)));
        //  еще один вариант
        System.out.println(Arrays.toString(invertRec(data, 0)));

        // Инвертация строки
        String s = "test string";
        System.out.print(s+" -> ");
        System.out.println(invertString(s.toCharArray()));
    }

    public static int[] invert(int[] data) {
        for (int k = 0; k < data.length / 2; k++) {
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
        }
        return data;

    }

    public static int[] invertDown(int[] data) {
        for (int k = data.length / 2; k >= 0; k--) {
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
        }
        return data;

    }

    public static int[] invertRec(int[] data, int k) {
        if (k < data.length / 2) {
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
            invertRec(data, k + 1);
        }
        return data;
    }

    public static String invertString(char[] data) {
        for (int k = data.length / 2; k >= 0; k--) {
            char tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
        }
        return new String(data);
    }

}
