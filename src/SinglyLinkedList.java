/**
 * Maria Jose Castro
 * carne 181202
 * HT6 Estructuras
 * 
 */

/**
 * @author Majo!
 *Codigo extraido de mi HT3 link de git: https://github.com/iconicmajo/HT4
 */
public class SinglyLinkedList<E> implements iLista<E> {
		
	   protected int contar; 
	   protected Nodo<E> first; 

	   public SinglyLinkedList()
	  
	   {
	      first = null;
	      contar = 0;
	   }
	   @Override 
	   public int size()

	  {
	    return contar;
	  }
	   public void addFirst(E value)
	 
	  {
	    
	     first = new Nodo<E>(value, first);
	     contar++;
	  }
	   public E removeFirst()
	  
	 {
	     Nodo<E> temp = first;
	     first = first.next(); 
	     contar--;
	     return temp.value();
	  }
	   public E getFirst()
	  
	  {
	      return first.value();
	  }
	   @Override 
	  public void addLast(E value)
	  
	  {

	      Nodo<E> temp = new Nodo<E>(value,null);
	      if (first != null)
	     {
	         // pointer to possible tail
	         Nodo<E> finger = first;
	         while (finger.next() != null)
	         {
	                finger = finger.next();
	         }
			 
	         finger.setNext(temp);
	      } else first = temp;
		  
		  contar++;
		  
	   }
	   
	   public boolean contains(E value)
	  
	  {
	      Nodo<E> finger = first;
		  
	      while (finger != null &&
	             !finger.value().equals(value))
	     {
	          finger = finger.next();
	      }
	      return finger != null;
	   }

}

