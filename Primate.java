public class Primate extends Mamifero{
    private int estructura; //Solitario: 1, grupal: 2, familiar: 3 y jerarquico: 4
    private int inteligencia;   //Del 1 al 100
    private double cerebro; //En g

    public Primate(String nombrec, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
    int dieta, double costodieta, String especie, int tamanio, int estructura, int inteligencia, double cerebro) {
        super(nombrec, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, costodieta, especie, tamanio);
        this.estructura = estructura;
        this.inteligencia = inteligencia;
        this.cerebro = cerebro;
    }

    public int getEstructura() {
        return estructura;
    }

    public void setEstructura(int estructura) {
        this.estructura = estructura;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getCerebro() {
        return cerebro;
    }

    public void setCerebro(double cerebro) {
        this.cerebro = cerebro;
    }

    @Override
    public double calcularComida(){
        double comida = 0.0;
        if(tamanio == 1 || tamanio ==2){
            comida = peso * 0.05;
        }
        else if(tamanio == 3){
            comida = peso * 0.03;
        }
        return comida;
    }

    @Override
    public double costoComida(){
        double mescomida = 0.0;
        mescomida = calcularComida() * 30 * costodieta;
        return mescomida;
    }

    @Override
    public double costoTotal(){
        double mestotal = 0.0;
        mestotal = mantenerRecinto() + costoComida();
        return mestotal;
    }

    @Override
    public String toString() {
        String testructura = "";
        if(estructura == 1){
            testructura = "solitario";
        }
        else if(estructura == 2){
            testructura = "grupal";
        }
        else if(estructura == 3){
            testructura = "familiar";
        }
        else if(estructura == 4){
            testructura = "jerarquico";
        }
        return super.toString() + " estructura: " + testructura + ", nivel de inteligencia: " + inteligencia + ", peso del cerebro: " + cerebro + " g, comida necesaria al dia: " + calcularComida() + "g, costo de la comida al mes: Q." + costoComida() + " costo total al mes: Q." + costoTotal();
    }
}