
public class Ejercicio3{
    public int cantidadDig(int num){
        int res = 0;
        if(num<10){
            res=1;
        }else{
            res=1+cantidadDig(num/10);
        }
        return res;
    }
}

