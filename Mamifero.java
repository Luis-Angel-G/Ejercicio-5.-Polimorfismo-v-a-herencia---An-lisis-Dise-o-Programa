public abstract class Mamifero extends Animal{
    protected int pelaje;   //Corto: 1, largo: 2; grueso:3 y ausente: 4
    protected int crias;
    protected double peso;  //En kg
    protected double esperanza;
    protected double gestacion;
    protected boolean extincion;
    protected int dieta;    //Carnivora: 1 y omnivora: 2
    protected String especie;
    protected int recinto;  //Pequenio: 1, mediano: 2 y grande: 3
    protected int tamanio;  //Pequenio: 1, mediano: 2 y grande: 3
    
    public Mamifero(int pelaje, int crias, double peso, double esperanza, double gestacion, boolean extincion,
            int dieta, String especie, int recinto, int tamanio) {
        super(nombrec, habitat, esperanza);
        this.pelaje = pelaje;
        this.crias = crias;
        this.peso = peso;
        this.esperanza = esperanza;
        this.gestacion = gestacion;
        this.extincion = extincion;
        this.dieta = dieta;
        this.especie = especie;
        this.recinto = recinto;
        this.tamanio = tamanio;
    }
}