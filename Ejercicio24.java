

public class Ejercicio24{
    public boolean esDecremental(int n){
        boolean res;
        if(n<10){
          res=true;
        }else{
            res=esDecremental(n/10,n%10);
        }
        return res;
    }
    private boolean esDecremental (int n, int uDig){
        boolean res;
        if(n>10){
            int digt=n%10;
            if(digt>=uDig){
                res=esDecremental(n/10,n%10);
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
