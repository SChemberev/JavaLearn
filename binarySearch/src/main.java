import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] inpArr = new int[100000000];
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите искомое значение");
        int key = sc.nextInt();

        for (int i = 0; i < inpArr.length; i++){
            inpArr[i] = rnd.nextInt();
        }

        binarySearch s = new binarySearch();
        System.out.println(s.simpleSearch(inpArr, key));

        System.out.println(s.binSearch(inpArr, key));
    }
}
