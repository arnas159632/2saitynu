
package lt.viko.eif.adrevinskas.serverrenting.clinet;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;



/**
 * <p>Java class for dedicatedServersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dedicatedServersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="storageSpace" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cpu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ram" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="os" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dedicatedServersType", propOrder = {
    "id",
    "storageSpace",
    "cpu",
    "ram",
    "os"
})
public class DedicatedServersType {

    protected int id;
    protected int storageSpace;
    @XmlElement(required = true)
    protected String cpu;
    @XmlElement(required = true)
    protected String ram;
    @XmlElement(required = true)
    protected String os;

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
     * Gets the value of the storageSpace property.
     * 
     */
    public int getStorageSpace() {
        return storageSpace;
    }

    /**
     * Sets the value of the storageSpace property.
     * 
     */
    public void setStorageSpace(int value) {
        this.storageSpace = value;
    }

    /**
     * Gets the value of the cpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * Sets the value of the cpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpu(String value) {
        this.cpu = value;
    }

    /**
     * Gets the value of the ram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRam() {
        return ram;
    }

    /**
     * Sets the value of the ram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRam(String value) {
        this.ram = value;
    }

    /**
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

}
