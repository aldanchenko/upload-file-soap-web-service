
package ua.examples.cxf.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dfile" type="{http://server.cxf.examples.ua/}uploadedFile" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadFile", propOrder = {
    "dfile"
})
public class UploadFile {

    @XmlElement(name = "Dfile")
    protected UploadedFile dfile;

    /**
     * Gets the value of the dfile property.
     * 
     * @return
     *     possible object is
     *     {@link UploadedFile }
     *     
     */
    public UploadedFile getDfile() {
        return dfile;
    }

    /**
     * Sets the value of the dfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadedFile }
     *     
     */
    public void setDfile(UploadedFile value) {
        this.dfile = value;
    }

}
