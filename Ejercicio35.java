import java.util.ArrayList;
public class Ejercicio35{
    public ArrayList<Integer> PascalT(int n){
        ArrayList<ArrayList<Integer>>res = new ArrayList();
        PascalT(0,n,res);
        ArrayList<Integer> ultimaFila = res.get(res.size()-1);
        System.out.println(ultimaFila);
        return ultimaFila;
    }

    private void PascalT(int nivel, int n, ArrayList<ArrayList<Integer>>res){
        if(nivel <= n){
            if(nivel == 0){
                ArrayList<Integer> sublista = new ArrayList();
                sublista.add(1);
                res.add(sublista);
                PascalT(nivel+1,n,res);
            }else{
                ArrayList<Integer> ultsublista = res.get(res.size()-1);
                ultsublista.add(0);//añade al final los ceros
                ultsublista.add(0,0);//añade al principio los ceros
                ArrayList<Integer> nuevaSublista = new ArrayList();
                crearListaCapacidad(2*nivel+1,0,nuevaSublista);
                nuevaSublista.set(0,1);//agregando el 1 al inicio
                nuevaSublista.set(2*nivel,1);//agregando el 1 al final
                generarFila(ultsublista,nuevaSublista,1,nivel*2);//generamos la fila
                res.add(nuevaSublista);//insertamos la fila generada a la respuesta final
                PascalT(nivel+1,n,res);
            }
        }
    }

    private void generarFila(ArrayList<Integer> ultsublista, ArrayList<Integer> nuevasublista, int i, int lim){
        if(i<lim){
            int izq = ultsublista.get(i-1);
            int der = ultsublista.get(i+1);
            int nuevoValor = izq+der;
            generarFila(ultsublista,nuevasublista,i+1,lim);
        }
    }

    private void crearListaCapacidad(int tam, int i, ArrayList<Integer>lista){
        if(i<tam){
            lista.add(0);
            crearListaCapacidad(tam,i+1,lista);
        }
    }
}