
package com.wangkang.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
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
@WebServiceClient(name = "ServiceService", targetNamespace = "http://service.wangkang.com/", wsdlLocation = "http://localhost:9001/Service/Hello?wsdl")
public class ServiceService
    extends javax.xml.ws.Service
{

    private final static URL SERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICESERVICE_EXCEPTION;
    private final static QName SERVICESERVICE_QNAME = new QName("http://service.wangkang.com/", "ServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9001/Service/Hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICESERVICE_WSDL_LOCATION = url;
        SERVICESERVICE_EXCEPTION = e;
    }

    public ServiceService() {
        super(__getWsdlLocation(), SERVICESERVICE_QNAME);
    }

    public ServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICESERVICE_QNAME, features);
    }

    public ServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICESERVICE_QNAME);
    }

    public ServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICESERVICE_QNAME, features);
    }

    public ServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Service
     */
    @WebEndpoint(name = "ServicePort")
    public com.wangkang.client.Service getServicePort() {
        return super.getPort(new QName("http://service.wangkang.com/", "ServicePort"), Service.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Service
     */
    @WebEndpoint(name = "ServicePort")
    public com.wangkang.client.Service getServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.wangkang.com/", "ServicePort"), Service.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICESERVICE_EXCEPTION!= null) {
            throw SERVICESERVICE_EXCEPTION;
        }
        return SERVICESERVICE_WSDL_LOCATION;
    }

}
