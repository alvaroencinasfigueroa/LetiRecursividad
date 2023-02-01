//Dado un tablero de ajedrez, ubicar 8 reinas sin que ninguna de ellas se ataque, es decir corra peligro. 
public class Ejercicio46{
    private int tab[][];
    private int m,n;
    public Ejercicio46(int tab[][],int m,int n){
        this.tab = tab;
        this.m = m;
        this.n = n;
    }
    public boolean backtrack(){
        return backtrack(x,y);
    }
    private boolean backtrack(int x, int y){
        boolean poner;
        if(esValido){
            poner = true;
        }
    }
} 