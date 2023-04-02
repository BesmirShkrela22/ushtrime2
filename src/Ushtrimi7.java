import java.util.Scanner;

public class Ushtrimi7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep nje numer me te vogel sesa 100: ");
        int nr = scanner.nextInt();
        while(nr>100){
            System.out.println("Numer i gabuar. Vendos nje numer me te vogel se 100: ");
            nr = scanner.nextInt();
        }
        System.out.println("Numer i sakte.");
    }
}
