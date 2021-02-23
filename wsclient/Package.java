
package wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="package">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tracking" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *         &lt;element name="userByReceiver" type="{http://wsserver/}user" minOccurs="0"/>
 *         &lt;element name="userBySender" type="{http://wsserver/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "package", propOrder = {
    "description",
    "destinationCity",
    "id",
    "name",
    "senderCity",
    "tracking",
    "userByReceiver",
    "userBySender"
})
public class Package {

    protected String description;
    protected String destinationCity;
    protected int id;
    protected String name;
    protected String senderCity;
    protected Byte tracking;
    protected User userByReceiver;
    protected User userBySender;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the destinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * Sets the value of the destinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCity(String value) {
        this.destinationCity = value;
    }

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the senderCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCity() {
        return senderCity;
    }

    /**
     * Sets the value of the senderCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCity(String value) {
        this.senderCity = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTracking(Byte value) {
        this.tracking = value;
    }

    /**
     * Gets the value of the userByReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserByReceiver() {
        return userByReceiver;
    }

    /**
     * Sets the value of the userByReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserByReceiver(User value) {
        this.userByReceiver = value;
    }

    /**
     * Gets the value of the userBySender property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserBySender() {
        return userBySender;
    }

    /**
     * Sets the value of the userBySender property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserBySender(User value) {
        this.userBySender = value;
    }

}
