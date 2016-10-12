package recursion;

/**
 * Created by iabdulov on 27-Sep-16.
 */
public class Recursion {
    public static void main(String[] args) {
//        f1(1);
//        for (int i = 0; i < 30; i++) {
//            System.out.println("fib(" + i + ") = " + fib(i));
//        }
        fib(5);
    }

    public static void f(int arg) {
        System.out.print(" " + arg);
        if (arg < 7) {
            f(2 * arg);
        }
    }

    public static void f1(int arg) {
        if (arg < 7) {
            f1(2 * arg);
        }
        System.out.print(" " + arg);
    }

    public static int fib(int arg) {
        int res = arg < 2 ? 1 : fib(arg - 2) + fib(arg - 1);
        System.out.print(" " + arg);
        return res;
    }
}

