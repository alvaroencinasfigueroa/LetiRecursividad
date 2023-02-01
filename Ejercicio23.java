
public class Ejercicio23{
    public boolean esIncremental(int n){
        boolean res;
        if(n<10){
            res=true;
        }else{
            res=esIncremental(n/10,n%10);
        }
        return res;
    }

    private boolean esIncremental(int n, int ultimoDig){
        boolean res;
        if(n>10){
            int dig=n%10;
            if(dig<=ultimoDig){
                res=esIncremental(n/10,n%10);
                res=true;
            }else{
                res=false;
            }
        }else{
            res=false;
        }
        return res;
    }
}

