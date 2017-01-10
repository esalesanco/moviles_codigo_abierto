package es.cice.tutorialjava.poo;

public class Estudiante extends Persona {
	private String nie;
	private String[] cursos;

	public Estudiante(String nombre, int edad, String nie, String...cursos) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
		this.nie = nie;
		this.cursos = cursos;
	}

	public String getNie() {
		return nie;
	}

	public void setNie(String nie) {
		this.nie = nie;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void addCurso(String curso) {
		int i;
		String [] copia = this.cursos;
		this.cursos = new String[this.cursos.length + 1];
		for (i = 0; i < copia.length; i++) {
			this.cursos[i] = copia[i];
		}
		this.cursos[i] = curso;
	}
	

	/**
	 * Elimina el parametro curso del atributo cursos, ajustando su tamaño 
	 * @param curso el curso que se desea eiminar del atributo cursos
	 */
	public void removeCurso(String curso) {
		String[] copia = this.cursos;
		this.cursos = new String[0];
		for (int i = 0; i < copia.length; i++) {
			if (!copia[i].equals(curso)) {
				addCurso(copia[i]);
			}
		}
	}

	public void print() {
		System.out.print("Estudiante[nombre: " + getNombre()
				          + ", edad: " + getEdad()
				          + ", domicilio: " + getDomicilio()
				          + ", nie: " + getNie()
				          + ", numero cursos: " + cursos.length
				          + ", cursos: ");
		
		for (int i = 0; i < this.cursos.length; i++) {
			if (i != 0) {
				System.out.print(" - ");
			}
			
			System.out.print(this.cursos[i]);
		}
		
		System.out.println("]");
	}
}
