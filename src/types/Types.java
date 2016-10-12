package types;

/**
 * Created by iabdulov on 03-Oct-16.
 */
public class Types {
    public static void main(String[] args) {
        IntHolder x = new IntHolder(0);
        x = f(x);
        System.out.println("x.value = "+x.value);
        
    }

    public static class IntHolder {
        /*stack                                     Heap                                                  PerGen
           x (new IntHolder(0)) ----->[[тех.часть ее может и не быть][значение свойства value]]
         */
        public int value;

        public IntHolder(int value) {
            this.value = value;
        }
    }

    public static IntHolder f(IntHolder x) {
        return new IntHolder(x.value);
    }
}
