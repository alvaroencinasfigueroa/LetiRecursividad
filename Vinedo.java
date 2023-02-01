import java.util.*;
public class Vinedo{
    Parcela pa;
    //private ArrayList<ArrayList<String>> parcela;
    String parce[][];
    int m,n,sumaDeParcelas,xParcela, yParcela;
    public Vinedo(Parcela pa,String[][]parce,int m, int n, int sumaDeParcelas){
        this.pa = pa;
        m = parce.length;
        n = parce[0].length;
        this.sumaDeParcelas = sumaDeParcelas;
    }

    public int[][] encontrarPos(){
        return encontrarPos(xParcela,yParcela);
    }

    private int[][] encontrarPos(int x, int y){
        int res[][] = new int [x][y];
        if(esValido(x,y)){
            if(esMoscatel(x,y)){
                int valor = pa.getCantidad();
                sumaValor = sumarParcelas(valor);
                parce[x][y] = ""; 
            }else{
                if(noMoscatel(x,y)){
                }
            }
        }else{
            res = -1;
        }
    }

    private boolean esValido(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }
    
    private boolean esMoscatel(int x, int y){
        return true;
    }
}
