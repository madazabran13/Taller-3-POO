
import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ne,numero = 0;
        float pv, se = 0;
        System.out.println(" ***TABLA DE ARTICULOS Y PRECIOS***\n");
        System.out.println("\tArtículo      Precio\n"
                + "  \t  1           329.99\n"
                + "  \t  2           150.75\n"
                + "  \t  3            90.95\n"
                + "  \t  4           455.89\n");
        System.out.print("\t  **PAGO SEMANAL**\n");
        System.out.println("Precio de venta: ");
        pv = entrada.nextFloat();
    }
}
