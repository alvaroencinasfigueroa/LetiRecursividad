/*22.  Escribir un proceso recursivo que muestre una media piramide de digitos
 * como se muestra en la siguiente figura:
1
21
321
4321
54321
654321
7654321
87654321
987654321
 */
public class Ejercicio22{
    public int piramide(int n){
        int res = 0;
        if(n==1){
            res = 1;
        }else{
            res = 1+piramide(n);
        }
        return res;
    }
}