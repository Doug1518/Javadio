package desafioPoo;

interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
    String obterUltimaChamada();
    String verificarSinal();
}