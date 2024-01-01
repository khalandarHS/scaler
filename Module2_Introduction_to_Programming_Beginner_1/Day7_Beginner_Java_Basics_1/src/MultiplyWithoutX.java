import java.util.Scanner;

public class MultiplyWithoutX {
    public static void main(String[] args) {

        // Multiply two numbers without using '*'

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Numbers: ");

        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = 0;
        for(int i = 1; i<=B; i++){
            result = result+A;
        }
        System.out.println(result);
    }
}
