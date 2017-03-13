
package com.ucca.common;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ucca.common package. 
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

    private final static QName _BalancePostTime_QNAME = new QName("http://common.ucca.com", "post_time");
    private final static QName _BalanceSpendBalance_QNAME = new QName("http://common.ucca.com", "spend_balance");
    private final static QName _BalanceTipsbak_QNAME = new QName("http://common.ucca.com", "tipsbak");
    private final static QName _BalanceSpendTime_QNAME = new QName("http://common.ucca.com", "spend_time");
    private final static QName _BalanceTranstype_QNAME = new QName("http://common.ucca.com", "transtype");
    private final static QName _BalanceSpendPlace_QNAME = new QName("http://common.ucca.com", "spend_place");
    private final static QName _BalanceEmployeeBalance_QNAME = new QName("http://common.ucca.com", "employee_balance");
    private final static QName _BalanceSpendCompany_QNAME = new QName("http://common.ucca.com", "spend_company");
    private final static QName _EmployeeCardId_QNAME = new QName("http://common.ucca.com", "card_id");
    private final static QName _EmployeeCareDate_QNAME = new QName("http://common.ucca.com", "care_date");
    private final static QName _EmployeeEmployeeName_QNAME = new QName("http://common.ucca.com", "employee_name");
    private final static QName _EmployeeEmployeeId_QNAME = new QName("http://common.ucca.com", "employee_id");
    private final static QName _EmployeeCardStatus_QNAME = new QName("http://common.ucca.com", "card_status");
    private final static QName _AccountStatus_QNAME = new QName("http://common.ucca.com", "status");
    private final static QName _AccountName_QNAME = new QName("http://common.ucca.com", "name");
    private final static QName _AccountExpectBalance_QNAME = new QName("http://common.ucca.com", "expect_balance");
    private final static QName _AccountEmployId_QNAME = new QName("http://common.ucca.com", "employId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ucca.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfEmployee }
     * 
     */
    public ArrayOfEmployee createArrayOfEmployee() {
        return new ArrayOfEmployee();
    }

    /**
     * Create an instance of {@link ArrayOfBalance }
     * 
     */
    public ArrayOfBalance createArrayOfBalance() {
        return new ArrayOfBalance();
    }

    /**
     * Create an instance of {@link ArrayOfAccount }
     * 
     */
    public ArrayOfAccount createArrayOfAccount() {
        return new ArrayOfAccount();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link Balance }
     * 
     */
    public Balance createBalance() {
        return new Balance();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "post_time", scope = Balance.class)
    public JAXBElement<String> createBalancePostTime(String value) {
        return new JAXBElement<String>(_BalancePostTime_QNAME, String.class, Balance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "spend_balance", scope = Balance.class)
    public JAXBElement<BigDecimal> createBalanceSpendBalance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BalanceSpendBalance_QNAME, BigDecimal.class, Balance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "tipsbak", scope = Balance.class)
    public JAXBElement<String> createBalanceTipsbak(String value) {
        return new JAXBElement<String>(_BalanceTipsbak_QNAME, String.class, Balance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "spend_time", scope = Balance.class)
    public JAXBElement<String> createBalanceSpendTime(String value) {
        return new JAXBElement<String>(_BalanceSpendTime_QNAME, String.class, Balance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "transtype", scope = Balance.class)
    public JAXBElement<String> createBalanceTranstype(String value) {
        return new JAXBElement<String>(_BalanceTranstype_QNAME, String.class, Balance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "spend_place", scope = Balance.class)
    public JAXBElement<String> createBalanceSpendPlace(String value) {
        return new JAXBElement<String>(_BalanceSpendPlace_QNAME, String.class, Balance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "employee_balance", scope = Balance.class)
    public JAXBElement<BigDecimal> createBalanceEmployeeBalance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BalanceEmployeeBalance_QNAME, BigDecimal.class, Balance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "spend_company", scope = Balance.class)
    public JAXBElement<String> createBalanceSpendCompany(String value) {
        return new JAXBElement<String>(_BalanceSpendCompany_QNAME, String.class, Balance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "card_id", scope = Employee.class)
    public JAXBElement<String> createEmployeeCardId(String value) {
        return new JAXBElement<String>(_EmployeeCardId_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "care_date", scope = Employee.class)
    public JAXBElement<String> createEmployeeCareDate(String value) {
        return new JAXBElement<String>(_EmployeeCareDate_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "employee_name", scope = Employee.class)
    public JAXBElement<String> createEmployeeEmployeeName(String value) {
        return new JAXBElement<String>(_EmployeeEmployeeName_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "employee_id", scope = Employee.class)
    public JAXBElement<String> createEmployeeEmployeeId(String value) {
        return new JAXBElement<String>(_EmployeeEmployeeId_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "card_status", scope = Employee.class)
    public JAXBElement<String> createEmployeeCardStatus(String value) {
        return new JAXBElement<String>(_EmployeeCardStatus_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "status", scope = Account.class)
    public JAXBElement<String> createAccountStatus(String value) {
        return new JAXBElement<String>(_AccountStatus_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "name", scope = Account.class)
    public JAXBElement<String> createAccountName(String value) {
        return new JAXBElement<String>(_AccountName_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "expect_balance", scope = Account.class)
    public JAXBElement<BigDecimal> createAccountExpectBalance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AccountExpectBalance_QNAME, BigDecimal.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "employId", scope = Account.class)
    public JAXBElement<String> createAccountEmployId(String value) {
        return new JAXBElement<String>(_AccountEmployId_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.ucca.com", name = "employee_balance", scope = Account.class)
    public JAXBElement<BigDecimal> createAccountEmployeeBalance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BalanceEmployeeBalance_QNAME, BigDecimal.class, Account.class, value);
    }

}
