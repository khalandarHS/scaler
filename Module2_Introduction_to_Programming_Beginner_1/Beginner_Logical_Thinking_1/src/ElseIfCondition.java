import java.util.Scanner;

public class ElseIfCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int temperature = sc.nextInt();

        if (temperature >= 25){
            System.out.println("Hot Day Today");
        } else if (temperature >=15 ) {
            System.out.println("It's a Pleasant Day");
        } else {
            System.out.println("It's Getting Colder");
        }

        //System.out.println("Let's go Out");

    }
}

