package gestionGit;

public class Main {

	public static void main(String[] args) {

		System.out.println("Gestion con Git y GitHub");

		Operaciones op = new Operaciones();
		System.out.println("Suma: " + op.sumar(3.7, 4.1));
		System.out.println("Multiplicacion: " + op.multiplicar(4, 7));
	}

}
