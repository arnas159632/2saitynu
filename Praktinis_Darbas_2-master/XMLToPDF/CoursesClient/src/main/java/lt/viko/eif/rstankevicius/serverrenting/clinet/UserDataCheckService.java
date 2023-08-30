
package lt.viko.eif.adrevinskas.serverrenting.clinet;

import jakarta.xml.ws.*;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;



/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserDataCheckService", targetNamespace = "http://www.ServerRenting.lt/viko/eif/adrevinskas/serverrenting/api/userDataCheck", wsdlLocation = "http://localhost:8080/ws/userDataCheck.wsdl")
public class UserDataCheckService
    extends Service
{

    private final static URL USERDATACHECKSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERDATACHECKSERVICE_EXCEPTION;
    private final static QName USERDATACHECKSERVICE_QNAME = new QName("http://www.ServerRenting.lt/viko/eif/adrevinskas/serverrenting/api/userDataCheck", "UserDataCheckService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/userDataCheck.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERDATACHECKSERVICE_WSDL_LOCATION = url;
        USERDATACHECKSERVICE_EXCEPTION = e;
    }

    public UserDataCheckService() {
        super(__getWsdlLocation(), USERDATACHECKSERVICE_QNAME);
    }

    public UserDataCheckService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERDATACHECKSERVICE_QNAME, features);
    }

    public UserDataCheckService(URL wsdlLocation) {
        super(wsdlLocation, USERDATACHECKSERVICE_QNAME);
    }

    public UserDataCheckService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERDATACHECKSERVICE_QNAME, features);
    }

    public UserDataCheckService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserDataCheckService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserDataCheck
     */
    @WebEndpoint(name = "UserDataCheckSoap11")
    public UserDataCheck getUserDataCheckSoap11() {
        return super.getPort(new QName("http://www.ServerRenting.lt/viko/eif/adrevinskas/serverrenting/api/userDataCheck", "UserDataCheckSoap11"), UserDataCheck.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserDataCheck
     */
    @WebEndpoint(name = "UserDataCheckSoap11")
    public UserDataCheck getUserDataCheckSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ServerRenting.lt/viko/eif/adrevinskas/serverrenting/api/userDataCheck", "UserDataCheckSoap11"), UserDataCheck.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERDATACHECKSERVICE_EXCEPTION!= null) {
            throw USERDATACHECKSERVICE_EXCEPTION;
        }
        return USERDATACHECKSERVICE_WSDL_LOCATION;
    }

}
