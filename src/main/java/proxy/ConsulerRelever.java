
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConsulerRelever complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="ConsulerRelever">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="rib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsulerRelever", propOrder = {
    "rib"
})
public class ConsulerRelever {

    protected String rib;

    /**
     * Obtient la valeur de la propriété rib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRib() {
        return rib;
    }

    /**
     * Définit la valeur de la propriété rib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRib(String value) {
        this.rib = value;
    }

}
