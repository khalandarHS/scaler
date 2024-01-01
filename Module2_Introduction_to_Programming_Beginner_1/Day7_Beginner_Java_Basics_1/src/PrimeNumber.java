import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //check if the given number is a prime number
        //Prime         => Has exactly 2 divisors 1 and itself
        //or we can say => Has '0' divisors in a range of "2 to N-1"

        //Code goes here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: " );
        int N = sc.nextInt();
        int i;
        for (i=2; i <= N - 1; i++) {
            if (N % i == 0) {
                System.out.println(N + " is Not A Prime Number");
                break;
            }
        }
        if (i == N) {
            System.out.println(N + " is a Prime Number");
        }
    }
}
