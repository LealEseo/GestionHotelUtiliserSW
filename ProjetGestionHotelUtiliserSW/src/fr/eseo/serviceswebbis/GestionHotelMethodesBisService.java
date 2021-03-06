package fr.eseo.serviceswebbis;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-03-14T15:25:15.330+01:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "GestionHotelMethodesBisService",
                  wsdlLocation = "http://localhost:8080/ProjetGestionHotelSW/services/GestionHotelMethodesBisPort?wsdl",
                  targetNamespace = "http://serviceswebbis.eseo.fr/")
public class GestionHotelMethodesBisService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://serviceswebbis.eseo.fr/", "GestionHotelMethodesBisService");
    public final static QName GestionHotelMethodesBisPort = new QName("http://serviceswebbis.eseo.fr/", "GestionHotelMethodesBisPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ProjetGestionHotelSW/services/GestionHotelMethodesBisPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GestionHotelMethodesBisService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ProjetGestionHotelSW/services/GestionHotelMethodesBisPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GestionHotelMethodesBisService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GestionHotelMethodesBisService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionHotelMethodesBisService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public GestionHotelMethodesBisService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GestionHotelMethodesBisService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GestionHotelMethodesBisService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SEIGestionHotelMethodeBis
     */
    @WebEndpoint(name = "GestionHotelMethodesBisPort")
    public SEIGestionHotelMethodeBis getGestionHotelMethodesBisPort() {
        return super.getPort(GestionHotelMethodesBisPort, SEIGestionHotelMethodeBis.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SEIGestionHotelMethodeBis
     */
    @WebEndpoint(name = "GestionHotelMethodesBisPort")
    public SEIGestionHotelMethodeBis getGestionHotelMethodesBisPort(WebServiceFeature... features) {
        return super.getPort(GestionHotelMethodesBisPort, SEIGestionHotelMethodeBis.class, features);
    }

}
