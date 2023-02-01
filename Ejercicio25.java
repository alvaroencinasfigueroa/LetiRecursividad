
public class Ejercicio25{
    public String inversoSimple(String cadena) {//25
        String inverso = darVuelta(cadena, 0);
        System.out.println("inverso " + inverso);
        String res = inversoSimple(inverso, 0, "");
        System.out.println("respuesta = " + res);
        return res;
    }

    private String inversoSimple(String texto, int i, String texto2) {
        String res="";
        if (i < texto.length()) {
            char letra = texto.charAt(i);
            if (texto2.length() == 0) {
                texto2 += letra;
            } else {
                int posUltima = texto2.length()-1;
                char ultimo = texto2.charAt(posUltima);
                if (letra != ultimo) {
                    texto2 = texto2 + letra;
                }
            }
            res = inversoSimple(texto, i+1, texto2);
        } else {
            res = texto2;
        }
        return res;
    }

    private String darVuelta(String cad, int i) {
        String res = "";
        if (i < cad.length()) {
            res = darVuelta(cad, i+1) + cad.charAt(i);
        }
        return res;
    }
}