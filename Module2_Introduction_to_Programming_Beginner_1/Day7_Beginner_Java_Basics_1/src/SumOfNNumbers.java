import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {

        //Question : Sum of N Numbers : N = 4, [enter 4 Numbers] -> 2, 4, 6, 10 -> = 22

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N Number  : ");

        int N = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= N){
            System.out.println("Enter the Numbers");
            int K = sc.nextInt();
            sum = sum +K;
            i++;
        }
        System.out.println(sum);

    }
}
/*
    else{


 */