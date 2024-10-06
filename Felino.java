public class Felino extends Mamifero{
    private double cola;    //En cm
    private String color;
    private double velocidad;

    public Felino(String nombrec, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
    int dieta, String especie, int recinto, int tamanio, double cola, String color, double velocidad) {
        super(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, especie, recinto, tamanio);
        this.cola = cola;
        this.color = color;
        this.velocidad = velocidad;
    }

    public double getCola() {
        return cola;
    }

    public void setCola(double cola) {
        this.cola = cola;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public double calcularComida(){
        double comida = 0.0;
        if(tamanio == 1){
            comida = peso * 0.04;
        }
        else if(tamanio == 2){
            comida = peso * 0.06;
        }
        else if(tamanio == 3){
            comida = peso * 0.08;
        }
        return comida;
    }

    @Override
    public double costoComida(){
        double mescomida =0.0;
        mescomida = comida * 30 * costocomida;
        return mescomida;
    }

    @Override
    public String toString() {
        return super.toString() + " largo de la cola: " + cola + "cm, color: " + color + ", velocidad maxima: " + velocidad + "m/s, comida necesaria al dia: " + calcularComida() + "g, costo de la comida al mes: Q." + costoComida();
    }
}