//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.11 a las 06:47:43 PM CDT 
//


package org.example.aerolinea;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="boleto" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idBoleto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="asiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "boleto"
})
@XmlRootElement(name = "ListarBoletosResponse")
public class ListarBoletosResponse {

    @XmlElement(required = true)
    protected List<ListarBoletosResponse.Boleto> boleto;

    /**
     * Gets the value of the boleto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boleto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoleto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListarBoletosResponse.Boleto }
     * 
     * 
     */
    public List<ListarBoletosResponse.Boleto> getBoleto() {
        if (boleto == null) {
            boleto = new ArrayList<ListarBoletosResponse.Boleto>();
        }
        return this.boleto;
    }


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
     *         &lt;element name="idBoleto" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="asiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pago" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "idBoleto",
        "fecha",
        "origen",
        "destino",
        "asiento",
        "pago"
    })
    public static class Boleto {

        protected int idBoleto;
        @XmlElement(required = true)
        protected String fecha;
        @XmlElement(required = true)
        protected String origen;
        @XmlElement(required = true)
        protected String destino;
        @XmlElement(required = true)
        protected String asiento;
        @XmlElement(required = true)
        protected String pago;

        public Boleto() {
			// TODO Auto-generated constructor stub
		}
        
        

		public Boleto(int idBoleto, String fecha, String origen, String destino, String asiento, String pago) {
			this.idBoleto = idBoleto;
			this.fecha = fecha;
			this.origen = origen;
			this.destino = destino;
			this.asiento = asiento;
			this.pago = pago;
		}



		/**
         * Obtiene el valor de la propiedad idBoleto.
         * 
         */
        public int getIdBoleto() {
            return idBoleto;
        }

        /**
         * Define el valor de la propiedad idBoleto.
         * 
         */
        public void setIdBoleto(int value) {
            this.idBoleto = value;
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
         * Obtiene el valor de la propiedad origen.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigen() {
            return origen;
        }

        /**
         * Define el valor de la propiedad origen.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigen(String value) {
            this.origen = value;
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
         * Obtiene el valor de la propiedad asiento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAsiento() {
            return asiento;
        }

        /**
         * Define el valor de la propiedad asiento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAsiento(String value) {
            this.asiento = value;
        }

        /**
         * Obtiene el valor de la propiedad pago.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPago() {
            return pago;
        }

        /**
         * Define el valor de la propiedad pago.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPago(String value) {
            this.pago = value;
        }

    }

}
