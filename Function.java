import java.util.ArrayList;
import java.util.Map;



/**
 * 
 */

/**
 * @author Majo!
 *Codigo extraido del libro Java Structures
 */
 
public class Function  {
	public static String fun4(Map<String, String> map, Map<String, String> baraja) {
		ArrayList<String> hechizos = new ArrayList<String>();
        ArrayList<String> monstruos = new ArrayList<String>();
        ArrayList<String> trampa = new ArrayList<String>();
        
		for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("Hechizo")) {
                hechizos.add(entry.getKey()+entry.getValue());
            } 
            
            if (entry.getValue().equals("Monstruo")) {
                monstruos.add(entry.getKey()+entry.getValue());
            }
            
            if (entry.getValue().equals("Trampa")) {
                trampa.add(entry.getKey()+entry.getValue());
            } 
            
            else {
                System.out.println("No se han encontrado cartas");
            }
        }
		return "Hechizos: "+hechizos+"Monstruos: "+ monstruos+ "Trampas: "+ trampa;
	}

	
	
	public static String fun6(Map<String, String> map) {
		
		ArrayList<String> hechizos = new ArrayList<String>();
        ArrayList<String> monstruos = new ArrayList<String>();
        ArrayList<String> trampa = new ArrayList<String>();
        
		for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("Hechizo")) {
                hechizos.add(entry.getKey()+entry.getValue());
            } 
            
            if (entry.getValue().equals("Monstruo")) {
                monstruos.add(entry.getKey()+entry.getValue());
            }
            
            if (entry.getValue().equals("Trampa")) {
                trampa.add(entry.getKey()+entry.getValue());
            } 
            
            else {
                System.out.println("No se han encontrado cartas");
            }
        }
		return "Hechizos: "+hechizos+"Monstruos: "+ monstruos+ "Trampas: "+ trampa;
	}
	}	

