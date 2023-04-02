import java.util.Arrays;
import java.util.Scanner;

public class Ushtrimi3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos gjatesine e array: ");
        int gjatesia = scanner.nextInt();
        int[] myArray = new int[gjatesia];
        for(int i = 0; i < gjatesia; i++){
            System.out.println("Vendos elementin e " + (i + 1) + ":");
            myArray[i] = scanner.nextInt();
        }
        int maxValue = myArray[0];
        int minValue = myArray[0];
        for(int i = 1; i < myArray.length; i++)
        {
            if(myArray[i] > maxValue)
                maxValue = myArray[i];
            else if(myArray[i] < minValue)
                minValue = myArray[i];
        }
        System.out.println("Vlera maksimale eshte: " +maxValue);
        System.out.println("Vlera minimale eshte: " +minValue);
     }
}
