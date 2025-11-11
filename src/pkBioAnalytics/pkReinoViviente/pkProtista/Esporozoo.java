package pkBioAnalytics.pkReinoViviente.pkProtista;

public class Esporozoo extends Protozoo {
    private boolean esParasito;

    public Esporozoo() {
        super();
        // Por definición, los esporozoos son parásitos
        this.setEsParasito(true); 
    }

    public Esporozoo(String nombre) {
        super();
        this.setNombre(nombre);
        this.setEsParasito(true);
    }

    public void mover() {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " ya no puede moverse porque está muerto.");
            return;
        }
        System.out.println(this.getNombre() + " no posee estructuras de locomoción; se desplaza pasivamente (ej. en la sangre del huésped).");
    }

    public void descansar(int horas) {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede descansar porque está muerto.");
            return;
        }
        System.out.println(this.getNombre() + " entra en fase de reposo dentro de la célula huésped durante " + horas + " horas.");
    }

    // Método específico de Esporozoo
    public void infectar() {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede infectar porque está muerto.");
            return;
        }
        if (this.esParasito) {
            System.out.println(this.getNombre() + " está buscando una célula huésped para invadir.");
        } else {
            System.out.println(this.getNombre() + " no es una forma parasitaria en este momento.");
        }
    }

    public boolean isEsParasito() {
        return esParasito;
    }

    public void setEsParasito(boolean esParasito) {
        this.esParasito = esParasito;
    }
}
