
public class Recursividad1
{

    public int nSimoSerie(int n){

        if (n==1)
            return 5;
        else if (n==2)
            return 13;

        else
            return nSimoSerie(n-1)*2+3; 

    }

    public boolean buscarPar(int n){
        boolean res;

        if (n>9 && n%2==0){
            int dig=n%10;

            res=buscarPar(n);
            res=true;
            if(n>10 && n%2==1)
                res=false;
        }else{
            res=false;
        }

        return res;
    }
}
