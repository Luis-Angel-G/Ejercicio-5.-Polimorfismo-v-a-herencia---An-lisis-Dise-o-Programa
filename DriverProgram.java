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
                        System.out.println("Ingrese la esperanza de vida en anios:");
                        double esperanza = teclado.nextDouble();
                        System.out.println("Ingrese el numero del tipo de pelaje que tiene:\n1. Corto\n2. Largo\n3. Grueso\n4. Ausente");
                        int pel = teclado.nextInt();
                        if(pel > 0 && pel < 5){
                            int pelaje = pel;
                        }
                        else{
                            System.out.println("Opcion no valida. Intente de nuevo");
                            break;
                        }
                        System.out.println("Ingrese el numero de crias en promedio:");
                        int crias = teclado.nextInt();
                        System.out.println("Ingrese el peso en kg:");
                        double peso = teclado.nextDouble();
                        
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Opcion no valida. Intente de nuevo.");
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                continuar = false;
            default:
                System.out.println("Opcion no valida. Intente de nuevo.");
        }
    }
}