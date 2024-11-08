import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>Class:</b> RegistroOperaciones <br>
 * <b>Description:</b> 
 * <p>  Clase que permite registrar y almacenar las operaciones realizadas en la aplicación. </p>
 *
 * @autor Mahonrri Nazir Sastré De La Cadena
 * @mail mnsastrec@desarrollo-ultrasist.com.mx
 * 
 * @created 7 de noviembre del 2024
 * @version 1.0
 * @category Registro de operaciones.
 */

public class RegistroOperaciones {

    /** Lista que almacenará las descripciones de las operaciones realizadas. */
    private static final List<String> operacionesRealizadas = new ArrayList<>();

    /**
     * Registra una operación realizada agregándola a la lista.
     * 
     * @param descripcion Descripción de la operación realizada.
     */
    public static void registrarOperacion(String descripcion) {
        operacionesRealizadas.add(descripcion);
    }

    /**
     * Genera un archivo de texto con todas las operaciones registradas durante el uso de la aplicación.
     * 
     */
    public static void generarReporte() {

        /** Intenta escribir el reporte en un archivo de texto. */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("reporte_operaciones.txt"))) {

            /** Escribe el encabezado del reporte. */
            writer.write("Reporte de operaciones realizadas:\n");
            writer.write("-------------------------------\n");
            for (String operacion : operacionesRealizadas) {
                writer.write(operacion + "\n");
            }
            
            /** Mensaje de que el reporte se generó exitosamente */
            System.out.println("Reporte generado exitosamente en reporte_operaciones.txt.");
        } catch (IOException e) {
            System.out.println("Error al generar el reporte: " + e.getMessage());
        }
    }
}