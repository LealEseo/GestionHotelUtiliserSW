
package fr.eseo.servicesweb.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.eseo.servicesweb.test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TrouverChambre_QNAME = new QName("http://test.servicesweb.eseo.fr/", "trouverChambre");
    private final static QName _TrouverChambreResponse_QNAME = new QName("http://test.servicesweb.eseo.fr/", "trouverChambreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.eseo.servicesweb.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrouverChambre }
     * 
     */
    public TrouverChambre createTrouverChambre() {
        return new TrouverChambre();
    }

    /**
     * Create an instance of {@link TrouverChambreResponse }
     * 
     */
    public TrouverChambreResponse createTrouverChambreResponse() {
        return new TrouverChambreResponse();
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverChambre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrouverChambre }{@code >}
     */
    @XmlElementDecl(namespace = "http://test.servicesweb.eseo.fr/", name = "trouverChambre")
    public JAXBElement<TrouverChambre> createTrouverChambre(TrouverChambre value) {
        return new JAXBElement<TrouverChambre>(_TrouverChambre_QNAME, TrouverChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverChambreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrouverChambreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://test.servicesweb.eseo.fr/", name = "trouverChambreResponse")
    public JAXBElement<TrouverChambreResponse> createTrouverChambreResponse(TrouverChambreResponse value) {
        return new JAXBElement<TrouverChambreResponse>(_TrouverChambreResponse_QNAME, TrouverChambreResponse.class, null, value);
    }

}
