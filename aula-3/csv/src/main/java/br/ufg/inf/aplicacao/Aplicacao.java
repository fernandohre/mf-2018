
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

public class Aplicacao {
    
    private static String _url = "http://repositorio.dados.gov.br/educacao/CADASTRO%20DAS%20IES_2011.csv";
    private static URL _arquivo;
    private static BufferedReader _leitor;
    private static String _linha = "";
    private static String _separador = ";";
    public static void main(String[] args) {
        
        try {
            _arquivo = new URL(_url);
            URLConnection conexao = _arquivo.openConnection();
            InputStreamReader entrada = new InputStreamReader(conexao.getInputStream());
            _leitor = new BufferedReader(entrada);
            while ((_linha = _leitor.readLine()) != null) {
                String partes[] = _linha.split(_separador);
                System.out.println(partes[0]);
            }
             
        } catch (Exception ex) {
        
        }
        
    }
}
