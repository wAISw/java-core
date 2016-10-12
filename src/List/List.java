package List;

import java.util.Arrays;

/**
 * Created by iabdulov on 29-Sep-16.
 */
public class List {
    public static void main(String[] args) {

        Node tail = genIter(0, 1, 2, 3);
        System.out.println(toStringIter(tail));
        Node tail1 = genRec(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(toStringRec(merge(tail, tail1)));


    }

    public static Node genIter(int... values) {
        Node tail = null;
        for (int k = values.length - 1; k >= 0; k--) {
            tail = new Node(values[k], tail);
        }
        return tail;
    }

    public static Node merge(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            if (tailA.value < tailB.value) {
                return new Node(tailA.value, merge(tailA.next, tailB));
            } else {
                return new Node(tailB.value, merge(tailB.next, tailA));
            }
        } else {
            return (tailA == null) ? tailB : tailA;
        }
    }

    public static Node genRec(int... values) {
        if (values.length == 0) {
            return null;
        } else {
            int[] newArray = Arrays.copyOfRange(values, 1, values.length);
            Node next = genRec(newArray);
            return new Node(values[0], next);
        }
    }

    public static String toStringIter(Node tail) {
        String result = "";
        while (tail != null) {
            result += tail.value + "->";
            tail = tail.next;
        }
        return result + "*";
    }

    public static String toStringRec(Node tail) {
        return (tail == null) ? "*" : tail.value + "->" + toStringRec(tail.next);
    }

    public static Node copy(Node tail) {
        return tail == null ? null : new Node(tail.value, copy(tail.next));
    }

    public static boolean isEqual(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            return (tailA.value == tailB.value) && isEqual(tailA.next, tailB.next);
        } else {
            return tailA == tailB;
        }
    }

    public static int length(Node tail) {
        return (tail == null) ? 0 : 1 + length(tail.next);
    }

    public static int max(Node tail) {
        return (tail == null) ? 0 : Math.max(tail.value, max(tail.next));
    }

    public static int sum(Node tail) {
        return (tail == null) ? 0 : tail.value + sum(tail.next);
    }

    public static class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
