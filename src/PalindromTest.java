/**
 * Created by natna on 5/3/2019.
 */
public class PalindromTest {

    public static void main(String[] args) {
        String test="tattarrattat";
        StringBuilder sb=new StringBuilder(test);
        String r= String.valueOf(sb.reverse());
        if (r.equals(test))
            System.out.println("");
        else
            System.out.println("");
        System.out.println( isPalindrome(test));
    }


    private  static boolean isPalindrome(String word){
        String c="";
        for (byte w: word.getBytes()){
            c=(char)w+c;
        }
        System.out.println(c);

        return  true;
    }
}
