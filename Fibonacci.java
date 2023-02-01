public class Fibonacci{
    public long fib(int n){
        long res;
        if(n == 0 || n == 1){
            res = n;
        }else{
            res = fib(n-1) + fib(n-2);
        }
        return res;
    }
}
