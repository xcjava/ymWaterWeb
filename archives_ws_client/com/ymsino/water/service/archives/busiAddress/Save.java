package com.ymsino.water.service.archives.busiAddress;

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
 *         &lt;element name="busiAddressSaveParam" type="{http://api.service.archives.esb.ymsino.com/}busiAddressSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "busiAddressSaveParam" })
public class Save {

	protected BusiAddressSaveParam busiAddressSaveParam;

	/**
	 * Gets the value of the busiAddressSaveParam property.
	 * 
	 * @return possible object is {@link BusiAddressSaveParam }
	 * 
	 */
	public BusiAddressSaveParam getBusiAddressSaveParam() {
		return busiAddressSaveParam;
	}

	/**
	 * Sets the value of the busiAddressSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link BusiAddressSaveParam }
	 * 
	 */
	public void setBusiAddressSaveParam(BusiAddressSaveParam value) {
		this.busiAddressSaveParam = value;
	}

}
