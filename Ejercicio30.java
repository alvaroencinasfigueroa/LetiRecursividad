public class Ejercicio30{
    public int posiciones(int n){
        return posiciones("",0);
    }

    private int posiciones(String numero,int pos){
        int res=0;
        int lon = numero.length();
        int posFinal = numero.length()-1;
        char carFinal = numero.charAt(posFinal);
        int dig = (int)(carFinal);
        if(pos >= numero.length()-1){
            if(dig%2==0){
                res = posiciones(numero,pos-1);
            }else{
                if(dig%2==0){
                    res = 1+posiciones(numero,pos-1);
                }else{
                    res = posiciones(numero,pos-1);
                }
            }
        }else{
            if(lon==1){
                res = 0;
            }
        }
        return res;
    }
}