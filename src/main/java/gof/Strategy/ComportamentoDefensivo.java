package gof.Strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Mover comportamento Defensivo");
    }
}
