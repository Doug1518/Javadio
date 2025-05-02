package gof.Strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Mover comportamento Agressivo");
    }
}
