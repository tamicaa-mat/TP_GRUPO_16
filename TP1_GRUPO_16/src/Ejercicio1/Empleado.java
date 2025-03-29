package Ejercicio1;

public class Empleado {

	//Attributes
	private final int ID; // ID Constante
	private String nombre;
	private int edad;
	private static int cont = 1000; 

	//constructores
	public Empleado() {
		this.ID = cont++;
		this.nombre = "";
		this.edad = 21;
	}
	public Empleado(String nombre,int edad) {
		this.ID = cont++;
		setNombre(nombre);
		setEdad(edad);
	}
	// metodos get set encapsulamiento(elimine el set de id, ya que debe autogenerarse)
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre.isEmpty() ? "sin nombre" : nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad < 0 ? 21 : edad;
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
