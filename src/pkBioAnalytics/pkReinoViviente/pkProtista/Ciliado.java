package pkBioAnalytics.pkReinoViviente.pkProtista;

public abstract class Ciliado extends Protozoo {
    private String nombre;
    private Integer numCilios;             
    private Boolean tieneCitostoma;     
    private String tipoReproduccion;      
    private Double tamanioMicrom;        
    private Double velocidadDeMovimiento;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            System.out.println( "Ingrese un nombre válido porfavor, este campo no puede estar vacío");
        }else {
       this.nombre = nombre.trim();
    }
    }
    public Integer getNumCilios() {
        return numCilios;
    }
    public void setNumCilios(Integer numCilios) {
       if (numCilios != null && numCilios >= 0) { 
        this.numCilios = numCilios;
    } else {
        System.out.println("El número de cilios debe ser siempre un numero positivo. ERROR");
    }
}
    public Boolean getTieneCitostoma() {
        return tieneCitostoma;
    }
    public void setTieneCitostoma(Boolean tieneCitostoma) {
        this.tieneCitostoma = tieneCitostoma;
    }
    public String getTipoReproduccion() {
        return tipoReproduccion;
    }
    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }
    public Double getTamanioMicrom() {
        return tamanioMicrom;
    }
    public void setTamanioMicrom(Double tamanioMicrom) {
        if (tamanioMicrom<0||tamanioMicrom>3000.00){
            System.out.println("Error, debe imgresar siempre un número positivo dentro del rango permitido");
        }else{
        this.tamanioMicrom = tamanioMicrom;
          }
        }
    public Double getVelocidadDeMovimiento() {
        return velocidadDeMovimiento;
    }

    public void setVelocidadDeMovimiento(Double velocidadDeMovimiento) {
        this.velocidadDeMovimiento = velocidadDeMovimiento;
    } 
   
    public Ciliado (){
        super();
    }

    protected Ciliado (String nombre,double tamanioMicrom,int numCilios,boolean tieneCitostoma){
        super();
        setNombre(nombre);
        setNumCilios(numCilios);
        setTamanioMicrom(tamanioMicrom);
        setTieneCitostoma(tieneCitostoma);
     } 
    
    public void crecer (double incrementoMicrom){ 
        if (this.getEstaVivo()){
            setTamanioMicrom(this.getTamanioMicrom() + incrementoMicrom);
            System.out.println( "El ciliado " + this.getNombre() + " ha crecido. Nuevo tamaño: " + this.getTamanioMicrom() + "µm.");
        } else {
            System.out.println("El ciliado está muerto y no puede crecer.");
        }
    }
    public  void desplazar (){
        System.out.println("el ciliado"+this.getNombre()+"se esta desplazando");
    }
    public void ingerirAlimento (){
         System.out.println("el ciliado"+this.getNombre()+"estacomiendo");
    }
    
    public boolean reproducir(String tipoReproduccion){
    System.out.println(" el ciliado"+ this.getNombre()+"se esta reproducciendo"+ this.getTipoReproduccion());
    return true;
    }

    
}

    



   