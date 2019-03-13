
package fr.eseo.servicesweb;

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
 * 2019-03-13T08:23:35.967+01:00
 * Generated source version: 3.3.0
 *
 */
public final class SEIGestionHotelMethodes_GestionHotelMethodesPort_Client {

    private static final QName SERVICE_NAME = new QName("http://servicesweb.eseo.fr/", "GestionHotelMethodesService");

    private SEIGestionHotelMethodes_GestionHotelMethodesPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GestionHotelMethodesService.WSDL_LOCATION;
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

        GestionHotelMethodesService ss = new GestionHotelMethodesService(wsdlURL, SERVICE_NAME);
        SEIGestionHotelMethodes port = ss.getGestionHotelMethodesPort();

        {
        System.out.println("Invoking reserverChambre...");
        fr.eseo.servicesweb.Reservation _reserverChambre_arg0 = new fr.eseo.servicesweb.Reservation();
        fr.eseo.servicesweb.Date _reserverChambre_arg0DateDeb = new fr.eseo.servicesweb.Date();
        _reserverChambre_arg0.setDateDeb(_reserverChambre_arg0DateDeb);
        fr.eseo.servicesweb.Date _reserverChambre_arg0DateFin = new fr.eseo.servicesweb.Date();
        _reserverChambre_arg0.setDateFin(_reserverChambre_arg0DateFin);
        _reserverChambre_arg0.setIdChambre(344929030);
        _reserverChambre_arg0.setIdClient(1199455815);
        _reserverChambre_arg0.setIdReservation(-470686239);
        _reserverChambre_arg0.setNbPlaces(1069616673);
        _reserverChambre_arg0.setPaiementEffectue(true);
        int _reserverChambre__return = port.reserverChambre(_reserverChambre_arg0);
        System.out.println("reserverChambre.result=" + _reserverChambre__return);


        }
        {
        System.out.println("Invoking trouverChambre...");
        fr.eseo.servicesweb.Chambre _trouverChambre_arg0 = new fr.eseo.servicesweb.Chambre();
        _trouverChambre_arg0.setIdChambre(-1213188462);
        _trouverChambre_arg0.setNbPlaceLit(1781241611);
        _trouverChambre_arg0.setPrixJournalier(0.22327179f);
        _trouverChambre_arg0.setTypeChambre("TypeChambre-2044262385");
        int _trouverChambre_arg1 = -1312756149;
        int _trouverChambre_arg2 = 375220082;
        java.lang.String _trouverChambre_arg3 = "_trouverChambre_arg31901117148";
        java.lang.String _trouverChambre_arg4 = "_trouverChambre_arg4-1843892861";
        java.util.List<fr.eseo.servicesweb.Chambre> _trouverChambre__return = port.trouverChambre(_trouverChambre_arg0, _trouverChambre_arg1, _trouverChambre_arg2, _trouverChambre_arg3, _trouverChambre_arg4);
        System.out.println("trouverChambre.result=" + _trouverChambre__return);


        }
        {
        System.out.println("Invoking annulerChambre...");
        int _annulerChambre_arg0 = -1446770805;
        boolean _annulerChambre__return = port.annulerChambre(_annulerChambre_arg0);
        System.out.println("annulerChambre.result=" + _annulerChambre__return);


        }
        {
        System.out.println("Invoking payerChambre...");
        int _payerChambre_arg0 = -1219593275;
        boolean _payerChambre__return = port.payerChambre(_payerChambre_arg0);
        System.out.println("payerChambre.result=" + _payerChambre__return);


        }

        System.exit(0);
    }

}