
package fr.eseo.serviceswebbis;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateDeb" type="{http://serviceswebbis.eseo.fr/}date" minOccurs="0"/&gt;
 *         &lt;element name="dateFin" type="{http://serviceswebbis.eseo.fr/}date" minOccurs="0"/&gt;
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
    "dateFin",
    "idChambre",
    "idClient",
    "idReservation",
    "nbPlaces",
    "paiementEffectue"
})
public class Reservation {

    protected Date dateDeb;
    protected Date dateFin;
    protected int idChambre;
    protected int idClient;
    protected int idReservation;
    protected int nbPlaces;
    protected boolean paiementEffectue;

    /**
     * Obtient la valeur de la propri�t� dateDeb.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateDeb() {
        return dateDeb;
    }

    /**
     * D�finit la valeur de la propri�t� dateDeb.
     * 
     * @param _reserverChambre_arg0DateDeb
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateDeb(Date _reserverChambre_arg0DateDeb) {
        this.dateDeb = _reserverChambre_arg0DateDeb;
    }

    /**
     * Obtient la valeur de la propri�t� dateFin.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateFin() {
        return dateFin;
    }

    /**
     * D�finit la valeur de la propri�t� dateFin.
     * 
     * @param _reserverChambre_arg0DateFin
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateFin(Date _reserverChambre_arg0DateFin) {
        this.dateFin = _reserverChambre_arg0DateFin;
    }

    /**
     * Obtient la valeur de la propri�t� idChambre.
     * 
     */
    public int getIdChambre() {
        return idChambre;
    }

    /**
     * D�finit la valeur de la propri�t� idChambre.
     * 
     */
    public void setIdChambre(int value) {
        this.idChambre = value;
    }

    /**
     * Obtient la valeur de la propri�t� idClient.
     * 
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * D�finit la valeur de la propri�t� idClient.
     * 
     */
    public void setIdClient(int value) {
        this.idClient = value;
    }

    /**
     * Obtient la valeur de la propri�t� idReservation.
     * 
     */
    public int getIdReservation() {
        return idReservation;
    }

    /**
     * D�finit la valeur de la propri�t� idReservation.
     * 
     */
    public void setIdReservation(int value) {
        this.idReservation = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbPlaces.
     * 
     */
    public int getNbPlaces() {
        return nbPlaces;
    }

    /**
     * D�finit la valeur de la propri�t� nbPlaces.
     * 
     */
    public void setNbPlaces(int value) {
        this.nbPlaces = value;
    }

    /**
     * Obtient la valeur de la propri�t� paiementEffectue.
     * 
     */
    public boolean isPaiementEffectue() {
        return paiementEffectue;
    }

    /**
     * D�finit la valeur de la propri�t� paiementEffectue.
     * 
     */
    public void setPaiementEffectue(boolean value) {
        this.paiementEffectue = value;
    }

}
