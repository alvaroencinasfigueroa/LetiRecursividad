
public class Ejercicio106{
    public int arbolN(int n){
        int res=0;
        if(n==1){
            res=6;
        }else{
            res=arbolN(n-1)+(2*(n)-1)+4;
        }
        return res;
    }
}
