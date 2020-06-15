//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.11 a las 06:47:43 PM CDT 
//


package org.example.aerolinea;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numPasajeros" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="piloto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aeromosas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modelo",
    "numPasajeros",
    "piloto",
    "aeromosas",
    "destino"
})
@XmlRootElement(name = "ConsultarAvionResponse")
public class ConsultarAvionResponse {

    @XmlElement(required = true)
    protected String modelo;
    protected int numPasajeros;
    @XmlElement(required = true)
    protected String piloto;
    @XmlElement(required = true)
    protected String aeromosas;
    @XmlElement(required = true)
    protected String destino;

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad numPasajeros.
     * 
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }

    /**
     * Define el valor de la propiedad numPasajeros.
     * 
     */
    public void setNumPasajeros(int value) {
        this.numPasajeros = value;
    }

    /**
     * Obtiene el valor de la propiedad piloto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiloto() {
        return piloto;
    }

    /**
     * Define el valor de la propiedad piloto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiloto(String value) {
        this.piloto = value;
    }

    /**
     * Obtiene el valor de la propiedad aeromosas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeromosas() {
        return aeromosas;
    }

    /**
     * Define el valor de la propiedad aeromosas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeromosas(String value) {
        this.aeromosas = value;
    }

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

}
