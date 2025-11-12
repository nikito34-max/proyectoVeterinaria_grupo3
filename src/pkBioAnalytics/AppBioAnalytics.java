package pkBioAnalytics;
import pkBioAnalytics.pkHumano.*;
import pkBioAnalytics.pkReinoViviente.pkProtista.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppBioAnalytics {
    private String nombreLab;

	public void inciarLaboratorio() {
        MicroBiologo microBio = new MicroBiologo(
            "Juan",
            "Perez", 
            "1743782691", 
            "juan123", 
            "password123", 
            "Microbiología Molecular"
        );

        Scanner input = new Scanner(System.in);

        System.out.println("Laboratorio de Biologia " + getNombreLab());
        System.out.println("Autenticarse en el Laboratorio");

        boolean acceso = false;
        int intentos = 0;

        while (!acceso && intentos < 3) {
            System.out.print("Ingrese su usuario: ");
            String username = input.nextLine().trim();

            System.out.print("Ingrese su password: ");
            String password = input.nextLine();

            acceso = microBio.login(username, password);

            if (acceso) {
                System.out.println("\nAcceso permitido.\n");
                microBio.showInfo();
            } else {
                intentos++;
                System.out.println("Acceso denegado. Intento " + intentos + " de 3.");
                if (intentos == 3) {
                    System.out.println("Número máximo de intentos alcanzado.");
                }
            }
        }

        input.close();

        if (acceso) {
            Ameba ameba1 = new Ameba("Amebina", 25, 20);
            Heliozoo heliozoo1 = new Heliozoo("Heliozon", 40, 12);












            System.out.println("\nRegistro de protozoos en el sistema\n");
            List<Protozoo> protozoos = Arrays.asList(ameba1, heliozoo1);
            registrar(protozoos);
            System.out.println();

            System.out.println("Simulacion de interacciones entre protozoos...\n");
            microBio.observar();

            ameba1.mover();
            ameba1.dividir();
            heliozoo1.mover();
            heliozoo1.descansar(2);
            System.out.println("\n== Caso de uso: REQ 02 ==");
            heliozoo1.cazar(ameba1);
            ameba1.cazar(heliozoo1);
            System.out.println();

            
















    
            System.out.println("\n==caso de uso: REQ 01==\n");
            microBio.analizar();
        }
    }

    public void registrar(List<Protozoo> protozoos) { 
        if (!protozoos.isEmpty()) {
            for (Protozoo protozoo : protozoos) {            
                if (protozoo != null) {    
                    System.out.println("Protozoo del tipo " + protozoo.getClass().getSimpleName() + " registrado.");
                } else {
                    System.out.println("Debe ingresar un protozoo");
                }
            }
        }
    }

    public String getNombreLab() {
        return this.nombreLab;
    }
}
