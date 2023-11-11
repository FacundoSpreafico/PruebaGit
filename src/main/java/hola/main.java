package hola;

public class main {
	
	public static void main(String[] args) {
		int a=0,b=2,c=6;
		sumar(a,b,c);
		
	}
	
	public static void sumar(int a,int b, int c) {
		System.out.print(a+b+c);
	}

	public static void dividir(int a, int b) {
		if(b != 0) {
			System.out.print(a/b);
		}
		else
			System.out.print("Operacion no admitida");
	}
}
