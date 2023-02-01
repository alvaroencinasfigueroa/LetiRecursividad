

public class Goma extends Producto{
    private String sabor;
    
    public Goma(){
        super();
    }
    public void setSabor(String sab){
        sabor=sab;
    }
    public String getSabor(){
        return sabor;
    }
    @Override
    public void darPrecio(){
        int precioGoma=3;
    }
}
