
public class Laberinto{
    private int lab [][];
    private int m,n,xR,yR,xQ,yQ;
    public Laberinto(int lab [][], int xR, int yR, int xQ, int yQ){
        this.lab = lab;
        this.xR = xR;
        this.yR = yR;
        this.xQ = xQ;
        this.yQ = yQ;
        m       = lab.length;
        n       = lab[0].length;
    }

    public boolean buscar(){
        return buscar(xR,yR);
    }

    private boolean buscar(int x, int y){
        boolean encontrado;
        if(valido(x,y)){
            if(estaQueso(x,y)){
                encontrado = true;
            }else{
                if(lab[x][y] == 0){//casilla vacía puedo moverme
                    lab[x][y] = 2;//una vez visitada la casilla la marco el 2 significa marca
                    encontrado = buscar(x-1,y);
                    if(!encontrado){
                        encontrado = buscar(x,y+1);
                        if(!encontrado){
                            encontrado = buscar(x+1,y);
                            if(!encontrado){
                                encontrado = buscar(x,y-1);
                            }
                        }
                    }
                    lab[x][y] = 0; //backtracking
                }else{
                    encontrado = false;
                }
            }
        }else{
            encontrado = false;
        }
        return encontrado;
    }
    private boolean valido(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }
    private boolean estaQueso(int x, int y){
        return x == xQ && y == yQ;
    }
}