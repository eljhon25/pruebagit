package uninorte;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Persona persona1 = new Persona("Cesar Augusto", "Cervantes");
       Persona persona2 = new Persona("Juan", "Perez");
       Persona persona3 = new Persona("Nombre", "Apellido");
       
       //crear lista de objetos
       LinkedList<Persona> lista = new LinkedList<Persona>();  
       
       //agregar personas a la lista
       lista.add(persona1);
       lista.add(persona2);
       lista.add(persona3);
       
       //Variable para recibir datos por pantalla
       Scanner sc = new Scanner(System.in);
       
       //recorrer lista de personas 
       for (Persona persona : lista) 
       {
		 System.out.println(persona.getNombreCompleto());
		 
		 System.out.println("Digite dirección");
		 persona.setDireccion(sc.nextLine());
		 
		 
		 System.out.println("Digite teléfono");
		 persona.setTelefono(sc.nextLine());
		 
		 System.out.println("Digite correo");
		 persona.setCorreo(sc.nextLine());
		 		 
	   }
       
       sc.close();
       
       for (Persona persona : lista) 
       {
    	      	   
    	   System.out.println(persona.getNombreCompleto()+" "+persona.getDireccion() + " " +  persona.getTelefono() + " " + persona.getCorreo());		 
		 		 		 
	   }
       
	}

}
