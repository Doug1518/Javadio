package desafioPoo;

interface NavegadorNaInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
    String obterUrlAtual();
    String listarAbasAbertas();
}