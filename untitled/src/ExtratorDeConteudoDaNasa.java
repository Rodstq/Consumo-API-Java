import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDaNasa {

    public List<Conteudo> extraiConteudos(String json){
        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);

        List<Conteudo> conteudos = new ArrayList<>();
        for (Map<String, String> atributos : listaDeAtributos){
            String urlImagem = atributos.get("url").replaceAll("(@+)(.*),jpg$", "S1.jpg");
            String titulo = atributos.get("title");
            var conteudo = new Conteudo(titulo, urlImagem);

            conteudos.add(conteudo);
        }
            return conteudos;
    }
}


