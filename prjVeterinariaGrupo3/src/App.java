import pkLaboratorio.*;

public class App {
    public static void main(String[] args) {
        System.out.println("=== INICIO DEL SISTEMA DE LABORATORIO PROTISTA ===");

        Laboratorio laboratorio = new Laboratorio();
        laboratorio.iniciarMundoProtista();

        System.out.println("\n=== FIN DEL EXPERIMENTO ===");
    }
}
