
package lt.viko.eif.adrevinskas.courses.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;




/**
 * <p>Java class for cloudServersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cloudServersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lenght" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="difficulty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cloudServersType", propOrder = {
    "id",
    "lenght",
    "hours",
    "difficulty"
})
public class CloudServersType {

    protected int id;
    protected int lenght;
    protected int hours;
    @XmlElement(required = true)
    protected String difficulty;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the lenght property.
     * 
     */
    public int getLenght() {
        return lenght;
    }

    /**
     * Sets the value of the lenght property.
     * 
     */
    public void setLenght(int value) {
        this.lenght = value;
    }

    /**
     * Gets the value of the hours property.
     * 
     */
    public int getHours() {
        return hours;
    }

    /**
     * Sets the value of the hours property.
     * 
     */
    public void setHours(int value) {
        this.hours = value;
    }

    /**
     * Gets the value of the difficulty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the value of the difficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifficulty(String value) {
        this.difficulty = value;
    }

}
