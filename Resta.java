import java.util.List;

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

        /** Ordena los números en orden ascendente y los muestra. */
        ArchivoUtil.ordenAscendente(listaNumeroResta); 
        ArchivoUtil.mostrarNumeros("Números en orden ascendente: ", listaNumeroResta);
        
        System.out.println("Resultado de la resta: " + resultado);
    }
}
