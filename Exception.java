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
//throw Keyword
public class Test {

    public static void main(String[] args) {

        int age = 15;

        if(age < 18) {
            throw new ArithmeticException("Not Eligible for Voting");
        }

        System.out.println("Eligible");
    }
}
//throws Keyword
import java.io.IOException;

public class Test {

    static void readFile() throws IOException {
        throw new IOException("File Not Found");
    }

    public static void main(String[] args) {

        try {
            readFile();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

//catch blocks

try {
}
catch(ArithmeticException e) {
}
catch(NullPointerException e) {
}
//without catch

try {
}
finally {
}
//finally execute after return

public static int test() {
    try {
        return 10;
    }
    finally {
        System.out.println("Finally");
    }
}
