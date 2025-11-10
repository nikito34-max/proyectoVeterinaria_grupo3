package pkBioAnalytics;
import pkBioAnalytics.pkHumano.*;
import pkBioAnalytics.pkReinoViviente.pkProtista.*;

import java.util.List;
import java.util.Scanner;

public class AppBioAnalytics {
	public void iniciarMundoProtista() {
        List<Protozoo> protozoos = List.of(          
            new Ameba("Amebina", 25, 20),
            new Heliozoo("Heliozon", 40, 12)
        );

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
            registrar(protozoos);

            microBio.observar(protozoos);

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
}
