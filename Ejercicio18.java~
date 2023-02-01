public class Ejercicio18{
    public int promedio(int n){
        return promedio(n, true);
    }
    private int promedio(int n, boolean par){
        int res;
        if(n == 0){
            res = 0;
        }else{
            int digito = n%10;
            if(par){
                res = digito + promedio(n/10, false);
            }else{
                res = -digito + promedio(n/10, true);
            }
        }
        return res;
    }
}