package pkBioAnalytics.pkReinoViviente.pkProtista;

public class Rizopodo extends Protozoo {
    private Double tamanio;

    public Rizopodo() {
        super();
        this.setTamanio(0.0);
    }
    public Rizopodo(String nombre, double tamanio) {
        super();
        this.setNombre(nombre);
        this.setTamanio(tamanio);
    }

   public void mover() {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " ya no puede moverse porque está muerto.");
            return;
        }
        System.out.println(this.getNombre() + " se mueve extendiendo sus pseudópodos.");
    }

    public void descansar(int horas) {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede descansar porque está muerto.");
            return;
        }
        System.out.println(this.getNombre() + " reposa en el fondo del agua durante " + horas + " horas.");
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }
}
