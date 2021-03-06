package com.acme.services.event;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * Acme Event service
 *
 * This class was generated by Apache CXF 3.2.4
 * 2018-04-16T02:47:10.291+01:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "Event_Service",
                  wsdlLocation = "classpath:wsdl/event.wsdl",
                  targetNamespace = "http://acme.com/services/event")
public class EventService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://acme.com/services/event", "Event_Service");
    public final static QName EventPort = new QName("http://acme.com/services/event", "Event_Port");
    static {
        URL url = EventService.class.getClassLoader().getResource("wsdl/event.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(EventService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/event.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EventService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EventService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EventService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public EventService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EventService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EventService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns EventPortType
     */
    @WebEndpoint(name = "Event_Port")
    public EventPortType getEventPort() {
        return super.getPort(EventPort, EventPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EventPortType
     */
    @WebEndpoint(name = "Event_Port")
    public EventPortType getEventPort(WebServiceFeature... features) {
        return super.getPort(EventPort, EventPortType.class, features);
    }

}
