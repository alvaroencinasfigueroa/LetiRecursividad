
public class Factorial{
    public int factorial(int n){
        int res = 0;
        if(n==0){
            res = 1;
        }else{
            res = factorial(n-1)*n;
        }
        return res;
    }
}
