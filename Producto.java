

public abstract class Producto{
    protected int precio;
    protected String fechaVencimiento;
    protected String nombre;
    protected double peso;
    
    public abstract void darPrecio();
    
    public void setPrecio(int pre){
        precio=pre;
    }
    public int getPrecio(){
        return precio;
    }
    public void setFechaVencimiento(String fv){
        fechaVencimiento=fv;
    }
    public String getFechaVencimiento(){
        return fechaVencimiento;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        nombre=nom;
    }
    public void setPeso(double pezo){
        peso=pezo;
    }
    public double getPeso(){
        return peso;
    }
}
