package Ejercicio1;

public class Empleado {
	
	//Attributes
	
	private int id;
	private String nombre;
	private int edad;
	public static int cont=999;
	 

	//constructores
	public Empleado() 
	{
		cont ++;
		this.id=cont;
		this.nombre="sin nombre";
		this.edad=99;
	}
	
	public Empleado(String nombre,int edad) 
	{
		cont ++;
		this.id=cont;
		this.nombre=nombre;
		this.edad=edad;

	}
	
	// metodos get set encapsulamiento(elimine el set de id, ya que debe autogenerarse)
	
	public int getId() {
		return id;
	}
	
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
    private static int devuelveProximoID() {
        cont++;
        return cont;
    }
	
	
	
	

	//metodo tostring devuelve informacion del objeto
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	


}
