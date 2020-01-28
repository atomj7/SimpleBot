import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        if( inputNum % 2 == 0 ){
            System.out.print(inputNum + 2);
        } else {
            System.out.print(inputNum + 1);
        }
    }
}