
public class Perfecto{
    public boolean perfectoIterativo(int n){
        boolean res = false;
        int s = 0;
        //int r=n/2;
        for(int k=1; k<=n/2; k++){
            if(n%k==0){
                s = s+k;
            }
        }
        if(s==n){
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    public boolean perfectoRecursivo(int n){
        boolean res = false;
        int suma=sumaDivisores(n);
        if(n==1){
            res = false;
        }
        else{
            if(n>=2){
                if(suma==n){
                    res = true;
                }
                else{
                    res = false;
                }
            }
        }
        return res;
    }

    private int sumaDivisores(int n){
        return sumaDivisores(n,1);
    }
    //este metodo suma los divisores de un numero pero no toma en cuenta al mismo número
    //ejemplo: ingresamos 4 sus divisores son 1, 2 entonces solo los toma en cuenta a ellos y 
    //ya no al 4
    private int sumaDivisores(int n, int pd){
        int res = 0;
        if(n==1){
            res = 1;
        }else{
            if(pd<n){
                if(n%pd==0){
                    res = pd + sumaDivisores(n,pd+1);
                }
                else{
                    res = sumaDivisores(n,pd+1);
                }
            }

        }
        return res;
    }
}
