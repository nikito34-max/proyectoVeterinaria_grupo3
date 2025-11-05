package pkLaboratorio.pkProtista.pkAlgas;
/**
 * Clase que representa un alga genérica dentro del laboratorio biológico.
 * Hereda de Organismo y agrega atributos específicos del grupo de las algas.
 */
public class Alga extends Organismo {

    private String color;
    private boolean esMicroscopica;
    private String habitat;

    /**
     * Constructor de la clase Alga.
     * @param nombreCientifico Nombre científico del alga.
     * @param reino Reino biológico al que pertenece.
     * @param tipoCelula Tipo de célula.
     * @param color Color del alga.
     * @param esMicroscopica Indica si es microscópica.
     * @param habitat Lugar donde habita el alga.
     */
    public Alga(String nombreCientifico, String reino, String tipoCelula,
                String color, boolean esMicroscopica, String habitat) {
        super(nombreCientifico, reino, tipoCelula);
        this.color = color;
        this.esMicroscopica = esMicroscopica;
        this.habitat = habitat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsMicroscopica() {
        return esMicroscopica;
    }

    public void setEsMicroscopica(boolean esMicroscopica) {
        this.esMicroscopica = esMicroscopica;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void analizar() {
        System.out.println("Analizando características generales del alga...");
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nAlga{" +
               "color='" + color + '\'' +
               ", esMicroscopica=" + esMicroscopica +
               ", habitat='" + habitat + '\'' +
               '}';
    }
}

