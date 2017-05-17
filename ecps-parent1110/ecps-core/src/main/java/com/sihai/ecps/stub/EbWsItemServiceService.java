package com.sihai.ecps.stub;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2017-03-09T17:24:32.708+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "EbWsItemServiceService", 
                  wsdlLocation = "http://localhost:8089/ecps-portal/services/publishItem?wsdl",
                  targetNamespace = "http://service.ws.ecps.sihai.com/") 
public class EbWsItemServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.ws.ecps.sihai.com/", "EbWsItemServiceService");
    public final static QName EbWsItemServicePort = new QName("http://service.ws.ecps.sihai.com/", "EbWsItemServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8089/ecps-portal/services/publishItem?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EbWsItemServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8089/ecps-portal/services/publishItem?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EbWsItemServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EbWsItemServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EbWsItemServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EbWsItemServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EbWsItemServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EbWsItemServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName);
    }

    /**
     *
     * @return
     *     returns EbWsItemService
     */
    @WebEndpoint(name = "EbWsItemServicePort")
    public EbWsItemService getEbWsItemServicePort() {
        return super.getPort(EbWsItemServicePort, EbWsItemService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EbWsItemService
     */
    @WebEndpoint(name = "EbWsItemServicePort")
    public EbWsItemService getEbWsItemServicePort(WebServiceFeature... features) {
        return super.getPort(EbWsItemServicePort, EbWsItemService.class, features);
    }

}