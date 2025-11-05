package pkLaboratorio.pkProtista;

public class Euglena extends ReinoProtista {
    public Euglena(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " absorbe nutrientes del medio.");
    }

    public void fotosintetizar() {
        System.out.println(getNombre() + " realiza fotosíntesis usando su cloroplasto.");
    }

    public void interactuarCon(ReinoProtista otro) {
        System.out.println(getNombre() + " se desplaza hacia " + otro.getNombre() + " por fototaxis.");
    }
}
