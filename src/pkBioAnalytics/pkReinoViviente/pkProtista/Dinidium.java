package pkBioAnalytics.pkReinoViviente.pkProtista;

public class Dinidium extends Ciliado {
private Integer cantidadDeEnergia;
private Paramecium presa;
private Boolean tieneProsboide;
private Double posicion;


   public Double getPosicion() {
   return posicion;
}

public void setPosicion(Double posicion) {
   this.posicion = posicion;
}

   public Integer getCantidadDeEnergia() {
    return cantidadDeEnergia;
 }

   public void setCantidadDeEnergia(Integer cantidadDeEnergia) {
    if (cantidadDeEnergia<0){
    this.cantidadDeEnergia=0;
        System.out.println(" el ciliado" +getNombre() + "debe estar muerto");
    } else {
    this.cantidadDeEnergia = cantidadDeEnergia;
    }
   }

   public Paramecium getPresa() {
    return presa;
    }
    public void setPresa(Paramecium presa) {
    this.presa = presa;
   }
   public Boolean getTieneProsboide() {
    return tieneProsboide;
    }
    public void setTieneProsboide(Boolean tieneProsboide) {
    this.tieneProsboide = tieneProsboide;
    }
    /** Creación de los constructores */
    public Dinidium () {
      super ();
      this.setPosicion(0.0);
      this.cantidadDeEnergia=100;
    }
    public Dinidium(String nombre, Double tamanioMicrom, Integer numCilios, Boolean tieneCitostoma, Integer cantidadDeEnergia,Boolean tieneProsboide) {
        super.setNombre(nombre);
        super.setNumCilios(numCilios);
        super.setTamanioMicrom(tamanioMicrom);
        super.setTieneCitostoma(tieneCitostoma);
        this.setCantidadDeEnergia(cantidadDeEnergia); 
        this.setTieneProsboide (tieneProsboide);
    }
  
    @Override
    public void mover() {
    double velocidad = this.getVelocidadDeMovimiento();
    this.posicion += velocidad * 1.0;
    System.out.println(this.getNombre() + " se desplaza. Nueva posición: " + this.posicion);
}
   public void localizar (Paramecium presa){
    System.out.println(this.getNombre() + " está utilizando sus cilios sensoriales para buscar presas."); 
  }
  public void inmovilizar(boolean tieneProsboides) {
        if (tieneProsboides) {
            System.out.println(this.getNombre() + " lanza sus proboscis para paralizar e inmovilizar a la presa.");
        } else {
            System.out.println(this.getNombre() + " realiza un impacto rápido para aturdir e inmovilizar a la presa.");
        }
    }

    public void cazar(Paramecium presa) {
        System.out.println( this.getNombre() + " va a cazar");
         if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede cazar porque está muerta.");
            return;
        }
      }
   
    public void ingerir(Paramecium presa) {
        if (this.getTieneCitostoma()) {
            System.out.println(this.getNombre() + " abre su citostoma y empuja a Paramecium hacia el interior.");
            System.out.println("Se forma una vacuola alimenticia."); 
        } else {
            System.out.println(this.getNombre()+ "no puede ingerir la comida");
        }
    }

    public void digerir(Paramecium presa) {

        int energiaBase = 150; 
        this.setCantidadDeEnergia(this.getCantidadDeEnergia() + energiaBase); 
        
        System.out.println("Metabolizando el Paramecium");
        System.out.println("Se obtienen " + energiaBase + " unidades de energía. Energía total: " + this.getCantidadDeEnergia() + ".");
    }
    @Override
    public void crecer (double incrementoMicrom){ 
        if (this.getEstaVivo()){
            setTamanioMicrom(this.getTamanioMicrom() + incrementoMicrom);
            System.out.println( "El ciliado " + this.getNombre() + " ha crecido. Nuevo tamaño: " + this.getTamanioMicrom() + "µm.");
        } else {
            System.out.println("El ciliado está muerto y no puede crecer.");
        }
    }
    @Override
 public void descansar(int horas) {
   System.out.println( " descansando ");
 }
}
   

