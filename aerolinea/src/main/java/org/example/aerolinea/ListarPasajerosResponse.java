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
 *         &lt;element name="pasajero" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idPasajero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "pasajero"
})
@XmlRootElement(name = "ListarPasajerosResponse")
public class ListarPasajerosResponse {

    @XmlElement(required = true)
    protected List<ListarPasajerosResponse.Pasajero> pasajero;

    /**
     * Gets the value of the pasajero property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pasajero property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPasajero().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListarPasajerosResponse.Pasajero }
     * 
     * 
     */
    public List<ListarPasajerosResponse.Pasajero> getPasajero() {
        if (pasajero == null) {
            pasajero = new ArrayList<ListarPasajerosResponse.Pasajero>();
        }
        return this.pasajero;
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
     *         &lt;element name="idPasajero" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "idPasajero",
        "nombre",
        "apellido",
        "direccion",
        "telefono",
        "correo"
    })
    public static class Pasajero {

        protected int idPasajero;
        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(required = true)
        protected String apellido;
        @XmlElement(required = true)
        protected String direccion;
        @XmlElement(required = true)
        protected String telefono;
        @XmlElement(required = true)
        protected String correo;

        public Pasajero() {
			// TODO Auto-generated constructor stub
		}
        
        

		public Pasajero(int idPasajero, String nombre, String apellido, String direccion, String telefono,
				String correo) {
			this.idPasajero = idPasajero;
			this.nombre = nombre;
			this.apellido = apellido;
			this.direccion = direccion;
			this.telefono = telefono;
			this.correo = correo;
		}



		/**
         * Obtiene el valor de la propiedad idPasajero.
         * 
         */
        public int getIdPasajero() {
            return idPasajero;
        }

        /**
         * Define el valor de la propiedad idPasajero.
         * 
         */
        public void setIdPasajero(int value) {
            this.idPasajero = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad apellido.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApellido() {
            return apellido;
        }

        /**
         * Define el valor de la propiedad apellido.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApellido(String value) {
            this.apellido = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefono() {
            return telefono;
        }

        /**
         * Define el valor de la propiedad telefono.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefono(String value) {
            this.telefono = value;
        }

        /**
         * Obtiene el valor de la propiedad correo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorreo() {
            return correo;
        }

        /**
         * Define el valor de la propiedad correo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorreo(String value) {
            this.correo = value;
        }

    }

}
