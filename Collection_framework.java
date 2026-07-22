//List
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");

        System.out.println(list);
    }
}

//Output 
//[Java, Python, Java]

//set
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java");

        System.out.println(set);
    }
}

//Output 
//[Java, Python]

//3.Queue
