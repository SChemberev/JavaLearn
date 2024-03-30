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
        for (int i = 2; i <= inpArr.length - 1; i++) //поиск простых чисел
        {
            boolean isSimple = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isSimple = false;
                    break;
                }
            }
            if(isSimple)
            {
                System.out.print(i + " ");
            }
        }
    }
}
