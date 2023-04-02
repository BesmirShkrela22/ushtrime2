import java.util.Arrays;

public class Ushtrimi4 {
    public static void main(String[] args)
    {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        int[] array2 = {11, 10, 12, 13, 14, 2, 4, 5};

        System.out.println("Array i pare : "+ Arrays.toString(array1));
        System.out.println("Array i dyte : "+Arrays.toString(array2));


        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                    System.out.println("Common element : "+(array1[i]));
                }
            }
        }
    }
}
