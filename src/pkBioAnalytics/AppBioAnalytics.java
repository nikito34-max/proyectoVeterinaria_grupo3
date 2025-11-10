package pkBioAnalytics;
import pkBioAnalytics.pkHumano.*;
import java.util.Scanner;

public class AppBioAnalytics {
	public void iniciarMundoProtista() {
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
                System.out.println("Acceso permitido.");
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
    }
}
