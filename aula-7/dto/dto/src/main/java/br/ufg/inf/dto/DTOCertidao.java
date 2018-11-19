/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DTOCertidao")
public class DTOCertidao extends ParserJsonXML<DTOCertidao>{
    private String identificador;
    private long tipo;
    private String cartorio;
    private long livro;

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public long getTipo() {
        return tipo;
    }

    public void setTipo(long tipo) {
        this.tipo = tipo;
    }

    public String getCartorio() {
        return cartorio;
    }

    public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
    }

    public long getLivro() {
        return livro;
    }

    public void setLivro(long livro) {
        this.livro = livro;
    }

    public long getFolha() {
        return folha;
    }

    public void setFolha(long folha) {
        this.folha = folha;
    }

    public long getTermo() {
        return termo;
    }

    public void setTermo(long termo) {
        this.termo = termo;
    }
    private long folha;
    private long termo;
}
