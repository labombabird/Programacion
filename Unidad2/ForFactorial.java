
package forfactorial;

import java.util.Scanner;

public class ForFactorial {

    public static void main(String[] args) {

Factorial();
    }
    public static void Factorial(){
        Scanner entrada =new Scanner(System.in);
double factorial;
int num;
System.out.println("Factorial de un numero ");
num = entrada.nextInt();
factorial=1;
for(int i = num; i>0; i--){
    factorial= factorial*i;    
}
System.out.println("Factorial de " + num + " es:" + factorial);
    }
           
}
