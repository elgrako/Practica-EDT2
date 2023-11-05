package practicaEDT2;

import java.sql.Date;

public class Paciente {
	private String nombre;
	private String apellidos;
	private int telefono;
	private Date fechaNacimiento;
	private String direccion;

	public Paciente(String nombre, String apellidos, int telefono, Date fechaNacimiento, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}