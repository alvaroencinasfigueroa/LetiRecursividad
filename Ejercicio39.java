
public class Ejercicio39{//de int a String: String cad=Integer.toString(int) de String a int: int n= 
    public String cadCantidad(String cad){
        return cadCantidad(cad,0,0);
    }

    private String cadCantidad(String cad, int pos1, int pos2){
        String res="";
        if(cad.length() == 1){
            int a = cad.length();
            String cad1 = Integer.toString(a);
            res = cad.concat(cad1);
        }
        else{
            if(cad.length() > 1){
                if(pos1 < cad.length() && pos2 < cad.length()){
                    char c1 = cad.charAt(pos1);
                    char c2 = cad.charAt(pos2);
                    if(c1 == c2){
                        String cad2 = cad.substring(0,pos2);
                        int b = cad2.length();
                        String cad3 = Integer.toString(b);
                        res = cadCantidad(cad.concat(cad3),pos1,pos2+1);
                    }
                    else{
                        if(c1 != c2){
                            String cad4 = cad.substring(0,pos2-1);
                            int c = cad4.length();
                            String cad5 = Integer.toString(c);
                            res = cadCantidad(cad.concat(cad5),pos1,pos2+1);
                        }
                    }
                }
            }
        }
        return res;
    }
}
