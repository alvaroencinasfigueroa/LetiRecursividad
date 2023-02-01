public class buscadorDePerfectos<E>{
    private buscadorDePerfectos encontrado;
    public int[] buscaPerfectos(int []vec){
        return buscaPerfectos(vec,0,encontrado);
    }

    private int [] buscaPerfectos(int vec[],int pos,buscadorDePerfectos<E> encontrado){
        int res[] = new int[10];
        if(vec[pos].equals(encontrado)){
            res = null;
        }else{ 
            res = null;
        }
        return res;
    }
}
