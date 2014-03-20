package com.ymsino.water.service.freesettle.userWallet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getByUidResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByUidResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://api.service.freesettle.esb.ymsino.com/}userWalletReturn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByUidResponse", propOrder = { "_return" })
public class GetByUidResponse {

	@XmlElement(name = "return")
	protected UserWalletReturn _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link UserWalletReturn }
	 * 
	 */
	public UserWalletReturn getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link UserWalletReturn }
	 * 
	 */
	public void setReturn(UserWalletReturn value) {
		this._return = value;
	}

}
