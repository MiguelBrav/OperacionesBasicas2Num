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
			División();
			Multiplicación();
			
			System.out.println("La suma de los 2 números es " +suma);
			System.out.println("La resta de los 2 números es " +resta);
			System.out.println("La multiplicación de los 2 números es " +multi);
			System.out.println("La división de los 2 números es " +divi);}
			

		private static void Entrada() {
			// TODO Auto-generated method stub
			
			
			System.out.println("¿Cuál es el primer número?");
			num1=teclado.nextDouble();
			
			System.out.println("¿Cuál es el segundo número?");
			num2=teclado.nextDouble();
			return;	
			
			
		}

		private static void Multiplicación() {
			// TODO Auto-generated method stub
			multi=num1*num2;
			return;
		}

		private static void División() {
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
