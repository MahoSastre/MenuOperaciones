import java.util.List;

public class Multiplicacion {

    /**
     * Realiza la operación de multiplicación de varios números.
     * 
     */
    public static void operacionMultiplicacion() {

        /** Solicita una lista de números para la multiplicación, asegurando que se ingresen al menos dos. */
        List<Integer> listaNumeroMultiplicacion = ArchivoUtil.validarListaNumerosMinimoDos("Ingrese el número a multiplicar");
        if (listaNumeroMultiplicacion == null) return; 

        /** Muestra los números ingresados al usuario. */
        ArchivoUtil.mostrarNumeros("Números ingresados: ", listaNumeroMultiplicacion);

        /** Realiza la multiplicación de los números y muestra el resultado. */
        int resultado = Operaciones.multiplicación(listaNumeroMultiplicacion);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
}
