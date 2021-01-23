/**
 * Created by natna on 4/26/2019.
 */
public class StringDemo {

    public static void main(String[] args) {
        System.out.println("------reverse string");

        String str = "tatat9";
        String reverseStr="";

        for(byte c:str.getBytes()){
            reverseStr=(char)c+reverseStr;
        }
        System.out.println("Original String is : "+str);
        System.out.println("Reversed String is : "+reverseStr);
        if (str.equals(reverseStr)) System.out.println("so the string is palindrom");
        else System.out.println("so the string is not palindrom");

        System.out.println("----palindrom check using string builder-----");

        StringBuilder sb=new StringBuilder(str);
        if (sb.reverse().toString().equals(str)) System.out.println("so the string is palindrom");
        else System.out.println("so the string is not palindrom");
    }
}
