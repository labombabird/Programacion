
package doacomulador;

import java.util.Scanner;

public class DoAcomulador {

    public static void main(String[] args) {
acomula();
    }
 public static void acomula(){
     Scanner entrada =new Scanner(System.in);
int num,suma;
suma=0;
do{
System.out.println("Introduce numero ");
num = entrada.nextInt();
suma+=num;
}while(num!=0);
System.out.println("La suma es de " + suma);
 }   
}
