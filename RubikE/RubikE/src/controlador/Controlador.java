package controlador;

import interfaz.*;
import mundo.*;

/**
 *  Realiza la conexion entre la interfaz y el mundo del problema.
 *  @version 1.0.0.
 *  @author  Giovanni Fajardo Utria.
 */
public class Controlador
{   
 // Objetos controlables de la interfaz 	
    
 // Clase del mundo
    Rubik rubik;
	
 // Constructor	
 /**
  *  Constructor por defecto.
  *  Crea la instancia del mundo.
  */
	public Controlador()
	{ // Instanciar la clase principal del modelo
	     this.rubik = new Rubik( );	     
	}
	
	public void conectar(  )
	{ 
	}

 // --------------------------------------------------------------	
 // Implementacion de los metodos de la clase controladora	
 // --------------------------------------------------------------

}