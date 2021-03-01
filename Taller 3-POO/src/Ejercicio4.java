import java.util.Scanner;
/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\t**SUELDO BRUTO**\n\n");
        System.out.print("Ingrese el numero de empleados: ");
        int E = entrada.nextInt(), H=0, T;
    
        for(int i=0;i<E;i++){
            System.out.print("Numero de horas laboradas del empleado "+(i+1)+": ");
            H = entrada.nextInt();
            System.out.print("Tarifa por hora del empleado "+(i+1)+": ");
            T = entrada.nextInt(); 
            int total = H*T;
            System.out.printf("El sueldo bruto semanal es: %d\n", total);
            System.out.println("");
        }
        if(H<=40)
            System.out.print("Se le pagará una cuota");  
        else 
            System.out.print("Se le pagará cuota y media");  
    }
}


