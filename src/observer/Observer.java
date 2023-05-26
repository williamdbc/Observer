package observer;

public abstract class Observer {
    protected String nome;

    public Observer(String nome) {
        this.nome = nome;
    }

    public abstract void notificarMudancaEstado(Carro carro);
}
