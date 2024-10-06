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
}