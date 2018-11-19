/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.dto;

import com.google.gson.Gson;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class ParserJsonXML<T> {
    private Gson Gson() {
        return new Gson();
    }
    
    public String toJson() {
        return Gson().toJson(this);
    }
    
    public T fromJson(String json) {
        return Gson().fromJson(json, (Class<T>) this.getClass());
    }
    
    private JAXBContext contexto() throws JAXBException {
        return JAXBContext.newInstance(this.getClass());
    }
    
    public String toXml() {
        StringWriter sw = new StringWriter();
        try {
            Marshaller marshaller = contexto().createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(this, sw);
        } catch(JAXBException e) {
            System.out.println(e.getMessage());
        }

        return sw.toString();
    }

    public T fromXml(String xml) {
        StringReader xmlToConvert = new StringReader(xml);
        try {
            Unmarshaller unmarshaller = contexto().createUnmarshaller();
            T objeto = (T) unmarshaller.unmarshal(xmlToConvert);
            return objeto;
        } catch(JAXBException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
