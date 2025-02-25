import java.util.Scanner;

public class DriverProgram{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Gestion gestion = new Gestion();
        boolean continuar = true;
        String nombrec;
        String habitat;
        double esperanza;
        int pel;
        int pelaje;
        int crias;
        double peso;
        double gestacion;
        int opcion2;
        boolean extincion = false;
        int diet;
        int dieta;
        double costodieta;
        String especie;
        int taman;
        int tamanio;
        double presupuesto;
        int drecinto;
        double precior = 0.0;
        double gastot;
        double restante;
        int aceptar;
        String animalm;
        int r;
        double costo;
        int opcion6;
        int re = 3;

        while (continuar){
            System.out.println("Menu");
            System.out.println("1. Informacion de intercambio");
            System.out.println("2. Informacion de animales del mismo nombre cientifico");
            System.out.println("3. Recibir ejemplar");
            System.out.println("4. Modificar informacion de un animal");
            System.out.println("5. Eliminar animal");
            System.out.println("6. Enviar animal");
            System.out.println("7. Salir");
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
                            nombrec = teclado.nextLine();
                            System.out.println("Ingrese la descripcion del habitat");
                            habitat = teclado.nextLine();
                            System.out.println("Ingrese la esperanza de vida en anios");
                            esperanza = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el numero del tipo de pelaje que tiene:\n1. Corto\n2. Largo\n3. Grueso\n4. Ausente");
                            pel = teclado.nextInt();
                            teclado.nextLine();
                            if(pel > 0 && pel < 5){
                                pelaje = pel;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el numero de crias en promedio");
                            crias = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese el peso en kg:");
                            peso = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el tiempo de gestacion en meses");
                            gestacion = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Seleccione si esta en peligro de extincion");
                            System.out.println("1. Esta en peligro de extincion");
                            System.out.println("2. No esta en peligro de extincion");
                            opcion2 = teclado.nextInt();
                            teclado.nextLine();
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
                            diet = teclado.nextInt();
                            teclado.nextLine();
                            if(diet == 1 || diet == 2){
                                dieta = diet;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el costo de la dieta por g");
                            costodieta = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese de que especie es");
                            especie = teclado.nextLine();
                            System.out.println("Ingrese el numero del tamanio que tiene:\n1. Pequenio\n2. Mediano\n3. Grande");
                            taman = teclado.nextInt();
                            teclado.nextLine();
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
                            System.out.println(gestion.crearFelino(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, cola, color, velocidad));
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre cientifico");
                            nombrec = teclado.nextLine();
                            System.out.println("Ingrese la descripcion del habitat");
                            habitat = teclado.nextLine();
                            System.out.println("Ingrese la esperanza de vida en anios");
                            esperanza = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el numero del tipo de pelaje que tiene:\n1. Corto\n2. Largo\n3. Grueso\n4. Ausente");
                            pel = teclado.nextInt();
                            teclado.nextLine();
                            if(pel > 0 && pel < 5){
                                pelaje = pel;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el numero de crias en promedio");
                            crias = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese el peso en kg:");
                            peso = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el tiempo de gestacion en meses");
                            gestacion = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Seleccione si esta en peligro de extincion");
                            System.out.println("1. Esta en peligro de extincion");
                            System.out.println("2. No esta en peligro de extincion");
                            opcion2 = teclado.nextInt();
                            teclado.nextLine();
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
                            diet = teclado.nextInt();
                            teclado.nextLine();
                            if(diet == 1 || diet == 2){
                                dieta = diet;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el costo de la dieta por g");
                            costodieta = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese de que especie es");
                            especie = teclado.nextLine();
                            System.out.println("Ingrese el numero del tamanio que tiene:\n1. Pequenio\n2. Mediano\n3. Grande");
                            taman = teclado.nextInt();
                            teclado.nextLine();
                            if(taman == 1 || taman == 2 || taman == 3){
                                tamanio = taman;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el numero del tipo de estructura que tiene:\n1. Solitario\n2. Grupal\n3. Familiar\n4. Jerarquico");
                            int estruc = teclado.nextInt();
                            teclado.nextLine();
                            int estructura;
                            if(estruc > 0 && estruc < 5){
                                estructura = estruc;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el nivel de inteligencia del 1 al 100");
                            int intel = teclado.nextInt();
                            teclado.nextLine();
                            int inteligencia;
                            if(intel > 0 && intel < 101){
                                inteligencia = intel;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el peso del cerebro en gramos");
                            double cerebro = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println(gestion.crearPrimate(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, estructura, inteligencia, cerebro));
                            break;
                        default:
                            System.out.println("Opcion no valida. Intente de nuevo.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre cientifico del animal");
                    String nombrecie = teclado.nextLine();
                    System.out.println(gestion.encontrarAnimal(nombrecie));
                    break;
                case 3:
                    System.out.println("Seleccione que tipo de mamifero es el del intercambio");
                    System.out.println("1. Felino");
                    System.out.println("2. Primate");
                    System.out.println("Ingrese alguna opcion");
                    int opcion3 = teclado.nextInt();
                    teclado.nextLine();
                    switch (opcion3) {
                        case 1:
                            System.out.println("Ingrese el nombre cientifico");
                            nombrec = teclado.nextLine();
                            System.out.println("Ingrese la descripcion del habitat");
                            habitat = teclado.nextLine();
                            System.out.println("Ingrese la esperanza de vida en anios");
                            esperanza = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el numero del tipo de pelaje que tiene:\n1. Corto\n2. Largo\n3. Grueso\n4. Ausente");
                            pel = teclado.nextInt();
                            teclado.nextLine();
                            if(pel > 0 && pel < 5){
                                pelaje = pel;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el numero de crias en promedio");
                            crias = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese el peso en kg:");
                            peso = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el tiempo de gestacion en meses");
                            gestacion = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Seleccione si esta en peligro de extincion");
                            System.out.println("1. Esta en peligro de extincion");
                            System.out.println("2. No esta en peligro de extincion");
                            opcion2 = teclado.nextInt();
                            teclado.nextLine();
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
                            diet = teclado.nextInt();
                            teclado.nextLine();
                            if(diet == 1 || diet == 2){
                                dieta = diet;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el costo de la dieta por g");
                            costodieta = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese de que especie es");
                            especie = teclado.nextLine();
                            System.out.println("Ingrese el numero del tamanio que tiene:\n1. Pequenio\n2. Mediano\n3. Grande");
                            taman = teclado.nextInt();
                            teclado.nextLine();
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
                            System.out.println(gestion.crearFelino(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, cola, color, velocidad));
                            System.out.println("Ingrese el presupuesto disponible para el anio");
                            presupuesto = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Tiene recinto disponible?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            drecinto = teclado.nextInt();
                            teclado.nextLine();
                            switch (drecinto) {
                                case 1:
                                    precior = 0.0;
                                    break;
                                case 2:
                                    System.out.println("Ingrese el costo de construir uno");
                                    precior = teclado.nextDouble();
                                    teclado.nextLine();
                                    break;
                                default:
                                    System.out.println("Opcion no valida. Intente de nuevo.");
                                    break;
                            }
                            gastot = gestion.costoFelino(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, cola, color, velocidad) + precior;
                            restante = presupuesto - gastot;
                            if(restante > 0){
                                System.out.println("Tiene condiciones para recibir el animal, si lo acepta su presupuesto sera de: Q." + restante);
                            }
                            else{
                                System.out.println("No tiene condiciones para recibir el animal, el presupuesto no alcanza");
                            }
                            System.out.println("Aceptar animal?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            aceptar = teclado.nextInt();
                            teclado.nextLine();
                            switch (aceptar) {
                                case 1:
                                    System.out.println(gestion.agregarFelino(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, cola, color, velocidad));
                                    break;
                                case 2:
                                    System.out.println("No se agrego el animal.");
                                    break;
                                default:
                                System.out.println("Opcion no valida. Intente de nuevo.");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre cientifico");
                            nombrec = teclado.nextLine();
                            System.out.println("Ingrese la descripcion del habitat");
                            habitat = teclado.nextLine();
                            System.out.println("Ingrese la esperanza de vida en anios");
                            esperanza = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el numero del tipo de pelaje que tiene:\n1. Corto\n2. Largo\n3. Grueso\n4. Ausente");
                            pel = teclado.nextInt();
                            teclado.nextLine();
                            if(pel > 0 && pel < 5){
                                pelaje = pel;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el numero de crias en promedio");
                            crias = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese el peso en kg:");
                            peso = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el tiempo de gestacion en meses");
                            gestacion = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Seleccione si esta en peligro de extincion");
                            System.out.println("1. Esta en peligro de extincion");
                            System.out.println("2. No esta en peligro de extincion");
                            opcion2 = teclado.nextInt();
                            teclado.nextLine();
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
                            diet = teclado.nextInt();
                            teclado.nextLine();
                            if(diet == 1 || diet == 2){
                                dieta = diet;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el costo de la dieta por g");
                            costodieta = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese de que especie es");
                            especie = teclado.nextLine();
                            System.out.println("Ingrese el numero del tamanio que tiene:\n1. Pequenio\n2. Mediano\n3. Grande");
                            taman = teclado.nextInt();
                            teclado.nextLine();
                            if(taman == 1 || taman == 2 || taman == 3){
                                tamanio = taman;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el numero del tipo de estructura que tiene:\n1. Solitario\n2. Grupal\n3. Familiar\n4. Jerarquico");
                            int estruc = teclado.nextInt();
                            teclado.nextLine();
                            int estructura;
                            if(estruc > 0 && estruc < 5){
                                estructura = estruc;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el nivel de inteligencia del 1 al 100");
                            int intel = teclado.nextInt();
                            teclado.nextLine();
                            int inteligencia;
                            if(intel > 0 && intel < 101){
                                inteligencia = intel;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el peso del cerebro en gramos");
                            double cerebro = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println(gestion.crearPrimate(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, estructura, inteligencia, cerebro));
                            System.out.println("Ingrese el presupuesto disponible para el anio");
                            presupuesto = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Tiene recinto disponible?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            drecinto = teclado.nextInt();
                            teclado.nextLine();
                            switch (drecinto) {
                                case 1:
                                    precior = 0.0;
                                    break;
                                case 2:
                                    System.out.println("Ingrese el costo de construir uno");
                                    precior = teclado.nextDouble();
                                    teclado.nextLine();
                                    break;
                                default:
                                    System.out.println("Opcion no valida. Intente de nuevo.");
                                    break;
                            }
                            gastot = gestion.costoPrimate(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, estructura, inteligencia, cerebro) + precior;
                            restante = presupuesto - gastot;
                            if(restante > 0){
                                System.out.println("Tiene condiciones para recibir el animal, si lo acepta su presupuesto sera de: Q." + restante);
                            }
                            else{
                                System.out.println("No tiene condiciones para recibir el animal, el presupuesto no alcanza");
                            }
                            System.out.println("Aceptar animal?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            aceptar = teclado.nextInt();
                            teclado.nextLine();
                            switch (aceptar) {
                                case 1:
                                    System.out.println(gestion.agregarPrimate(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, estructura, inteligencia, cerebro));
                                    break;
                                case 2:
                                    System.out.println("No se agrego el animal.");
                                    break;
                                default:
                                System.out.println("Opcion no valida. Intente de nuevo.");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida. Intente de nuevo.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Seleccione que tipo de mamifero es el que desea modificar");
                    System.out.println("1. Felino");
                    System.out.println("2. Primate");
                    System.out.println("Ingrese alguna opcion");
                    int opcion4 = teclado.nextInt();
                    teclado.nextLine();
                    switch (opcion4) {
                        case 1:
                            System.out.println("Ingrese el nombre cientifico del animal a modificar");
                            animalm = teclado.nextLine();
                            System.out.println("Ingrese el color del animal a modificar");
                            String color = teclado.nextLine();
                            System.out.println("Ingrese la informacion modificada:");
                            System.out.println("Ingrese la descripcion del habitat");
                            habitat = teclado.nextLine();
                            System.out.println("Ingrese la esperanza de vida en anios");
                            esperanza = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el numero del tipo de pelaje que tiene:\n1. Corto\n2. Largo\n3. Grueso\n4. Ausente");
                            pel = teclado.nextInt();
                            teclado.nextLine();
                            if(pel > 0 && pel < 5){
                                pelaje = pel;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el numero de crias en promedio");
                            crias = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese el peso en kg:");
                            peso = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el tiempo de gestacion en meses");
                            gestacion = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Seleccione si esta en peligro de extincion");
                            System.out.println("1. Esta en peligro de extincion");
                            System.out.println("2. No esta en peligro de extincion");
                            opcion2 = teclado.nextInt();
                            teclado.nextLine();
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
                            diet = teclado.nextInt();
                            teclado.nextLine();
                            if(diet == 1 || diet == 2){
                                dieta = diet;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el costo de la dieta por g");
                            costodieta = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese de que especie es");
                            especie = teclado.nextLine();
                            System.out.println("Ingrese el numero del tamanio que tiene:\n1. Pequenio\n2. Mediano\n3. Grande");
                            taman = teclado.nextInt();
                            teclado.nextLine();
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
                            System.out.println("Ingrese la velocidad maxima en m/s");
                            double velocidad = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println(gestion.modificarFelino(animalm, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, cola, color, velocidad));
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre cientifico del animal a modificar");
                            animalm = teclado.nextLine();
                            System.out.println("Ingrese el peso del cerebro en gramos del animal a modificar");
                            double cerebro = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese la informacion modificada:");
                            System.out.println("Ingrese la descripcion del habitat");
                            habitat = teclado.nextLine();
                            System.out.println("Ingrese la esperanza de vida en anios");
                            esperanza = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el numero del tipo de pelaje que tiene:\n1. Corto\n2. Largo\n3. Grueso\n4. Ausente");
                            pel = teclado.nextInt();
                            teclado.nextLine();
                            if(pel > 0 && pel < 5){
                                pelaje = pel;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el numero de crias en promedio");
                            crias = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese el peso en kg:");
                            peso = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el tiempo de gestacion en meses");
                            gestacion = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Seleccione si esta en peligro de extincion");
                            System.out.println("1. Esta en peligro de extincion");
                            System.out.println("2. No esta en peligro de extincion");
                            opcion2 = teclado.nextInt();
                            teclado.nextLine();
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
                            diet = teclado.nextInt();
                            teclado.nextLine();
                            if(diet == 1 || diet == 2){
                                dieta = diet;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el costo de la dieta por g");
                            costodieta = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese de que especie es");
                            especie = teclado.nextLine();
                            System.out.println("Ingrese el numero del tamanio que tiene:\n1. Pequenio\n2. Mediano\n3. Grande");
                            taman = teclado.nextInt();
                            teclado.nextLine();
                            if(taman == 1 || taman == 2 || taman == 3){
                                tamanio = taman;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el numero del tipo de estructura que tiene:\n1. Solitario\n2. Grupal\n3. Familiar\n4. Jerarquico");
                            int estruc = teclado.nextInt();
                            teclado.nextLine();
                            int estructura;
                            if(estruc > 0 && estruc < 5){
                                estructura = estruc;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println("Ingrese el nivel de inteligencia del 1 al 100");
                            int intel = teclado.nextInt();
                            teclado.nextLine();
                            int inteligencia;
                            if(intel > 0 && intel < 101){
                                inteligencia = intel;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo");
                                break;
                            }
                            System.out.println(gestion.crearPrimate(animalm, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, estructura, inteligencia, cerebro));
                            break;
                        default:
                            System.out.println("Opcion no valida. Intente de nuevo.");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el nombre cientifico del animal");
                    String nombreelim = teclado.nextLine();
                    System.out.println(gestion.eliminarAnimal(nombreelim));
                    break;
                case 6:
                    System.out.println("Seleccione que tipo de mamifero es el que desea enviar");
                    System.out.println("1. Felino");
                    System.out.println("2. Primate");
                    System.out.println("Ingrese alguna opcion");
                    int opcion5 = teclado.nextInt();
                    teclado.nextLine();
                    switch (opcion5) {
                        case 1:
                            System.out.println("Ingrese el nombre cientifico del animal a enviar");
                            animalm = teclado.nextLine();
                            System.out.println("Ingrese el color del animal a enviar");
                            String color = teclado.nextLine();
                            System.out.println("Ingrese el numero del recinto de mayor tamanio disponible en el otro zoologico");
                            System.out.println("1. Pequenio");
                            System.out.println("2. Mediano");
                            System.out.println("3. Grande");
                            r = teclado.nextInt();
                            teclado.nextLine();
                            if (r > 0 && r < 4){
                                re = r;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo.");
                                break;
                            }
                            System.out.println("Ingrese el costo del transporte");
                            costo = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println(gestion.requisitoEspacioF(animalm, color, re) + ". El costo del transporte seria de: Q." + costo);
                            System.out.println("Desea enviar animal?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            opcion6 = teclado.nextInt();
                            teclado.nextLine();
                            switch (opcion6) {
                                case 1:
                                System.out.println(gestion.enviarAnimal(animalm));
                                    break;
                                case 2:
                                    System.out.println("No se envio el animal.");
                                    break;
                                default:
                                    System.out.println("Opcion no valida. Intente de nuevo.");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre cientifico del animal a enviar");
                            animalm = teclado.nextLine();
                            System.out.println("Ingrese el peso del cerebro en gramos del animal a enviar");
                            double cerebro = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Ingrese el numero del recinto de mayor tamanio disponible en el otro zoologico");
                            System.out.println("1. Pequenio");
                            System.out.println("2. Mediano");
                            System.out.println("3. Grande");
                            r = teclado.nextInt();
                            teclado.nextLine();
                            if (r > 0 && r < 4){
                                re = r;
                            }
                            else{
                                System.out.println("Opcion no valida. Intente de nuevo.");
                                break;
                            }
                            System.out.println("Ingrese el costo del transporte");
                            costo = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println(gestion.requisitoEspacioP(animalm, cerebro, re) + ". El costo del transporte seria de: Q." + costo);
                            System.out.println("Desea enviar animal?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            opcion6 = teclado.nextInt();
                            teclado.nextLine();
                            switch (opcion6) {
                                case 1:
                                System.out.println(gestion.enviarAnimal(animalm));
                                    break;
                                case 2:
                                    System.out.println("No se envio el animal.");
                                    break;
                                default:
                                    System.out.println("Opcion no valida. Intente de nuevo.");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida. Intente de nuevo.");
                            break;
                    }
                    break;
                case 7:
                    continuar = false;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        }
        teclado.close();
    }
}