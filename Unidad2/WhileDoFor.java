
package whiledofor;


public class WhileDoFor {


    public static void main(String[] args) {
DoW();
    }
 public static void DoW(){
     int i =1, j=1,k;    
System.out.println("Numeros del 1-100");

//////////WHILE/////////////
while(i<=100){
  System.out.println("Numero" + i);
i++;  
}  
System.out.println("Numeros del1-100");

//////////DO//////////////////
    do {
 System.out.println("Numero" + j);    
 j++; 
} while(j<=100);
  
////////FOR////////////////  
  for (k=1;k<=100;k++){
   System.out.println("Numero" + k);    
   
  }
 }   
}
