import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by natna on 10/28/2018.
 */
public class PossibleOutcome {

    private static List<String> listOfComb = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int games = in.nextInt();
        double p = in.nextDouble();
        String[] gameResult = {"L", "W"};
      //  PossibleOutcome.generateCombinations(games, new ArrayList<>(Arrays.asList(gameResult)));
        for (String st: listOfComb){
            System.out.println(st);
        }
    }

/*
    private static void generateCombinations(int arraySize, ArrayList<String> possibleValues) {
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
    }*/

}


