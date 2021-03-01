
import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio10 {
    
    public static void main(String[] args){
        Scanner Nin = new Scanner(System.in);
        int n,inv=0,res;
        System.out.println("\tINVERSION DE NUMEROS\t\n");
        System.out.print("Ingrese un numero: ");
        n = Nin.nextInt();
        
        while(n>0){
            res = n%10;
            inv = inv*10+res;
            n /= 10;
        }
        System.out.printf("El numero invertido es: %d\n",inv);
    }
}
