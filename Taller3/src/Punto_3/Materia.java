package Punto_3;

public class Materia {

	String nombre;
	int [] Estudiantes;
	
	public Materia(String nombre, int[] estudiantes) {
		this.nombre = nombre;
		Estudiantes = estudiantes;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int[] getEstudiantes() {
		return Estudiantes;
	}
	public void setEstudiantes(int[] estudiantes) {
		Estudiantes = estudiantes;
	}
	
}
