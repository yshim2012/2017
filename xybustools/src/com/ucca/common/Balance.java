
package com.ucca.common;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Balance complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Balance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee_balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="post_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spend_balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="spend_company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spend_place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spend_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipsbak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Balance", propOrder = {
    "employeeBalance",
    "postTime",
    "spendBalance",
    "spendCompany",
    "spendPlace",
    "spendTime",
    "tipsbak",
    "transtype"
})
public class Balance {

    @XmlElementRef(name = "employee_balance", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> employeeBalance;
    @XmlElementRef(name = "post_time", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postTime;
    @XmlElementRef(name = "spend_balance", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> spendBalance;
    @XmlElementRef(name = "spend_company", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spendCompany;
    @XmlElementRef(name = "spend_place", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spendPlace;
    @XmlElementRef(name = "spend_time", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spendTime;
    @XmlElementRef(name = "tipsbak", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipsbak;
    @XmlElementRef(name = "transtype", namespace = "http://common.ucca.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transtype;

    /**
     * 获取employeeBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEmployeeBalance() {
        return employeeBalance;
    }

    /**
     * 设置employeeBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEmployeeBalance(JAXBElement<BigDecimal> value) {
        this.employeeBalance = value;
    }

    /**
     * 获取postTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostTime() {
        return postTime;
    }

    /**
     * 设置postTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostTime(JAXBElement<String> value) {
        this.postTime = value;
    }

    /**
     * 获取spendBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSpendBalance() {
        return spendBalance;
    }

    /**
     * 设置spendBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSpendBalance(JAXBElement<BigDecimal> value) {
        this.spendBalance = value;
    }

    /**
     * 获取spendCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpendCompany() {
        return spendCompany;
    }

    /**
     * 设置spendCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpendCompany(JAXBElement<String> value) {
        this.spendCompany = value;
    }

    /**
     * 获取spendPlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpendPlace() {
        return spendPlace;
    }

    /**
     * 设置spendPlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpendPlace(JAXBElement<String> value) {
        this.spendPlace = value;
    }

    /**
     * 获取spendTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpendTime() {
        return spendTime;
    }

    /**
     * 设置spendTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpendTime(JAXBElement<String> value) {
        this.spendTime = value;
    }

    /**
     * 获取tipsbak属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipsbak() {
        return tipsbak;
    }

    /**
     * 设置tipsbak属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipsbak(JAXBElement<String> value) {
        this.tipsbak = value;
    }

    /**
     * 获取transtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTranstype() {
        return transtype;
    }

    /**
     * 设置transtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTranstype(JAXBElement<String> value) {
        this.transtype = value;
    }

}
