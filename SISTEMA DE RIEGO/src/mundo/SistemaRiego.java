 package mundo;
import javax.swing.JOptionPane;
public class SistemaRiego 
{
	
	/**
	 * Atributos declarados para la clase SistemaRiego
	 * atributo que representa el volumen del agua
	 */
    private double volumen;
    /**
     * atributo que representa el radio 
     */
    private double radio;
    /**
	 * atributo que representa la logitud de la manguera.
	 */
    private double longitud;
    /**
     * atributo que representa la tasa de cambio del volumen en funcion del tiempo.
     */
    private double tasaCambioVolumen;
    
 
    /**
	 * Constructor que inicializa las variables de la clase SistemaRiego <br>
	 *  <b> post: </b> las variables quedan inicializadas <br>
	 */
    public SistemaRiego(double volumen, double radio, double longitud, double tasaCambioVolumen) {
        this.volumen = volumen ;
        this.radio = radio;
        this.longitud = longitud;
        this.tasaCambioVolumen = tasaCambioVolumen;
    }
    
   
    /**
     *  Obtiene por medio del teclado el dato de longitud <br>
     *  <b>pre: </b> La "longitud" se encuentra inicializada <br>
     *  <b>post: </b> El valor de "longitud" es agregado por medio del teclado y almacenado en la variable.
     */
    public void leerLongitud ( )
    {
    	String strNota = JOptionPane.showInputDialog( "Ingrese la longitud de la manguera en metros" );
    	longitud = Double.parseDouble( strNota );
    }
    /**
     *  Obtiene por medio del teclado el dato de tasa la tasa de cambio del volumen <br>
     *  <b>pre: </b> La "tasaCambioVolumen" se encuentra inicializada <br>
     *  <b>post: </b> El valor de "tasaCambioVolumen" es agrado por medio del usuario y guardado en la variable   
     */
    public void leerTasaDeCambioVolumen ( )
    {
    	String strNota = JOptionPane.showInputDialog( "Ingrese  la tasa de cambio del volumen en metros^3/Segundo" );
    	tasaCambioVolumen = Double.parseDouble( strNota );
    }
    /**
     *  Obtiene por medio del teclado el dato del radio de la manguera  <br>
     *  <b>pre: </b> La "radio" se encuentra inicializada <br>
     *  <b>post: </b> El valor de "radio" es agrado por medio del usuario y guardado en la variable   
     */
    public void leerRadio ( )
    {
    	String strNota = JOptionPane.showInputDialog( "Ingrese el  radio en metros" );
    	radio = Double.parseDouble( strNota );
    }
    /**
     *  Obtiene por medio del teclado el dato del volumen  <br>
     *  <b>pre: </b> La "volumen" se encuentra inicializada <br>
     *  <b>post: </b> El valor de "volumen" es agrado por medio del usuario y guardado en la variable   
     */
    public void leerVolumen ( )
    {
    	String strNota = JOptionPane.showInputDialog( "Ingrese  volumen en metros^3" );
    	volumen = Double.parseDouble( strNota );
    }
    
    
    /**
     *  Metodo que calcula la tasa del cambio en el radio.
     * @return nueva tasa de cambio en el radio.
     */
    public double calcularTasaCambioRadio() {
        double denominador = Math.PI * 2 * radio * longitud;
        double tasaCambioRadio = tasaCambioVolumen / denominador;
        return tasaCambioRadio;
    }
    
    
    /**
     * Metodo que calcula la tasa del cambio en el volumen.
     * @param tiempo en segundos
     * @return nueva tasa de cambio en el volumen 
     */
    public double calcularTasaCambioVolumen(double tiempo) {
        double tasaCambioVolumen = this.tasaCambioVolumen;
        double nuevoVolumen = volumen + (tasaCambioVolumen * tiempo);
        return nuevoVolumen;
    }
    
    // Getters y Setters
    public double getVolumen() {
        return volumen;
    }
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public double getTasaCambioVolumen() {
        return tasaCambioVolumen;
    }
    public void setTasaCambioVolumen(double tasaCambioVolumen) {
        this.tasaCambioVolumen = tasaCambioVolumen;
    }
}
