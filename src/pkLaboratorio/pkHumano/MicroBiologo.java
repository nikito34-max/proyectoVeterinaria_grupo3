package pkLaboratorio.pkHumano;

import pkLaboratorio.pkProtista.pkProtozoo.ReinoProtista;

public class MicroBiologo {
    private String id;
    private String nombre;
    private String especialidad;
    private String login;
    private String password;

    public MicroBiologo(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public boolean setClave(String log, String pass) {
        this.login = log;
        this.password = pass;
        return true;
    }

    public void observar(ReinoProtista protista) {
        System.out.println(nombre + " observa a " + protista.getNombre() + " bajo el microscopio.");
    }

    public String getLogin() {
         return login; }
    public String getPassword() { 
        return password; }
    public String getNombre() {
         return nombre; }
}
