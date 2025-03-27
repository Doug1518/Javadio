package desafioPoo;

class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    // Atributos
    private String modelo;
    private int armazenamento;

    // Construtor
    public Iphone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    // Métodos de ReprodutorMusical
    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando: " + musica);
    }

    @Override
    public void aumentarVolume(int volume) {
        System.out.println("Volume ajustado para: " + volume);
    }

    @Override
    public void pularMusica() {
        System.out.println("Pulando para a próxima música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public String obterMusicaAtual() {
        return "Música atual: Imagine - John Lennon";
    }

    @Override
    public String obterStatusReproducao() {
        return "Status: Tocando";
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public String obterUltimaChamada() {
        return "Última chamada: +55 11 91234-5678";
    }

    @Override
    public String verificarSinal() {
        return "Sinal: 4G";
    }

    // Métodos de NavegadorNaInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public String obterUrlAtual() {
        return "URL atual: https://www.google.com";
    }

    @Override
    public String listarAbasAbertas() {
        return "Abas abertas: [Google, Wikipédia, YouTube]";
    }
}