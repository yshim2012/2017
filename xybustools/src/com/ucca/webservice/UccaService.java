
package com.ucca.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UccaService", targetNamespace = "http://webservice.ucca.com", wsdlLocation = "http://10.122.12.141:8081/WSTest/services/UccaService?wsdl")
public class UccaService
    extends Service
{

    private final static URL UCCASERVICE_WSDL_LOCATION;
    private final static WebServiceException UCCASERVICE_EXCEPTION;
    private final static QName UCCASERVICE_QNAME = new QName("http://webservice.ucca.com", "UccaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.122.12.141:8081/WSTest/services/UccaService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UCCASERVICE_WSDL_LOCATION = url;
        UCCASERVICE_EXCEPTION = e;
    }

    public UccaService() {
        super(__getWsdlLocation(), UCCASERVICE_QNAME);
    }

    public UccaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), UCCASERVICE_QNAME, features);
    }

    public UccaService(URL wsdlLocation) {
        super(wsdlLocation, UCCASERVICE_QNAME);
    }

    public UccaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UCCASERVICE_QNAME, features);
    }

    public UccaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UccaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UccaServicePortType
     */
    @WebEndpoint(name = "UccaServiceHttpPort")
    public UccaServicePortType getUccaServiceHttpPort() {
        return super.getPort(new QName("http://webservice.ucca.com", "UccaServiceHttpPort"), UccaServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UccaServicePortType
     */
    @WebEndpoint(name = "UccaServiceHttpPort")
    public UccaServicePortType getUccaServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.ucca.com", "UccaServiceHttpPort"), UccaServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UCCASERVICE_EXCEPTION!= null) {
            throw UCCASERVICE_EXCEPTION;
        }
        return UCCASERVICE_WSDL_LOCATION;
    }

}
