import java.util.Arrays;

/*Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
Используйте перебор и двоичный поиск для решения этой задачи*/
//schemberev 24052024
public class binarySearch {
    public int simpleSearch(int[] inputArr, int key){ // перебор массива
        for(int i = 0; i < inputArr.length; i++){
            if (inputArr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int binSearch(int[] inputArr, int key){
        return binSearch(inputArr, key, 0, inputArr.length);
    }

    private static int binSearch(int[] inputArr, int key, int start, int end){ // двоичный поиск
        int half = (start + end) / 2;
        if(start > end){
            return -1;
        }
        if (key == inputArr[half]){
            return half;
        } else if (key < inputArr[half]) {
            return binSearch(inputArr, key, start, half -1);
        }
        else {
            return binSearch(inputArr, key, half + 1, end);
        }
    }
}

