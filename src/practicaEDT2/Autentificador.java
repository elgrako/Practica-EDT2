package practicaEDT2;

public class Autentificador {

	public Autentificador() {

	}

	public boolean autentificar(String identificador, String contrasena) {

		if (identificador.equals("usuario123") && contrasena.equals("contrasena123")) {
			return true;
		} else {
			return false;
		}
	}
}
