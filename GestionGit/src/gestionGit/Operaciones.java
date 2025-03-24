package gestionGit;

public class Operaciones {

	public double sumar(double a, double b) {
		return a + b;
	}
	
	public int restar (int a,int b) {
		if(a<b) return 0;
		return a-b;
	}
	
	public int multiplicar (int a, int b) {
		return a*b;
	}
	
	public double dividir (int a,int b) {
		if (b==0)return 0;
		return a/b;
	}
	
}
