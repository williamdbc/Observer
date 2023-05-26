package observer;

public class Main {
    public static void main(String[] args) {
        // Criando os carros
        Carro carro1 = new Carro("Ferrari");
        Carro carro2 = new Carro("BMW");

        // Criando os monitores
        MonitorCarro monitor1 = new MonitorCarro("Monitor 1");
        MonitorCarro monitor2 = new MonitorCarro("Monitor 2");

        // Registrando os monitores como observadores dos carros
        carro1.adicionarObservador(monitor1);
        carro1.adicionarObservador(monitor2);
        carro2.adicionarObservador(monitor1);

        // Mudando a velocidade dos carros
        carro1.setVelocidade(100);
        carro2.setVelocidade(80);
        carro1.setVelocidade(150);
    }
}
