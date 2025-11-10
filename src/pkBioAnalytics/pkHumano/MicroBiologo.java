package pkBioAnalytics.pkHumano;

public class MicroBiologo extends Persona {
    private String especialidad;

    public MicroBiologo(String nombre, String apellido, String cedula, String username, String password, String especialidad) {
        super(nombre, apellido, cedula, username, password);
        this.especialidad = especialidad;
    }

    @Override
    public void showInfo() {
        System.out.println("Microbiólogo: " + getNombre() + " " + getApellido() + ", Especialidad: " + this.especialidad);
    }

    public void observar() {
        System.out.println("El microbiólogo " + getNombre() + " está observando muestras bajo el microscopio.");
    }

    public void analizar() {
        System.out.println("El microbiólogo " + getNombre() + " está analizando las muestras y anotando datos importantes.");    
    }
}