
package nl.han.dateplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="input" type="{http://www.han.nl/schemas/dateplanner}DateOptions"/>
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
    "input"
})
@XmlRootElement(name = "DatePlannerRequest", namespace = "http://www.han.nl/schemas/dateplanner")
public class DatePlannerRequest {

    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    protected DateOptions input;

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link DateOptions }
     *     
     */
    public DateOptions getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOptions }
     *     
     */
    public void setInput(DateOptions value) {
        this.input = value;
    }

}
