/*Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений. *done*
Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
        Пример:
Дан массив [1, 2, 3], и массив весов [1, 2, 10].
        В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».*/
//schemberev 03052024

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] elm = new int[]{r.nextInt(11), r.nextInt(11), r.nextInt(11)};
        int[] wht = new int[]{r.nextInt(11), r.nextInt(11), r.nextInt(11)};
        RndArrays inp = new RndArrays(elm, wht);
        //System.out.println(Arrays.toString(elm));
    }
}
