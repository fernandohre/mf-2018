
package br.ufg.inf.aplicacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aplicacao {
    
    private static String url = "http://repositorio.dados.gov.br/"
            + "educacao/CADASTRO%20DAS%20IES_2011.csv";
    private static URL arquivo;
    private static BufferedReader leitor;
    private static String linha = "";
    private static String SEPARADOR = ";";
    private static int NUM_LINHAS_IGNORADAS = 11;
    private static int POSICAO_ESTADO = 9;
    private static Scanner leia = new Scanner(System.in);
    private static final GerenciadorDicionarioEstados dicionarioDeEstados = 
            new GerenciadorDicionarioEstados();
    private static final Integer UNIVERSIDADE_ENCONTRADA = 1;
    public static void main(String[] args) {
        try {
            leitor = new BufferedReader(obtenhaFluxoDeEntrada());
            int contador = 0;
            while ((linha = leitor.readLine()) != null) {
                if (contador < NUM_LINHAS_IGNORADAS) {
                    contador++;
                    continue;
                }
                String partes[] = linha.split(SEPARADOR);
                if (!(partes.length < POSICAO_ESTADO)) {
                    dicionarioDeEstados.adicione(partes[POSICAO_ESTADO]);
                }   
            }
            dicionarioDeEstados.exibaQuantidadeDeUniversidadesPorEstado();
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro! o program será finalizado...");
            System.out.println(ex.getLocalizedMessage());
        }
    }
    public static InputStreamReader obtenhaFluxoDeEntrada() throws IOException {
        arquivo = new URL(obtenhaUrl());
            URLConnection conexao = arquivo.openConnection();
            InputStreamReader fluxoDeEntrada = new InputStreamReader(conexao
                                                            .getInputStream());
        return fluxoDeEntrada;
    }
    public static String obtenhaUrl() {
        String urlFornecida = leia.nextLine();
        if (urlFornecida.isEmpty()) {
            urlFornecida = url;
        }
        return urlFornecida;
    }
}
