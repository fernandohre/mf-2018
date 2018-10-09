/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.formatador;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
    private static int ENTRADA_DO_USUARIO = 0;
    private static final String _urlFtp = "ftp://ftp.datasus.gov.br/cnes/"
            + "BASE_DE_DADOS_CNES_201808.ZIP";
    private static URL _arquivo;
    private static URLConnection _conexao;
    private static BufferedReader _leitorDeBuffer;
    private static InputStreamReader _arquivoObtido;
    private static ZipInputStream _arquivoZipObtido;
    private static String _linha = "";
    private static String SEPARADOR = ";";
    private static String nomeDoArquivo = "tbEstabelecimento201808.csv";
    private static ZipEntry arquivoCsvObtido;
    public static void main(String args[]) {
        try {
            
            _arquivo = new URL(_urlFtp);
            
            _conexao = _arquivo.openConnection();
            _arquivoZipObtido = new ZipInputStream(_conexao.getInputStream());
            while ((arquivoCsvObtido = _arquivoZipObtido
                                       .getNextEntry()) != null) {
                if  (arquivoCsvObtido.getName()
                                     .equalsIgnoreCase(nomeDoArquivo)) {
                    _arquivoObtido = new InputStreamReader(_arquivoZipObtido);
                    _leitorDeBuffer = new BufferedReader(_arquivoObtido);
                    break;
                }
            
            }
            while ((_linha = _leitorDeBuffer.readLine()) != null) {
                String[] partes = _linha.split(SEPARADOR);
                
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro, o programa será finalizado!");
            System.out.println(e.getMessage());
        }
    }
}