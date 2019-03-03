/**
 * Maria Jose Castro
 * carne 181202
 * HT6 Estructuras
 */

/**
 * @author Majo!
 *Codigo extraido del libro Java Structures
 */
public class MapList(){
	
	public MapList()
	// post: constructs an empty map, based on a list
	{
		data = new SinglyLinkedList<Association<K,V>>();
	}

	public MapList(Map<K,V> source)
	// post: constructs a map with values found in source
	{
		this();
		putAll(source);
	}
	
	public V put(K k, V v)
	// pre: k and v are non-null
	// post: inserts a mapping from k to v in the map
	{
	Association<K,V> temp = new Association<K,V>(k,v);
	Association<K,V> result = data.remove(temp);
	data.add(temp);
	if (result == null) return null;
	else return result.getValue();
	}
	
	public Set<K> keySet()
	// post: returns a set of all keys associated with this map
	{
	Set<K> result = new SetList<K>();
	Iterator<Association<K,V>> i = data.iterator();
	while (i.hasNext())
	{
	Association<K,V> a = i.next();
	result.add(a.getKey());
	}
	return result;
	}
	public Set<Association<K,V>> entrySet()
	// post: returns a set of (key-value) pairs, generated from this map
	{
	Set<Association<K,V>> result = new SetList<Association<K,V>>();
	Iterator<Association<K,V>> i = data.iterator();
	while (i.hasNext())
	{
	Association<K,V> a = i.next();
	result.add(a);
	}
	return result;
	}
	public Structure<V> values()
	// post: returns a structure that contains the range of the map
	{
	Structure<V> result = new SinglyLinkedList<V>();
	Iterator<V> i = new ValueIterator<K,V>(data.iterator());
	while (i.hasNext())
	{
	result.add(i.next());
	}
	return result;
	}
}
