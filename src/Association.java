/**
 * Maria Jose Castro
 * carne 181202
 * HT6 Estructuras
 * 
 */

/**
 * @author Majo!
 *Codigo extrido del libroJava Structures
 */
//package structure5;
public class Association<K,V>
{
	
	protected K theKey; // the key of the key-value pair
	protected V theValue; // the value of the key-value pair


	public Association(K key, V value) {
	// pre: key is non-null
	// post: constructs a key-value pair
	}
	public V getValue() {
	// post: returns value from association
	}
	public K getKey() {
	// post: returns key from association
	}
	public V setValue(V value) {
	// post: sets association's value to value
		V oldValue = theValue;
		theValue = value;
		return oldValue;
	}
}