
import java.util.ArrayList;
public class MaquinaExpendedora{
    Producto p;
    private ArrayList<Nacho>nachos=new ArrayList<Nacho>();
    private ArrayList<Papa>papas=new ArrayList<Papa>();
    private ArrayList<Goma>gomas=new ArrayList<Goma>();
    private int precio;
    private int stockMinimo;


   public void vender(int precio,Producto pro,int dinero){
       if(dinero==pro.getPrecio()){
           if(productoSeleccionado()==precio){
            }
           
        }

  }
     
   public void cargarProducto(Producto pro){
    if(p instanceof Papa)
    papas.add();
    if(p instanceof Nacho)
    nachos.add();
    if(p instanceof Goma)
    papas.add();
   }
   public int productoSeleccionado(){
       return 0;
    }
}

