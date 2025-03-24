package gestionGit;

public class Operaciones {

	public double sumar(double a, double b) {
		return a + b;
	}

	public int restar(int a, int b) {
		if (a < b)
			return 0;
		return a - b;
	}

	public double multiplicar(double a, double b) {
		return a * b;
	}

	public double dividir(double a, double b) {
		if (b == 0)
			return 0;
		return a / b;
	}

	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}

}
