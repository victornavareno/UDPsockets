package ProductoExample;

import java.io.Serializable;


public class Producto implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	private String nombre;
	private String id;



public Producto(String titulo, String id) {
	this.nombre = titulo;
	this.id = id;
}

public String getNombre() {
	return nombre;
}
public String getId() {
	return id;
}


} //CLASS
