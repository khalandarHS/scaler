import java.util.Scanner;

public class TwoNumbersSum {
    public static void main(String[] args) {

        // For SUM numbers in between TWO numbers ex: 2,6 -> 2+3+4+5+6  = 20;

        //Edge cases (A<B) (B<A)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int i, sum;

        if (A < B) {
             i = A;
             sum = 0;
            while (i <= B) {
                sum = sum + i;
                i++;
            }
        } else {
            i = B;
            sum = 0;
            while (i <= A) {
                sum = sum + i;
                i++;
            }

        }
        System.out.println(sum);
    }
}


/*

        int i = A;
        int sum = 0;
        while (i<=B){
            sum = sum +i;
            i++;
        }
        System.out.println(sum);
    }

}
 */

