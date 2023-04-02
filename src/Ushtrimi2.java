import java.util.Scanner;

public class Ushtrimi2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Vendos numrin: ");
        int num = in.nextInt();

        if (num > 0)
        {
            System.out.println("Numri i vendosur eshte pozitive");
        }
        else if (num < 0)
        {
            System.out.println("Numri i vendosur eshte negative");
        }
        else
        {
            System.out.println("Numri i vendosur eshte zero");
        }
    }
}
