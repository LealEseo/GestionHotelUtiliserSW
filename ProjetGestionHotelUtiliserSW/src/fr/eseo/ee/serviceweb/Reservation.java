
package fr.eseo.ee.serviceweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateDeb" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateDeb_string" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateFin_string" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idChambre" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idClient" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idReservation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nbPlaces" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paiementEffectue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "dateDeb",
    "dateDebString",
    "dateFin",
    "dateFinString",
    "idChambre",
    "idClient",
    "idReservation",
    "nbPlaces",
    "paiementEffectue"
})
public class Reservation {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDeb;
    @XmlElement(name = "dateDeb_string")
    protected String dateDebString;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFin;
    @XmlElement(name = "dateFin_string")
    protected String dateFinString;
    protected int idChambre;
    protected int idClient;
    protected int idReservation;
    protected int nbPlaces;
    protected boolean paiementEffectue;

    /**
     * Obtient la valeur de la propriété dateDeb.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDeb() {
        return dateDeb;
    }

    /**
     * Définit la valeur de la propriété dateDeb.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDeb(XMLGregorianCalendar value) {
        this.dateDeb = value;
    }

    /**
     * Obtient la valeur de la propriété dateDebString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDebString() {
        return dateDebString;
    }

    /**
     * Définit la valeur de la propriété dateDebString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDebString(String value) {
        this.dateDebString = value;
    }

    /**
     * Obtient la valeur de la propriété dateFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFin() {
        return dateFin;
    }

    /**
     * Définit la valeur de la propriété dateFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFin(XMLGregorianCalendar value) {
        this.dateFin = value;
    }

    /**
     * Obtient la valeur de la propriété dateFinString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFinString() {
        return dateFinString;
    }

    /**
     * Définit la valeur de la propriété dateFinString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFinString(String value) {
        this.dateFinString = value;
    }

    /**
     * Obtient la valeur de la propriété idChambre.
     * 
     */
    public int getIdChambre() {
        return idChambre;
    }

    /**
     * Définit la valeur de la propriété idChambre.
     * 
     */
    public void setIdChambre(int value) {
        this.idChambre = value;
    }

    /**
     * Obtient la valeur de la propriété idClient.
     * 
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * Définit la valeur de la propriété idClient.
     * 
     */
    public void setIdClient(int value) {
        this.idClient = value;
    }

    /**
     * Obtient la valeur de la propriété idReservation.
     * 
     */
    public int getIdReservation() {
        return idReservation;
    }

    /**
     * Définit la valeur de la propriété idReservation.
     * 
     */
    public void setIdReservation(int value) {
        this.idReservation = value;
    }

    /**
     * Obtient la valeur de la propriété nbPlaces.
     * 
     */
    public int getNbPlaces() {
        return nbPlaces;
    }

    /**
     * Définit la valeur de la propriété nbPlaces.
     * 
     */
    public void setNbPlaces(int value) {
        this.nbPlaces = value;
    }

    /**
     * Obtient la valeur de la propriété paiementEffectue.
     * 
     */
    public boolean isPaiementEffectue() {
        return paiementEffectue;
    }

    /**
     * Définit la valeur de la propriété paiementEffectue.
     * 
     */
    public void setPaiementEffectue(boolean value) {
        this.paiementEffectue = value;
    }

}
