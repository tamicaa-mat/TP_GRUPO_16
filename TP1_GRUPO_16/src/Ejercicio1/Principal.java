package Ejercicio1;


public class Principal {

	
	
public static void main(String[] Args) {
		
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado();
		Empleado empleado4 = new Empleado();
		
		empleado1.setNombre("Homero Simp");
		empleado2.setNombre("Franco Cruz");
		empleado3.setNombre("Selena Maria");
		empleado4.setNombre("Tati Ezqiu");
		
	
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		System.out.println(empleado3.toString());
		System.out.println(empleado4.toString());
		
	}
}
