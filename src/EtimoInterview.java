import java.util.*;

/**
 * Created by natna on 10/30/2018.
 */
public class EtimoInterview {

    public static void main(String[] args) {
     //    EtimoInterview.multipleOf4();
      EtimoInterview.reverseString();

    }

    private static void reverseString() {

        System.out.println("Enter your sentence");
        Scanner inString = new Scanner(System.in);
        String takeAString = inString.nextLine();
        String[] words = takeAString.split(" ");
        Collections.reverse( Arrays.asList(words));
        for (String r: words){
            System.out.print(r+" ");
        }
        System.out.println("--------------------------");
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(takeAString);
        stringBuilder= stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
    private static void multipleOf4() {
        List<Integer> multipleOF4 = new ArrayList<>();
        for (int i = 1; i < 333; i++) {
            if (i % 4 == 0)
                multipleOF4.add(i);
        }
        Collections.reverse(multipleOF4);
        for (Integer r : multipleOF4) {
            System.out.println(r);
        }

    }
}
