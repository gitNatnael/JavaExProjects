
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemBProbability {

    private static List<String> combination = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int games = in.nextInt();
            double p = in.nextDouble();
            char[] alphabet = new char[]{'a', 'b'};
            ProblemBProbability.possibleStrings(games, alphabet, "");
            double calculateLongestStreakProb = 0;

            for (String r : combination) {
                char[] st = r.toCharArray();
                int count = 0;
                int flag = 0;
                double calculateWinPro = 1;

                for (char s : st) {
                    if (s == 'a') {
                        count = 0;
                        calculateWinPro *= (1 - p);
                    } else {
                        count++;
                        if (flag <= count) flag = count;
                        calculateWinPro *= p;
                    }
                }
                calculateLongestStreakProb += ((double) flag * calculateWinPro);
            }
            System.out.println((double) Math.round(calculateLongestStreakProb * 10000000000d) / 10000000000d);
            combination.clear();
        }

    }

    public static void possibleStrings(int maxLength, char[] alphabet, String curr) {
        StringBuilder stCurr = new StringBuilder(curr);
        if (curr.length() == maxLength) {
            combination.add(curr);
        } else {
            for (int i = 0; i < alphabet.length; i++) {
                StringBuilder oldCurr = new StringBuilder(curr);
                curr += alphabet[i];
                possibleStrings(maxLength, alphabet, curr);
                curr = oldCurr.toString();
            }

        }

    }
}