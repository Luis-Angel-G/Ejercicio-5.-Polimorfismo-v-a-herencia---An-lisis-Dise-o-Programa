public abstract class Animal{
    protected String nombrec;
    protected String habitat;
    protected double esperanza;
    
    public Animal(String nombrec, String habitat, double esperanza) {
        this.nombrec = nombrec;
        this.habitat = habitat;
        this.esperanza = esperanza;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getEsperanza() {
        return esperanza;
    }

    public void setEsperanza(double esperanza) {
        this.esperanza = esperanza;
    }

    @Override
    public String toString() {
        return "Nombre cientifico: " + nombrec + ", descripcion del habitat: " + habitat + ", esperanza de vida: " + esperanza;
    }
}