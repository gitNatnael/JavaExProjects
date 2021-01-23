/**
 * Created by natna on 5/5/2019.
 */
public class Factorial {

    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));


    }

    /*private void stt(){
        int x=0;
        assert (x>0) ? "a": "b";
        System.out.println("finished");
    }*/
    private static double factorial(int n){
        int factorial = n;
        for (int j = n - 1; j > 0; j--) {
            factorial = factorial * j;
        }
        return factorial;
    }
}
