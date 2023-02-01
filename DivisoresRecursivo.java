import java.util.*;
public class DivisoresRecursivo{
    public void divisores(int n){
        //int vec [] = new int[4];
        ArrayList listaDivisores = new ArrayList();
        divisores(n,1,listaDivisores,0);
        for(int i= 0; i<listaDivisores.size(); i++){
            System.out.println(listaDivisores.get(i));
        }
    }

    private void divisores(int n, int pd, ArrayList<Integer> lista, int pos){
        if(pd<=n){
            if(n%pd==0){
                lista.add(pd);
                divisores(n,pd+1,lista,pos+1);
            }else{
                divisores(n,pd+1,lista,pos);
            }
        }
    }
}

