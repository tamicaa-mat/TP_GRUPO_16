package Ejercicio1;

public class Principal {

public static void main(String[] Args) {
		
		Empleado[] vEmpleado = new Empleado[6];
	
		vEmpleado[0] = new Empleado();
		vEmpleado[1] = new Empleado();
		vEmpleado[2] = new Empleado();
		vEmpleado[3] = new Empleado();
		vEmpleado[4] = new Empleado("", -1);
		vEmpleado[5] = new Empleado("Jorge");
		
		vEmpleado[0].setNombre("Homero Simp");
		vEmpleado[1].setNombre("Franco Cruz");
		vEmpleado[2].setNombre("Selena Maria");
		vEmpleado[3].setNombre("");
		vEmpleado[3].setEdad(-1);
		
		for (Empleado empleado : vEmpleado) {
			System.out.println(empleado.toString());
		}
		
		System.out.println("El proximo ID sera el " + Empleado.devuelveProximoID());
		
	}
}
