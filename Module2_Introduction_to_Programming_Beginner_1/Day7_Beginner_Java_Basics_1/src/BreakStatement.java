public class BreakStatement {
    public static void main(String[] args) {
        int calories = 0;
        int gf_calls_up = 5;

        while (calories <= 20){
            System.out.println("Burning Calories " + calories);
            if (calories == gf_calls_up){
                break;
            }
            calories = calories+1;
        }
        System.out.println("Out of GYM");
    }
}
