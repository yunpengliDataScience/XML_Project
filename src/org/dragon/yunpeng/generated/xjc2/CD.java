//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.31 at 07:22:49 PM EDT 
//


package org.dragon.yunpeng.generated.xjc2;

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
 *         &lt;element ref="{}TITLE"/>
 *         &lt;element ref="{}ARTIST"/>
 *         &lt;element ref="{}COUNTRY"/>
 *         &lt;element ref="{}COMPANY"/>
 *         &lt;element ref="{}PRICE"/>
 *         &lt;element ref="{}YEAR"/>
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
    "title",
    "artist",
    "country",
    "company",
    "price",
    "year"
})
@XmlRootElement(name = "CD")
public class CD {

    @XmlElement(name = "TITLE", required = true)
    protected String title;
    @XmlElement(name = "ARTIST", required = true)
    protected String artist;
    @XmlElement(name = "COUNTRY", required = true)
    protected String country;
    @XmlElement(name = "COMPANY", required = true)
    protected String company;
    @XmlElement(name = "PRICE")
    protected float price;
    @XmlElement(name = "YEAR")
    protected short year;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITLE(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the artist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARTIST() {
        return artist;
    }

    /**
     * Sets the value of the artist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARTIST(String value) {
        this.artist = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANY() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANY(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public float getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPRICE(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public short getYEAR() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYEAR(short value) {
        this.year = value;
    }

}
