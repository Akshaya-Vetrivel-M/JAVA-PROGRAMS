import java.util.Scanner;

public class ElectricBillCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();

        double rate;

        if (units <= 100) {
            rate = 1.0;
        } else if (units <= 300) {
            rate = 1.5;
        } else {
            rate = 2.0;
        }

        double bill = units * rate;

        System.out.println("Total electricity bill: " + bill);

        sc.close();
    }
}

Output:
Sample Run 1
Enter the number of units consumed: 80
Total electricity bill: 80.0

Sample Run 2
Enter the number of units consumed: 200
Total electricity bill: 300.0
