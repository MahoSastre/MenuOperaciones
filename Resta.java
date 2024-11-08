import java.util.List;

/**
 * <b>Class:</b> Resta <br>
 * <b>Description:</b>
 * <p> Esta clase maneja la operación de resta de una lista de números. </p>
 *
 * @author Mahonrri Nazir Sastré De La Cadena
 * @mail mnsastrec@desarrollo-ultrasist.com.mx
 * 
 * @created 7 de noviembre del 2024
 * @version 1.0
 * @category Operación Aritmética
 */
public class Resta {
    
    /**
     * Realiza la operación de resta de varios números.
     * 
     */
    public static void operacionResta() {

        
        /** Solicita una lista de números para la resta, asegurando que se ingresen al menos dos. */
        List<Integer> listaNumeroResta = ArchivoUtil.validarListaNumerosMinimoDos("Ingrese el número a sumar");
        if (listaNumeroResta == null) return; 

        /** Realiza la resta de los números. */
        int resultado = Operaciones.resta(listaNumeroResta);

        
        
        RegistroOperaciones.registrarOperacion("Resta: " + listaNumeroResta + " = " + resultado);

        /** Ordena los números en orden ascendente y los muestra. */
        ArchivoUtil.ordenAscendente(listaNumeroResta); 
        ArchivoUtil.mostrarNumeros("Números en orden ascendente: ", listaNumeroResta);

        System.out.println("Resultado de la resta: " + resultado);
    }
}