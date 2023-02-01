public class VectorRecursivo{
    //public int convertir(int ab[]){
    //return convertir(ab,0);
    //}
    public static void main(String [] asd){
        int vec[]={1,2,3,4};
        int posA = vec.length-1;
        int v = sumarVector(vec,posA);
        System.out.println(v);
    }

    /*private int convertir(int ab[], int pos){
    int res = 0;
    if(pos==ab.length)
    res = ab[0];
    else{ 
    res = ab[(ab.length-1)-pos] * Math.pow(10,pos)+convertir(pos+1);
    }
    return res;    
    }//{1,2,3,4} = 1234*/
    public int llenarVector(int vec[]){
        return llenarVector(vec,0);
    }

    private int llenarVector(int vec[],int pos){
        int res = 0;
        if(vec.length == pos){
            res = vec[0];
        }else{
            res = llenarVector(vec,pos+1);
        }
        return res;
    }
    //Sumar los elementos de un vector
    public static int sumaVector(int vec []){
        return sumarVector(vec, vec.length-1);
    }

    private static int sumarVector(int vec [], int pos){
        int tam = pos;
        int res = 0;
        if(tam == 0){
            res = vec[tam];
        }else{
            res = (vec[tam]) + sumarVector(vec,tam-1);
        }
        return res;
    }

    public static int sumaVectorIterativo(int vec[]){
        int res = 0;
        for(int i = 0; i < vec.length; i++){
            res = res + vec[i];
        }
        return res;
    }
}

