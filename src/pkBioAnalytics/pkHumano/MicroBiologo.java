package pkBioAnalytics.pkHumano;

import java.util.List;

import pkBioAnalytics.pkReinoViviente.pkProtista.Ameba;
import pkBioAnalytics.pkReinoViviente.pkProtista.Heliozoo;
import pkBioAnalytics.pkReinoViviente.pkProtista.Protozoo;

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

    public void observar(List<Protozoo> protozoos) {
        if (protozoos == null || protozoos.isEmpty()) {
            System.out.println("No hay protozoos registrados para observar.");
            return;
        }

        Ameba amebaEncontrada = null;
        Heliozoo heliozooEncontrado = null;

        for (Protozoo protozoo : protozoos) {
            System.out.println();
            System.out.println("El microbiólogo " + getNombre() + " está observando la muestra de "
                    + protozoo.getClass().getSimpleName() + " bajo el microscopio.");
            System.out.println();

            if (protozoo instanceof Ameba a) {
                a.mover();
                a.dividir();
                amebaEncontrada = a;
            } else if (protozoo instanceof Heliozoo h) {
                h.mover();
                h.descansar(2);
                heliozooEncontrado = h; 
            }
        }

        if (amebaEncontrada != null && heliozooEncontrado != null) {
            System.out.println("\n== Caso de uso: REQ 02 ==");
            heliozooEncontrado.cazar(amebaEncontrada);
            amebaEncontrada.cazar(heliozooEncontrado);
            System.out.println();
        }
    }


    public void analizar() {
        System.out.println("El microbiólogo " + getNombre() + " está analizando las muestras y anotando datos importantes.");    
    }
}