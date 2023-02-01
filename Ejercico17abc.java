
public class Ejercico17abc{
    public int contarCaracter(String texto,char x){
        return contarCaracter(texto,0,x);
    }

    private int contarCaracter(String texto,int pos,char x){//17-A
        char a=x;
        if(pos<texto.length()){
            char c=texto.charAt(pos);
            if(c==a)
                return 1+contarCaracter(texto,pos+1,x);
            else
                return contarCaracter(texto,pos+1,x);
        }else 
            return 0;

    }

    public String invCadena(String texto){
        //String texto3=darVuelta(texto,0);
        return invCadena(texto,0,"");
    }

    private String invCadena(String texto,int pos,String texto2){//17-B sigue mal
        //String st=texto2;
        if(pos<=texto.length()){
            char c=texto.charAt(pos);

            texto2=darVuelta(texto,pos+1);
            return invCadena(texto,pos+1,texto2+c);

        }else
            return invCadena(texto,pos,texto2);
    }

    public int contarVocales(String texto){
        return contarVocales(texto,0);
    }

    private int contarVocales(String texto,int pos){//17-C
        if(pos<texto.length()){
            char c=texto.charAt(pos);
            if(esVocal(c))
                return 1+contarVocales(texto,pos+1);
            else
                return contarVocales(texto,pos+1);
        }
        else 
            return 0;
    }

    private boolean esVocal(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

    private String darVuelta(String texto,int pos){
        String res="";
        if(pos<texto.length()){
            res=darVuelta(texto, pos+1)+texto.charAt(pos);
        }
        return res;
    }

    public int contarConsonante(String escrito){
        return contarConsonante(escrito,0);
    }

    private int contarConsonante(String escrito,int pos){//propio
        if(pos<escrito.length()){
            char ch=escrito.charAt(pos);
            if(esConsonante(ch))
                return 1+contarConsonante(escrito,pos+1);
            else
                return contarConsonante(escrito,pos+1);
        }
        else 
            return 0;
    }

    private boolean esConsonante(char ch){
        return ch=='b'||ch=='c'||ch=='d'||ch=='f'||ch=='g'||ch=='h'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z';
    }
}
