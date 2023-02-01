

public class Nacho extends Producto{
    private String deMaiz;
    public Nacho(String dM){
        super();
        deMaiz=dM;
    }
    /*public Nacho(int pr, String fve,String nob,double pe,String dM){
        super(pr,fve,nob,pe,dM);
        deMaiz=dM;
    }*/
    public void setDeMaiz(String dM){
        deMaiz=dM;
    }
    public String getDeMaiz(){
        return deMaiz;
    }
    @Override
    public void darPrecio(){
        int precioNacho=2;
    }
}
