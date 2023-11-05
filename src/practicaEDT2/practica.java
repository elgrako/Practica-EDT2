package practicaEDT2;

public class practica {

	public static void main(String[] args) {
        Usuario usuario = new Usuario("usuario123", "contrasena123");
        
        Autentificador autentificador = new Autentificador();
        RegistroEmpleado registroEmpleado = new RegistroEmpleado();

        Empleado nuevoEmpleado = new Empleado("Nombre", "Apellido", "Cargo", 0);
        registroEmpleado.agregarEmpleado(nuevoEmpleado);
        
        
    }
}
