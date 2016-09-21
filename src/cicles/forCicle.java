package cicles;

/**
 * Created by iabdulov on 21-Sep-16.
 */
public class ForCicle {
    public static void main(String[] args) {
        System.out.println("Простой for");
        for (int k = 0; k < 10; k++) {
            System.out.print(k);
        }
        System.out.println("for с увеличением внутри цикла");
        for (int k = 0; k < 10; ) {
            System.out.print(k);
            k++;
        }
        System.out.println("for бесконечный");
        int k = 0;
        for (; ; ) {
            if (k < 10) {
                System.out.print(k);
                k++;
            } else {
                break;
            }
        }
        System.out.println("while");
        int j = 0;
        while (true) {
            if (j < 10) {
                System.out.print(j);
                j++;
            } else {
                break;
            }
        }
        System.out.println("Целочисленное деление");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "/2 = " + (i / 2));
        }


    }
}
