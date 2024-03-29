/*1.0. Максимальное, минимальное и среднее значение

Задача:

Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.

Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].*/

import java.util.Arrays;
import java.util.Scanner;

public class MaxMininArray
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int itemCount = scan.nextInt();
        double[] rndArr = new double[itemCount];
        double avgVal = 0;
        if (itemCount > 0) {
            for (int i = 0; i <= itemCount - 1; i++)
            {
                rndArr[i] = Math.random();
            }
            Arrays.sort(rndArr);
            System.out.println("Наименьший элемент массива: " + rndArr[0]);
            System.out.println("Наибольший элемент массива: " + rndArr[itemCount - 1]);
            for (int i = 0; i <= itemCount - 1; i++)
            {
                avgVal += rndArr[i];
            }
            System.out.println("Среднее значение массива: " + avgVal/2);
        }
        else
        {
            System.out.print("Массив пуст");
        }
    }
}
