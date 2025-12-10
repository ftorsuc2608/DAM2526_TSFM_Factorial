package pruebaControlVersiones;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

        System.out.print("Introduce un número entero mayor o igual que 0: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("ERROR: el número debe ser mayor o igual que 0.");
        } else {
            System.out.println("Has introducido el número: " + num);
        }

        sc.close();

        
	}
	private static long factorialBucle(int n) {
		//TODO: crea tu el contenido de esta función... si eres capaz

        System.out.println("RESULTADO - En versiones posteriores se calculará el factorial del número " + num);
        
        System.out.println("RESULTADO - El factorial del número " + num + " es " + factorialRec(num));

	}
	private static Scanner sc = new Scanner(System.in);

	

    //TODO: Elimina en la función main la declaración de la variable `sc`, ya que vamos a usar el atributo de la clase.
    //TODO: Haz una llamada adecuada a la función pedirNumero.
	new pruebaControlVersiones.Factorial.pedirNumero();

  

	private static int pedirNumero() {
	    int num;
	    boolean valido;

	    do {
	        System.out.print("Introduce un número entero mayor o igual que 0: ");
	        if (sc.hasNextInt()) {
	            num = sc.nextInt();
	            valido = true;
	        } else {
	            System.out.println("Entrada no válida. Introduce un entero.");
	            sc.next();
	            valido = false;
	            num = -1;
	        }
	    } while (!valido);

	    return num;
	}
	/**
	 * Calcula el factorial de un número utilizando un enfoque recursivo.
	 *
	 * @param n Número entero del que se quiere obtener el factorial.
	 * @return Factorial de n, calculado mediante recursividad.
	 */
	private static long factorialRec(int n) {
	    if (n == 0 || n == 1) {
	      return 1;
	    }

	    return n * factorialRec(n - 1);
	}

}