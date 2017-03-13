
package com.ucca.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Employee complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="card_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="card_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="care_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", propOrder = {
    "cardId",
    "cardStatus",
    "careDate",
    "employeeId",
    "employeeName"
})
public class Employee {

    @XmlElementRef(name = "card_id", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardId;
    @XmlElementRef(name = "card_status", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardStatus;
    @XmlElementRef(name = "care_date", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> careDate;
    @XmlElementRef(name = "employee_id", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeId;
    @XmlElementRef(name = "employee_name", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeName;

    /**
     * 获取cardId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardId() {
        return cardId;
    }

    /**
     * 设置cardId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardId(JAXBElement<String> value) {
        this.cardId = value;
    }

    /**
     * 获取cardStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardStatus() {
        return cardStatus;
    }

    /**
     * 设置cardStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardStatus(JAXBElement<String> value) {
        this.cardStatus = value;
    }

    /**
     * 获取careDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCareDate() {
        return careDate;
    }

    /**
     * 设置careDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCareDate(JAXBElement<String> value) {
        this.careDate = value;
    }

    /**
     * 获取employeeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置employeeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeId(JAXBElement<String> value) {
        this.employeeId = value;
    }

    /**
     * 获取employeeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置employeeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeName(JAXBElement<String> value) {
        this.employeeName = value;
    }

}
