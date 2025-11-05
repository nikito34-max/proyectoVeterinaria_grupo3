package pkLaboratorio;

import pkLaboratorio.pkHumano.*;
import pkLaboratorio.pkProtista.pkProtozoo.*;

import java.util.List;

public class Laboratorio {
    private String log;
    private String pass;

    public Laboratorio() {
        setLog("usrBio");
        setPass("passBio");
    }

    public void iniciarMundoProtista() {
        MicroBiologo biologo = new MicroBiologo("1887654321", "Dra. Ana", "Biología Molecular");
        List<ReinoProtista> protozoos = List.of(
            new Ameba("Ameba Proteus"),
            new Paramecio("Paramecio Aurelia"),
            new Euglena("Euglena Viridis"),
            new Plasmodium("Plasmodium Globator"),
            new Ciliado("Ciliado Balantidium"),
            new Flagelado("Flagelado Giardia"),
            new Esporozoo("Esporozoo Gregarina"),
            new Foraminifero("Foraminífero Globigerina"),
            new Sarcodino("Sarcodino Radiolaria"),
            new Stentor("Stentor Coeruleus"),
            new Toxoplasma("Toxoplasma Gondii"),
            new Trypanosoma("Trypanosoma Cruzi")
        );



        if (!biologo.setClave("usrBio", "passBio")) {
            System.out.println("No se pudo establecer la clave del biólogo.");
            return;
        }

        System.out.println("\n--- caso de uso: REQ 01 ---");
        if (ingresar(biologo)) {
            System.out.println("Acceso concedido. Bienvenido/a, " + biologo.getNombre() + ".");

            for (ReinoProtista p : protozoos) {
                System.out.println("\n--- caso de uso: REQ 02 ---");
                registrar(p);
                System.out.println("\n--- caso de uso: REQ 03 ---");
                biologo.observar(p);
            }

            System.out.println("\n--- caso de uso: REQ 04 ---");

            for (int i = 0; i < protozoos.size(); i++) {
                ReinoProtista actual = protozoos.get(i);
                actual.alimentar();

                // comportamiento especial
                if (actual instanceof Euglena e) e.fotosintetizar();
                if (actual instanceof Plasmodium p) p.reproducir();

                // interacción con el siguiente
                if (i < protozoos.size() - 1) {
                    ReinoProtista siguiente = protozoos.get(i + 1);
                    if (actual instanceof Euglena e) e.interactuarCon(siguiente);
                    if (actual instanceof Paramecio p) p.interactuarCon(siguiente);
                }
            }

        } else {
            System.out.println("Acceso denegado. Credenciales incorrectas.");
        }
    }

    private boolean ingresar(MicroBiologo usuario) {
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
