import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Vendos tekstin: ");
        String text = in.nextLine();
        System.out.print("E kunderta e tekstit te vendosur eshte : ");
        for (int idx = text.length() - 1; idx >= 0; --idx) {
            System.out.print(text.charAt(idx));
        }
    }

}
