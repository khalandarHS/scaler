import java.util.Scanner;

public class FizzBuzzChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i =1;
        while ( i<=N ) {
        if (i%3 ==0 && i%5==0){
            System.out.print("FizzBuzz ");
        } else if (i%3==0) {
            System.out.print("FIzz ");
        } else if (i%5==0) {
            System.out.print("Buzz ");
        }else {
            System.out.print(i+ " ");
        }
            i=i+1;
        }

    }
}
