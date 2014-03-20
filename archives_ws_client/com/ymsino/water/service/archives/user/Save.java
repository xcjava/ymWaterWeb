package com.ymsino.water.service.archives.user;

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
 *         &lt;element name="userSaveParam" type="{http://api.service.archives.esb.ymsino.com/}userSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "userSaveParam" })
public class Save {

	protected UserSaveParam userSaveParam;

	/**
	 * Gets the value of the userSaveParam property.
	 * 
	 * @return possible object is {@link UserSaveParam }
	 * 
	 */
	public UserSaveParam getUserSaveParam() {
		return userSaveParam;
	}

	/**
	 * Sets the value of the userSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link UserSaveParam }
	 * 
	 */
	public void setUserSaveParam(UserSaveParam value) {
		this.userSaveParam = value;
	}

}
