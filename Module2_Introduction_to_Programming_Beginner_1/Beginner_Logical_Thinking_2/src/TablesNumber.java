import java.util.Scanner;

public class TablesNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i=1;
        //int total;
        System.out.println("Enter the Number: ");

        int N = sc.nextInt();

        while (i<=10){
            //total = N*i;
            //System.out.println(N + " X " + i + " = " + total );
            System.out.println(N + " X " + i + " = " + N*i );// By using "N*i" reducing the lines of code
            i=i+1;
        }



    }
}
