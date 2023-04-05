public class Conteudo {

    private String titulo;
    private String urlImagem;


    public Conteudo(String titulo, String UrlImagem){
        this.titulo = titulo;
        this.urlImagem = urlImagem;
    }
    public String getTitulo(){
        return titulo;
    }

    public String getUrlImagem(){
        return urlImagem;
    }
}
