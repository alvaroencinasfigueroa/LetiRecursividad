import java.util.ArrayList;
import java.lang.StringBuilder;
public class Ejercicio45M{
    public ArrayList<String> palabrasOc(String texto){
        ArrayList<ArrayList<String>> palabras = new ArrayList();
        ArrayList<String> num = new ArrayList();
        return palabrasOc(texto,palabras,num,0);
    }

    private ArrayList<String> palabrasOc(String texto, ArrayList<String> palabras, ArrayList<String> num, int pos){
        ArrayList<ArrayList<String>>res = new ArrayList();
        if(pos<texto.length()){
            char c = texto.charAt(pos);
            if(esDelimitador(c)){
                String palabra = formarPalabra("",c);
                palabras.add(palabra);
                int l = palabra.length();
                String longitudPalabra = Integer.subString(l);
                num.add(longitudPalabra);
            }else{
                palabra = formarPalabra("",c);
            }
            res = palabrasOc(texto,palabras,num,pos+1);
        }else{
            if(palabra.length()>0){
                palabras.add(palabra);
                num.add(longitudPalabra);
            }
        }
        return res;
    }
    private boolean esDelimitador(char a){
        return a == ' ' ||a == ';' ||a == ':' ||a == ',' ||a == '.' ;
    }
    private String formarPalabra(String pal, char b){
        String res = "";
        if(pal.length()>0){
            String p;
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            p = sb.toString();
            res = p;
        }
        return res;
    }
}