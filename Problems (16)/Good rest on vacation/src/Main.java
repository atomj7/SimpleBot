import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int durationDays = scanner.nextInt();
        int foodCost = scanner.nextInt() * durationDays;
        int flightCost = 2 * scanner.nextInt();
        int nightCost = (durationDays -1) * scanner.nextInt();
        System.out.print(nightCost + flightCost + foodCost);
    }
}