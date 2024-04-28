/*
    Программа подсчета дохода по депозитарному счету с фиксированным процентом с учетом повторного вложения ежегодного дохода по вкладу
    (Работа с двумерными массивами)
    SChemberev 31.03.24
 */

import java.io.*;
import java.util.Scanner;

public class depositPercentCounter
{
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        System.out.print("Введите количество лет для подсчета: ");
        double years = inp.nextDouble() + 1;
        System.out.print("Введите первоначальную сумму вклада: ");
        double deposit = inp.nextDouble();
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
        System.out.println();
        for(int i = 0; i < years; i++) //вывод двумерного массива
        {
            System.out.format("%5s", i + "|");
            for (int j = 0; j < 20; j++) {
                if (i == 0) {
                    System.out.format( "%10s", j + 1 + "%");
                } else {
                    System.out.format("%10s", String.format("%.2f", table[i][j]));
                }
            }
            System.out.println();
        }
        File outFile = new File("D:/depositCounter.txt");
        outFile.createNewFile();
        // FileOutputStream newOutput = new FileOutputStream(outFile);
        saveArrayToFile(table, outFile);

    }

    private static void saveArrayToFile(double[][] arr, File path)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (int i = 0; i < arr.length; i++)
            {
                bw.write(String.format("%5s", i + "|"));
                for (int j = 0; j < arr[0].length; j++)
                {
                    if(i == 0)
                    {
                        bw.write(String.format("%10s", j + 1 + "%|"));
                    }
                    else
                    {
                        bw.write(String.format("%10s", (String.format("%.2f", arr[i][j]) + "|")));
                    }
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
