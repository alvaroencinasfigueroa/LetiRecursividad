public class Ejercicio47{
    public String mafia(int n){
        String res;
        if(n == 0){
            res = "-.-";
        }else{
            res = " (-. " +mafia(n-1)+ " .-) ";
        }
        return res;
    }
}