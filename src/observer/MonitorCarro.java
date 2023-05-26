package observer;

public class MonitorCarro extends Observer {
    public MonitorCarro(String nome) {
        super(nome);
    }

    @Override
    public void notificarMudancaEstado(Carro carro) {
        System.out.println("[" + nome + "] O carro " + carro.getModelo() +
                " mudou a velocidade para " + carro.getVelocidade() + " km/h");
    }
}
