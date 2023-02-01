

public class Ejercicio1{
    public int potencia(int n,int m){
        int res=0;
        if(n==0){
            res=1;
        }else{
            if(m==1)
            res=n;
            else
            res=potencia(n,m-1)*n;
        }
        return res;
    }
}
