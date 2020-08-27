
package tabuada;

import java.util.Scanner;

public class Tabuada {

   
    public static void main(String[] args) {
       
       Scanner teclado = new Scanner (System.in);
       
      
       System.out.print ("Digite o numero para a tabuada: ");
       int numero = teclado.nextInt();
       
       System.out.println("Digite a operção da Tabula \n1-Multiplicação, \n2-Divição ");
       int op = teclado.nextInt();
       
       if (op==1){
           for(int i = 10; i >= 1; i--){
           System.out.println(numero +" * " + i +" = " + (numero*i));
           }
       }
       if (op==2){
           for(int i = 10; i >= 1; i--){
           System.out.println(numero +" / " + i +" = " + (numero/i));
           }
        }
    }
           
}
