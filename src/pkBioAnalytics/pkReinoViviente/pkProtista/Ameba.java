package pkBioAnalytics.pkReinoViviente.pkProtista;

public class Ameba extends Rizopodo {
    private Integer fuerzaPseudopodo;

    public Ameba() {
        super();
        this.setFuerzaPseudopodo(10);
    }

    public Ameba(String nombre, double tamanio, int fuerzaPseudopodo) {
        super();
        super.setNombre(nombre);
        super.setTamanio(tamanio);
        this.setFuerzaPseudopodo(fuerzaPseudopodo);
    }

    @Override
    public void mover() {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede moverse porque está muerta.");
            return;
        }
        System.out.println(this.getNombre() + " se desliza lentamente extendiendo su cuerpo gelatinoso.");
    }

    @Override
    public void descansar(int horas) {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede descansar porque está muerta.");
            return;
        }
        System.out.println(this.getNombre() + " se detiene brevemente para recuperar energía en un entorno fangoso durante " + horas + " horas.");
    }

    public void dividir() {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " ya no puede dividirse porque está muerta.");
            return;
        }
        System.out.println(this.getNombre() + " se divide en dos amebas más pequeñas.");
        this.setTamanio(this.getTamanio() / 2);
    }

    public void cazar(Heliozoo presa) {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede cazar porque está muerta.");
            return;
        }

        if (!presa.getEstaVivo()) {
            System.out.println(presa.getNombre() + " ya no está vivo. " + this.getNombre() + " lo ignora.");
            return;
        }

        if (this.getTamanio() > presa.getTamanio()) {
            System.out.println(this.getNombre() + " envuelve a " + presa.getNombre() + " con sus pseudópodos y lo consume.");
            presa.setEstaVivo(false);
        } else {
            System.out.println(this.getNombre() + " intenta atrapar a " + presa.getNombre() + ", pero este escapa flotando.");
        }
    }

    public Integer getFuerzaPseudopodo() {
        return fuerzaPseudopodo;
    }

    public void setFuerzaPseudopodo(Integer fuerzaPseudopodo) {
        this.fuerzaPseudopodo = fuerzaPseudopodo;
    }
}

