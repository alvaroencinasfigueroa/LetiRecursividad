import java.util.ArrayList;
public class Primalidad{
    public void esEquilibrado(int n){
        ArrayList lista = new ArrayList();
        esEquilibrado(n,lista);
    }

    private void esEquilibrado(int n, ArrayList li){

        if(contFactoresPrimos(n)==1){

            li.add(n);
            System.out.println("El numero es equilibrado... " + li);
        }
        else{
            if(contFactoresPrimos(n)>1){
                li = divisores(n);
                int f1 = (int)li.get(0);
                int f2 = (int)li.get(1);
                ArrayList a1 = new ArrayList();
                a1.add(f1);
                a1.add(f2);
                System.out.println("El numero No es equilibrado... " + a1);
            }
        }
        
    }

    private int contFactoresPrimos(int n){
        return contFactoresPrimos(n, n/2);
    }

    private int contFactoresPrimos(int n, int posFactor){
        int res = 0;
        if(posFactor > 1){
            if((n % posFactor)==0 ){
                if(esPrimo(posFactor)){
                    res = 1 + contFactoresPrimos(n, (posFactor-1));
                }else{
                    res = contFactoresPrimos(n, (posFactor-1));
                }
            }else{
                res = contFactoresPrimos(n, (posFactor-1));
            }

        }
        return res;
    }

    private boolean esPrimo(int n){
        boolean res;
        if(cantDivi(n) == 2){
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    private int cantDivi(int n){
        return cantDivi(n,1);   
    }

    private int cantDivi(int n,int pd){
        int res=0;
        if(pd<=n){
            if(n%pd==0)
                res = 1+cantDivi(n,pd+1);
            else
                res = cantDivi(n,pd+1);
        }else{
            res=0;
        }
        return res;
    }

    private ArrayList divisores(int n){
        //int vec [] = new int[4];
        ArrayList listaDivisores = new ArrayList();
        divisores(n,1,listaDivisores,0);
        for(int i= 0; i<listaDivisores.size(); i++){
            System.out.println(listaDivisores.get(i));
        }
        return listaDivisores;
    }

    private ArrayList divisores(int n, int pd, ArrayList<Integer> lista, int pos){
        if(pd<=n){
            if(n%pd==0){
                lista.add(pd);
                divisores(n,pd+1,lista,pos+1);
            }else{
                divisores(n,pd+1,lista,pos);
            }
        }
        return lista;
    }
}

