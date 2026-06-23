public class Test {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        System.out.println(a / b);
    }
}
//Using try-catch
public class Test {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
//finally Block
public class Test {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Exception Handled");
        }
        finally {
            System.out.println("Finally Block Executed");
        }
    }
}
