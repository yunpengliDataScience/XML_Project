//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.31 at 07:22:49 PM EDT 
//


package org.dragon.yunpeng.generated.xjc2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.dragon.yunpeng.generated.xjc2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ARTIST_QNAME = new QName("", "ARTIST");
    private final static QName _COUNTRY_QNAME = new QName("", "COUNTRY");
    private final static QName _PRICE_QNAME = new QName("", "PRICE");
    private final static QName _YEAR_QNAME = new QName("", "YEAR");
    private final static QName _TITLE_QNAME = new QName("", "TITLE");
    private final static QName _COMPANY_QNAME = new QName("", "COMPANY");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.dragon.yunpeng.generated.xjc2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CD }
     * 
     */
    public CD createCD() {
        return new CD();
    }

    /**
     * Create an instance of {@link CATALOG }
     * 
     */
    public CATALOG createCATALOG() {
        return new CATALOG();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ARTIST")
    public JAXBElement<String> createARTIST(String value) {
        return new JAXBElement<String>(_ARTIST_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COUNTRY")
    public JAXBElement<String> createCOUNTRY(String value) {
        return new JAXBElement<String>(_COUNTRY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE")
    public JAXBElement<Float> createPRICE(Float value) {
        return new JAXBElement<Float>(_PRICE_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "YEAR")
    public JAXBElement<Short> createYEAR(Short value) {
        return new JAXBElement<Short>(_YEAR_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TITLE")
    public JAXBElement<String> createTITLE(String value) {
        return new JAXBElement<String>(_TITLE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COMPANY")
    public JAXBElement<String> createCOMPANY(String value) {
        return new JAXBElement<String>(_COMPANY_QNAME, String.class, null, value);
    }

}
