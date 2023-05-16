package interfaz;
import mundo.SistemaRiego;

public class ProgramaPrincipal 
{
    public static void main(String[] args) 
    {    
        // Crear un objeto SistemaRiego
    	SistemaRiego sistemaDeRiego = new SistemaRiego(0, 0, 0, 0);
		
    	//Leer los datos de las variables
    	sistemaDeRiego.leerLongitud( );
		sistemaDeRiego.leerVolumen( );
		sistemaDeRiego.leerTasaDeCambioVolumen( );
		sistemaDeRiego.leerRadio( );
		
        // Calcular la tasa de cambio del radio
        double tasaCambioRadio = sistemaDeRiego.calcularTasaCambioRadio();
        System.out.println("La tasa de cambio del radio es: " + tasaCambioRadio + " m/s");
        
        
        System.out.println("                                                    ");
        
        // Calcular la tasa de cambio del volumen después de 2 horas
        double tasaCambioVolumen = sistemaDeRiego.calcularTasaCambioVolumen(2);
        System.out.println( "La tasa de cambio del volumen después de 2 horas es: " + tasaCambioVolumen + " m^3/s" ) ;
     }
}
