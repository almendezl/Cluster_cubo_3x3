package interfaz;

import java.awt.Color;
import mundo.*;

public class InterfazApp 
{
// Atributos
   private Rubik rubik, rubik1;
   
  public InterfazApp()
  { rubik = new Rubik();
    rubik1 = rubik.clone();
    
    System.out.println(rubik.key());
   // System.out.println(rubik1.key());
    System.out.println(rubik1.cubo(0, 0, 0).toString());
    rubik1.horizontal(0);
    rubik1.vertical(1);
  //  rubik1.transversal(0);
    rubik1.transversal(1);
    System.out.println(rubik1.key());
    //rubik1.horizontalN(0);
    //System.out.println(rubik1.key());
    
  }        
  
 
  public static void main(String[] args) 
  { new InterfazApp();    
  }
}
