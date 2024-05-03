import java.lang.reflect.Array;

public class RndArrays {
    private int[] elements = new int[3];
    private int[] weights = new int[3];

    public RndArrays(int[] elements, int[] weights){
        this.elements = elements;
        this.weights = weights;
        for(int weight:weights){
            int counter += weight;
        }
    }
}
