
public class Ejercicio2{
    public boolean esPrimo(int n){
        boolean res;
        if(cantDiv(n) == 2){
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    public int cantDiv(int n){
        return cantDiv(n,1);
    }

    private int cantDiv(int n, int pd){
        int res = 0;
        if(pd <= n){
            if(n % pd == 0)
                res = 1 + cantDiv(n,pd+1);
            else
                res = cantDiv(n,pd+1);
        }else{
            res = 0;
        }
        return res;
    }
}
