
package es.corpme.course.cxf2.contractfirst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para firstMethod complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="firstMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="aString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "firstMethod", propOrder = {
    "aNumber",
    "aString"
})
public class FirstMethod {

    @XmlElement(nillable = true)
    protected Integer aNumber;
    @XmlElement(nillable = true)
    protected String aString;

    /**
     * Obtiene el valor de la propiedad aNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getANumber() {
        return aNumber;
    }

    /**
     * Define el valor de la propiedad aNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setANumber(Integer value) {
        this.aNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad aString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAString() {
        return aString;
    }

    /**
     * Define el valor de la propiedad aString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAString(String value) {
        this.aString = value;
    }

}
