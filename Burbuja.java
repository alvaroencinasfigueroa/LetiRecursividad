
public class Burbuja{
    public void principal(){
        int [] B = {4,59,17,41,95,13,8,62};
        System.out.println("Vector desordenado");
        mostrarArreglo(B);
        burbuja(B);
        System.out.println("Vector ordenado");
        mostrarArreglo(B);
    }

    public void mostrarArreglo(int B []){
        mostrarArreglo(B,0);
    }

    private void mostrarArreglo(int B[],int i){
        if(i<B.length){
            System.out.println(B[i]+" ");
            mostrarArreglo(B,i+1);
        }
        else
            System.out.println();
    }

    private void burbuja(int B[]){
        burbuja(B, 0, B.length-1, 0);
    }

    public void burbuja(int B[], int li, int ls, int i){
        if(li<ls){
            if(i<ls){//4,1,3,7      1,3,4,7        1 2
                if(B[i] > B[i+1]){
                    int aux = B[i];
                    B[i] = B[i+1];//ls-1
                    B[i+1] = aux;
                }
                burbuja(B,li,ls,i+1);
            }else
                burbuja(B,li,ls-1,0);

        }
    }
    /*public void encontrarMinimo(int ar[],int pos,int aux){
    if (pos<ar.length){
    if(pos>pos+1){
    aux=ar[pos];
    ar
    }
    }
    }*/
}

