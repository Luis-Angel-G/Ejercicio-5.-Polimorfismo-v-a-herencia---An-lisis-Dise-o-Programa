import java.util.Scanner;

public class DriverProgram{
    Scanner teclado = new Scanner(System.in);
    Gestion gestion = new Gestion();
    boolean continuar = true;

    while (continuar){
        System.out.println("Menu");
        System.out.println("1. Informacion de intercambio");
        System.out.println("2. Informacion de algun animal");
        System.out.println("3. Recibir ejemplar");
        System.out.println("4. Salir");
        System.out.println("Ingrese alguna opcion");
        int opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Seleccione que tipo de mamífero es el del intercambio");
                System.out.println("1. Felino");
                System.out.println("2. Primate");
                System.out.println("Ingrese alguna opcion");
                int opcion1 = teclado.nextInt();
                teclado.nextLine();
                switch (opcion1) {
                    case 1:
                        System.out.println("Ingrese el nombre cientifico:");
                        String nombrec = teclado.nextLine();
                        System.out.println("Ingrese la descripción del habitat:");
                        String habitat = teclado.nextLine();
                        System.out.println("Ingrese la esperanza de vida en años:")
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                continuar = false;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }
}