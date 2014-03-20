package com.ymsino.water.service.archives.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getByUserIdResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="getByUserIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://api.service.archives.esb.ymsino.com/}userReturn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByUserIdResponse", propOrder = { "_return" })
public class GetByUserIdResponse {

	@XmlElement(name = "return")
	protected UserReturn _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link UserReturn }
	 * 
	 */
	public UserReturn getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link UserReturn }
	 * 
	 */
	public void setReturn(UserReturn value) {
		this._return = value;
	}

}
