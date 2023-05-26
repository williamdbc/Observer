package observer;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String modelo;
    private int velocidade;
    private List<Observer> observadores;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
        this.observadores = new ArrayList<>();
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
        notificarObservadores();
    }

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.notificarMudancaEstado(this);
        }
    }
}