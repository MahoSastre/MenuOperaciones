import java.util.Scanner;

public class MenuPrincipal {
    
    /** Variable que controla si el programa debe salir o seguir ejecutándose */
    private boolean salirApp = false;

    /**
     * Método principal que inicia el menú de la calculadora.
     * Da la bienvenida al usuario y muestra las opciones repetidamente hasta que decida salir. 
     */
    public void ejecutarMenu() {
        
        /** Objeto para leer la opción del usuario **/
        Scanner opcionSeleccionada = new Scanner(System.in);
        System.out.println("Bienvenido a la Calculadora");
        System.out.println("Presione 'S' en cualquier momento para salir de la aplicación.");

        /** Ciclo que mantiene el menú activo hasta que el usuario decida salir **/
        while (!salirApp) {
            mostrarMenu();
            String opcion = opcionSeleccionada.nextLine().trim();

            /** Llama al método que ejecuta la opción elegida */
            procesarOpcion(opcion);
        }
        /** Cierra el scanner **/
        opcionSeleccionada.close();
    }
    
    /**
     * Muestra el menú principal con las opciones de operaciones.
     */
    private void mostrarMenu() {
        System.out.println("\nMenú principal:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("Presiona 'S' para salir");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Ejecuta la opción seleccionada por el usuario.
     * @param opcionMenu la opción ingresada por el usuario.
     */
    private void procesarOpcion(String opcionMenu) {
        switch (opcionMenu.toLowerCase()) {
            case "1" -> Suma.operacionSuma();
            case "2" -> Resta.operacionResta();
            case "3" -> Multiplicacion.operacionMultiplicacion();
            case "4" -> Division.operacionDivision();
            case "s" -> {
                salirApp = true;
                System.out.println("Saliendo del programa...");
            }
            /** Mensaje en caso de que el usuario ingrese algo que no esté en el menú. */
            default -> System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    }
}

