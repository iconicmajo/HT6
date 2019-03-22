/**
 * 
 */

/**
 * @author Majo!
 *
 */
public class Carta {
	
	//Atributos de una carta
	public String nombre;
	public String tipo;
	
	//Constructor 
	public Carta(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}
	//Setters y getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//To String  de cada carta
	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
	

}
