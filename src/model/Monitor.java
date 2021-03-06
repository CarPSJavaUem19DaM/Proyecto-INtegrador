package model;

/** <h1>Clase Hija Model Monitor</h1> que extiende la clase Usuario, coniene los 3 atributos y el constructor definidos 
 * en la clase padre Usuario que permiten crear un objeto de tipo Monitor asign�ndole los valores correspondientes. 
 * @author Carlos
 * @since 07/04/2019
 * @version 1.0
 */

public class Monitor extends Usuario {
	
	/**<h2>m�todo Monitor</h2>
	 * Constructor que recibe 2 par�metros para inicializar/asignar valor a los 3 atributos heredados.
	 * @param nombre de tipo String, contendr� el valor del nombre que se va a asignar al atributo <i>nombre</i>
	 * @param tipo de tipo String, inicializado y con el valor asignado de tipo Monitor
	 * @param iD de tipo int, contendr� el valor de n�mero de identificaic�n se va a asignar al atributo <i>ID</i>
	 */
	public Monitor(String nombre, int iD) {
		super(nombre, "monitor", iD);

	}
	
	//traza
	@Override
	public String toString() {
		return "Monitor [nombre=" + nombre + ", tipo=" + tipo + ", ID=" + ID + "]";
	}
	

}
