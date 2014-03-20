package com.ymsino.water.service.archives.busiAddress;

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
 *         &lt;element name="busiAddressModifyParam" type="{http://api.service.archives.esb.ymsino.com/}busiAddressModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "busiAddressModifyParam" })
public class Modify {

	protected BusiAddressModifyParam busiAddressModifyParam;

	/**
	 * Gets the value of the busiAddressModifyParam property.
	 * 
	 * @return possible object is {@link BusiAddressModifyParam }
	 * 
	 */
	public BusiAddressModifyParam getBusiAddressModifyParam() {
		return busiAddressModifyParam;
	}

	/**
	 * Sets the value of the busiAddressModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link BusiAddressModifyParam }
	 * 
	 */
	public void setBusiAddressModifyParam(BusiAddressModifyParam value) {
		this.busiAddressModifyParam = value;
	}

}
