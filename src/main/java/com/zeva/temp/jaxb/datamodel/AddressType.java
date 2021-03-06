//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.16 at 11:23:28 AM EST 
//


package com.zeva.temp.jaxb.datamodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}PostalAddresses"/>
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}ElectronicAddress"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "postalAddresses",
    "electronicAddress"
})
public class AddressType {

    @XmlElement(name = "PostalAddresses", required = true)
    protected PostalAddressListType postalAddresses;
    @XmlElement(name = "ElectronicAddress", required = true)
    protected ElectronicAddressType electronicAddress;

    /**
     * Gets the value of the postalAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressListType }
     *     
     */
    public PostalAddressListType getPostalAddresses() {
        return postalAddresses;
    }

    /**
     * Sets the value of the postalAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressListType }
     *     
     */
    public void setPostalAddresses(PostalAddressListType value) {
        this.postalAddresses = value;
    }

    /**
     * Gets the value of the electronicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicAddressType }
     *     
     */
    public ElectronicAddressType getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * Sets the value of the electronicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicAddressType }
     *     
     */
    public void setElectronicAddress(ElectronicAddressType value) {
        this.electronicAddress = value;
    }

}
