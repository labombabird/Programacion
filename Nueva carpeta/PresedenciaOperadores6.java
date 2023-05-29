

package com.mycompany.presedenciaoperadores6;

import java.util.Scanner;


public class PresedenciaOperadores6 {

    public static void main(String[] args) {

           calculaoperaciones();
        
        
        
  
    }
public static void calculaoperaciones(){
        // Entrada de datos
            float a,b,c,d,f,g,h,j,e,i,m,n,q,r,s;
            float x,y,p;
           Scanner Guardado =new Scanner(System.in);
            System.out.println("Dame Numeros:");
            System.out.println("A:"); 
                a = Guardado.nextInt();
            System.out.println("B:");  
                b = Guardado.nextInt();
            System.out.println("C:"); 
                c = Guardado.nextInt();
            System.out.println("D:");
                d = Guardado.nextInt();
            System.out.println("E:"); 
                e = Guardado.nextInt();
           System.out.println("F:");  
                f = Guardado.nextInt();
            System.out.println("G:");  
                g = Guardado.nextInt();
            System.out.println("H:");
                h = Guardado.nextInt();
            System.out.println("I:");  
                i = Guardado.nextInt();
            System.out.println("J:"); 
                j = Guardado.nextInt();
            System.out.println("X:"); 
                x = Guardado.nextInt();
            System.out.println("Y:"); 
                y = Guardado.nextInt();
            System.out.println("M:"); 
                m = Guardado.nextInt();    
            System.out.println("N:"); 
                n = Guardado.nextInt();  
            System.out.println("S:"); 
                s = Guardado.nextInt(); 
            System.out.println("P:"); 
                p = Guardado.nextInt(); 
            System.out.println("Q:"); 
                q = Guardado.nextInt(); 
            System.out.println("R:"); 
                r = Guardado.nextInt(); 
 //*********  IncisoA 
double calcularA;
calcularA=((1.5)+(1.3));
System.out.println("a)"+ calcularA);

//********** IncisoB
double calcularB;
calcularB= ((1/(x-5)) - ((3*x*y)/4));
System.out.println("b)"+ calcularB);

//********** IncisoC
double calcularC;
calcularC= ((.5)+7);
System.out.println("c)"+ calcularC);

//********** IncisoD
double calcularD;
calcularD=(.5+7);
System.out.println("d)"+ calcularD);

//********** IncisoE
float calcularE;
calcularE= (((a*a) / (b-c))+ (d-e) / (f-((g*h) / j)));
System.out.println("e)"+ calcularE);
//********** IncisoF
float calcularF; 
calcularF= ((m/n)+p);
System.out.println("f)"+ calcularF);
//********** IncisoG
float calcularG; 
calcularG= (m+(n/(p-q)));
System.out.println("g)"+ calcularG);

//********** IncisoH
float calcularH; 
calcularH = (((a*a)/(b*b))+ ((c*c)/(d*d)));
System.out.println("H)"+ calcularH);

//********** Incisoi
float calcularI; 
calcularI = ((m+(n/p))/(q-(r/s)));
System.out.println("i)"+ calcularI);

//********** IncisoJ
float calcularJ; 
calcularJ = (((3*a)+b)/c-(d+(5*e))/(f+(g/(2*h))));
System.out.println("j)"+ calcularJ);

//********** IncisoK
float calcularK; 
calcularK = (((a*a)+(2*a*b)+(b*b))/((1/(x*x))+2));
System.out.println("k)"+ calcularK);

}


}
