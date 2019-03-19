
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package fr.eseo.ee.servicesweb3;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-03-19T17:41:41.303+01:00
 * Generated source version: 3.3.0
 *
 */

@javax.jws.WebService(
                      serviceName = "GestionHotelMethodes3Service",
                      portName = "GestionHotelMethodes3Port",
                      targetNamespace = "http://servicesweb3.ee.eseo.fr/",
                      wsdlLocation = "http://localhost:8080/ProjetGestionHotelSW/services/GestionHotelMethodes3Port?wsdl",
                      endpointInterface = "fr.eseo.ee.servicesweb3.SEIGestionHotelMethodes3")

public class GestionHotelMethodes3PortImpl implements SEIGestionHotelMethodes3 {

    private static final Logger LOG = Logger.getLogger(GestionHotelMethodes3PortImpl.class.getName());

    /* (non-Javadoc)
     * @see fr.eseo.ee.servicesweb3.SEIGestionHotelMethodes3#reserverChambre(fr.eseo.ee.servicesweb3.Reservation arg0)*
     */
    public int reserverChambre(fr.eseo.ee.servicesweb3.Reservation arg0) {
        LOG.info("Executing operation reserverChambre");
        System.out.println(arg0);
        try {
            int _return = 1341060081;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see fr.eseo.ee.servicesweb3.SEIGestionHotelMethodes3#trouverChambre(fr.eseo.ee.servicesweb3.Chambre arg0, int arg1, int arg2, java.lang.String arg3, java.lang.String arg4)*
     */
    public java.util.List<fr.eseo.ee.servicesweb3.Chambre> trouverChambre(fr.eseo.ee.servicesweb3.Chambre arg0, int arg1, int arg2, java.lang.String arg3, java.lang.String arg4) {
        LOG.info("Executing operation trouverChambre");
        System.out.println(arg0);
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
        System.out.println(arg4);
        try {
            java.util.List<fr.eseo.ee.servicesweb3.Chambre> _return = new java.util.ArrayList<fr.eseo.ee.servicesweb3.Chambre>();
            fr.eseo.ee.servicesweb3.Chambre _returnVal1 = new fr.eseo.ee.servicesweb3.Chambre();
            _returnVal1.setIdChambre(-155296756);
            _returnVal1.setNbPlaceLit(-573398944);
            _returnVal1.setPrixJournalier(0.20854837f);
            _returnVal1.setTypeChambre("TypeChambre1454085314");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see fr.eseo.ee.servicesweb3.SEIGestionHotelMethodes3#payerChambre(int arg0)*
     */
    public boolean payerChambre(int arg0) {
        LOG.info("Executing operation payerChambre");
        System.out.println(arg0);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see fr.eseo.ee.servicesweb3.SEIGestionHotelMethodes3#annulerChambre(int arg0)*
     */
    public boolean annulerChambre(int arg0) {
        LOG.info("Executing operation annulerChambre");
        System.out.println(arg0);
        try {
            boolean _return = true;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see fr.eseo.ee.servicesweb3.SEIGestionHotelMethodes3#connexion(java.lang.String arg0, java.lang.String arg1)*
     */
    public int connexion(java.lang.String arg0, java.lang.String arg1) {
        LOG.info("Executing operation connexion");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            int _return = 1811769817;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
