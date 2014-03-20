package com.ymsino.water.service.archives.vat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for modify complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="modify">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vatModifyParam" type="{http://api.service.archives.esb.ymsino.com/}vatModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "vatModifyParam" })
public class Modify {

	protected VatModifyParam vatModifyParam;

	/**
	 * Gets the value of the vatModifyParam property.
	 * 
	 * @return possible object is {@link VatModifyParam }
	 * 
	 */
	public VatModifyParam getVatModifyParam() {
		return vatModifyParam;
	}

	/**
	 * Sets the value of the vatModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link VatModifyParam }
	 * 
	 */
	public void setVatModifyParam(VatModifyParam value) {
		this.vatModifyParam = value;
	}

}
