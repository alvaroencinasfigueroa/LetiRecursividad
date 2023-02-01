public class Parcela{
    String nom;
    int cantidad;
    public Parcela(String nombre, int cant){
        nom = nombre;
        cantidad = cant;
    }

    public int getCantidad(){
        return cantidad;
    }

    public String getNombre(){
        return nom;
    }
}