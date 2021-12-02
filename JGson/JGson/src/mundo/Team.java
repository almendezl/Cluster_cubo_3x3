package mundo;

import java.util.ArrayList;

public class Team 
{
    /* Atributos  */
    private User user[];
    private ArrayList <User> team;
    
    /* Constructor */
    public Team()
    { /*
      user = new User[3];            
      user[0] = new User("Billy Joel", "192.168.0.1");
      user[1] = new User("Thom Yorke", "192.168.0.2");
      user[2] = new User("Gordon Matthew - Sting", "192.168.0.3");
      */
    	      
      team = new ArrayList<User>();	
      team.add(new User("Billy Joel", "192.168.0.1"));
      team.add(new User("Thom Yorke", "192.168.0.2"));
      team.add(new User("Gordon Matthew", "192.168.0.3"));
      team.add(new User("Peter Frampton", "192.168.0.4"));
      team.add(new User("Paul McCarney", "192.168.0.5"));
      team.add(new User("Eric Clapton", "192.168.0.6"));
      team.add(new User("Jeff Healey", "192.168.0.7"));
    }
    
    public String toString(int index) 
    { return  ((User)team.get(index)).getNick() + " : " + ((User)team.get(index)).getIp(); 
    }         
}
