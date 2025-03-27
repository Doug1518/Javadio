package desafioPoo;

interface ReprodutorMusical {
    void tocarMusica(String musica);
    void aumentarVolume(int volume);
    void pularMusica();
    void selecionarMusica(String musica);
    String obterMusicaAtual();
    String obterStatusReproducao();
}