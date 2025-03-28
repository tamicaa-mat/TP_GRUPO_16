package Ejercicio1;

public class Empleado {
	
	//Attributes
	
	private final int ID; // ID Constante
	private String nombre;
	private int edad;
	
	private static int cont = 1000;
	 

	//constructores
	public Empleado() 
	{
		this.ID = cont++;
		this.nombre = "sin nombre";
		this.edad = 99;
	}
	
	public Empleado(String nombre,int edad) 
	{
		this.ID = cont++;
		this.nombre = nombre;
		this.edad = edad;

	}
	
	
	// metodos get set encapsulamiento(elimine el set de id, ya que debe autogenerarse)
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	 // Método que genera el próximo ID
    public static int devuelveProximoID() {
        return cont;
    }	

    
	//metodo tostring devuelve informacion del objeto
	@Override
	public String toString() { 
		return "Empleado " + nombre + ", edad: " + edad + ", legajo: " + ID;
	}
	
	


}
