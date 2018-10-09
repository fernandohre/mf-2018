
package br.ufg.inf.aplicacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
    private static int NUM_LINHAS_IGNORADAS = 10;
    private static int POSICAO_ESTADO = 9;
    private static Scanner leia = new Scanner(System.in);
    private static final HashMap dicionarioDeEstados = new HashMap<String, 
                                                                   Integer>();
    private static final Integer UNIVERSIDADE_ENCONTRADA = 1;
    public static void main(String[] args) {
        try {
            String urlFornecida = leia.nextLine();
            if (urlFornecida.isEmpty()) {
                urlFornecida = url;
            }
            arquivo = new URL(urlFornecida);
            URLConnection conexao = arquivo.openConnection();
            InputStreamReader entrada = new InputStreamReader(conexao
                                                            .getInputStream());
            leitor = new BufferedReader(entrada);
            int contador = 0;
            int numeroDeUniversidades = 0;
            while ((linha = leitor.readLine()) != null) {
                if (contador < NUM_LINHAS_IGNORADAS) {
                    contador++;
                    continue;
                }
                String partes[] = linha.split(SEPARADOR);
                if (!(partes.length < POSICAO_ESTADO)) {
                    if (!dicionarioDeEstados
                            .containsKey(partes[POSICAO_ESTADO])) {
                        dicionarioDeEstados.put(partes[POSICAO_ESTADO], 
                                            UNIVERSIDADE_ENCONTRADA);
                    }
                    int quantidadeDeUniversidades = (int) dicionarioDeEstados
                                                .get(partes[POSICAO_ESTADO]);
                    dicionarioDeEstados.put(partes[POSICAO_ESTADO], 
                                        quantidadeDeUniversidades + 1);
                }
                dicionarioDeEstados.forEach((chave, valor) -> { 
                    System.out.println(chave + " " + valor);
                });
            }
            
            
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro! o program será finalizado...");
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
