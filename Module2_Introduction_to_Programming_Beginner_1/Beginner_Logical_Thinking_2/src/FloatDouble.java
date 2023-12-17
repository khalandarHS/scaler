public class FloatDouble {
    public static void main(String[] args) {
        float cost1 = 1.23123456789999f; // It can only store small numbers
        Double cost3 = 1.23123456789999; // for more precision we use Double.

        int cost2 = (int)9.25;

        System.out.println(cost1);
        System.out.println(cost2);
        System.out.println(cost3);
    }
}
