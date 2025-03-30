package Ejercicio1;

public class Empleado {

	//Attributes
	private final int ID; // ID Constante
	private String nombre;
	private int edad;
	private static int cont = 1000; 
	
	/**
	 * Constructor por defecto que instancia a un empleado con un nuevo ID, nombre vacío
	 * y edad 21.
	 */
	public Empleado() {
		this.ID = cont++;
		this.nombre = "";
		this.edad = 99;
	}
	/**
	 * Constructor que instancia un empleado con nombre, edad y el nuevo ID generado.
	 * @param nombre (String)
	 * @param edad (int)
	 */
	public Empleado(String nombre,int edad) {
		this.ID = cont++;
		setNombre(nombre);
		setEdad(edad);
	}
	//Constructor que solo recibe nombre como parametro y se asigna una edad por defecto
	public Empleado(String nombre) {
		this.ID = cont++;
		setNombre(nombre);
		this.edad=99;
	}
	/**
	 * Método que devuelve el nombre del empleado.
	 * @return el nombre 
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método que devuelve la edad del empleado.
	 * @return la edad 
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Cambia el nombre del empleado. En caso de que este vacio se le asignara "sin nombre".
	 * @param nombre (String)
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre.isEmpty() ? "sin nombre" : nombre;
	}
	/**
	 * Cambia la edad del empleado, si la edad es negativa se le asignara el "99".
	 * @param edad (int)
	 */
	public void setEdad(int edad) {
		this.edad = edad < 0 ? 99 : edad;
	}
	/**
	 * Genera el próximo ID para el nuevo empleado, comienza con el ID 1000
	 * y va en aumento.
	 * @return el ID del nuevo empleado
	 */
    public static int devuelveProximoID() {
        return cont;
    }	
    /**
     * Método toString que se encarga de mostrar la información del empleado(nombre, edad, legajo).
     * @return la información del empleado
     */
	@Override
	public String toString() { 
		return "Empleado " + nombre + ", edad: " + edad + ", legajo: " + ID;
	}

}

