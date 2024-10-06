public abstract class Mamifero extends Animal{
    protected int pelaje;   //Corto: 1, largo: 2; grueso:3 y ausente: 4
    protected int crias;
    protected double peso;  //En kg
    protected double gestacion;
    protected boolean extincion;
    protected int dieta;    //Carnivora: 1 y omnivora: 2
    protected String especie;
    protected int recinto;  //Pequenio: 1, mediano: 2 y grande: 3
    protected int tamanio;  //Pequenio: 1, mediano: 2 y grande: 3

    public Mamifero(String nombrec, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
            int dieta, String especie, int recinto, int tamanio) {
        super(nombrec, habitat, esperanza);
        this.pelaje = pelaje;
        this.crias = crias;
        this.peso = peso;
        this.gestacion = gestacion;
        this.extincion = extincion;
        this.dieta = dieta;
        this.especie = especie;
        this.recinto = recinto;
        this.tamanio = tamanio;
    }

    public int getPelaje() {
        return pelaje;
    }

    public void setPelaje(int pelaje) {
        this.pelaje = pelaje;
    }

    public int getCrias() {
        return crias;
    }

    public void setCrias(int crias) {
        this.crias = crias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getGestacion() {
        return gestacion;
    }

    public void setGestacion(double gestacion) {
        this.gestacion = gestacion;
    }

    public boolean isExtincion() {
        return extincion;
    }

    public void setExtincion(boolean extincion) {
        this.extincion = extincion;
    }

    public int getDieta() {
        return dieta;
    }

    public void setDieta(int dieta) {
        this.dieta = dieta;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getRecinto() {
        return recinto;
    }

    public void setRecinto(int recinto) {
        this.recinto = recinto;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        String tpelaje = "";
        
        return super.toString() + "Mamifero [pelaje=" + pelaje + ", crias=" + crias + ", peso=" + peso + ", gestacion=" + gestacion
                + ", extincion=" + extincion + ", dieta=" + dieta + ", especie=" + especie + ", recinto=" + recinto
                + ", tamanio=" + tamanio + "]";
    }
}