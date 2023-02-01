//Ejercicio: cuántas combinaciones hay para formar un numero a partir de otros; ejemplo el 2 estás formado por sí mismo
//            [2; 1,1] el 3 por [3; 1,1,1; 2,1; 1,2]
import java.util.ArrayList;
public class SumaCombinatoria{
    public static void main(String [] a){
        int n = 3;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        combinacionesSuma(n, numeros, 0);
        //combinacionesSuma(n);
    }
    /*public  void combinacionesSuma(int n){
        return combinacionesSuma(n,numeros,0);
    }*/
    public static void combinacionesSuma(int numero, ArrayList<Integer> numeros, int suma){
        if(suma == numero){
            System.out.println(numeros);
        }else{
            for (int i = 1; i <= numero; i++){
                suma += i;
                if(suma <= numero){
                    numeros.add(i);
                    combinacionesSuma(numero,numeros, suma);
                    numeros.remove(numeros.indexOf(i));//aqui usamos backtracking
                }
                suma -= i;//aqui mas
            }
        }
    }
}
