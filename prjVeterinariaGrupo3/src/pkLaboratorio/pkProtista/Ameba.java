package pkLaboratorio.pkProtista;

public class Ameba extends ReinoProtista {
    public Ameba(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " realiza fagocitosis para alimentarse.");
    }

    public void moverseHacia(ReinoProtista otro) {
        System.out.println(getNombre() + " se mueve lentamente hacia " + otro.getNombre() + ".");
    }
}
