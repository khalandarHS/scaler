import java.util.Scanner;

public class IncrementOperator {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int A = sc.nextInt();
        int A = 10;
        int B = A++;
        int C = ++A;

        System.out.println(A + ", " +  B + ", " + C); // result = 12, 10 , 13 (Explanation will be given in the Notes/Class)
        int X =10;
        int Y = X--;  //Post Decrement
        int Z = --X;  //Pre Decrement

        System.out.println(X + ", " + Y + ", " + Z);
    }
}
