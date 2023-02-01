
class Ejercicio19{
    public long Ackerman(long m, long n){
        long res = 0;
        if(m == 0){
            res = n+1;
        }else{
            if(m > 0 && n == 0){
                res = Ackerman(m-1,1);
            }else{
                res = Ackerman(m-1,Ackerman(m,n-1));
            }
        }
        return res;
    }
}