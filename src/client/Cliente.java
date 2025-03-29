package client;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import common.Calculadora;


public class Cliente {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1091);
            Calculadora calc = (Calculadora) registry.lookup("Calculadora");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;
            switch (operacao) {
                case '+': resultado = calc.soma(num1, num2); break;
                case '-': resultado = calc.subtracao(num1, num2); break;
                case '*': resultado = calc.multiplicacao(num1, num2); break;
                case '/': resultado = calc.divisao(num1, num2); break;
                default: System.out.println("Operação inválida!"); return;
            }

            System.out.println("Resultado: " + resultado);
            scanner.close();
        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}