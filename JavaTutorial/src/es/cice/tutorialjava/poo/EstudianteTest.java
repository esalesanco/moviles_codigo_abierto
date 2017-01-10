package es.cice.tutorialjava.poo;

public class EstudianteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e1 = new Estudiante("Luis", 22, "222222", "POO", "Android", "IOS");
		e1.print();
		e1.addCurso("Python");
		e1.print();
		e1.removeCurso("POO");
		e1.print();
		
		Estudiante e2 = new Estudiante("Manuel", 22, "111111");
		e2.print();
		e2.removeCurso("POO");
		e2.print();
		e2.addCurso("POO");
		e2.addCurso("IOS");
		e2.addCurso("Android");
		e2.addCurso("POO");
		e2.print();
		e2.removeCurso("POO");
		e2.print();
	}

}
