/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufg.inf.dto;

import java.util.Date;
public class DTODadoDemografico extends ParserJsonXML<DTODadoDemografico> {
    private String individuo;
    private Date nascimento;
    private String nascimentoAcuracia;
    private String nascimentoSeguimento;
    private String nascimentoPluraridade;
    private String nascimentoOrdem;
    private Date dataDeObito;
    private String dataDeObitoAcuracia;
    private String codigoObitoFonte;
    private String sexo;
    private String mae;
    private String pai;
    private long situacaoFamiliar;
    private long raca;
    private String comentario;
    private long codigoNacionalidade;
    private long codigoMunicipio;
    private String estado;
    private long codigoPais;
    private Date dataDeEntradaNoPais;

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNascimentoAcuracia() {
        return nascimentoAcuracia;
    }

    public void setNascimentoAcuracia(String nascimentoAcuracia) {
        this.nascimentoAcuracia = nascimentoAcuracia;
    }

    public String getNascimentoSeguimento() {
        return nascimentoSeguimento;
    }

    public void setNascimentoSeguimento(String nascimentoSeguimento) {
        this.nascimentoSeguimento = nascimentoSeguimento;
    }

    public String getNascimentoPluraridade() {
        return nascimentoPluraridade;
    }

    public void setNascimentoPluraridade(String nascimentoPluraridade) {
        this.nascimentoPluraridade = nascimentoPluraridade;
    }

    public String getNascimentoOrdem() {
        return nascimentoOrdem;
    }

    public void setNascimentoOrdem(String nascimentoOrdem) {
        this.nascimentoOrdem = nascimentoOrdem;
    }

    public Date getDataDeObito() {
        return dataDeObito;
    }

    public void setDataDeObito(Date dataDeObito) {
        this.dataDeObito = dataDeObito;
    }

    public String getDataDeObitoAcuracia() {
        return dataDeObitoAcuracia;
    }

    public void setDataDeObitoAcuracia(String dataDeObitoAcuracia) {
        this.dataDeObitoAcuracia = dataDeObitoAcuracia;
    }

    public String getCodigoObitoFonte() {
        return codigoObitoFonte;
    }

    public void setCodigoObitoFonte(String codigoObitoFonte) {
        this.codigoObitoFonte = codigoObitoFonte;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public long getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    public void setSituacaoFamiliar(long situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    public long getRaca() {
        return raca;
    }

    public void setRaca(long raca) {
        this.raca = raca;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public long getCodigoNacionalidade() {
        return codigoNacionalidade;
    }

    public void setCodigoNacionalidade(long codigoNacionalidade) {
        this.codigoNacionalidade = codigoNacionalidade;
    }

    public long getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(long codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(long codigoPais) {
        this.codigoPais = codigoPais;
    }

    public Date getDataDeEntradaNoPais() {
        return dataDeEntradaNoPais;
    }

    public void setDataDeEntradaNoPais(Date dataDeEntradaNoPais) {
        this.dataDeEntradaNoPais = dataDeEntradaNoPais;
    }
}
