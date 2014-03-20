package com.ymsino.water.service.freesettle.userWallet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getByUid complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByUid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByUid", propOrder = { "uid" })
public class GetByUid {

	protected Long uid;

	/**
	 * Gets the value of the uid property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getUid() {
		return uid;
	}

	/**
	 * Sets the value of the uid property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setUid(Long value) {
		this.uid = value;
	}

}
