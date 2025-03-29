package server;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import server.CalculadoraImpl;

public class Servidor {
    public static void main(String[] args) {
        try {
            CalculadoraImpl calc = new CalculadoraImpl();
            Registry registry = LocateRegistry.createRegistry(1091);
            registry.rebind("Calculadora", calc);
            System.out.println("Servidor RMI pronto...");
        } catch (Exception e) {
            System.err.println("Erro no servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}