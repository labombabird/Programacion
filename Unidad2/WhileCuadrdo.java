
package whilecuadrdo;

import java.util.Scanner;


public class WhileCuadrdo {

    public static void main(String[] args) {
Cuadrado();
    }
    public static void Cuadrado(){
        Scanner entrada =new Scanner(System.in);
int num, cuadrado,c=0;
System.out.println("Introduce numero ");
num = entrada.nextInt();
while (num>=0){
    cuadrado = num*num;
    System.out.println("El cuadrado es de " + cuadrado);
    
     System.out.println("");
          System.out.println("Introducir numero");
             num = entrada.nextInt();
}
    }
    
}
