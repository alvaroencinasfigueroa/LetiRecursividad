
public class Ejercicio114{
    public int Estrella(int n){
        int res = 0;
        if(n == 1){
            res = 10;
        }else{
            res = Estrella(n-1)*4+15;
        }
        return res;
    }
}
