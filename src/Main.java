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
	while(opcion>4);
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
					//hol
				}
				if(hop ==5){
					System.out.println(map);
				}
				
				if(hop ==6) {
					System.out.println("Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
		             Function.fun6(map);	
				}
		}
		
		if(opcion ==2) {
			//Codigo extraido de https://www.youtube.com/watch?v=BRGzv5vefGA 
			//recuperado el 02/03/2018
			//TreeMap<String, String> tm= new TreeMap<String, String>();
			map = fm.createMap("TreeMap");
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
			while(top >7) ;
				if(top==1) {
					System.out.println("Ingrese la carta a agregar: ");
                    name = teclado.nextLine();
                    if(map.containsKey(name)) {
                    	type = map.get(name);
                    	System.out.println("entro");
                    	//baraja.put(name, type);
                }
                    else {
                    	System.out.println("Error");
                    }
				}
				if(top ==2) {
					System.out.print("Ingrese la carta a buscar: ");
                    //String name = teclado.nextLine();
                    //System.out.println(Function.funcion2(map, name));
				}
				if(top ==3) {
					//Function.funcion3(baraja);
				}
				if(top ==4) {
					System.out.println("Ordenar por tipo su coleccion ");
				}
				if(top ==5){
					//Function.funcion5(map);
				}
				if(top ==6) {
					System.out.println("Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
				}
		}
			
		if (opcion ==3) {
			//Codigo extraido de https://www.youtube.com/watch?v=BRGzv5vefGA 
			//recuperado el 02/03/2018
			//LinkedHashMap<String, String> lm= new LinkedHashMap<String, String>();
			map = fm.createMap("LinkedMap");
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
			while(lop >7) ;
				if(lop==1) {
					System.out.println("Ingrese la carta a agregar: ");
                    name = teclado.nextLine();
                    if(map.containsKey(name)) {
                    	type = map.get(name);
                    	System.out.println("entro");
                    	//baraja.put(name, type);
                }
                    else {
                    	System.out.println("Error");
                    }
				}
				if(lop == 2) {
					System.out.print("Ingrese la carta a buscar: ");
                   // String name = teclado.nextLine();
                    //System.out.println(Function.funcion2(map, name));
				}
				if(lop ==3) {
					//Function.funcion3(baraja);
				}
				if(lop ==4) {
					System.out.println("Ordenar por tipo su coleccion ");
				}
				if(lop ==5){
					//Function.funcion5(map);
				}
				if(lop ==6) {
					System.out.println("Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
					
				}
		}
		
		else {
			System.out.println("Ingrese una opcion valida: ");
			opcion = teclado.nextInt();
		}
		
		}

public static Map leer(Map<String, String> map){
	
	try {
           System.out.println("-------------------------------------");
           Scanner read = new Scanner(new File("C:\\Users\\Majo!\\Desktop\\HT6\\src\\cards_desc.txt"));
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
	



