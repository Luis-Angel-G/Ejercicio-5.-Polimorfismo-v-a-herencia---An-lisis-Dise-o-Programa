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

    public String encontrarAnimal(String nombrecie){
        String animalencontrado = "";
        for(Animal animal : listaAnimales){
            if(animal.getNombrec().equals(nombrecie)){
                animalencontrado = animalencontrado + "\n" + animal.toString();
            }
            else{
                animalencontrado = "No se encontro al animal en el zoologico";
            }
        }
        return animalencontrado;
    }

    public String modificarFelino(String animalm, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
    int dieta, double costodieta, String especie, int tamanio, double cola, String color, double velocidad){
        String animalmodif = "";
        for(Animal animal : listaAnimales){
            if(animal.getNombrec().equals(animalm)){
                int posicion = listaAnimales.indexOf(animal);
                Felino felinoModificado = new Felino(animalm, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, cola, color, velocidad);
                listaAnimales.add(posicion, felinoModificado);
                animalmodif = "Se ha modificado la informacion del animal";
            }
            else{
                animalmodif = "No se ha encontrado el animal";
            }
        }
        return animalmodif;
    }

    public String modificarPrimate(String animalm, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
    int dieta, double costodieta, String especie, int tamanio, int estructura, int inteligencia, double cerebro){
        String animalmodif = "";
        for(Animal animal : listaAnimales){
            if(animal.getNombrec().equals(animalm)){
                int posicion = listaAnimales.indexOf(animal);
                Primate primateModificado = new Primate(animalm, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio, estructura, inteligencia, cerebro);
                listaAnimales.add(posicion, primateModificado);
                animalmodif = "Se ha modificado la informacion del animal";
            }
            else{
                animalmodif = "No se ha encontrado el animal";
            }
        }
        return animalmodif;
    }

    public String eliminarAnimal(String nombreelim) {
        for (int i = 0; i < listaAnimales.size(); i++) {
            Animal animal = listaAnimales.get(i);
            if (animal.getNombrec().equals(nombreelim)) {
                listaAnimales.remove(i);
                return "Se ha eliminado el animal";
            }
        }
        return "No se ha encontrado al animal";
    }    
}