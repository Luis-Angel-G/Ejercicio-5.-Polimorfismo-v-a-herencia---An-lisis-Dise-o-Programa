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
                System.out.println("Seleccione que tipo de mamifero es el del intercambio");
                System.out.println("1. Felino");
                System.out.println("2. Primate");
                System.out.println("Ingrese alguna opcion");
                int opcion1 = teclado.nextInt();
                teclado.nextLine();
                switch (opcion1) {
                    case 1:
                        System.out.println("Ingrese el nombre cientifico");
                        String nombrec = teclado.nextLine();
                        System.out.println("Ingrese la descripción del habitat");
                        String habitat = teclado.nextLine();
                        System.out.println("Ingrese la esperanza de vida en anios");
                        double esperanza = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.println("Ingrese el numero del tipo de pelaje que tiene:\n1. Corto\n2. Largo\n3. Grueso\n4. Ausente");
                        int pel = teclado.nextInt();
                        teclado.nextLine();
                        int pelaje;
                        if(pel > 0 && pel < 5){
                            pelaje = pel;
                        }
                        else{
                            System.out.println("Opcion no valida. Intente de nuevo");
                            break;
                        }
                        System.out.println("Ingrese el numero de crias en promedio");
                        int crias = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingrese el peso en kg:");
                        double peso = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.println("Ingrese el tiempo de gestacion en meses");
                        double gestacion = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.println("Seleccione si esta en peligro de extincion");
                        System.out.println("1. Esta en peligro de extincion");
                        System.out.println("2. No esta en peligro de extincion");
                        int opcion2 = teclado.nextInt();
                        teclado.nextLine();
                        boolean extincion;
                        switch (opcion2) {
                            case 1:
                                extincion = true;
                                break;
                            case 2:
                                extincion = false;
                                break;
                            default:
                                System.out.println("Opcion no valida. Intente de nuevo.");
                                break;
                        }
                        System.out.println("Ingrese el numero de tipo de dieta tiene:\n1. Carnivora\n2. Omnivora");
                        int diet = teclado.nextInt();
                        teclado.nextLine();
                        int dieta;
                        if(diet == 1 || diet == 2){
                            dieta = diet;
                        }
                        else{
                            System.out.println("Opcion no valida. Intente de nuevo");
                            break;
                        }
                        System.out.println("Ingrese el costo de la dieta por g");
                        double costodieta = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.println("Ingrese de que especie es");
                        String especie = teclado.nextLine();
                        System.out.println("Ingrese el numero del tamanio que tiene:\n1. Pequenio\n2. Mediano\n3. Grande")
                        int taman = teclado.nextInt();
                        teclado.nextLine();
                        int tamanio;
                        if(taman == 1 || taman == 2 || taman == 3){
                            tamanio = taman;
                        }
                        else{
                            System.out.println("Opcion no valida. Intente de nuevo");
                            break;
                        }
                        System.out.println("Ingrese el tamanio de la cola en cm");
                        double cola = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.println("Ingrese el color");
                        String color = teclado.nextLine();
                        System.out.println("Ingrese la velocidad maxima en m/s");
                        double velocidad = teclado.nextDouble();
                        teclado.nextLine();
                        gestion.crearFelino(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, recinto, tamanio, cola, color, velocidad);
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Opcion no valida. Intente de nuevo.");
                        break;
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
                break;
        }
    }
}