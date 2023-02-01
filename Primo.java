

public class Primo{
    public boolean esPrimo(int n){
        boolean res;
        if(cantDivi(n) == 2){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
    
    public int cantDivi(int n){
       return cantDivi(n,1);   
   }
   private int cantDivi(int n,int pd){
       int res = 0;
       if(pd <= n){
           if(n % pd == 0)
            res = 1 + cantDivi(n,pd+1);
           else
            res = cantDivi(n,pd+1);
        }else{
            res = 0;
        }
        return res;
   }
}
