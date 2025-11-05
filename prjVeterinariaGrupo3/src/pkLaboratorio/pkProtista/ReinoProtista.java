package pkLaboratorio.pkProtista;

public abstract class ReinoProtista {
    private String nombre;

    public ReinoProtista(String nombre) {
        this.nombre = nombre;
    }

    public abstract void alimentarse();

    public String getNombre() {
        return nombre;
    }
}
