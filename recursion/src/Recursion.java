// небольшие задачи в попытках понять рекрсию
//schemberev 25052024
public class Recursion {
    public String nString(int n){ // вывести числа от 0 до n
        if (n == 1){
            return "1";
        }
        return nString(n-1) + " " + n;
    }
}
