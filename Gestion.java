import java.util.ArrayList;

public class Gestion{
    private ArrayList<Animal> listaAnimales = new ArrayList<>();

    public String crearFelino(String nombrec, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
    int dieta, double costodieta, String especie, int tamanio, double cola, String color, double velocidad){
        Felino nuevoFelino = new Felino(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, cola, color, velocidad);
        return nuevoFelino.toString();
    }

    public String crearPrimate(String nombrec, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
    int dieta, double costodieta, String especie, int tamanio, int estructura, int inteligencia, double cerebro){
        Primate nuevoPrimate = new Primate(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, estructura, inteligencia, cerebro);
        return nuevoPrimate.toString();
    }

    public double costoFelino(String nombrec, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
    int dieta, double costodieta, String especie, int tamanio, double cola, String color, double velocidad){
        Felino nuevoFelino = new Felino(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, cola, color, velocidad);
        return nuevoFelino.costoTotal() * 12;
    }

    public double costoPrimate(String nombrec, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
    int dieta, double costodieta, String especie, int tamanio, int estructura, int inteligencia, double cerebro){
        Primate nuevoPrimate = new Primate(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, estructura, inteligencia, cerebro);
        return nuevoPrimate.costoTotal() * 12;
    }

    public String agregarFelino(String nombrec, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
    int dieta, double costodieta, String especie, int tamanio, double cola, String color, double velocidad){
        Felino nuevoFelino = new Felino(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, cola, color, velocidad);
        listaAnimales.add(nuevoFelino);
        return "Se agrego el animal correctamente.";
    }

    public String agregarPrimate(String nombrec, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
    int dieta, double costodieta, String especie, int tamanio, int estructura, int inteligencia, double cerebro){
        Primate nuevoPrimate = new Primate(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, estructura, inteligencia, cerebro);
        listaAnimales.add(nuevoPrimate);
        return "Se agrego el animal correctamente.";
    }

    public String encontrarAnimal(String nombrecie) {
        String animalencontrado = "";
        boolean encontrado = false; 
        for (Animal animal : listaAnimales) {
            if (animal.getNombrec().equalsIgnoreCase(nombrecie)) {
                animalencontrado = animalencontrado + "\n" + animal.toString();
                encontrado = true;
            }
        }
        if (!encontrado) {
            animalencontrado = "No se encontro al animal en el zoologico";
        }
        return animalencontrado;
    }

    public String modificarFelino(String animalm, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
    int dieta, double costodieta, String especie, int tamanio, double cola, String color, double velocidad) {
        for (int i = 0; i < listaAnimales.size(); i++) {
            Animal anima = listaAnimales.get(i);
            Felino animal = (Felino) anima;
            if (animal.getNombrec().equalsIgnoreCase(animalm) && animal.getColor().equalsIgnoreCase(color)) {
                Felino felinoModificado = new Felino(animalm, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, cola, color, velocidad);
                listaAnimales.set(i, felinoModificado);
                return "Se ha modificado la informacion del animal";
            }
        }
        return "No se ha encontrado el animal";
    }

    public String modificarPrimate(String animalm, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
    int dieta, double costodieta, String especie, int tamanio, int estructura, int inteligencia, double cerebro) {
        for (int i = 0; i < listaAnimales.size(); i++) {
            Animal anima = listaAnimales.get(i);
            Primate animal =(Primate) anima;
            if (animal.getNombrec().equalsIgnoreCase(animalm) && animal.getCerebro() == cerebro) {
                Primate primateModificado = new Primate(animalm, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, estructura, inteligencia, cerebro);
                listaAnimales.set(i, primateModificado);
                return "Se ha modificado la informacion del animal";
            }
        }
        return "No se ha encontrado el animal";
    }

    public String eliminarAnimal(String nombreelim) {
        for (int i = 0; i < listaAnimales.size(); i++) {
            Animal animal = listaAnimales.get(i);
            if (animal.getNombrec().equalsIgnoreCase(nombreelim)) {
                listaAnimales.remove(i);
                return "Se ha eliminado el animal";
            }
        }
        return "No se ha encontrado al animal";
    }

    public String requisitoEspacioF(String animalm, String color, int r){
        String req = "";
        for (int i = 0; i < listaAnimales.size(); i++){
            Animal anima = listaAnimales.get(i);
            Felino animal = (Felino) anima;
            if (animal.getNombrec().equals(animalm) && animal.getColor().equals(color)){
                int recinto = animal.getRecinto();
                if (recinto == 1 && recinto <= r){
                    req = "Se requiere de un recinto pequenio o superior. El otro zoologico tiene las condiciones necesarias para recibir el animal.";
                }
                else if (recinto == 1 && recinto > r){
                    req = "Se requiere de un recinto pequenio o superior. El otro zoologico no tiene las condiciones necesarias para recibir el animal";
                }
                else if (recinto == 2 && recinto <= r){
                    req = "Se requiere de un recinto mediano o superior. El otro zoologico tiene las condiciones necesarias para recibir el animal.";
                }
                else if (recinto == 2 && recinto > r){
                    req = "Se requiere de un recinto mediano o superior. El otro zoologico no tiene las condiciones necesarias para recibir el animal";
                }
                else{
                    req = "No se encontro el animal.";
                }
            }
        }
        return req;
    }

    public String requisitoEspacioP(String animalm, double cerebro, int r){
        String req = "";
        for (int i = 0; i < listaAnimales.size(); i++){
            Animal anima = listaAnimales.get(i);
            Primate animal = (Primate) anima;
            if (animal.getNombrec().equals(animalm) && animal.getCerebro() == cerebro){
                int recinto = animal.getRecinto();
                if (recinto == 1 && recinto <= r){
                    req = "Se requiere de un recinto pequenio o superior. El otro zoologico tiene las condiciones necesarias para recibir el animal.";
                }
                else if (recinto == 1 && recinto > r){
                    req = "Se requiere de un recinto pequenio o superior. El otro zoologico no tiene las condiciones necesarias para recibir el animal";
                }
                else if (recinto == 2 && recinto <= r){
                    req = "Se requiere de un recinto mediano o superior. El otro zoologico tiene las condiciones necesarias para recibir el animal.";
                }
                else if (recinto == 2 && recinto > r){
                    req = "Se requiere de un recinto mediano o superior. El otro zoologico no tiene las condiciones necesarias para recibir el animal";
                }
                else req = "No se encontro el animal";
            }
        }
        return req;
    }

    public String enviarAnimal(String nombreelim) {
        for (int i = 0; i < listaAnimales.size(); i++) {
            Animal animal = listaAnimales.get(i);
            if (animal.getNombrec().equalsIgnoreCase(nombreelim)) {
                listaAnimales.remove(i);
                return "Se ha enviado el animal";
            }
        }
        return "No se ha enviado el animal";
    }
}