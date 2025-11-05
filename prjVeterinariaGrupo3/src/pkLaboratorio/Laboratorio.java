package pkLaboratorio;

import pkLaboratorio.pkHumano.Biologo;
import pkLaboratorio.pkHumano.Estudiante;
import pkLaboratorio.pkProtista.*;
import pkLaboratorio.pkFinanza.DataFast;

public class Laboratorio {
    private String log;
    private String pass;

    public Laboratorio() {
        setLog("usrBio");
        setPass("passBio");
    }

    public void iniciarMundoProtista() {
        Estudiante estudiante = new Estudiante("1102345678", "Lucas", "Vera");
        Biologo biologo = new Biologo("1887654321", "Dra. Ana", "Biología Molecular");
        Ameba ameba = new Ameba("Ameba Proteus");
        Paramecio paramecio = new Paramecio("Paramecio Aurelia");
        Euglena euglena = new Euglena("Euglena Viridis");
        Volvox volvox = new Volvox("Volvox Globator");
        DataFast dataFast = new DataFast();

        if (!biologo.setClave("usrBio", "passBio")) {
            System.out.println("No se pudo establecer la clave del biólogo.");
            return;
        }

        System.out.println("\n--- caso de uso: REQ 01 ---");
        if (ingresar(biologo)) {
            System.out.println("Acceso concedido. Bienvenido/a, " + biologo.getNombre() + ".");

            System.out.println("\n--- caso de uso: REQ 02 ---");
            registrar(ameba);
            registrar(paramecio);
            registrar(euglena);
            registrar(volvox);

            System.out.println("\n--- caso de uso: REQ 03 ---");
            biologo.observar(ameba);
            biologo.observar(paramecio);
            biologo.observar(euglena);
            biologo.observar(volvox);

            System.out.println("\n--- caso de uso: REQ 04 ---");
            ameba.alimentarse();
            ameba.moverseHacia(paramecio);
            paramecio.alimentarse();
            paramecio.interactuarCon(euglena);
            euglena.fotosintetizar();
            euglena.interactuarCon(volvox);
            volvox.reproducirse();
        } else {
            System.out.println("Acceso denegado. Credenciales incorrectas.");
        }
    }

    private boolean ingresar(Biologo usuario) {
        if (usuario == null) return false;
        String login = usuario.getLogin();
        String password = usuario.getPassword();
        if (login == null || password == null) return false;
        return login.equals(getLog()) && password.equals(getPass());
    }

    private boolean registrar(ReinoProtista especie) {
        if (especie == null) return false;
        System.out.println("Registrando protista: " + especie.getNombre());
        return true;
    }

    public String getLog() { return log; }
    public void setLog(String log) { this.log = log; }
    public String getPass() { return pass; }
    public void setPass(String pass) { this.pass = pass; }
}
