import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstHour = scanner.nextInt();
        int firstMinutes = scanner.nextInt();
        int firstSeconds = scanner.nextInt();
        int secondHour = scanner.nextInt();
        int secondMinutes = scanner.nextInt();
        int secondSeconds = scanner.nextInt();
        int secondPassed = (secondHour - firstHour) * 3600 + (secondMinutes - firstMinutes) * 60 + secondSeconds - firstSeconds;
        System.out.print(secondPassed);
    }
}