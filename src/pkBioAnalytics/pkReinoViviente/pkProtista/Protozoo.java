package pkBioAnalytics.pkReinoViviente.pkProtista;

public abstract class Protozoo extends ReinoProtista { 
 
    public Protozoo() {
        super(); 
        super.setNombre("Protozoo desconocido");
        super.setEstaVivo(true); 
    }
    
    
    public abstract void mover();

    public abstract void descansar(int horas);
}