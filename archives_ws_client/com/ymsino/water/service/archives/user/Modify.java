package com.ymsino.water.service.archives.user;

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
 *         &lt;element name="userModifyParam" type="{http://api.service.archives.esb.ymsino.com/}userModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "userModifyParam" })
public class Modify {

	protected UserModifyParam userModifyParam;

	/**
	 * Gets the value of the userModifyParam property.
	 * 
	 * @return possible object is {@link UserModifyParam }
	 * 
	 */
	public UserModifyParam getUserModifyParam() {
		return userModifyParam;
	}

	/**
	 * Sets the value of the userModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link UserModifyParam }
	 * 
	 */
	public void setUserModifyParam(UserModifyParam value) {
		this.userModifyParam = value;
	}

}
