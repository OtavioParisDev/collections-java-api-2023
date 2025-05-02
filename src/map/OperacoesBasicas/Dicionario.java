package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavra(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraPesquisada = null;
        if (!dicionarioMap.isEmpty()){
            palavraPesquisada = dicionarioMap.get(palavra);
        }
        return palavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("oi","dizer oi");
        dicionario.adicionarPalavra("oi","dizer oiiiiii");
        dicionario.adicionarPalavra("tchau","dizer tchau");
        dicionario.adicionarPalavra("estou aqui","posição");
        dicionario.adicionarPalavra("onde","questionamento");
        dicionario.adicionarPalavra("Líquido","Estado fisico");

        dicionario.exibirPalavra();

        dicionario.removerPalavra("tchau");

        dicionario.exibirPalavra();

        System.out.println(dicionario.pesquisarPorPalavra("Líquido"));

    }
}
