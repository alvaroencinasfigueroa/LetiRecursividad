import java.util.*;
public class Ejercicio16{
    public ArrayList<Integer> bomba(int n,int b){
        ArrayList<Integer> res;
        if(n<=b){
            res = new ArrayList<Integer>();
            res.add(n);
        }else{
         int n1 = n/b;
         int n2 = n-n1;
         res = bomba(n1,b);
         ArrayList<Integer> res2 = bomba(n2,b);
         res.addAll(res2);
        }
        return res;
    }
}
 