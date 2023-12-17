import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int temperature = sc.nextInt();

        if (temperature > 25){
            System.out.println("Hot Day Today");
        } else {
            System.out.println(" It's a Pleasant Day");
        }

        System.out.println("Let's go Out");
    }
}
