package com.ymsino.water.service.comm.deleteData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for deleteData complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="concHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteData", propOrder = { "concHardwareId" })
public class DeleteData {

	protected String concHardwareId;

	/**
	 * Gets the value of the concHardwareId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConcHardwareId() {
		return concHardwareId;
	}

	/**
	 * Sets the value of the concHardwareId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConcHardwareId(String value) {
		this.concHardwareId = value;
	}

}
