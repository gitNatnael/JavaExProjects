import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by natna on 10/24/2018.
 */
public class Test {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inInt=new Scanner(System.in);
        System.out.println("Enter number of Guests");
        int numberOfGuests = inInt.nextInt();

       /* codeMatch = invitationCode[j];
        boolean match = Arrays.asList(invitationCode).;
        System.out.println(match);
        // IntStream.of(invitationCode).anyMatch(x -> x == codeMatch);
        if (!match) {
            System.out.println(codeMatch);
        }*/

       /* try {
            singleGuestList[caseList] = ProblemAb.singleGuestCode(invitationCode);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        System.out.println("Enter code:");

        String code = in.nextLine();
        String[] arr = code.split(" ");
        int[] codeInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            codeInt[i] = Integer.parseInt(arr[i]);

        }
        System.out.println(numberOfGuests);
    }
}
