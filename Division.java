import java.util.List;
/**
 * <b>Class:</b> Division.java <br>
 * <b>Description:</b> 
 * <p> Clase que gestiona la operación de división entre dos números.
 * </p>
 *
 * @author Mahonrri Nazir Sastré De La Cadena
 * @email mnsastrec@desarrollo-ultrasist.com.mx
 * 
 * @created 7 de noviembre del 2024
 * @version 1.0
 * @category Operación aritmética.
 */
public class Division {

    /**
     * Realiza la operación de división entre dos números.
     */
    public static void operacionDivision() {

        
        /** Solicita el numerador y verifica que no sea cero. si es nulo, finaliza el método. */
        Integer numerador = ArchivoUtil.validacionNumeroCero("Ingrese el numerador");
        if (numerador == null) return;

        /** Solicita el denominador y verifica que no sea cero. Si es nulo, finaliza el método. */
        Integer denominador = ArchivoUtil.validacionNumeroCero("Ingrese el denominador");
        if (denominador == null) return;
        
        /** Crea una lista con el numerador y denominador y los muestra. */
        List<Integer> listaNumeroDivision = List.of(numerador, denominador);
        ArchivoUtil.mostrarNumeros("Números ingresados para la división: ", listaNumeroDivision);

        /** Realiza la división y muestra el resultado con dos decimales. */
        double resultado = Operaciones.division(numerador, denominador);
        System.out.printf("Resultado de la división: %.2f%n", resultado);
        
        RegistroOperaciones.registrarOperacion("División: " + listaNumeroDivision + " = " + resultado);
    }
}