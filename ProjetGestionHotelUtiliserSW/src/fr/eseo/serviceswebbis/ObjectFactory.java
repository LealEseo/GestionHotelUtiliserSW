
package fr.eseo.serviceswebbis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.eseo.serviceswebbis package. 
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

    private final static QName _AnnulerChambre_QNAME = new QName("http://serviceswebbis.eseo.fr/", "annulerChambre");
    private final static QName _AnnulerChambreResponse_QNAME = new QName("http://serviceswebbis.eseo.fr/", "annulerChambreResponse");
    private final static QName _Connexion_QNAME = new QName("http://serviceswebbis.eseo.fr/", "connexion");
    private final static QName _ConnexionResponse_QNAME = new QName("http://serviceswebbis.eseo.fr/", "connexionResponse");
    private final static QName _PayerChambre_QNAME = new QName("http://serviceswebbis.eseo.fr/", "payerChambre");
    private final static QName _PayerChambreResponse_QNAME = new QName("http://serviceswebbis.eseo.fr/", "payerChambreResponse");
    private final static QName _ReserverChambre_QNAME = new QName("http://serviceswebbis.eseo.fr/", "reserverChambre");
    private final static QName _ReserverChambreResponse_QNAME = new QName("http://serviceswebbis.eseo.fr/", "reserverChambreResponse");
    private final static QName _TrouverChambre_QNAME = new QName("http://serviceswebbis.eseo.fr/", "trouverChambre");
    private final static QName _TrouverChambreResponse_QNAME = new QName("http://serviceswebbis.eseo.fr/", "trouverChambreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.eseo.serviceswebbis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnnulerChambre }
     * 
     */
    public AnnulerChambre createAnnulerChambre() {
        return new AnnulerChambre();
    }

    /**
     * Create an instance of {@link AnnulerChambreResponse }
     * 
     */
    public AnnulerChambreResponse createAnnulerChambreResponse() {
        return new AnnulerChambreResponse();
    }

    /**
     * Create an instance of {@link Connexion }
     * 
     */
    public Connexion createConnexion() {
        return new Connexion();
    }

    /**
     * Create an instance of {@link ConnexionResponse }
     * 
     */
    public ConnexionResponse createConnexionResponse() {
        return new ConnexionResponse();
    }

    /**
     * Create an instance of {@link PayerChambre }
     * 
     */
    public PayerChambre createPayerChambre() {
        return new PayerChambre();
    }

    /**
     * Create an instance of {@link PayerChambreResponse }
     * 
     */
    public PayerChambreResponse createPayerChambreResponse() {
        return new PayerChambreResponse();
    }

    /**
     * Create an instance of {@link ReserverChambre }
     * 
     */
    public ReserverChambre createReserverChambre() {
        return new ReserverChambre();
    }

    /**
     * Create an instance of {@link ReserverChambreResponse }
     * 
     */
    public ReserverChambreResponse createReserverChambreResponse() {
        return new ReserverChambreResponse();
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
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerChambre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnulerChambre }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceswebbis.eseo.fr/", name = "annulerChambre")
    public JAXBElement<AnnulerChambre> createAnnulerChambre(AnnulerChambre value) {
        return new JAXBElement<AnnulerChambre>(_AnnulerChambre_QNAME, AnnulerChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerChambreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnulerChambreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceswebbis.eseo.fr/", name = "annulerChambreResponse")
    public JAXBElement<AnnulerChambreResponse> createAnnulerChambreResponse(AnnulerChambreResponse value) {
        return new JAXBElement<AnnulerChambreResponse>(_AnnulerChambreResponse_QNAME, AnnulerChambreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Connexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Connexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceswebbis.eseo.fr/", name = "connexion")
    public JAXBElement<Connexion> createConnexion(Connexion value) {
        return new JAXBElement<Connexion>(_Connexion_QNAME, Connexion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnexionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConnexionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceswebbis.eseo.fr/", name = "connexionResponse")
    public JAXBElement<ConnexionResponse> createConnexionResponse(ConnexionResponse value) {
        return new JAXBElement<ConnexionResponse>(_ConnexionResponse_QNAME, ConnexionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerChambre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PayerChambre }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceswebbis.eseo.fr/", name = "payerChambre")
    public JAXBElement<PayerChambre> createPayerChambre(PayerChambre value) {
        return new JAXBElement<PayerChambre>(_PayerChambre_QNAME, PayerChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerChambreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PayerChambreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceswebbis.eseo.fr/", name = "payerChambreResponse")
    public JAXBElement<PayerChambreResponse> createPayerChambreResponse(PayerChambreResponse value) {
        return new JAXBElement<PayerChambreResponse>(_PayerChambreResponse_QNAME, PayerChambreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverChambre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReserverChambre }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceswebbis.eseo.fr/", name = "reserverChambre")
    public JAXBElement<ReserverChambre> createReserverChambre(ReserverChambre value) {
        return new JAXBElement<ReserverChambre>(_ReserverChambre_QNAME, ReserverChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverChambreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReserverChambreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceswebbis.eseo.fr/", name = "reserverChambreResponse")
    public JAXBElement<ReserverChambreResponse> createReserverChambreResponse(ReserverChambreResponse value) {
        return new JAXBElement<ReserverChambreResponse>(_ReserverChambreResponse_QNAME, ReserverChambreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverChambre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrouverChambre }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceswebbis.eseo.fr/", name = "trouverChambre")
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
    @XmlElementDecl(namespace = "http://serviceswebbis.eseo.fr/", name = "trouverChambreResponse")
    public JAXBElement<TrouverChambreResponse> createTrouverChambreResponse(TrouverChambreResponse value) {
        return new JAXBElement<TrouverChambreResponse>(_TrouverChambreResponse_QNAME, TrouverChambreResponse.class, null, value);
    }

}
