package main;

public class Cuenta {

	String nombre;
	String apellido;
	float saldo;
	int dni;
	
	public Cuenta(String nombre, String apellido, float saldo, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = saldo;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
}
