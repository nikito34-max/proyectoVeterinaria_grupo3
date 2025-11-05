package pkLaboratorio.pkProtista;

public class Volvox extends ReinoProtista {
    public Volvox(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " obtiene energía mediante fotosíntesis colectiva.");
    }

    public void reproducirse() {
        System.out.println(getNombre() + " se reproduce formando colonias hijas dentro de la colonia madre.");
    }
}
