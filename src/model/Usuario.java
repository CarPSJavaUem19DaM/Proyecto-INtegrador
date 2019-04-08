package model;
/**
 * <h1>Clase Padre Model Usuario</h1> definida como abstracta que coniene los atributos con los que formaremos objetos de tipo 
 * Usuario que ser�n definidos en las clases hijas. Es abstracta ya que no va a tener implementaci�n ni
 * instanciaci�n.
 * @author Carlos
 * @since 07/04/2019
 * @version 1.0
 */

public abstract class Usuario {	
	/** Atributos definidos como protected ya que ser�n heredados en las clases hijas: 	 
	 *  <ul>
	 *  	<li><i>nombre</i> de tipo String, contiene el nombre del usuario</li>
	 *  	<li><i>tipo</i> de tipo String, diferencia si el usuario es monitor o cliente</li>
	 *  	<li><i>ID</i> de tipo int, representa el n�mero de identificaci�n del usuario</li>
	 *  </ul> 
	 * Tambien se describe el constructor Usuario */
	
	protected String nombre;
	protected String tipo;
	protected int ID;
	
	/**<h2>m�todo Usuario</h2>
	 * Constructor que recibe 3 par�metros para inicializar/asignar valor a los 3 atributos 
	 * @param nombre de tipo String, contendr� el valor del nombre que se va a asignar al atributo <i>nombre</i>
	 * @param tipo de tipo String, contendr� el valor del tipo de usuario que se va a asignar al atributo <i>tipo</i>
	 * @param iD de tipo int, contendr� el valor de n�mero de identificaic�n se va a asignar al atributo <i>ID</i>
	 */
	public Usuario(String nombre, String tipo, int iD) {
		this.nombre = nombre;
		this.tipo = tipo;
		ID = iD;
	}
	
	
	
	

}
