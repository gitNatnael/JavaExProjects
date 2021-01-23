import java.util.*;




public class PrimeNumbers {


    public static void main(String[] args) {

        Scanner inInteger=new Scanner(System.in);
        System.out.println("Enter integer >= 3:");
        int maxPrime = inInteger.nextInt();

        List<Integer> primes = new ArrayList<>();
        for (int i=3; i<=maxPrime; i++){
             if (isPrime(i)){
                 primes.add(i);  //add the prime numbers in the list
             }
        }
        int size=primes.size();  //get half of the list, bc it is sorted list

        for (int i=0 ,j=size-1; i<=j; i++, j--){

           if (i==j) System.out.println(primes.get(i));
           else {
               System.out.println(primes.get(i));  //start the index from 0
               System.out.println(primes.get(j));  //start the index from size-1
           }
        }
    }

    //check if it is prime number or not
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }
}
