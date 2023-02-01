

public class Papa extends Producto{
    private String picante;
    public Papa(String pic){
        super();
        picante=pic;
    }
    /*public Papa(int pre,String fv,String nom,double pezo,String pic){
        super(pre,fv,nom,pezo);
        picante=pic;
    }*/
    @Override
    public void darPrecio(){
        int precioPapa=1;
    }
    public void setPPicante(String pi){
        picante=pi;
    }
    public String getPicante(){
        return picante;
    }
}

