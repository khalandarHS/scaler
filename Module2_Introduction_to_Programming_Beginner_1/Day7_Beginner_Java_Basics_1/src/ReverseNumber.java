import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //fallowing is to reverse the whole number but one edge case can not be satisfied.
        //while last digit is '0' ex 10020 .i.e, for falling first digit can not be zero.

        System.out.println("Enter the Numbers: ");
        int N = sc.nextInt();
        int ans =0;
        for( ;N > 0;N=N/10){
          int rem = N%10;
          ans = ans*10 + rem; // refer the notes for the Explanation. (Good explanation check notes)
        }
        System.out.println(ans);
    }
}
