import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos string e pare: ");
        String text1 = scanner.nextLine();
        System.out.println("Vendos string e dyte: ");
        String text2 = scanner.nextLine();
        System.out.println("Vendos string e trete: ");
        String text3 = scanner.nextLine();
        System.out.println("String qe ka me shume karaktere eshte: ");
        if(text1.length() >= text2.length() && text1.length() >= text2.length()){
            System.out.print(text1 + " ");
        }
        if(text2.length() >= text3.length() && text2.length() >= text1.length()){
            System.out.print(text2 + " ");
        }
        if(text3.length() >= text2.length() && text3.length() >= text1.length()){
            System.out.print(text3 + " ");
        }
    }
}
