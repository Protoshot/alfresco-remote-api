
/*
 * 
 */

package org.alfresco.repo.cmis.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.1.2
 * Fri Sep 05 13:45:03 EEST 2008
 * Generated source version: 2.1.2
 * 
 */


@WebServiceClient(name = "RelationshipService", 
                  wsdlLocation = "file:/D:/work/CMIS-WS/CMIS-WS/web/wsdl/cmis/RelationshipService.wsdl",
                  targetNamespace = "http://www.cmis.org/2008/05") 
public class RelationshipService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://www.cmis.org/2008/05", "RelationshipService");
    public final static QName RelationshipServicePort = new QName("http://www.cmis.org/2008/05", "RelationshipServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/work/CMIS-WS/CMIS-WS/web/wsdl/cmis/RelationshipService.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/D:/work/CMIS-WS/CMIS-WS/web/wsdl/cmis/RelationshipService.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public RelationshipService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RelationshipService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RelationshipService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns RelationshipServicePort
     */
    @WebEndpoint(name = "RelationshipServicePort")
    public RelationshipServicePort getRelationshipServicePort() {
        return super.getPort(RelationshipServicePort, RelationshipServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RelationshipServicePort
     */
    @WebEndpoint(name = "RelationshipServicePort")
    public RelationshipServicePort getRelationshipServicePort(WebServiceFeature... features) {
        return super.getPort(RelationshipServicePort, RelationshipServicePort.class, features);
    }

}
