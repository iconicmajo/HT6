/**
 * Maria Jose Castro
 * carne 181202
 * HT6 Estructuras
 */

/**
 * @author Majo!
 * 
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class FactoryMap<K,V> {
	
	public Map<K,V> createMap(String op) {
	
		if(op.equals("HashMap")) {
			return new HashMap<K,V>();
		}
		if(op.equals("TreeMap")){
			return new TreeMap<K,V>();
		}
		if(op.equals("LinkedMap")) {
			return new LinkedHashMap<K,V>();
		}
		
		return null;
	}

}
