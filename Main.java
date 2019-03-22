import java.io.*;
import java.util.*;

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
		Map<String, String> map = new HashMap<String, String>();
		Function fun = new Function();
		FactoryMap<String, String> fm = new FactoryMap<String, String>();
		Map<String, String> baraja = null;
		String name = "";
		String type = "";
		
		System.out.println("**************MAGIC GAME*************");
		System.out.println("*****************CARDS***************");
		System.out.println("Que implementacion desea usar?");
		System.out.println("1. HashMap");
		System.out.println("2. TreeMap");
		System.out.println("3. LinkedHashMap");
	
		int opcion = teclado.nextInt();
		teclado.nextLine();
		
		//El usuario ingresa la opcion
	while(opcion!=4) {

		if (opcion == 1) {
			
			
			//Codigo extraido de https://www.youtube.com/watch?v=BRGzv5vefGA 
			//recuperado el 02/03/2018
			map = fm.createMap("HashMap");
			baraja = fm.createMap("HashMap");
			map = leer(map);
			System.out.println("**************HASHMAP*************");
			System.out.println("Que desea hacer?");
			System.out.println("1. Agergar una carta a su coleccion");
			System.out.println("2.Busar el tipo de carta (por nombre)");
			System.out.println("3. Nombre, tipo y cantidad en su coleccion");
			System.out.println("4. Ordenar por tipo su coleccion");
			System.out.println("5. Mostrar todo (todas)");
			System.out.println("6. Ordenar por tipo (todas)");
			int hop = teclado.nextInt();
			teclado.nextLine();
			while (hop !=7) {
				if(hop==1) {
					System.out.println("Ingrese la carta a agregar: ");
                    name = teclado.nextLine();
                    if(map.containsKey(name)) {
                    	type = map.get(name);
                    	baraja.put(name, type);
                    	System.out.println("Carta agregada correctamente");
                    	}
                    else {
                    	System.out.println("Error");
                    }
				}
                  
				if(hop ==2) {
					System.out.print("Ingrese la carta a buscar: ");
					name = teclado.nextLine();
                    if(map.containsKey(name)) {
                    	type = map.get(name);
                    	System.out.println("La carta "+name+" es un: "+ type);
                    }
                    else {
                    	System.out.println("Error, su carta no existe");
                    }
				}
				if(hop ==3) {
					System.out.println(baraja);
				}
				
				if(hop ==4) {
					
				}
				if(hop ==5){
					System.out.println(map);
				}
				
				if(hop ==6) {
					System.out.println("Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
		             Function.fun6(map);	
				}
				else {
					System.out.println("Ingrese una opcion valida: ");
					hop = teclado.nextInt();
					teclado.nextLine();
				}
		}
			
		}
		
		if(opcion ==2) {
			//Codigo extraido de https://www.youtube.com/watch?v=BRGzv5vefGA 
			//recuperado el 02/03/2018
			//TreeMap<String, String> tm= new TreeMap<String, String>();
			map = fm.createMap("TreeMap");
			baraja = fm.createMap("TreeMap");
			map = leer(map);
			System.out.println("**************TREEMAP*************");
			System.out.println("Que desea hacer?");
			System.out.println("1. Agergar una carta a su coleccion");
			System.out.println("2.Busar el tipo de carta (por nombre)");
			System.out.println("3. Nombre, tipo y cantidad en su coleccion");
			System.out.println("4. Ordenar por tipo su coleccion");
			System.out.println("5. Mostrar todo (todas)");
			System.out.println("6. Ordenar por tipo (todas)");
			int top = teclado.nextInt();
			teclado.nextLine();
			while (top !=7) {
				if(top==1) {
					System.out.println("Ingrese la carta a agregar: ");
                    name = teclado.nextLine();
                    if(map.containsKey(name)) {
                    	type = map.get(name);
                    	System.out.println("entro");
                    	baraja.put(name, type);
                }
                    else {
                    	System.out.println("Error");
                    }
				}
				if(top ==2) {
					System.out.print("Ingrese la carta a buscar: ");
					name = teclado.nextLine();
                    if(map.containsKey(name)) {
                    	type = map.get(name);
                    	System.out.println("La carta "+name+" es un: "+ type);
                    }
                    else {
                    	System.out.println("Error, su carta no existe");
                    }
				}
				if(top ==3) {
					System.out.println(baraja);
				}
				if(top ==4) {
					System.out.println("Ordenar por tipo su coleccion ");
				}
				if(top ==5){
					System.out.println(map);
				}
				if(top ==6) {
					System.out.println("Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
					  Function.fun6(map);
				}
				else {
					System.out.println("Ingrese una opcion valida: ");
					top = teclado.nextInt();
					teclado.nextLine();
				}
			}
		}
			
		if (opcion ==3) {
			//Codigo extraido de https://www.youtube.com/watch?v=BRGzv5vefGA 
			//recuperado el 02/03/2018
			//LinkedHashMap<String, String> lm= new LinkedHashMap<String, String>();
			map = fm.createMap("LinkedMap");
			baraja = fm.createMap("LinkedMap");
			map = leer(map);
			System.out.println("**************LINKEDMAP*************");
			System.out.println("Que desea hacer?");
			System.out.println("1. Agergar una carta a su coleccion");
			System.out.println("2.Busar el tipo de carta (por nombre)");
			System.out.println("3. Nombre, tipo y cantidad en su coleccion");
			System.out.println("4. Ordenar por tipo su coleccion");
			System.out.println("5. Mostrar todo (todas)");
			System.out.println("6. Ordenar por tipo (todas)");
			int lop = teclado.nextInt();
			teclado.nextLine();
			while (lop !=7) {
				if(lop==1) {
					System.out.println("Ingrese la carta a agregar: ");
                    name = teclado.nextLine();
                    if(map.containsKey(name)) {
                    	type = map.get(name);
                    	baraja.put(name, type);
                }
                    else {
                    	System.out.println("Error");
                    }
				}
				if(lop == 2) {
					System.out.print("Ingrese la carta a buscar: ");
					name = teclado.nextLine();
                    if(map.containsKey(name)) {
                    	type = map.get(name);
                    	System.out.println("La carta "+name+" es un: "+ type);
                    }
                    else {
                    	System.out.println("Error, su carta no existe");
                    }
				}
				if(lop ==3) {
					System.out.println(baraja);
				}
				if(lop ==4) {
					//System.out.println("Ordenar por tipo su coleccion ");
				}
				if(lop ==5){
					System.out.println(map);
				}
				if(lop ==6) {
					System.out.println("Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
					Function.fun6(map);
					
				}
				else {
					System.out.println("Ingrese una opcion valida: ");
					lop = teclado.nextInt();
					teclado.nextLine();
				}
			}
		}
		else {
			System.out.println("Ingrese una opcion valida: ");
			opcion = teclado.nextInt();
			
		}
	}
		
		}

public static Map leer(Map<String, String> map){
	
	try {
           System.out.println("-------------------------------------");
           //Esta es la linea donde lee el doc, como me dijiste te puse solo el nombre del file
           //en mi compu solo lo lee con todo completo, si no corre copia tu dirección aqui
           Scanner read = new Scanner(new File("cards_desc.txt")); //"C:\\Users\\Majo!\\Desktop\\HT6\\src\\cards_desc.txt"
           String first ="";
           String last ="";

           
          while((read.hasNextLine()))
       
            {
        	 
        	 String line = read.nextLine();
             int i = line.lastIndexOf("|");
             first = line.substring(0,i).trim();
             last =line.substring(i+1).trim();
             map.put(first, last);
            }
     
            }

        catch (Exception ex) {
            ex.printStackTrace();
        }
	return map;
}
}
	



