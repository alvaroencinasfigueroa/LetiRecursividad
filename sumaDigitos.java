
public class sumaDigitos{
    public int sumaDigitos(int n){
        int res = 0;
        if(n<10){
            res = n;
        }else{
            int dig = n%10;
            res = dig + sumaDigitos(n/10);
        }
        return res;
    }

    public int sumaDivisores(int n){
        return sumaDivisores(n,1);
    }

    private int sumaDivisores(int n, int pd){
        int res = 0;

        if(n==1){
            res = 1;
        }else{
            if(pd<=n){
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