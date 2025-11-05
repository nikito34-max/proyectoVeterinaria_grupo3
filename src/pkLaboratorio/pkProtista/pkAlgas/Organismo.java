package pkLaboratorio.pkProtista.pkAlgas;
/**
 * Clase abstracta base que representa un organismo biológico genérico.
 * Define los atributos y comportamientos comunes a todos los organismos.
 */
public abstract class Organismo {

    private String nombreCientifico;
    private String reino;
    private String tipoCelula;

    /**
     * Constructor de la clase Organismo.
     * @param nombreCientifico Nombre científico del organismo.
     * @param reino Reino biológico al que pertenece.
     * @param tipoCelula Tipo de célula (Procarionte o Eucarionte).
     */
    public Organismo(String nombreCientifico, String reino, String tipoCelula) {
        this.nombreCientifico = nombreCientifico;
        this.reino = reino;
        this.tipoCelula = tipoCelula;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getTipoCelula() {
        return tipoCelula;
    }

    public void setTipoCelula(String tipoCelula) {
        this.tipoCelula = tipoCelula;
    }

    /**
     * Método abstracto que define el proceso de análisis del organismo.
     * Debe ser implementado por las subclases.
     */
    public abstract void analizar();

    @Override
    public String toString() {
        return "Organismo{" +
               "nombreCientifico='" + nombreCientifico + '\'' +
               ", reino='" + reino + '\'' +
               ", tipoCelula='" + tipoCelula + '\'' +
               '}';
    }
}

