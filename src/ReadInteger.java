import java.util.*;

/**
 * Created by natna on 10/25/2018.
 */
public class ReadInteger {

    public static void main(String[] args) {

        List<Integer> integers=new ArrayList<>();
        int numberOFGuests=5;
        Integer [] arr=new Integer[numberOFGuests];

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter integer");
        int i=0;
        while (i<numberOFGuests){
            arr[i]=scanner.nextInt();
            i++;
        }

        List<Integer> list=  Arrays.asList(arr);
        for (int j=0; j< numberOFGuests; j++)
            System.out.println("Frequency"+list.get(j)+":"+ Collections.frequency(list, arr[j]));

    }
}
