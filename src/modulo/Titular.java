
package modulo;


public class Titular {
    int cc;
    String nombre;
    String sexo;

    public Titular() {
    }

    public Titular(int cc, String nombre, String sexo) {
        this.cc = cc;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString() {
        return "\n  cedula de ciudadania: " + this.getCc() +
                "\n nombre: " + this.getNombre() +
                "\n sexo: " + this.getSexo();
    }
    
}
