import java.util.List;

/**
 * <b>Class:</b> Suma <br>
 * <b>Description:</b>
 * <p> Esta clase maneja la operación de suma de una lista de números. </p>
 *
 * @author Mahonrri Nazir Sastré De La Cadena
 * @email mnsastrec@desarrollo-ultrasist.com.mx
 * 
 * @created 7 de noviembre del 2024
 * @version 1.0
 * @category Operación Aritmética
 */
public class Suma {

    /**
     * Realiza la operación de suma de varios números.
     * 
     */
    public static void operacionSuma() {

        
        /** Solicita una lista de números para la suma, se valida que se ingresen al menos dos números. */
        List<Integer> listaNumeroSuma = ArchivoUtil.validarListaNumerosMinimoDos("Ingrese el número a sumar");
        if (listaNumeroSuma == null) return; 

        /** Ordena los números en orden descendente y los muestra. */
        ArchivoUtil.ordenDescendente(listaNumeroSuma); 
        ArchivoUtil.mostrarNumeros("Números en orden descendente: ", listaNumeroSuma);
        
        /** Realiza la suma de los números y muestra el resultado. */
        int resultado = Operaciones.suma(listaNumeroSuma);
        System.out.println("Resultado de la suma: " + resultado);

        RegistroOperaciones.registrarOperacion("Suma: " + listaNumeroSuma + " = " + resultado);
    }
}