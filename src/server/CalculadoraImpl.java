package server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import common.Calculadora;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {
    protected CalculadoraImpl() throws RemoteException {
        super();
    }

    public double soma(double a, double b) throws RemoteException {
        return a + b;
    }

    public double subtracao(double a, double b) throws RemoteException {
        return a - b;
    }

    public double multiplicacao(double a, double b) throws RemoteException {
        return a * b;
    }

    public double divisao(double a, double b) throws RemoteException {
        if (b == 0) throw new RemoteException("Divisão por zero não permitida");
        return a / b;
    }
}