import java.util.Scanner;
/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, cont = 1,  mayor;
        System.out.println("\tDETERMINAR EL NUMERO MAYOR\n");
        System.out.printf("Numero %d: ", cont++);
        mayor = entrada.nextInt();

        while (cont<=10){ 
            System.out.printf("Numero %d: ", cont++);
            n = entrada.nextInt();
            if (n>mayor)
            mayor = n;
        } 
        System.out.printf("El numero mayor es: %d\n",mayor);          
    } 

} 
 