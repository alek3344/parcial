
package modulo;

import java.util.Scanner;

public class Sede {
    Scanner entrada = new Scanner(System.in);
    String[] nombre;
    String[] direccion;
    String[] ciudad; 
    
    public Sede() {
    }
    
    public Sede(String[] nombre, String[] direccion, String[] ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getDireccion() {
        return direccion;
    }

    public void setDireccion(String[] direccion) {
        this.direccion = direccion;
    }

    public String[] getCiudad() {
        return ciudad;
    }

    public void setCiudad(String[] ciudad) {
        this.ciudad = ciudad;
    }
    

    public void setSedes(int n) {
        nombre = new String[n];
        direccion = new String[n];
        ciudad = new String[n];
        
        for (int i=1; i<=n; i++)
        {
            System.out.println("");
            System.out.println("sede #" + i);
            System.out.println("ingresa el nombre de la sede: ");
            nombre[i-1] = entrada.nextLine();
            System.out.println("ingrese la direccion de la sede: ");
            direccion[i-1] = entrada.nextLine();
            System.out.println("ingrese la ciudad de la sede: ");
            ciudad[i-1] = entrada.nextLine();
            System.out.println("");
         
        }
    }
    
    public void porCodigo(int n)
    {
        int j=0;
        System.out.println("ingresa el numero de la sede que deseas consultar: ");
        j = entrada.nextInt();
        
            System.out.println("");
            System.out.println("sede #" + j);
            System.out.println("nombre: " + nombre[j-1]);
            System.out.println("direccion: " + direccion[j-1]);
            System.out.println("ciudad: " + ciudad[j-1]);
            System.out.println("");
    }
    
    public void mostrarSedes(int n)
    {
        System.out.println(" --- SEDES ---");
        for (int i = 1; i <=n; i++)
        {
            System.out.println("");
            System.out.println("sede #" + i);
            System.out.println("nombre: " + nombre[i-1]);
            System.out.println("direccion: " + direccion[i-1]);
            System.out.println("ciudad: " + ciudad[i-1]);
            System.out.println("");
        }
    }
    
}
