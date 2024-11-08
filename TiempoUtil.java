/**
 * <b>Class:</b> TiempoUtil <br>
 * <b>Description:</b>
 * <p> Esta clase gestiona los temporizadores para medir el tiempo de ejecución de la aplicación y de cada operación. </p>
 *
 * @author Mahonrri Nazir Sastré De La Cadena
 * @email mnsastrec@desarrollo-ultrasist.com.mx
 * 
 * @created 7 de noviembre del 2024
 * @version 1.0
 * @category Utilidades
 */

public class TiempoUtil {

    /** Variables para el tiempo total y por sección */
    private static long tiempoInicioApp;
    private static long tiempoInicioOperacion;
    
    private static long tiempoTotalApp = 0;
    private static long tiempoSuma = 0;
    private static long tiempoResta = 0;
    private static long tiempoMultiplicacion = 0;
    private static long tiempoDivision = 0;
    private static long tiempoMenu = 0;

    /**
     * Inicia el temporizador para el tiempo total de la aplicación.
     * 
     */
    public static void iniciarTemporizadorApp() {
        tiempoInicioApp = System.currentTimeMillis();
    }

    /**
     * Detiene el temporizador de la aplicación y calcula el tiempo total.
     * 
     */
    public static void detenerTemporizadorApp() {
        tiempoTotalApp = System.currentTimeMillis() - tiempoInicioApp;
    }

    /**
     * Inicia el temporizador para una operación específica.
     * 
     */
    public static void iniciarTemporizadorOperacion() {
        tiempoInicioOperacion = System.currentTimeMillis();
    }

    /**
     * Detiene el temporizador de la operación específica y acumula el tiempo.
     * @param operacion Nombre de la operación.
     */
    public static void detenerTemporizadorOperacion(String operacion) {
        long tiempoOperacion = System.currentTimeMillis() - tiempoInicioOperacion;
        switch (operacion.toLowerCase()) {
            case "suma" -> tiempoSuma += tiempoOperacion;
            case "resta" -> tiempoResta += tiempoOperacion;
            case "multiplicacion" -> tiempoMultiplicacion += tiempoOperacion;
            case "division" -> tiempoDivision += tiempoOperacion;
            case "menu" -> tiempoMenu += tiempoOperacion;
        }
    }

    /**
     * Muestra el tiempo total y el tiempo en cada operación.
     */
    public static void mostrarTiempos() {
        System.out.println("Tiempo total en la aplicación: " + formatearTiempo(tiempoTotalApp));
        System.out.println("Tiempo en Suma: " + formatearTiempo(tiempoSuma));
        System.out.println("Tiempo en Resta: " + formatearTiempo(tiempoResta));
        System.out.println("Tiempo en Multiplicación: " + formatearTiempo(tiempoMultiplicacion));
        System.out.println("Tiempo en División: " + formatearTiempo(tiempoDivision));
        System.out.println("Tiempo en el Menú: " + formatearTiempo(tiempoMenu));
    }
    
    /**
     * Convierte el tiempo en milisegundos a un formato de minutos y segundos.
     * 
     * @param tiempoMs Tiempo en milisegundos.
     * @return Cadena con el formato "X minutos Y segundos".
     */
    private static String formatearTiempo(long tiempoMs) {
        long segundosTotales = tiempoMs / 1000;
        long minutos = segundosTotales / 60;
        long segundos = segundosTotales % 60;
        return minutos + " minutos " + segundos + " segundos";
    }
}
