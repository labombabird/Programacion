
package fortablas;

public class ForTablas {


    public static void main(String[] args) {
ForTabla();
}

    
    
public static void ForTabla()
{
int c,j;
for(c=1;c<=10;c++)
{
System.out.println("Tabla del " + c);
for(j=1;j<=10;j++)
{
    System.out.println(j + "x" + c + " =" + j*c);
}    
}    
}}
