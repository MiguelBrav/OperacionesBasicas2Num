import java.util.Scanner;
public class Version2 {




		static Scanner teclado=new Scanner(System.in);
		static double num1, num2, suma, resta, multi, divi;
		public static void main(String[] args) {
		
		Programa(num1, num2);
		
		}
		
		public static void Programa(double a, double b) {
			// TODO Auto-generated method stub

			Entrada();
			
			Suma(a,b);
			Resta(a,b);
			Divisi�n();
			Multiplicaci�n();
			
			System.out.println("La suma de los 2 n�meros es " +suma);
			System.out.println("La resta de los 2 n�meros es " +resta);
			System.out.println("La multiplicaci�n de los 2 n�meros es " +multi);
			System.out.println("La divisi�n de los 2 n�meros es " +divi);}
			

		private static void Entrada() {
			// TODO Auto-generated method stub
			
			
			System.out.println("�Cu�l es el primer n�mero?");
			num1=teclado.nextDouble();
			
			System.out.println("�Cu�l es el segundo n�mero?");
			num2=teclado.nextDouble();
			return;	
			
			
		}

		private static void Multiplicaci�n() {
			// TODO Auto-generated method stub
			multi=num1*num2;
			return;
		}

		private static void Divisi�n() {
			// TODO Auto-generated method stub
			divi=num1/num2;
			return;
		}

		private static void Resta(double a, double b) {
			a=num1;
			b=num2;
			resta=num1-num2;
			return;
		}

		private static void Suma(double a,double b) {
			// TODO Auto-generated method stub
			a=num1;
			b=num2;
			suma=num1+num2;
			return;
			
		}

	

}
