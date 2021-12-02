package mundo;


public class User 
{
  /* Atributos */
   private String nick, ip;

  /* Constructor */  
   public User(String nick, String ip) 
   { this.nick = nick;
	 this.ip = ip;
   }

  /* Metodos setters & getters */  
   public void setNick(String nick) { this.nick = nick; }
   public void setIp(String ip) { this.ip = ip; }

   public String getNick() { return nick; }
   public String getIp() { return ip; }
   
   public String toString() { return nick + " : " + ip; }
}
