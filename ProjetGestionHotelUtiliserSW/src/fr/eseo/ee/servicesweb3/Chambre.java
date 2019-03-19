
package fr.eseo.ee.servicesweb3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour chambre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="chambre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idChambre" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nbPlaceLit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prixJournalier" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="typeChambre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chambre", propOrder = {
    "idChambre",
    "nbPlaceLit",
    "prixJournalier",
    "typeChambre"
})
public class Chambre {

    protected int idChambre;
    protected int nbPlaceLit;
    protected float prixJournalier;
    protected String typeChambre;

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
     * Obtient la valeur de la propriété nbPlaceLit.
     * 
     */
    public int getNbPlaceLit() {
        return nbPlaceLit;
    }

    /**
     * Définit la valeur de la propriété nbPlaceLit.
     * 
     */
    public void setNbPlaceLit(int value) {
        this.nbPlaceLit = value;
    }

    /**
     * Obtient la valeur de la propriété prixJournalier.
     * 
     */
    public float getPrixJournalier() {
        return prixJournalier;
    }

    /**
     * Définit la valeur de la propriété prixJournalier.
     * 
     */
    public void setPrixJournalier(float value) {
        this.prixJournalier = value;
    }

    /**
     * Obtient la valeur de la propriété typeChambre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeChambre() {
        return typeChambre;
    }

    /**
     * Définit la valeur de la propriété typeChambre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeChambre(String value) {
        this.typeChambre = value;
    }

}
