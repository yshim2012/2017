
package com.ucca.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Employee complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcardId���Ե�ֵ��
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
     * ����cardId���Ե�ֵ��
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
     * ��ȡcardStatus���Ե�ֵ��
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
     * ����cardStatus���Ե�ֵ��
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
     * ��ȡcareDate���Ե�ֵ��
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
     * ����careDate���Ե�ֵ��
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
     * ��ȡemployeeId���Ե�ֵ��
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
     * ����employeeId���Ե�ֵ��
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
     * ��ȡemployeeName���Ե�ֵ��
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
     * ����employeeName���Ե�ֵ��
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
