import java.util.Scanner;
/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio9 {
     
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double horas = 0;
        double cargos = 0;
        double total = 0;
        int contador = 1;
        
        
        System.out.println("\nBienvenido al sistema de cobro del estacionamiento!.");
        System.out.printf("Por favor introduzca el numero de horas del coche: %d:\n", contador++);
        System.out.print("\n(-1 para terminar)\n");
        horas =  entrada.nextDouble();
        
        while ( -1 != horas ){      

        System.out.printf("El cargo para este usuario es de: %.2f\n", Cargo( ));
        total += Cargo();

        System.out.printf("Por favor introduzca el numero de horas del coche: %d:\n", contador++);
        System.out.print("\n(-1 para terminar)\n");
        horas =  entrada.nextDouble();

        } 

        System.out.printf("\nEl cargo total del dia es: %.2f\n", total);
     }
        
    
    public double Cargo() {   
        int x = 0;
        if ( 3 >= x )
            return 2.0;
        else
            return (2 + 0.5*Math.ceil(x - 3)) <= 10? 2 + 0.5*Math.ceil(x -3) : 10; 

        }
    
}
