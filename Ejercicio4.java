
public class Ejercicio4{
    public int contFactores(int n){
        return contFactores(n, n/2);
    }

    private int contFactores(int n, int posFactor){
        int res = 0;
        if(posFactor > 1){
            if((n % posFactor)==0 ){
                if(esPrimo(posFactor)){
                    res = 1 + contFactores(n, (posFactor-1));
                }else{
                    res = contFactores(n, (posFactor-1));
                }
            }else{
                res = contFactores(n, (posFactor-1));
            }

        }
        return res;
    }

    private boolean esPrimo(int n){
        boolean res;
        if(cantDivi(n) == 2){
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    private int cantDivi(int n){
        return cantDivi(n,1);   
    }

    private int cantDivi(int n,int pd){
        int res=0;
        if(pd<=n){
            if(n%pd==0)
                res = 1+cantDivi(n,pd+1);
            else
                res = cantDivi(n,pd+1);
        }else{
            res=0;
        }
        return res;
    }
}
