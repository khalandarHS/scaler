import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N = sc.nextInt();
        int sum = 0;
        while (N != 0){
            sum = sum +(N%10);
            N = N/10;
        }
        // If condition for negative numbers
        if(sum<0){
            //sum = -sum; //THis can be used or below line
            sum = sum *-1;
        }

        System.out.println(sum);
    }
}
