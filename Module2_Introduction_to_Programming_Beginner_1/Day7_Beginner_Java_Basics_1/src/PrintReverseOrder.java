import java.util.Scanner;

public class PrintReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        int N = sc.nextInt();
        /*
        //By using while loop

        while(N > 0){
            System.out.print(N%10);
            N = N/10;
       }
        */

        //By Using FOR loop            // we can optimize even further by removing "i"
        for( int i;N>0 ;N=N/10){      // for( ;N>0 ;N=N/10){
            System.out.print(i=N%10); //  System.out.print(N%10);
        }

    }
}

