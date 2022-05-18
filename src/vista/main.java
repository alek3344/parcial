
package modulo;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n=0;
        int opci=0;
        int cont=0;
        boolean salir=false;
        Banco titu = new Banco();
        
        do
        {
            System.out.println("--- MENU ---\n");
            System.out.println("1. crear banco");    
            System.out.println("2. crear sedes");
            System.out.println("3. crear cuenta bancaria");
            System.out.println("4. consultar sede (por codigo)");
            System.out.println("5. lista de sedes");
            System.out.println("6. consultar cuentas bancarias");
            System.out.println("7. salir");
            opci = entrada.nextInt();
            if (opci == 1)
            {
                titu.setSede();
                cont = cont+1;
            }else
            {
                if (cont != 0)
                {
                    switch (opci)
                    {
                        case 2:
                            titu.setSedes();
                            break;
                        case 3:
                            titu.setCuenta();
                            break;
                        case 4:
                            titu.setPorcodigo();
                            break;
                        case 5:
                            titu.listaSedes();
                            break;
                        case 6:
                            titu.mostrarCuentas();
                            break;
                        case 7: 
                            salir = true;
                            break;
                    }
                }
                else
                {
                    System.out.println(" --- primero debe registrar un banco ----");
                    System.out.println("");
                }
            }
        }
        while(salir=true);
        
    }
}
