import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos numrin: ");
        int number = scanner.nextInt();
        if (number != 0) {
            for (int i = number; i >= 0; i--) {
                System.out.print(i + " ");
            }
            for (int i = number; i <= 0; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print(number);
        }
    }
}
