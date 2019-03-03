import java.util.Scanner;
//import java.util.HashTable;

/**
 * Maria Jose Castro
 * carne 181202
 * HT6 Estructuras
 * 
 */

/**
 * @author Majo!
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("**************MAGIC GAME*************");
		System.out.println("*****************CARDS***************");
		System.out.println("Que implementacion desea usar?");
		System.out.println("1. HashMap");
		System.out.println("2. TreeMap");
		System.out.println("3. LinkedHashMap");
		int opcion = teclado.nextInt();
		//El usuario ingresa la opcion
		while(opcion>4);
		if (opcion == 1) {
			//Codigo extraido de https://www.youtube.com/watch?v=BRGzv5vefGA 
			//recuperado el 02/03/2018
			//HashMap<String, String> hm= new HashMap<String, String>();
			System.out.println("**************HASHMAP*************");
			System.out.println("Que desea hacer?");
			System.out.println("1. Agergar una carta a su coleccion");
			System.out.println("2.Busar el tipo de carta (por nombre)");
			System.out.println("3. Nombre, tipo y cantidad en su coleccion");
			System.out.println("4. Ordenar por tipo su coleccion");
			System.out.println("5. Mostrar todo (todas)");
			System.out.println("6. Ordenar por tipo (todas)");
			
		}
		if(opcion ==2) {
			//Codigo extraido de https://www.youtube.com/watch?v=BRGzv5vefGA 
			//recuperado el 02/03/2018
			//TreeMap<String, String> tm= new TreeMap<String, String>();
			System.out.println("**************HASHMAP*************");
			System.out.println("Que desea hacer?");
			System.out.println("1. Agergar una carta a su coleccion");
			System.out.println("2.Busar el tipo de carta (por nombre)");
			System.out.println("3. Nombre, tipo y cantidad en su coleccion");
			System.out.println("4. Ordenar por tipo su coleccion");
			System.out.println("5. Mostrar todo (todas)");
			System.out.println("6. Ordenar por tipo (todas)");
			
		}
		if (opcion ==3) {
			//Codigo extraido de https://www.youtube.com/watch?v=BRGzv5vefGA 
			//recuperado el 02/03/2018
			//LinkedHashMap<String, String> lm= new LinkedHashMap<String, String>();
			System.out.println("**************HASHMAP*************");
			System.out.println("Que desea hacer?");
			System.out.println("1. Agergar una carta a su coleccion");
			System.out.println("2.Busar el tipo de carta (por nombre)");
			System.out.println("3. Nombre, tipo y cantidad en su coleccion");
			System.out.println("4. Ordenar por tipo su coleccion");
			System.out.println("5. Mostrar todo (todas)");
			System.out.println("6. Ordenar por tipo (todas)");
			
		}
  	  

	}

}
