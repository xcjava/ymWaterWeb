package com.ymsino.water.service.manager.manager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getByManagerIdResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByManagerIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://api.service.manager.esb.ymsino.com/}managerReturn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByManagerIdResponse", propOrder = { "_return" })
public class GetByManagerIdResponse {

	@XmlElement(name = "return")
	protected ManagerReturn _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link ManagerReturn }
	 * 
	 */
	public ManagerReturn getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link ManagerReturn }
	 * 
	 */
	public void setReturn(ManagerReturn value) {
		this._return = value;
	}

}
