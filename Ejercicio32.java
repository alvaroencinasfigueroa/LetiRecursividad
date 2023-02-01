import java.util.*;
public class Ejercicio32{
    public int eliminarSegundasOcurrencias(int n){
        ArrayList<Integer> lista = new ArrayList<>();
        return eliminarSegundasOcurrencias(n, lista, 1);
    }
    public int eliminarSegundasOcurrencias(int n, ArrayList<Integer> us, int multiplicador){
        int res = 0;
        if(n == 0){
            res = 0;
        }else{
            int dig = n % 10;
            if(!us.contains(dig)){
                us.add(dig);
                res = (multiplicador*dig) + res + eliminarSegundasOcurrencias(n/10, us, multiplicador*10);
            }
        }
        return res;
    }
}
