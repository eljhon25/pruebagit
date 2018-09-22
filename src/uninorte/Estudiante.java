package uninorte;

import java.util.LinkedList;

public class Estudiante extends Persona
{
	//crear lista de objetos
    LinkedList<String> programas;
    
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, String apellido) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
		this.programas = new LinkedList<String>();		
		
	}

	public void setProgramas(LinkedList<String> programas) {
		this.programas = programas;
	}
	
	

	
    
    
    
    
    
}
