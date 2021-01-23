import java.util.*;

public class ProblemAb {

    public static void main(String[] args) {

        int numberOfCases, numberOfGuests, caseList = 0;
        Integer[] singleGuestList;
        Scanner enter = new Scanner(System.in);

        try {
            System.out.println("Enter number of Cases  1≤ N ≤ 50:");
            numberOfCases = enter.nextInt();
            singleGuestList = new Integer[numberOfCases];
            List<Integer> listOfInvitationCode;

            do {

                System.out.println("Enter number of guests 3≤G<1000:");
                numberOfGuests = enter.nextInt();
                System.out.println("Enter invitation code:");
                int count = 0;
                listOfInvitationCode = new ArrayList<>();
                while (count < numberOfGuests) {
                    listOfInvitationCode.add(enter.nextInt());
                    count++;
                }
                for (int j = 0; j < listOfInvitationCode.size(); j++) {
                    if (Collections.frequency(listOfInvitationCode, listOfInvitationCode.get(j)) < 2)
                        singleGuestList[caseList] = listOfInvitationCode.get(j);
                }

                caseList++;
            } while (caseList < numberOfCases);

            for (int i = 0; i < numberOfCases; i++) {
                System.out.println("case #" + (i + 1) + ":" + singleGuestList[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

