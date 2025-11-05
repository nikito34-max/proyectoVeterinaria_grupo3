package pkLaboratorio.pkHumano;

public class Estudiante {
    private String id;
    private String nombre;
    private String apellido;

    public Estudiante(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() { return nombre + " " + apellido; }
}
