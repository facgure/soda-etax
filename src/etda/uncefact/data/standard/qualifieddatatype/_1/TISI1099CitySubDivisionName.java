//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 02:43:46 PM ICT 
//


package etda.uncefact.data.standard.qualifieddatatype._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import un.unece.uncefact.identifierlist.standard.citysubdivisionnamefromtisi1099_2548.CitySubDivisionNameCodeContentType;
import un.unece.uncefact.identifierlist.standard.citysubdivisionnamefromtisi1099_2548.ICitySubDivisionNameCodeContentType;


/**
 * <p>Java class for TISI1099CitySubDivisionName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TISI1099CitySubDivisionName">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:un:unece:uncefact:identifierlist:standard:CitySubDivisionNameFromTISI1099_2548>CitySubDivisionNameCodeContentType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TISI1099CitySubDivisionName", propOrder = {
    "value"
})
public class TISI1099CitySubDivisionName {

    @XmlValue
    protected CitySubDivisionNameCodeContentType value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link CitySubDivisionNameCodeContentType }
     *     
     */
    public CitySubDivisionNameCodeContentType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitySubDivisionNameCodeContentType }
     *     
     */
    public void setValue(CitySubDivisionNameCodeContentType value) {
        this.value = value;
    }

}
