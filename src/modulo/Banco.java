
package modulo;

import java.util.Scanner;

public class Banco {
    Scanner entrada = new Scanner(System.in);
    String nombre;
    int max_sedes;
    int contsed=0;
    Sede num = new Sede();
    Cuenta_bancaria cu1 = new Cuenta_bancaria();
    

    public Banco() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMax_sedes() {
        return max_sedes;
    }

    public void setMax_sedes(int max_sedes) {
        this.max_sedes = max_sedes;
    }
    
    public int setSede()
    {
        System.out.println("");
        System.out.println("ingrese el nombre del banco (MAYUSCUlAS): ");
        nombre = entrada.nextLine();     
        System.out.println("ingrese el numero de sedes que desea (menor o igual a 10):");
        max_sedes = entrada.nextInt();
        entrada.nextLine();
        System.out.println("");
        return max_sedes;
    }
    
    public void setSedes()
    {
        System.out.println("---BANCO " + nombre + " ---");
        contsed = contsed + 1;
        num.setSedes(max_sedes);
    }
    
    public void setMostrarSedes()
    {
        System.out.println("---BANCO " + nombre + " ---");
        num.mostrarSedes(max_sedes);
    }
    
    public void setCuenta()
    {
        if (contsed == 0)
        {
            System.out.println("---primero debe ingresar sedes---\n");
        }
        else
        {
            System.out.println("\n---BANCO " + nombre + " ---\n");
            cu1.setApertura1(max_sedes);
        }
    }
    
    public void setPorcodigo()
    {
        System.out.println("\n---BANCO " + nombre + " ---\n");
        num.porCodigo(max_sedes);
    }
    
    public void listaSedes()
    {
        System.out.println("\n---BANCO " + nombre + " ---\n");
        num.mostrarSedes(max_sedes);
    }
    
    public void mostrarCuentas()
    {
        System.out.println("\n---BANCO " + nombre + " ---\n");
        cu1.mostrarAperturas(max_sedes);
    }
    
}
