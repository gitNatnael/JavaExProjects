import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by natna on 5/3/2019.
 */
public class GetMax {

    public static void main(String[] args) {
        Integer [] numbers={234,23,12,-1,200,1,8,10};
        List<Integer> list= Arrays.asList(numbers);
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(list.size()-2));
        int max=0, max2=0;
        max=numbers[0];
        max2=numbers[1];
        for(int i=0; i<numbers.length; i++){
            if (numbers[i]>max)
                max=numbers[i];
        }
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>max2 && numbers[i]!=max )
                max2=numbers[i];
        }
        System.out.println(max2);
        System.out.println(max);
    }
}
