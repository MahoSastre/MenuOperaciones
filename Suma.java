import java.util.List;


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
    }
}
