import java.util.Scanner;

public class GroceryBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coupon amount as a decimal: ");
        double coupon = scanner.nextDouble();

        if (coupon <= 0 || coupon > 1) {
            coupon = 0.10;
        }

        System.out.println("Enter the number of weeks (2-4): ");
        int weeks = scanner.nextInt();

        if (weeks < 2) {
            weeks = 2;
        } else if (weeks > 4) {
            weeks = 4;
        }

        double total = 0;
        for (int i = 1; i <= weeks; i++) {
            System.out.println("Enter the grocery bill for week " + i + ": ");
            total += scanner.nextDouble();
        }

        double monthlyTotal = total;
        double weeklyAverage = total / weeks;

        double monthlyTotalWithCoupon = monthlyTotal * (1 - coupon);
        double weeklyAverageWithCoupon = weeklyAverage * (1 - coupon);

        System.out.println("Monthly total without coupon: \\$" + monthlyTotal);
        System.out.println("Weekly average without coupon: \\" + weeklyAverage);

        System.out.println("Monthly total with coupon: \\" + monthlyTotalWithCoupon);
        System.out.println("Weekly average with coupon: \\" + weeklyAverageWithCoupon);
    }
}