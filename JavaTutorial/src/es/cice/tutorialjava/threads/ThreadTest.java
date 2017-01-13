package es.cice.tutorialjava.threads;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Implementacion anonima de un hilo.
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					System.out.println("Ejecutando hilo 1...");
				}
			}
		}).start();

		// El mismo tipo de implementacion con notacion "lambda" de otro hilo.
		// A partir de la version 8 de java
		new Thread(()->{
			while (true) {
				System.out.println("Ejecutando hilo 2...");
			}
		}).start();
	}
}
