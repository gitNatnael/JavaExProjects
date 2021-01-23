import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemBB {

    private static List<String> listOfComb = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int games = in.nextInt();
            double p = in.nextDouble();
            String[] gameResult = {"L", "W"};
            ProblemBB.possibleOutcomes(games, new ArrayList<>(Arrays.asList(gameResult)));
            double calculateLongestStreakProb = 0;
            for (String r : listOfComb) {
                char[] st = r.toCharArray();
                int count = 0;
                int flag = 0;
                double calculateWinPro = 1;

                for (char s : st) {
                    if (s == 'L') {
                        count = 0;
                        calculateWinPro *= (1 - p);
                    } else {
                        count++;
                        if (flag <= count) flag =  count;
                        calculateWinPro *= p;
                    }
                }
                calculateLongestStreakProb += ((double) flag * calculateWinPro);
            }
            System.out.println((double) Math.round(calculateLongestStreakProb * 10000000000d) / 10000000000d);

            listOfComb.clear();
        }
    }

    private static void possibleOutcomes(int arraySize, ArrayList<String> possibleValues) {
        int carry;
        int[] indices = new int[arraySize];
        String sc = "";
        do {
            for (int index : indices) {
                if (possibleValues.size()!=arraySize)
                    sc += possibleValues.get(index);
            }
            listOfComb.add(sc);
            sc="";
            carry = 1;
            for (int i = indices.length - 1; i >= 0; i--) {
                if (carry == 0)
                    break;

                indices[i] += carry;
                carry = 0;

                if (indices[i] == possibleValues.size()) {
                    carry = 1;
                    indices[i] = 0;
                }
            }
        }
        while (carry != 1);
    }
}
