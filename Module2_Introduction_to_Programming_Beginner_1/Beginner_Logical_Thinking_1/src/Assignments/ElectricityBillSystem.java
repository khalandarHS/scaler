package Assignments;

import java.util.Scanner;

public class ElectricityBillSystem {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int units = myScanner.nextInt();

        double ans;

        if (units <= 50) {
            ans = units * (0.50);
        } else if (units <= 150) {
            ans = 50 * 0.50 + (units - 50) * 0.75;
        } else if (units <= 250) {
            ans = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;

        } else {
            ans = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }

        float bill = (int)(1.2f*ans);
        System.out.println(bill);

    }
}
