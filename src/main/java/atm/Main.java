package atm;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int amount = scanner.nextInt();
        // 20, 10, 5 infinite amount of bills
        // amount % 5 == 0
        // how to receive amount by using the smallest amount of bills?
        System.out.println(amount);

        ATM atm = new ATM();
        atm.process(amount);
    }
}
