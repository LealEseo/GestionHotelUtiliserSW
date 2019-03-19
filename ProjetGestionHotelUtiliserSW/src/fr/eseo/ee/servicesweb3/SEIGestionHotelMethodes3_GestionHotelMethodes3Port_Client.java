
package fr.eseo.ee.servicesweb3;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-03-19T17:41:41.210+01:00
 * Generated source version: 3.3.0
 *
 */
public final class SEIGestionHotelMethodes3_GestionHotelMethodes3Port_Client {

    private static final QName SERVICE_NAME = new QName("http://servicesweb3.ee.eseo.fr/", "GestionHotelMethodes3Service");

    private SEIGestionHotelMethodes3_GestionHotelMethodes3Port_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GestionHotelMethodes3Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        GestionHotelMethodes3Service ss = new GestionHotelMethodes3Service(wsdlURL, SERVICE_NAME);
        SEIGestionHotelMethodes3 port = ss.getGestionHotelMethodes3Port();

        {
        System.out.println("Invoking reserverChambre...");
        fr.eseo.ee.servicesweb3.Reservation _reserverChambre_arg0 = new fr.eseo.ee.servicesweb3.Reservation();
        _reserverChambre_arg0.setDateDeb(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2019-03-19T17:41:41.288+01:00"));
        _reserverChambre_arg0.setDateDebString("DateDebString1488794655");
        _reserverChambre_arg0.setDateFin(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2019-03-19T17:41:41.288+01:00"));
        _reserverChambre_arg0.setDateFinString("DateFinString-289589915");
        _reserverChambre_arg0.setIdChambre(-79818722);
        _reserverChambre_arg0.setIdClient(644504247);
        _reserverChambre_arg0.setIdReservation(-1767940209);
        _reserverChambre_arg0.setNbPlaces(1121210884);
        _reserverChambre_arg0.setPaiementEffectue(true);
        int _reserverChambre__return = port.reserverChambre(_reserverChambre_arg0);
        System.out.println("reserverChambre.result=" + _reserverChambre__return);


        }
        {
        System.out.println("Invoking trouverChambre...");
        fr.eseo.ee.servicesweb3.Chambre _trouverChambre_arg0 = new fr.eseo.ee.servicesweb3.Chambre();
        _trouverChambre_arg0.setIdChambre(-1355286132);
        _trouverChambre_arg0.setNbPlaceLit(287611847);
        _trouverChambre_arg0.setPrixJournalier(0.62372065f);
        _trouverChambre_arg0.setTypeChambre("TypeChambre2000785625");
        int _trouverChambre_arg1 = 524603064;
        int _trouverChambre_arg2 = 1581601977;
        java.lang.String _trouverChambre_arg3 = "_trouverChambre_arg3266245429";
        java.lang.String _trouverChambre_arg4 = "_trouverChambre_arg4-395005380";
        java.util.List<fr.eseo.ee.servicesweb3.Chambre> _trouverChambre__return = port.trouverChambre(_trouverChambre_arg0, _trouverChambre_arg1, _trouverChambre_arg2, _trouverChambre_arg3, _trouverChambre_arg4);
        System.out.println("trouverChambre.result=" + _trouverChambre__return);


        }
        {
        System.out.println("Invoking payerChambre...");
        int _payerChambre_arg0 = -956305865;
        boolean _payerChambre__return = port.payerChambre(_payerChambre_arg0);
        System.out.println("payerChambre.result=" + _payerChambre__return);


        }
        {
        System.out.println("Invoking annulerChambre...");
        int _annulerChambre_arg0 = 2134449453;
        boolean _annulerChambre__return = port.annulerChambre(_annulerChambre_arg0);
        System.out.println("annulerChambre.result=" + _annulerChambre__return);


        }
        {
        System.out.println("Invoking connexion...");
        java.lang.String _connexion_arg0 = "_connexion_arg0-1683339414";
        java.lang.String _connexion_arg1 = "_connexion_arg12020108952";
        int _connexion__return = port.connexion(_connexion_arg0, _connexion_arg1);
        System.out.println("connexion.result=" + _connexion__return);


        }

        System.exit(0);
    }

}
