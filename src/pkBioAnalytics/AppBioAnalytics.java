package pkBioAnalytics;
import pkBioAnalytics.pkHumano.*;
import pkBioAnalytics.pkReinoViviente.pkProtista.*;

import java.util.Scanner;

public class AppBioAnalytics {
	public void iniciarMundoProtista() {
        Ameba ameba = new Ameba("Amebina", 25, 20);
        Heliozoo heliozoo = new Heliozoo("Heliozon", 40, 12);

        MicroBiologo microBio = new MicroBiologo(
            "Juan",
            "Perez", 
            "1743782691", 
            "juan123", 
            "password123", 
            "Microbiología Molecular"
        );

        Scanner input = new Scanner(System.in);

        System.out.println("Laboratorio de Biologia");
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
        System.out.println("\nRegistro de protozoos en el sistema\n");
        registrar(heliozoo);
        registrar(ameba);

        System.out.println();   
        microBio.observar();
        System.out.println(); 
        ameba.mover();
        heliozoo.mover();

        heliozoo.descansar(2);
        ameba.dividir();

        System.out.println("\n==caso de uso: REQ 02==\n");
        heliozoo.cazar(ameba);
        ameba.cazar(heliozoo);
        System.out.println(); 

        System.out.println("\n==caso de uso: REQ 01==\n");
        microBio.analizar();
        }
    }

    public boolean registrar(Rizopodo protozoo) {
        if (protozoo == null) return false;
        System.out.println("Rizópodo registrado: " + protozoo.getNombre());
        return true;
    }

    // public boolean registrar(Flagelado protozoo) {
    //     if (protozoo == null) return false;
    //     System.out.println("Flagelado registrado: " + protozoo.getNombre());
    //     return true;
    // }

    // public boolean registrar(Ciliado protozoo) {
    //     if (protozoo == null) return false;
    //     System.out.println("Ciliado registrado: " + protozoo.getNombre());
    //     return true;
    // }

    // public boolean registrar(Esporozoo protozoo) {
    //     if (protozoo == null) return false;
    //     System.out.println("Esporozoo registrado: " + protozoo.getNombre());
    //     return true;
    // }
    
}
