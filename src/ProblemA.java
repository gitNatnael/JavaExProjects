import java.util.*;
import java.util.stream.Collectors;

public class ProblemA {

    public static void main(String[] args) {

        int numberOfCases, numberOfGuests, caseList = 0;
        int[] invitationCode, singles;
        Scanner enter = new Scanner(System.in);

        numberOfCases = enter.nextInt();
        singles = new int[numberOfCases];

        do {

            numberOfGuests = enter.nextInt();
            invitationCode = new int[numberOfGuests];
            int count = 0;

            while (count < numberOfGuests) {
                invitationCode[count] = enter.nextInt();
                count++;
            }
            List<Integer> list = Arrays.stream(invitationCode).boxed().collect(Collectors.toList());

            for (int j = 0; j < list.size(); j++) {
                if (Collections.frequency(list, list.get(j)) < 2)
                    singles[caseList] = list.get(j);
            }

            caseList++;
        } while (caseList < numberOfCases);

        for (int i = 0; i < numberOfCases; i++) {
            System.out.println("case #" + (i + 1) + ":" + singles[i]);
        }

    }
}
