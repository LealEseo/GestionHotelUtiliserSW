package fr.eseo.servicesweb.test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-03-12T10:21:07.885+01:00
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://test.servicesweb.eseo.fr/", name = "SEITrouverChambreSW")
@XmlSeeAlso({ObjectFactory.class})
public interface SEITrouverChambreSW {

    @WebMethod
    @RequestWrapper(localName = "trouverChambre", targetNamespace = "http://test.servicesweb.eseo.fr/", className = "fr.eseo.servicesweb.test.TrouverChambre")
    @ResponseWrapper(localName = "trouverChambreResponse", targetNamespace = "http://test.servicesweb.eseo.fr/", className = "fr.eseo.servicesweb.test.TrouverChambreResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<fr.eseo.servicesweb.test.Chambre> trouverChambre(
        @WebParam(name = "arg0", targetNamespace = "")
        fr.eseo.servicesweb.test.Chambre arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        java.lang.String arg4
    );
}
