
package interfaz;

import com.google.gson.Gson;

import mundo.Team;
import mundo.User;

/*
 * Desarrollo de App TIC
 * 29-10-2019 
 */
public class JavaGson 
{

	public static void main(String[] args) 
	{
		User user = new User("Lennon", "192.168.0.24");
		
        Gson gson = new Gson();
        String json = gson.toJson(user);        
        System.out.println("json = " + json);
        
        User jsonToJava;
        
        jsonToJava = gson.fromJson(json, User.class);
        System.out.println("toString = " + jsonToJava.toString());

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        Team team = new Team();
        json = gson.toJson(team);
        System.out.println("json = " + json);
        
        Team jsonTeamToJava;
        
        jsonTeamToJava = gson.fromJson(json, Team.class);
        System.out.println("toString = " + jsonTeamToJava.toString(2));
	}

}
