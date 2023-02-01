public class MatrizRecursiva{
    public int [][] ordenarMatriz(int ma [][]){
        return ordenarMatriz(ma,0,0,1,0,0);
    }

    private int[][] ordenarMatriz(int ma [][],int i,int j, int cond,int f,int c){
        int[][] res = new int [f][c];
        if(cond == f*c*f*c){
            res = ma;
        }
        else{
            cond++;
            if(ma[i][j]>ma[i][j+1]){
                int temp = ma[i][j];
                ma[i][j] = ma[i][j+1];
                ma[i][j+1] = temp;
            }
            res = ordenarMatriz(ma,i,j+1,cond,f,c);
        }
        return res;
    }
    //Sumar los elementos de una matriz
    public int sumarMatriz(int [][] ma){
        return sumarMatriz(0,0,1,ma);
    }
    private int sumarMatriz(int fila, int col, int orden, int mat [][]){
        int res = 0;
        if(fila == 0 && col == 0){
            res = mat [0][0];
        }else{
            if(col<0){
                res = sumarMatriz(fila-1,col,orden,mat);
            }else{
                res = mat [fila][col] + sumarMatriz(fila,col-1,orden,mat);
            }
        }
        return res;
    }
}