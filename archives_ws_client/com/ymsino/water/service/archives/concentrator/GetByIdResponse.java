package com.ymsino.water.service.archives.concentrator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getByIdResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="getByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://api.service.archives.esb.ymsino.com/}concentratorReturn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByIdResponse", propOrder = { "_return" })
public class GetByIdResponse {

	@XmlElement(name = "return")
	protected ConcentratorReturn _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link ConcentratorReturn }
	 * 
	 */
	public ConcentratorReturn getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link ConcentratorReturn }
	 * 
	 */
	public void setReturn(ConcentratorReturn value) {
		this._return = value;
	}

}
