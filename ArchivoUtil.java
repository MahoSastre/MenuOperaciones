import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * <b>Class:</b> ArchivoUtil <br>
 * <b>Description:</b> 
 * <p> Clase de utilidades para manejar la entrada de usuario y operaciones auxiliares en la aplicación. </p>
 *
 * @author Mahonrri Nazir Sastré De La Cadena
 * @mail mnsastrec@desarrollo-ultrasist.com.mx
 * 
 * @created 7 de noviembre del 2024
 * @version 1.0
 * @category Utilidad.
 */
public class ArchivoUtil {

    /**
     *  entrada del usuario.
     */
    private static final Scanner letraSalida = new Scanner(System.in);

    /**
     * Mensaje que se muestra en las instrucciones de cada operación, indicando que se puede regresar al menú.
     */
    public static final String mensajeRegresar = "(o escriba 'R' para regresar al menú): ";

    /**
     * Verifica si el usuario ingresó 'R' para regresar al menú.
     * 
     * @param datoEntrada el dato ingresado por el usuario.
     * @return true si el usuario ingresó 'R', false de lo contrario.
     */
    public static boolean verificarRegresoMenu(String datoEntrada) {
        return datoEntrada.equalsIgnoreCase("R");
    }

    /**
     * 
     * @param datoEntrada el dato ingresado por el usuario.
     * @return true si el usuario ingresó 'S', false de lo contrario.
     */
    public static boolean verificarSalida(String datoEntrada) {
        return datoEntrada.equalsIgnoreCase("S");
    }

    /**
     * Valida que el número ingresado sea un número entero.
     * 
     * @param mensaje  mensaje que se muestra al usuario.
     * @return el número ingresado o null si se decide salir o regresar al menú.
     */
    public static Integer validarNumeroEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje + " " + mensajeRegresar);
            String input = letraSalida.nextLine().trim();
            
            /** Si presionan 'S', salir del programa. */
            if (verificarSalida(input)) {
                return null; 
            }

            /** Si presionan 'R', regresar al menú. */
            if (verificarRegresoMenu(input)) {
                return null;
            }

            try {

                /** Si ingresan un número válido, lo retorna. */
                return Integer.valueOf(input); 
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingrese un número entero.");
            }
        }
    }

    /**
     * Solicita una cantidad específica de números y los almacena en una lista.
     * 
     * @param contador la cantidad de números a ingresar.
     * @param mensaje el mensaje que se muestra para cada número.
     * @return lista de números enteros ingresados o null si se decide salir o regresar
     */
    public static List<Integer> listaNumeros(int contador, String mensaje) {
        List<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < contador; i++) {
            Integer numeroEntero = validarNumeroEntero(mensaje + " " + (i + 1));

            /** Sale si el usuario decide salir o regresar */
            if (numeroEntero == null) return null; 
            listaNumeros.add(numeroEntero);
        }
        return listaNumeros;
    }
    
    /**
     * Se verifica que el número no sea cero.
     * 
     * @param mensaje el mensaje que se muestra.
     * @return número ingresado o null si se decide salir o regresar
     */
    public static Integer validacionNumeroCero(String mensaje) {
        while (true) {
            Integer valor = validarNumeroEntero(mensaje + " (no puede ser 0)");

            /** Sale si se decide salir o regresar */
            if (valor == null) return null; 

            /** Retorna el valor si es diferente de 0 */
            if (valor != 0) return valor; 
            System.out.println("Error: El valor no puede ser cero. Intente de nuevo.");
        }
    }

    /**
     * Muestra los números ingresados.
     * 
     * @param mensaje el mensaje que acompaña a la lista de números.
     * @param numeros lista de números a mostrar.
     */
    public static void mostrarNumeros(String mensaje, List<Integer> numeros) {
        System.out.println(mensaje + numeros);
    }

    /**
     * Ordena una lista de números en orden descendente.
     * 
     * @param listaNumeros lista de números a ordenar.
     */
    public static void ordenDescendente(List<Integer> listaNumeros) {
        Collections.sort(listaNumeros, Collections.reverseOrder());
    }

    /**
     * Ordena una lista de números en orden ascendente.
     * 
     * @param listaNumeros lista de números a ordenar.
     */
    public static void ordenAscendente(List<Integer> listaNumeros) {
        Collections.sort(listaNumeros);
    }

    /**
     * Solicita que ingrese al menos dos números para realizar una operación.
     * 
     * @param mensaje mensaje que se muestra para cada número.
     * @return lista de números ingresados o null si se decide salir o regresar.
     */
    public static List<Integer> validarListaNumerosMinimoDos(String mensaje) {
        List<Integer> listaNumeros = new ArrayList<>();
        
        while (listaNumeros.size() < 2) {

            /** Preguntar al usuario cuántos números quiere usar. */
            Integer contador = validarNumeroEntero("¿Cuántos números desea ingresar para la operación?");
            
            /** Si el usuario presiona 'R' para regresar. */
            if (contador == null) return null; 
    
            /** Si el número ingresado es menor que 2, repite la solicitud. */
            if (contador < 2) {
                System.out.println("Debe ingresar al menos dos números para realizar la operación.");

                /** Vuelve a preguntar cuántos números desea ingresar. */
                continue;  
            }

            /** Pide los números. */
            for (int i = 0; i < contador; i++) {
                Integer numero = validarNumeroEntero(mensaje + " " + (i + 1));

                /** Si el usuario presiona 'S' o 'R', regresa al menú. */
                if (numero == null) return null;  
                listaNumeros.add(numero);
            }
        }
        return listaNumeros;
    }   
}



