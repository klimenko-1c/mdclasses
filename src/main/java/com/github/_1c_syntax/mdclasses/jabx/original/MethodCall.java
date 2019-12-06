//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package com.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for MethodCall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodCall"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ret" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="param" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pfc" type="{http://v8.1c.ru/8.2/managed-application/modules}ProcessFormsCloseParam" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}Name" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodCall", namespace = "http://v8.1c.ru/8.2/managed-application/modules", propOrder = {
    "ret",
    "param",
    "pfc"
})
public class MethodCall {

    @XmlElementRef(name = "ret", namespace = "http://v8.1c.ru/8.2/managed-application/modules", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> ret;
    @XmlElement(nillable = true)
    protected List<Object> param;
    @XmlElementRef(name = "pfc", namespace = "http://v8.1c.ru/8.2/managed-application/modules", type = JAXBElement.class, required = false)
    protected JAXBElement<ProcessFormsCloseParam> pfc;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String name;

    /**
     * Gets the value of the ret property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getRet() {
        return ret;
    }

    /**
     * Sets the value of the ret property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setRet(JAXBElement<Object> value) {
        this.ret = value;
    }

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getParam() {
        if (param == null) {
            param = new ArrayList<Object>();
        }
        return this.param;
    }

    /**
     * Gets the value of the pfc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcessFormsCloseParam }{@code >}
     *     
     */
    public JAXBElement<ProcessFormsCloseParam> getPfc() {
        return pfc;
    }

    /**
     * Sets the value of the pfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcessFormsCloseParam }{@code >}
     *     
     */
    public void setPfc(JAXBElement<ProcessFormsCloseParam> value) {
        this.pfc = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}