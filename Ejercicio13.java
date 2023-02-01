
public class Ejercicio13{
    //int sec []={2,3,4,5,6,7,8,9,10,11};

    /*public int sumarSecuencia(int n){
    return sumarSecuencia(sec,0);
    }

    private int sumarSecuencia(int sec [],int pos){
    int res=0;
    if(pos<sec.length){
    int pri = sec[pos];
    if(esPrimo(pri)){
    //int np=sec[pos];
    res= pri+sumarSecuencia(sec,pos+1);
    }else{
    res=sumarSecuencia(sec,pos+1);
    }
    }else{
    res = 0;
    }
    return res;
    }*/
    public int sumaPrimos(int n){
        return sumaPrimos(n,0);
    }

    private int sumaPrimos(int n, int pos){
        int res = 0;
        if(n<10){
            if(esPrimo(n)){
                res = n;
            }
            else{
                res = 0;
            }
        }else{
            int dig = n%10;
            if(esPrimo(dig)){
                res = dig + sumaPrimos(n/10, pos+1);
            }
            else{
                res = sumaPrimos(n/10, pos+1);
            }
        }
        return res;
    }

    private boolean esPrimo(int n){
        boolean res;
        if(cantDiv(n) == 2){
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    private int cantDiv(int n){
        return cantDiv(n,1);
    }

    private int cantDiv(int n,int pd){
        int res = 0;
        if(pd <= n){
            if(n%pd == 0)
                res = 1 + cantDiv(n,pd+1);
            else
                res = cantDiv(n,pd+1);
        }else{
            res = 0;
        }
        return res;
    }
}
