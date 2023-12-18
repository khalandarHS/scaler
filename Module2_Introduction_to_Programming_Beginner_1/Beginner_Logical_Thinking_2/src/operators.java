import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        //Division Operator for counting the digits
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int N = sc.nextInt();
        //int N=23456;
        int digits = 0;
        if (N==0){
            System.out.println(1);
        }else {
            while (N != 0) {
                digits = digits + 1;
                N = N / 10;
                //System.out.println(N);
            }

            System.out.println(digits);
        }
    }
}
