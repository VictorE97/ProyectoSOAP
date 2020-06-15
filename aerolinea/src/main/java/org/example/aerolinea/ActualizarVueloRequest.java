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
 *         &lt;element name="idVuelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="avion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="horaSalida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="horaLlegada" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idVuelo",
    "avion",
    "destino",
    "fecha",
    "horaSalida",
    "horaLlegada"
})
@XmlRootElement(name = "ActualizarVueloRequest")
public class ActualizarVueloRequest {

    protected int idVuelo;
    @XmlElement(required = true)
    protected String avion;
    @XmlElement(required = true)
    protected String destino;
    @XmlElement(required = true)
    protected String fecha;
    @XmlElement(required = true)
    protected String horaSalida;
    @XmlElement(required = true)
    protected String horaLlegada;

    /**
     * Obtiene el valor de la propiedad idVuelo.
     * 
     */
    public int getIdVuelo() {
        return idVuelo;
    }

    /**
     * Define el valor de la propiedad idVuelo.
     * 
     */
    public void setIdVuelo(int value) {
        this.idVuelo = value;
    }

    /**
     * Obtiene el valor de la propiedad avion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvion() {
        return avion;
    }

    /**
     * Define el valor de la propiedad avion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvion(String value) {
        this.avion = value;
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

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad horaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraSalida() {
        return horaSalida;
    }

    /**
     * Define el valor de la propiedad horaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraSalida(String value) {
        this.horaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad horaLlegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraLlegada() {
        return horaLlegada;
    }

    /**
     * Define el valor de la propiedad horaLlegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraLlegada(String value) {
        this.horaLlegada = value;
    }

}
