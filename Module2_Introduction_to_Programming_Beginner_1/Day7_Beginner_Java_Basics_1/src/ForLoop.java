import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // While is equivalent to For loop

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i = 1;
        while (i<=N){
            System.out.print(i +", ");
            i++;
        }
        System.out.println();
        for(int j =1;j<=N;j++){
            System.out.print(j+", ");
        }
    }
}

/*
In the above example we can see that for and while loop is exact the same, even the speed is same
we use for loop for compact Syntax (for lesser lines of code)
 */