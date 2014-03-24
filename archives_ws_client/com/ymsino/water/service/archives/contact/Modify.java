package com.ymsino.water.service.archives.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for modify complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modify">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactModifyParam" type="{http://api.service.archives.esb.ymsino.com/}contactModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "contactModifyParam" })
public class Modify {

	protected ContactModifyParam contactModifyParam;

	/**
	 * Gets the value of the contactModifyParam property.
	 * 
	 * @return possible object is {@link ContactModifyParam }
	 * 
	 */
	public ContactModifyParam getContactModifyParam() {
		return contactModifyParam;
	}

	/**
	 * Sets the value of the contactModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link ContactModifyParam }
	 * 
	 */
	public void setContactModifyParam(ContactModifyParam value) {
		this.contactModifyParam = value;
	}

}
