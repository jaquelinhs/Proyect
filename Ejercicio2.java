
package proyectointegrador;

import java.util.Scanner;

/**
 *
 * @author jaque
 */
public class Proyectointegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner d= new Scanner(System.in);
        
        System.out.println(" De acuerdo  a la ecuacion (b2-4ac) ");

        System.out.println(" Dame el valor para a ");
        float a= d.nextFloat();
        
        System.out.println(" Dame el valor para b ");
        float b= d.nextFloat();
        
        System.out.println(" Dame el valor para c ");
        float c= d.nextFloat();
        
        float R = b-(4*a)*c;
        
        if (R>=0)
        {
          if(R==0)
          {  
                System.out.println(" Las raices son numeros reales iguales ");
                
                float X1= (float) (-b + Math.sqrt(R)/2*a);
                
                
                System.out.println(" El resultado de X1 es: " + X1);
                System.out.println(" El resultado de X2 es: " + X1);
          }
          else
          {
                System.out.println(" Las raices son numeros reales distintos ");
                float X1= (float) (-b + Math.sqrt(R)/2*a);
                float X2= (float) (-b - Math.sqrt(R)/2*a);
                
                System.out.println(" El resultado de X1 es: " + X1);
                System.out.println(" El resultado de X2 es: " + X2);   
          }
        
        }
        else
        {
            System.out.println(" Las raices son numeros complejos ");
        }    
    }
}
