import java.lang.reflect.Array;
import java.util.Random;

public class RndArrays {
    private int[] arr;

    public RndArrays(int[] elements, int[] weights){
        int counter = 0;
        for (int i:weights){
            counter += i;
        }
        arr = new int[counter];
        int cursor = 0;
        for(int i = 0; i < weights.length; i++){
            for(int j = 0; j < weights[i]; j++){
                arr[cursor++] = elements[i];
            }
        }
    }

    public int arrayWithWeigts(){
        Random r = new Random();
        int rnd = r.nextInt(arr.length);
        return arr[rnd];
    }
}

