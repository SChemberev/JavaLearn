/*
    Программа подсчета дохода по депозитарному счету с фиксированным процентом с учетом повторного вложения ежегодного дохода по вкладу
    (Работа с двумерными массивами)
    SChemberev 31.03.24
 */

import java.util.Arrays;
import java.util.Scanner;

public class depositPercentCounter
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Введите количество лет для подсчета: ");
        double years = inp.nextDouble();
        System.out.print("Введите первоначальную сумму вклада: ");
        double deposit = inp.nextDouble();
        //String countChars = String.valueOf(deposit);
        //System.out.println(countChars.length());
        double[][] table = new double[(int) years][20];
        for(int i = 0; i < years; i++) //цикл для заполнения массива
        {
            for (int j = 0; j < 20; j++)
            {
                if (i == 0)
                {
                    table[i][j] = deposit;
                }
                else
                {
                    table[i][j] = table[i -1][j] + (table[i - 1][j] * (j+1)/100);
                }
            }
        }
        String countChars = String.valueOf(table[0][0]);
        System.out.println(countChars.length() + 3);
        System.out.print("   | "); //формирование табличного представления (начало)
        for (int i = 1; i <= 20; i++) //цикл для вывода первой строки таблицы с процентами
        {
            System.out.print(i + "%");
            for(int j = 0; j < countChars.length() + 3; j++)
            {
                 if(i <= 10)
                 {
                     System.out.print(" ");
                 }
                 else
                 {
                     System.out.print(" ");
                 }
            }
        }
        System.out.println();
        for(int i = 0; i < years; i++) //вывод двумерного массива
        {
            System.out.print(i + 1 + "  |");
            for (int j = 0; j < 20; j++)
            {
                System.out.print(" " + String.format("%.4f", table[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
