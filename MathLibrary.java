import java.util.ArrayList;
import java.util.List;

public class MathLibrary {

    // Function 1: Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function 2: Return all primes in a range
    public static List<Integer> primesInRange(int start, int end) {
        List<Integer> primes = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    // Function 3: Return prime factorization
    public static List<Integer> primeFactorization(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        return factors;
    }

    // Main method to demonstrate all functions
    public static void main(String[] args) {

        // isPrime()
        System.out.println("isPrime(17): " + isPrime(17));
        System.out.println("isPrime(4): " + isPrime(4));

        // primesInRange()
        System.out.println("Primes between 1 and 20: " + primesInRange(1, 20));

        // primeFactorization()
        System.out.println("Prime factors of 12: " + primeFactorization(12));
    }
}
