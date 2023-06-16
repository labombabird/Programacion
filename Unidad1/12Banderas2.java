
package banderas2;

import java.util.Scanner;


public class Banderas2 {
    //Variables
public static int Cal;
public static int Cal2;
public static int Cal3;
public static int Cal4;
public static int Cal5;
public static boolean bandera;
public static boolean bandera2;
public static boolean bandera3;
public static boolean bandera4;
public static boolean bandera5;


    public static void main(String[] args) {
Pedir();
Proceso();
    }
    public static void Pedir()
    {
        //Pedir
       Scanner Calif = new Scanner(System.in);
      System.out.println("Calificacion");
       Cal =  Calif.nextInt(); 
     System.out.println("Calificacion2");   
       Cal2 =  Calif.nextInt();
     System.out.println("Calificacion3");
       Cal3 =  Calif.nextInt();  
     System.out.println("Calificacion4");
       Cal4 =  Calif.nextInt(); 
     System.out.println("Calificacion5");
       Cal5 =  Calif.nextInt(); 
    }
    public static void Proceso()
    {
   bandera = (Cal>=7);
   System.out.println("Estas "+ bandera);
   bandera2 = (Cal2>=7);
   System.out.println("Estas "+ bandera2);
   bandera3 = (Cal3>=7);
   System.out.println("Estas "+ bandera3);
   bandera4 = (Cal4>=7);
   System.out.println("Estas "+ bandera4);
   bandera5 = (Cal5>=7);
   System.out.println("Estas "+ bandera5);
   
    }
}
