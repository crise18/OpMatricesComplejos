import java.util.Scanner;
/**
 * @author Mariana.G
 **/
public class PruebaComplejo {
	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
		double r1;
		double r2;
		double i1;
		double i2;
		
		int op = 1;


	System.out.println("Calculadora de complejos.");

	System.out.print("Ingresa la parte real del primer numero:\t");
			r1 = teclado.nextDouble();

	System.out.print("Ingresa la parte imaginaria del primer numero:\t");
			i1 = teclado.nextDouble();

	System.out.print("Ingresa la parte real del segundo numero:\t");
			r2 = teclado.nextDouble();

	System.out.print("Ingresa la parte imaginaria del segundo numero:\t");
			i2 = teclado.nextDouble();


		Complejo c1 = new Complejo(r1, i1);
		Complejo c2 = new Complejo(r2, i2);
		Complejo c3;

	

	while (op != 0){
		
		System.out.println("\n\tElige una opcion:"
				+ "\n\t0. Salir\n\t1. Sumar\n\t2. Restar\n\t3. Multiplicar\n\t4. Dividir");
		op = teclado.nextInt();

		switch(op){
		case 0: 
			op = 0;
			System.out.println("Vuelve pronto.");
			break;
		case 1:
			c3 = c1.sumar(c2);
			System.out.print("(" + c1 + ")" + "+" + "(" + c2 + ")" + " = " + "" + c3);

			System.out.println("Igualdad de complejos: " + c1.equals(c2));
			break;
			
		case 2:
			c3 = c1.restar(c2);
			System.out.println("(" + c1 + ")" + "-" + "(" + c2 + ")" + " = " + "" + c3);

			System.out.println("Igualdad de complejos: " + c1.equals(c2));
			break;
			
		case 3:
			c3 = c1.multiplicar(c2);
			System.out.println("(" + c1 + ")" + "*" + "(" + c2 + ")" + " = " + "" + c3);

			System.out.println("Igualdad de complejos: " + c1.equals(c2));
			break;
			
		case 4:
			c3 = c1.dividir(c2);
			if (r2 + i2 == 0.0){
				System.out.println("Error");
			} else {
			System.out.println("(" + c1 + ")" + "/" + "(" + c2 + ")" + " = " + "" + c3);}
			
			System.out.println("Igualdad de complejos: " + c1.equals(c2));
			break;

		
		}

	}
	}
}