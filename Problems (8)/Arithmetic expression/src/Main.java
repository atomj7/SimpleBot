import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        int result = ((value+1)* value + 2)* value+ 3;
        System.out.print(result);
    }
}