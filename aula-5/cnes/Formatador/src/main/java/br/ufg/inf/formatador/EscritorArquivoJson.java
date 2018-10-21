/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.formatador;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Classe resposável por receber uma lista de estabelecimentos de saúde como
 * parâmetro e serializar em json, escrevendo em um arquivo.
 * 
 * @author Fernando Henrique Quicano Callata
 */
public class EscritorArquivoJson {
    private ListaDeEstabelecimentosDeSaude lista;
    private FileWriter escritor;
    private static final String diretorio = "../web-app/aplicacao/";
    public EscritorArquivoJson(ListaDeEstabelecimentosDeSaude lista) {
        this.lista = lista;
    }
    
    public EscritorArquivoJson() {}
    
    public void escreva(String nomeArquivoJson) throws IOException {
        if (lista == null) {
            throw new IllegalArgumentException("Lista de estabelecimentos "
                    + "está vazia. Passe a lista no construtor do escritor "
                    + "de arquivos Json");
        }
        escritor = new FileWriter(diretorio + nomeArquivoJson);
        Gson gson = new Gson();
        String json = gson.toJson(lista);
        escritor.write(json.replace("\\\"", ""));
        escritor.close();
    }
    
}
