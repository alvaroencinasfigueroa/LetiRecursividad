
public class RecursividadConLetras{
    /*public int contarVocales(String texto){
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
    public boolean esVocal(char c){
    return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }*/

    /*public int contarConsonante(String escrito){
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
    public boolean esConsonante(char ch){
    return ch=='b'||ch=='c'||ch=='d'||ch=='f'||ch=='g'||ch=='h'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z';
    }*/

    public int contarPalabras(String texto){
        return contarPalabras(texto,0,"");
    }

    private int contarPalabras(String texto,int pos,String palabra){
        if(pos<texto.length()){
            char c=texto.charAt(pos);
            if(esDelimitador(c)){
                if(palabra.length()>0)
                    return 1 + contarPalabras(texto,pos+1,"");
                else
                    return contarPalabras(texto,pos+1,palabra);
            }else
                return contarPalabras(texto,pos+1,palabra+c);
        }else
        if(palabra.length()>0)
            return 1;
        else
            return 0;
    }

    public boolean esDelimitador(char q){
        return q==' '|| q =='.'||q ==','||q ==';'||q ==':';
    }
    /*public int contarCaracter(String texto,char x){
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

    }*/
    /*public String invCadena(String texto){
    //String texto3=darVuelta(texto,0);
    return invCadena(texto,0,"");
    }
    private String invCadena(String texto,int pos,String texto2){//17-B sigue mal
    String st=texto2;
    //if(texto!=){
    char c=texto.charAt(pos);
    st=darVuelta(texto,pos+1);
    return invCadena(texto,pos+1,texto2+c);

    //}else
    return invCadena(texto,pos,texto2+1);
    }//mal*/

    /*public int contarVocales(String texto){
    return contarVocales(texto,0);
    }
    private int contarVocales(String texto,int pos){//17-C yo no he hecho;
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
    public boolean esVocal(char c){
    return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }*/
    /*public boolean esPoesiaMat(String poesia,String nro){
    return esPoesiaMat(poesia,0,nro,0,"");
    }

    private boolean esPoesiaMat(String poesia,int pos,String nro,int i,String palabra){//94 mal

    if(i<nro.length() && pos<poesia.length()){
    char c=poesia.charAt(pos);
    if(esDelimitador(c)){
    if(palabra.length()>0){
    int dig=Integer.parseInt(nro);//casting
    if(palabra.length()==dig)
    return esPoesiaMat(poesia,pos+1,nro,i+1,"");
    }else 
    if(palabra.length()==0)
    return esPoesiaMat(poesia,pos+1,nro,i,palabra);

    }else
    return esPoesiaMat(poesia,pos+1,nro,i,palabra+c);
    }
    return false;
    }*/
    /*public String inversoCad(String texto){
    String inverso=darVuelta(cad);
    return inversoCad(inverso,0);
    }
    private String inversoCad(String texto,int i,String texto2){//25
    String res="";
    if(i<texto.length()){
    char letra=texto.charAt(i);
    if(texto2.length()==0){
    texto2=texto2+letra;
    }else{
    int posUltima=resActual()-1;
    char ultimo=resActual+letra;
    if(letra!=ultimo){
    resActual=resActual+letra;
    }

    }
    res=inversoCad(texto,i+1,resActual);
    }else{
    res=resActual;
    }
    return res;
    }
    private String darVuelta(String cad,int i){
    String res="";
    if(i<cad.length()){
    res=darVuelta(cad,i+1);
    }
    }*/

    /*public String inversoSimple(String cadena) {//25
    String inverso = darVuelta(cadena, 0);
    System.out.println("inverso " + inverso);
    String res = inversoSimple(inverso, 0, "");
    System.out.println("respuesta = " + res);
    return res;
    }
    private String inversoSimple(String cad, int i, String resActual) {
    String res="";
    if (i < cad.length()) {
    char letra = cad.charAt(i);
    if (resActual.length() == 0) {
    resActual += letra;
    } else {
    int posUltima = resActual.length()-1;
    char ultimo = resActual.charAt(posUltima);
    if (letra != ultimo) {
    resActual = resActual + letra;
    }
    }
    res = inversoSimple(cad, i+1, resActual);
    } else {
    res = resActual;
    }
    return res;
    }*/
    /*private char darVueltaChar(char ch,int j)
    char res='';
    if(j<)*/
    /*private String darVuelta(String cad, int i) {
    String res = "";
    if (i < cad.length()) {
    res = darVuelta(cad, i+1) + cad.charAt(i);
    }
    return res;
    }*/
    public int contarOcurrencias(String cad, String patron){
        return contarOcurrencias(cad, patron, 0);
    }

    private int contarOcurrencias(String cad, String patron, int i) {
        int res = 0;
        if (i <= cad.length()-patron.length()) {
            String subcad = cad.substring(i, i+patron.length());
            if (subcad.equals(patron)) {
                res++;
            }
            res = res + contarOcurrencias(cad, patron, i+1);
        }
        return res;
    }

    public boolean esPrefijo(String cad1,String cad2){//28 mal
        return esPrefijo(cad1,cad2,0);
    }

    private boolean esPrefijo(String cad1,String cad2,int pos){
        boolean res;
        if(pos==cad1.length()){
            res=true;
        }else{
            char c1=cad1.charAt(pos);
            char c2=cad2.charAt(pos);
            if(c1==c2){
                res=esPrefijo(cad1,cad2,pos+1);
            }else{
                res=false;
            }

        }
        return res;
    }
    /*public int patronExacto(String texto,String patron){
    return patronExacto(texto,0,patron,0);
    }
    private int patronExacto(String texto,int pos,String patron,int pos2){//42
    int res=0;
    if(pos<texto.length()){
    if(pos2==patron.length()){
    res = 1+patronExacto(texto,pos+1,patron,0);
    } else{
    char a=texto.charAt(pos);
    char b=patron.charAt(pos2);
    if(a==b){
    res=patronExacto(texto,pos+1,patron,pos2+1);
    }else{
    res=patronExacto(texto,pos+1,patron,pos2);
    }
    }
    } else{
    if(pos2==patron.length())
    res=1;
    else
    res=0;
    }
    return res;
    }*/
}





