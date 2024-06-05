// небольшие задачи в попытках понять рекрсию
//schemberev 25052024
public class Recursion {
    public String nString(int n){ // вывести числа от 0 до n
        if (n == 1){
            return "1";
        }
        return nString(n-1) + " " + n;
    }

    public String aToB(int A, int B){ // вывести числа от А до В включительно
        if (A > B){
            if (A == B){
                return Integer.toString(A);
            }
            return A + " " + aToB(A - 1, B);
        }
        else {
            if (A == B){
                return Integer.toString(A);
            }
            return aToB(A + 1, B) + " " + B;
        }
    }
}
