package pkLaboratorio.pkProtista.pkAlgas;

// Asumo que la clase Alga existe en el mismo paquete o es importada
// y que Alga extiende Organismo (basado en el @Override de analizar)

public class Chlorophyta extends Alga {

    private String pigmentosDominantes;
    private String sustanciaReserva;
    private String formaCuerpo; // Ej. Unicelular, Filamentosa, Colonial, Multicelular

    /**
     * Constructor de la clase Chlorophyta.
     * @param nombreCientifico Nombre científico del filo.
     * @param reino Reino biológico.
     * @param tipoCelula Tipo de célula.
     * @param color Color característico (usualmente verde).
     * @param esMicroscopica Indica si predominan formas microscópicas.
     * @param habitat Hábitat donde se encuentra.
     * @param pigmentosDominantes Pigmentos fotosintéticos principales.
     * @param sustanciaReserva Sustancia de reserva de energía.
     * @param formaCuerpo Morfología o forma del cuerpo predominante.
     */
    public Chlorophyta(String nombreCientifico, String reino, String tipoCelula,
                       String color, boolean esMicroscopica, String habitat,
                       String pigmentosDominantes, String sustanciaReserva, String formaCuerpo) {
        super(nombreCientifico, reino, tipoCelula, color, esMicroscopica, habitat);
        this.pigmentosDominantes = pigmentosDominantes;
        this.sustanciaReserva = sustanciaReserva;
        this.formaCuerpo = formaCuerpo;
    }

    public String getPigmentosDominantes() {
        return pigmentosDominantes;
    }

    public void setPigmentosDominantes(String pigmentosDominantes) {
        this.pigmentosDominantes = pigmentosDominantes;
    }

    public String getSustanciaReserva() {
        return sustanciaReserva;
    }

    public void setSustanciaReserva(String sustanciaReserva) {
        this.sustanciaReserva = sustanciaReserva;
    }

    public String getFormaCuerpo() {
        return formaCuerpo;
    }

    public void setFormaCuerpo(String formaCuerpo) {
        this.formaCuerpo = formaCuerpo;
    }

    /**
     * Implementación del método abstracto de la clase Organismo.
     * Muestra la información del filo Chlorophyta durante el análisis.
     */
    @Override
    public void analizar() {
        System.out.println("Analizando las características del filo Chlorophyta...");
        System.out.println("Pigmentos dominantes: " + pigmentosDominantes);
        System.out.println("Sustancia de reserva: " + sustanciaReserva);
        System.out.println("Morfología principal: " + formaCuerpo);
        System.out.println("Hábitat común: " + getHabitat());
        System.out.println("Color característico: " + getColor());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nChlorophyta{" +
                "pigmentosDominantes='" + pigmentosDominantes + '\'' +
                ", sustanciaReserva='" + sustanciaReserva + '\'' +
                ", formaCuerpo='" + formaCuerpo + '\'' +
                '}';
    }
}
