import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by natna on 4/26/2019.
 */
public class ForeachMethod {
    public static void main(String[] args) {


        List<String> nameList = new ArrayList<String>();

        nameList.add("Java");
        nameList.add("Kotlin");
        nameList.add("Android");

        // only single statement to be executed for each item in the ArrayList
        nameList.forEach(name -> System.out.println(name) );

        // multiple statements to be executed for each item in the ArrayList
        nameList.forEach(name -> {
            if(name.equals("Android")) {
                System.out.println(name + " is a framework.");
            } else {
                System.out.println(name + " is a programming language.");
            }
        });

        System.out.println("-----------foreach hashmap-----");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(10, "Java");
        map.put(20, "Kotlin");
        map.put(30, "Android");

        // only single statement to be executed for each item in the Map
        map.forEach( (key,value) -> System.out.println(key+":"+value) );

        // multiple statements to be executed for each item in the Map
        map.forEach((key,value) -> {
            if(value.equals("Android")) {
                System.out.println(value + " is a framework.");
            } else {
                System.out.println(value + " is a programming language.");
            }
            if (key.equals(20)) System.out.println("key is 20");
        });
    }
}
