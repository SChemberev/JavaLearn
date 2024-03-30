/*
    Поиск простых чисел
    SChemberev 30.03.24
 */

import java.util.Arrays;

public class simpleNumbers
{
    public static void main(String[] args)
    {
        int[] inpArr = new int[101];
        for (int i = 0; i < inpArr.length; i++) //заполнение массива
        {
            inpArr[i] = i;
        }
        for (int i = 2; i <= 100; i++)
        {
            if((inpArr[i] % 2 != 0) && (inpArr[i] % 3 != 0) && (inpArr[i] % 5 != 0))
            {
                System.out.print(inpArr[i] + " ");
            }
        }
    }
}
