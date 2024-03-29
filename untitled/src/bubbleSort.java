import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
    Сортировка массива (пузырьком)
    SChemberev 29.03.24
 */
public class bubbleSort
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = 10;
        int arrRng = scan.nextInt();
        if (arrRng > 0)
        {
            int[] arr = new int[arrRng];
            Random rnd = new Random();
            for (int i = 0; i <= arrRng - 1; i++) //заполнение массива целыми числами
            {
                arr[i] = rnd.nextInt(n);
            }
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i <= arrRng; i++)
            {
                int firstInt = arr[i];
                int secondInt = arr[i + 1];
                if(arr[i] > arr[i + 1])
                {
                    arr[i] = secondInt;
                    arr[i + 1] = firstInt;
                    System.out.println(Arrays.toString(arr));
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        else
        {
           System.out.println("Нет элементов в массиве!");
        }
    }
}
