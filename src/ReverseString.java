/**
 * Created by natna on 4/27/2019.
 */
public class ReverseString {

    public static void main(String[] args) {
        String s="tattarrattat";
        StringBuilder sb=new StringBuilder(s);
       // System.out.println(sb.reverse());
        String reverse="";
        /*byte [] sbyt=s.getBytes();
        byte [] reverse=new byte[sbyt.length];
        for (int i=0;i<sbyt.length;i++){
            reverse[i]=sbyt[sbyt.length-i-1];
        }
        for (byte b: s.getBytes()){
            reverse=(char)b + reverse;
        }
        String rev=new String(reverse);
        if (rev.equals(s))
            System.out.println("p");
        else
            System.out.println("Not palndrome"); */
        palindromByReversingChar("tattadddrrattat12");
        //System.out.println(new String(reverse));

    }
    private static void palindromByReversingChar(String s){

        String reveerse="";
        for (byte b: s.getBytes()){
            reveerse=(char)b+reveerse;
        }

        if (s.equals(reveerse)) System.out.println("palindrom");
        else System.out.println("Not palindrom");

    }

    private  static void palindromByStringBuffer(String s){

        StringBuilder name=new StringBuilder(s);
        name.reverse();
        System.out.println(name);
        System.out.println(s);
        if (s.equals(name.reverse().toString()))
            System.out.println("It is palindrom");
        else System.out.println("not palindrom");


    }
}
