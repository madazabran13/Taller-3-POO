import java.util.Scanner;
/**
 *
 * @author Miguel Andrés
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
      Scanner Ent = new Scanner(System.in);
      long  aux, dig,dec, num ,numero, expp, digito;
      int exp;
      boolean bin;
      double binario;
      System.out.println("**CONVERSION DE NUMEROS BINARIOS Y DECIMAL**\n");
    
       do{
          System.out.print("Digite un numero binario: ");
          num = Ent.nextLong();
          bin = true;
          aux =  num;
          
          while (aux!=0){
            dig = aux%10; 
            if (dig != 0 && dig != 1)
                bin = false; 
                aux = aux/10;                          
          }
        } while (!bin); 
          exp = 0;
          dec = 0;

        while (num != 0){
          dig =  (num % 10);  
          dec = dec + dig * (int) Math.pow(2, exp);
          exp++;
          num = num / 10;
        }
        System.out.println("Decimal: "+dec+"\n" );


        do{ 
            System.out.print("Digite un numero entero: ");                                                
            numero = Ent.nextInt();
        }while(numero < 0);

        expp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + digito * Math.pow(10, expp);                                                   
                expp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
   }
    
}
