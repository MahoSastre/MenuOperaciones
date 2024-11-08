import java.util.List;
/**
 * <b>Class:</b> Operaciones <br>
 * <b>Description:</b> 
 * <p> Clase que contiene métodos estáticos para realizar operaciones aritméticas básicas (suma, resta, multiplicación y división) sobre listas de números. </p>
 *
 * @autor Mahonrri Nazir Sastré De La Cadena
 * @mail mnsastrec@desarrollo-ultrasist.com.mx
 * 
 * @created 7 de noviembre del 2024
 * @version 1.0
 * @category Operación aritmética
 */
public class Operaciones {

    /**
     * Suma todos los números en una lista.
     * 
     * @param listaSuma lista de números a sumar.
     * @return suma de todos los números en la lista.
     */
    public static int suma(List<Integer> listaSuma) {
        int suma = 0;
        for (int numero : listaSuma) {
            suma += numero;
        }
        return suma;
    }

    /**
     * Resta los números en la lista, comenzando desde el primer número.
     * 
     * @param listaResta lista de números a restar.
     * @return resultado de restar todos los números en la lista.
     */
    public static int resta(List<Integer> listaResta) {
        int resultado = listaResta.get(0);
        for (int i = 1; i < listaResta.size(); i++) {
            resultado -= listaResta.get(i);
        }
        return resultado;
    }

    /**
     * Multiplica todos los números en una lista.
     * 
     * @param listaMultiplicacion lista de números a multiplicar.
     * @return resultado de multiplicar todos los números en la lista.
     */
    public static int multiplicación(List<Integer> listaMultiplicacion) {
        int resultado = 1;
        for (int num : listaMultiplicacion) {
            resultado *= num;
        }
        return resultado;
    }

    /**
     * Realiza una división entre dos números.
     * 
     * @param numerador número que será dividido.
     * @param denominador número por el cual se divide
     * @return resultado de la división como un número decimal.
     */
    public static double division(int numerador, int denominador) {

        /** Convierte a double para obtener el resultado a decimal */
        return (double) numerador / denominador;
    }
}