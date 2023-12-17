import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {

        //Building a Scanner
        Scanner sc = new Scanner(System.in);

        //Use the Scanner
        System.out.println("Enter Your Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter Your College: ");
        String College = sc.nextLine();
        System.out.println("Hello " + Name );
        System.out.println("Welcome to " + College);
    }
}
