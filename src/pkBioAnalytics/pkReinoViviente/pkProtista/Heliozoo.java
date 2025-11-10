package pkBioAnalytics.pkReinoViviente.pkProtista;

public class Heliozoo extends Rizopodo {
    private Integer numeroDeRayos;

    public Heliozoo() {
        super();
        this.setNumeroDeRayos(0);
    }

    public Heliozoo(String nombre, double tamanio, int numeroDeRayos) {
        super();
        super.setNombre(nombre);
        super.setTamanio(tamanio);
        this.setNumeroDeRayos(numeroDeRayos);
    }

     @Override
    public void mover() {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede moverse porque está muerto.");
            return;
        }
        System.out.println(this.getNombre() + " flota lentamente extendiendo sus pseudópodos radiales.");
    }

    @Override
    public void descansar(int horas) {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede descansar porque está muerto.");
            return;
        }
        System.out.println(this.getNombre() + " reduce su movimiento y flota inmóvil por " + horas + " horas.");
    }

    public void cazar(Ameba presa) {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede cazar porque está muerto.");
            return;
        }

        if (!presa.getEstaVivo()) {
            System.out.println(presa.getNombre() + " ya no está viva. " + this.getNombre() + " la ignora.");
            return;
        }

        if (this.getTamanio() > presa.getTamanio()) {
            System.out.println(this.getNombre() + " atrapa a " + presa.getNombre() + " con sus rayos y la consume.");
            presa.setEstaVivo(false);
        } else {
            System.out.println(presa.getNombre() + " se defiende con sus pseudópodos. " + this.getNombre() + " no puede comerla.");
        }
    }
    public Integer getNumeroDeRayos() {
        return numeroDeRayos;
    }

    public void setNumeroDeRayos(Integer numeroDeRayos) {
        this.numeroDeRayos = numeroDeRayos;
    }
}

