import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        scanner.close();

        int a = 1;

        while (a <= x) {
            System.out.print(a + " ");
            a += 2;
        }

    }
}







