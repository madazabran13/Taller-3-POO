import java.util.Scanner;
/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio8 {
    
   public static void main(String[] args){
    Scanner entrada = new Scanner(System.in); 
    int nump, cantv; 
    float monto_total=0;

    System.out.print("\tPRECIOS POR PRODUCTO:\n");
    System.out.print("Producto 1: $2.98\n");
    System.out.print("Producto 2: $4.50\n");
    System.out.print("Producto 3: $9.98\n");
    System.out.print("Producto 4: $4.49\n");
    System.out.print("Producto 5: $6.87\n");

    System.out.print("\nIngrese el numero correspondiente al producto: ");
    nump = entrada.nextInt(); 

    while ( 0 != nump ){    
        
        switch ( nump ){
            case 1:{   
                System.out.print("Introduzca la cantidad vendida de este producto: ");
                cantv = entrada.nextInt();
                System.out.printf("Precio de esta venta: %f\n", cantv*2.98);
                monto_total += cantv*2.98;
            break;
            }  

            case 2:{  
                System.out.print("Introduzca la cantidad vendida de este producto: ");
                cantv = entrada.nextInt();
                System.out.printf("Precio de esta venta: %f\n", cantv*4.50);
                monto_total += cantv*4.50;
            break;
            }  

            case 3:{   
                System.out.print("Introduzca la cantidad vendida de este producto: ");
                cantv = entrada.nextInt();
                System.out.printf("Precio de esta venta: %f\n", cantv*9.98);
                monto_total += cantv*9.98;
            break;
            }  

            case 4:{  
                System.out.print("Introduzca la cantidad vendida de este producto: ");
                cantv = entrada.nextInt();
                System.out.printf("Precio de esta venta: %f\n", cantv*4.49);
                monto_total += cantv*4.49;
            break;
            } 

            case 5:{    // Cierra case 
                System.out.print("Introduzca la cantidad vendida de este producto: ");
                cantv = entrada.nextInt();
                System.out.printf("Precio de esta venta: %f\n", cantv*6.87);
                monto_total += cantv*6.87;
            break;
            } 

            default :{   
                System.out.print("\nINTRODUZCA NUMERO DE PRODUCTO VALIDO!\n");
            break;
            }  
        }   
        
    System.out.println("\n**Digite 0 para finalizar compra**");   
    System.out.print("Ingrese el numero correspondiente al producto: ");
    nump = entrada.nextInt(); 

    }     
    System.out.printf("\nLas ventas totales fueron: %f\n\n", monto_total);
   }
}
