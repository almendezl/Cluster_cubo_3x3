
package mundo;

/**
 * @since 31-10-2019
 * @author Giovanni Fajardo Utria
 */
public class State 
{// Atributos
    private int position;
    private String move;
    private Rubik rubik;
    
 // Constructor
    public State(int position, String move, Rubik rubik) 
    { this.position = position;
      this.move = move;
      this.rubik = rubik;
    }

 // Metodos get   
    public int getPositon() { return position; }
    public String getMove() { return move; }
    public Rubik getRubik() { return rubik; }  
}
