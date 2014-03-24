package com.ymsino.water.service.archives.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for save complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="save">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactSaveParam" type="{http://api.service.archives.esb.ymsino.com/}contactSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "contactSaveParam" })
public class Save {

	protected ContactSaveParam contactSaveParam;

	/**
	 * Gets the value of the contactSaveParam property.
	 * 
	 * @return possible object is {@link ContactSaveParam }
	 * 
	 */
	public ContactSaveParam getContactSaveParam() {
		return contactSaveParam;
	}

	/**
	 * Sets the value of the contactSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link ContactSaveParam }
	 * 
	 */
	public void setContactSaveParam(ContactSaveParam value) {
		this.contactSaveParam = value;
	}

}
