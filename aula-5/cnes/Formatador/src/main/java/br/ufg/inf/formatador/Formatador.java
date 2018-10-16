/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.formatador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 
 * Classe responsável por realizar operações de formatação do arquivo
 * obtido do datasus.
 * 
 * @author Fernando Henrique Quicano Callata
 */
public class Formatador {
    /**
     * Constante que representa a entrada do usuário para URL   .
     */
    private static int URL = 0;
    /**
     * Entrada do usuário para nome do arquivo json
     */
    private static int ARQUIVO_JSON = 1;
    /**
     * URL padrão para obtenção do arquivo CSV.
     */
    private static final String urlFtp = "ftp://ftp.datasus.gov.br/cnes/"
            + "BASE_DE_DADOS_CNES_201808.ZIP";
    /**
     * Nome padrão que o arquivo json gerado terá caso o usuário não informe
     * nenhum argumento para o nome do arquivo.
     */
    private static final String nomePadraoJson = "estabelecimentos.json"; 
    /**
     * Atributo que conterá o arquivo csv.
     */
    private static URL arquivo;
    /**
     * Atributo que armazenará a abertura da conexão ftp.
     */
    private static URLConnection conexao;
    /**
     * leitor do buffer de memória.
     */
    private static BufferedReader leitorDeBuffer;
    /**
     * Arquivo csv obtido da conexão através do protocolo ftp.
     */
    private static InputStreamReader arquivoObtido;
    /**
     * Arquivo zip que contém o conjunto de itens csv.
     */
    private static ZipInputStream arquivoZipObtido;
    /**
     * Linha lida no arquivo csv.
     */
    private static String linha = "";
    /**
     * Separador utilizado para segmentar a leitura do arquivo csv.
     */
    private static String SEPARADOR = ";";
    /**
     * Nome do arquivo a ser obtido.
     */
    private static String nomeDoArquivo = "tbEstabelecimento201808.csv";
    /**
     * Arquivo csv obtido do arquivo zip.
     */
    private static ZipEntry arquivoCsvObtido;
    /**
     * Represeta a posição do código do estabelecimento na tabela.
     */
    private static final int CODIGO = 0;
    /**
     * Representa a posição da razão social na tabela do arquivo csv.
     */
    private static final int RAZAO_SOCIAL = 5;
    /**
     * Representa a posição da latitude na tabela do arquivo csv.
     */
    private static final int LATITUDE = 39;
    /**
     * Representa a posição da longitude na tabela do arquivo csv.
     */
    private static final int LONGITUDE = 40;
    public static void main(String args[]) {
        try {
            String urlDigitada = args.length  > 0 
                                 ? args[URL] 
                                 : urlFtp;
            String nomeArquivoJson = args.length > 1
                                 ? args[ARQUIVO_JSON]
                                 : nomePadraoJson;
            processeArquivoCsv(urlDigitada);
            crieArquivoJson(nomeArquivoJson);
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro, o programa será finalizado!");
            System.out.println(e.getMessage());
        }
    }
    
    public static void processeArquivoCsv(String url) 
            throws IOException{
        arquivo = new URL(url);
        conexao = arquivo.openConnection();
        arquivoZipObtido = new ZipInputStream(conexao.getInputStream());
        while ((arquivoCsvObtido = arquivoZipObtido
                                   .getNextEntry()) != null) {
            if  (arquivoCsvObtido.getName()
                                 .equalsIgnoreCase(nomeDoArquivo)) {
                arquivoObtido = new InputStreamReader(arquivoZipObtido);
                leitorDeBuffer = new BufferedReader(arquivoObtido);
                break;
            }
        }
    }
    
    public static void crieArquivoJson(String nomeArquivoJson) throws IOException {
        boolean primeiraLinha = true;
        while ((linha = leitorDeBuffer.readLine()) != null) {
            if (primeiraLinha) {
                primeiraLinha = false;
                continue;
            }
            String[] partes = linha.split(SEPARADOR);
            EstabelecimentoDeSaude item;
            item = new EstabelecimentoDeSaude(partes[CODIGO],
                                              partes[RAZAO_SOCIAL],
                                              partes[LATITUDE], 
                                              partes[LONGITUDE]);
            ListaDeEstabelecimentosDeSaude.obtenha().add(item);
        }
        EscritorArquivoJson escritorDeJson;
        escritorDeJson = new EscritorArquivoJson(
                ListaDeEstabelecimentosDeSaude.obtenha());
        escritorDeJson.escreva(nomeArquivoJson);
    }
}
