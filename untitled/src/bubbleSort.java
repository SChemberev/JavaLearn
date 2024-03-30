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
        int arrRng = scan.nextInt();
        if (arrRng > 0)
        {
            int[] arr = new int[arrRng];
            Random rnd = new Random();
            for (int i = 0; i <= arrRng - 1; i++) //заполнение массива целыми числами
            {
                arr[i] = rnd.nextInt();
            }
            System.out.println("Исходный массив: " + Arrays.toString(arr));
            for (int i = 0; i < arr.length - 1; i++) //сортировка массива
            {
                for (int j = 0; j < arr.length - 1; j++)
                {
                    if (arr[j] > arr[j + 1])
                    {
                        int defVal = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = defVal;
                    }
                }
            }
            System.out.print("Отсортированный массив: " + Arrays.toString(arr));
        }
        else
        {
           System.out.println("Нет элементов в массиве!");
        }
    }
}
