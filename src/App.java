import pkBioAnalytics.*;

public class App {
    public static void main(String[] args) {
        System.out.println("=== INICIO DEL SISTEMA DE LABORATORIO PROTISTA ===");

        AppBioAnalytics laboratorio = new AppBioAnalytics();
        laboratorio.inciarLaboratorio();

        System.out.println("\n=== FIN DEL EXPERIMENTO ===");
    }
}
