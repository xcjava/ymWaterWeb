package com.ymsino.water.service.archives.vat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for save complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="save">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vatSaveParam" type="{http://api.service.archives.esb.ymsino.com/}vatSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "vatSaveParam" })
public class Save {

	protected VatSaveParam vatSaveParam;

	/**
	 * Gets the value of the vatSaveParam property.
	 * 
	 * @return possible object is {@link VatSaveParam }
	 * 
	 */
	public VatSaveParam getVatSaveParam() {
		return vatSaveParam;
	}

	/**
	 * Sets the value of the vatSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link VatSaveParam }
	 * 
	 */
	public void setVatSaveParam(VatSaveParam value) {
		this.vatSaveParam = value;
	}

}
