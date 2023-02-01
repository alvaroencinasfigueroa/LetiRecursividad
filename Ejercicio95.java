
public class Ejercicio95{
    public int kotch(int n){
        int res=0;
        if(n==1){
            res=1;
        }else{
            res=kotch(n-1)*4+1;
        }
        return res;
    }
}
