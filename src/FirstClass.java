public class FirstClass {
    public static void main(String[] args) {
       double myDouble = 20.00;
       double myDouble2 = 80.00;

       boolean remainderIsZero = myDouble + myDouble2 * 100.00 % 40.00 == 0.00;
       System.out.println(remainderIsZero);

       if(!remainderIsZero) {
           System.out.println("got some remainder");
       }
    }
}
