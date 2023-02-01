
public class Par
{
    private int saltos;
    private String direccion;
    public Par(int s, String d) {
        saltos = s;
        direccion = d;
    }
    public String toString() {
        return "("+saltos + ", " + direccion + ")";
    }
}
