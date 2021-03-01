import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner Entero = new Scanner(System.in);
        int sim, tam, tca, lim, nsa;
        System.out.print("Saldo al iniciar el mes: ");
        sim = Entero.nextInt();
        System.out.print("Total de abonos en el mes: ");
        tam = Entero.nextInt();
        System.out.print("Total de créditos aplicados a la cuenta del cliente en el mes: ");
        tca = Entero.nextInt();
        System.out.print("Limite de creditos permitidos: \n");
        lim = Entero.nextInt();
        
        nsa = sim + tam - tca; 
        
        System.out.printf("El nuevo saldo es : %d\n", nsa);
        
        if(tca>lim)
            System.out.println("Se excedió el límite de su crédito");
        else
            System.out.println("Todo está en orden, no ha excedido el limite");
 
    }
}
