package pkLaboratorio.pkProtista.pkAlgas;

public class Volvox extends Alga {

    private double diametro;
    private String tipoReproduccion;
    private int cantidadCelulas;

    /**
     * Constructor de la clase Volvox.
     * @param nombreCientifico Nombre científico del organismo.
     * @param reino Reino biológico.
     * @param tipoCelula Tipo de célula.
     * @param color Color característico del alga.
     * @param esMicroscopica Indica si es microscópica.
     * @param habitat Hábitat donde se encuentra.
     * @param diametro Diámetro aproximado en micrómetros.
     * @param tipoReproduccion Tipo de reproducción (asexual o sexual).
     * @param cantidadCelulas Número de células en la colonia.
     */
    public Volvox(String nombreCientifico, String reino, String tipoCelula,
                  String color, boolean esMicroscopica, String habitat,
                  double diametro, String tipoReproduccion, int cantidadCelulas) {
        super(nombreCientifico, reino, tipoCelula, color, esMicroscopica, habitat);
        this.diametro = diametro;
        this.tipoReproduccion = tipoReproduccion;
        this.cantidadCelulas = cantidadCelulas;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public int getCantidadCelulas() {
        return cantidadCelulas;
    }

    public void setCantidadCelulas(int cantidadCelulas) {
        this.cantidadCelulas = cantidadCelulas;
    }

    /**
     * Implementación del método abstracto de la clase Organismo.
     * Muestra la información del Volvox durante el análisis.
     */
    @Override
    public void analizar() {
        System.out.println("Analizando el Volvox bajo el microscopio...");
        System.out.println("Diámetro: " + diametro + " micrometros");
        System.out.println("Tipo de reproducción: " + tipoReproduccion);
        System.out.println("Cantidad de células: " + cantidadCelulas);
        System.out.println("Hábitat: " + getHabitat());
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nVolvox{" +
               "diámetro=" + diametro +
               ", tipoReproducción='" + tipoReproduccion + '\'' +
               ", cantidadCélulas=" + cantidadCelulas +
               '}';
    }
}
