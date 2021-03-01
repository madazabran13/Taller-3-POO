import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio7 {
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int l;
        System.out.println("\tDIBUJO DE UN CUADRADO\n");
        System.out.print("Ingrese el lado del cuadrado: ");
        l = teclado.nextInt();
        System.out.println();
        
        for(int x=1; x<=l; x++){
            for(int y=1; y<=l; y++){
                if(x==1 || x==l || y==1 || y==l)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
