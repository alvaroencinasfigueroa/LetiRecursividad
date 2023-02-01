import java.util.ArrayList;

public class Ejercicio54
{
    private String cinta;
    public Ejercicio54(String c) {
        cinta = c;
    }

    public String buscarCadena(String cad) {
        ArrayList<Par> res = new ArrayList();
        buscarCadena(cad, 0, 0, res);
        String msg;
        if (res.size() == 0) {
            msg = "Imposible";
        } else {
            msg = convertirACadena(res, 0);
        }
        System.out.println(msg);
        return msg;
    }

    private void buscarCadena(String cad, int posCinta, int posCad, ArrayList<Par> res) {
        if (posCad < cad.length()) {
            char c = cad.charAt(posCad);
            int saltosAdelante = buscarLetraAdelante(c, posCinta+1, 1);
            int saltosAtras = buscarLetraAtras(c, posCinta-1, 1);
            if (saltosAdelante == -1 && saltosAtras == -1) {
                res.clear();
            } else {
                Par par;
                if (saltosAdelante > 0 && saltosAtras == -1) {
                    par = new Par(saltosAdelante, "Adelante");
                    posCinta = posCinta + saltosAdelante;
                } else  if (saltosAtras > 0 && saltosAdelante == -1) {
                    par = new Par(saltosAtras, "Atras");
                    posCinta = posCinta - saltosAtras;
                } else if (saltosAdelante == saltosAtras) {
                    par = new Par(saltosAdelante, "Adelante");
                    posCinta = posCinta + saltosAdelante;
                } else if (saltosAdelante < saltosAtras) {
                    par = new Par(saltosAdelante, "Adelante");
                    posCinta += saltosAdelante;
                } else {
                    par = new Par(saltosAtras,"Atras");
                    posCinta -= saltosAtras;
                }
                res.add(par);
                buscarCadena(cad, posCinta, posCad + 1, res);
            }
        }
    }

    private int buscarLetraAdelante(char c, int posCinta, int resP) {
        int res;
        if (posCinta == cinta.length()) {
            res = -1;
        } else {
            char letraActual = cinta.charAt(posCinta);
            if (letraActual == c) {
                res = resP;
            } else {
                res = buscarLetraAdelante(c, posCinta+1, resP+1);
            }
        }
        return res;
    }

    private int buscarLetraAtras(char c, int posCinta, int resP) {
        int res;
        if (posCinta == -1) {
            res = -1;
        } else {
            char letraActual = cinta.charAt(posCinta);
            if (letraActual == c) {
                res = resP;
            } else {
                res = buscarLetraAtras(c, posCinta-1, resP+1);
            }
        }
        return res;
    }

    private String convertirACadena(ArrayList<Par> res, int pos) {
        String msg = "";
        if (pos < res.size()) {
            Par p = res.get(pos);
            msg = p.toString() + convertirACadena(res, pos+1);
        }
        return msg;
    }
}



