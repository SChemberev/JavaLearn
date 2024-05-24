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

    public int binSearch(int[] inputArr, int key){ // двоичный поиск
        Arrays.sort(inputArr);
    }
}

