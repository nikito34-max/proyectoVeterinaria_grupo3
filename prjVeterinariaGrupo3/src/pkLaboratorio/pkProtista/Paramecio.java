package pkLaboratorio.pkProtista;

public class Paramecio extends ReinoProtista {
    public Paramecio(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " usa cilios para atraer alimento hacia su boca celular.");
    }

    public void interactuarCon(ReinoProtista otro) {
        System.out.println(getNombre() + " comparte nutrientes con " + otro.getNombre() + ".");
    }
}
