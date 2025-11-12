package pkBioAnalytics.pkReinoViviente.pkProtista;


public abstract class Flagelado extends Protozoo {
    protected int numeroFlagelos;

    public Flagelado() { super(); }

    public Flagelado(String nombre, double tamano, int numeroFlagelos) {
        super(nombre, tamano);
        this.numeroFlagelos = numeroFlagelos;
    }

    public int getNumeroFlagelos() { return numeroFlagelos; }
    public void setNumeroFlagelos(int numeroFlagelos) { this.numeroFlagelos = numeroFlagelos; }

}

// Tripanosoma.java
public class Tripanosoma extends Flagelado {
    private String tipoInfeccion; 

    public Tripanosoma() { super(); }

    public Tripanosoma(String nombre, double tamano, int numeroFlagelos, String tipoInfeccion) {
        super(nombre, tamano, numeroFlagelos);
        this.tipoInfeccion = tipoInfeccion;
    }

    public String getTipoInfeccion() { return tipoInfeccion; }
    public void setTipoInfeccion(String tipoInfeccion) { this.tipoInfeccion = tipoInfeccion; }

    @Override
    public void mover() {
        System.out.printf("%s (Tripanosoma) se desplaza con su flagelo y membrana ondulante.\n", nombre);
    }

   
    public void parasitar(Protozoo presa) {
        System.out.printf("%s intenta parasitar a %s. Tipo de infección: %s\n",
                nombre, presa.getNombre(), tipoInfeccion);
        // comportamiento simbólico: si la presa es muy pequeña, "fracasa"
        if (presa.getTamano() < this.tamano * 0.5) {
            System.out.printf("%s: parasitismo menos efectivo por tamaño de la presa.\n", nombre);
        } else {
            System.out.printf("%s: parasitismo exitoso (simulado).\n", nombre);
        }
    }

    @Override
    public String toString() {
        return String.format("Tripanosoma: %s, tipoInfeccion=%s", super.toString(), tipoInfeccion);
    }
}

// Euglenoide.java
public class Euglenoide extends Flagelado {
    private String pigmentacion;
    private boolean tieneCloroplastos;

    public Euglenoide() {
        super();
    }

    public Euglenoide(String nombre, double tamano, int numeroFlagelos, String pigmentacion, boolean tieneCloroplastos) {
        super(nombre, tamano, numeroFlagelos);
        this.pigmentacion = pigmentacion;
        this.tieneCloroplastos = tieneCloroplastos;
    }

    public String getPigmentacion() { return pigmentacion; }
    public void setPigmentacion(String pigmentacion) { this.pigmentacion = pigmentacion; }

    public boolean isTieneCloroplastos() { return tieneCloroplastos; }
    public void setTieneCloroplastos(boolean tieneCloroplastos) { this.tieneCloroplastos = tieneCloroplastos; }

    @Override
    public void mover() {
        System.out.printf("%s (Euglenoide) se mueve con su flagelo (%d flagelo(s)).\n", nombre, numeroFlagelos);
    }

    public void fotosintetizar() {
        if (tieneCloroplastos) {
            System.out.printf("%s realiza fotosíntesis y produce energía a partir de la luz.\n", nombre);
        } else {
            System.out.printf("%s no tiene cloroplastos (no puede fotosintetizar).\n", nombre);
        }
    }

    @Override
    public String toString() {
        return String.format("Euglenoide: %s, pigmentacion=%s, cloroplastos=%b", super.toString(), pigmentacion, tieneCloroplastos);
    }
}

