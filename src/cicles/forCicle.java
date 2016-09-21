package cicles;

/**
 * Created by iabdulov on 21-Sep-16.
 */
public class forCicle {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k++) {
            System.out.print(k);
        }
        System.out.println();
        for (int k = 0; k < 10; ) {
            System.out.print(k);
            k++;
        }
        System.out.println();
        int k = 0;
        for (; ; ) {
            if (k < 10) {
                System.out.print(k);
                k++;
            } else {
                break;
            }
        }
        System.out.println();
        int j = 0;
        while (true) {
            if (j < 10) {
                System.out.print(j);
                j++;
            } else {
                break;
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "/2 = " + (i / 2));
        }
    }
}
