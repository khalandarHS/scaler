import java.util.Scanner;

public class ComputePowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Base Number: ");
        int A = sc.nextInt();

        System.out.println("Enter the Exponent Number: ");
        int N = sc.nextInt();
        int i = 1;
        int result = 1;
        while (i<=N){

            result = result * A;
            i++;
        }

        System.out.println(result);

    }
}

/*

//By Using the Power Function Math.pow(base,exponent).

        System.out.println("Enter the Base Number: ");
        int A = sc.nextInt();

        System.out.println("Enter the Exponent Number: ");
        int N = sc.nextInt();

        double result = Math.pow(A,N);

        System.out.println(result);
 */