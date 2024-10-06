public abstract class Mamifero extends Animal{
    protected int pelaje;   //Corto: 1, largo: 2; grueso:3 y ausente: 4
    protected int crias;
    protected double peso;  //En kg
    protected double gestacion;
    protected boolean extincion;
    protected int dieta;    //Carnivora: 1 y omnivora: 2
    protected double costodieta;    //Costo por gramo
    protected String especie;
    protected int recinto;  //Pequenio: 1, mediano: 2 y grande: 3
    protected int tamanio;  //Pequenio: 1, mediano: 2 y grande: 3

    public Mamifero(String nombrec, String habitat, double esperanza, int pelaje, int crias, double peso, double gestacion, boolean extincion,
            int dieta, double costodieta, String especie, int recinto, int tamanio) {
        super(nombrec, habitat, esperanza);
        this.pelaje = pelaje;
        this.crias = crias;
        this.peso = peso;
        this.gestacion = gestacion;
        this.extincion = extincion;
        this.dieta = dieta;
        this.costodieta = costodieta;
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

    public double getCostodieta() {
        return costodieta;
    }
    
    public void setCostodieta(double costodieta) {
        this.costodieta = costodieta;
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

    public void setRecinto() {
        if(tamanio == 1){
            this.recinto = 1;
        }
        else if(tamanio == 2 || tamanio == 3){
            this.recinto = 2;
        }
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int mantenerRecinto(){
        int mesrecinto = 0;
        if(recinto == 1){
            mesrecinto = 100 * 30;
        }
        else{
            mesrecinto = 250 * 30;
        }
        return mesrecinto;
    }

    public abstract double costoComida();
    public abstract double costoTotal();

    @Override
    public String toString() {
        String tpelaje = "";
        String eextincion = "";
        String tdieta = "";
        String trecinto = "";
        String ttamanio = "";
        if(pelaje == 1){
            tpelaje = "corto";
        }
        else if(pelaje == 2){
            tpelaje = "largo";
        }
        else if(pelaje == 3){
            tpelaje = "grueso";
        }
        else if(pelaje == 4){
            tpelaje = "ausente";
        }
        if(extincion){
            eextincion = "esta en peligro de extincion";
        }
        else{
            eextincion = "no esta en peligro de extincion";
        }
        if(dieta == 1){
            tdieta = "carnivora";
        }
        else if (dieta == 2){
            tdieta = "omnivora";
        }
        if(recinto == 1){
            trecinto = "pequeño, de 50 metros cuadrados";
        }
        else{
            trecinto = "mediano, de 150 metros cuadrados";
        }
        if(tamanio == 1){
            ttamanio = "pequeño";
        }
        else if(tamanio == 2){
            ttamanio = "mediano";
        }
        else if(tamanio == 3){
            ttamanio = "grande";
        }
        return super.toString() + " tipo de pelaje: " + tpelaje + ", numero de crias: " + crias + ", peso: " + peso + " kg, tiempo de gestacion: " + gestacion
                + eextincion + " meses, tipo de dieta: " + tdieta + "costo de la dieta por gramo: Q." + costodieta + ", especie: " + especie + ", recinto " + trecinto
                + ", tamanio: " + ttamanio;
    }
}