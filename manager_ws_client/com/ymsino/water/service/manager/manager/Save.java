package com.ymsino.water.service.manager.manager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for save complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="save">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managerSaveParam" type="{http://api.service.manager.esb.ymsino.com/}managerSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "managerSaveParam" })
public class Save {

	protected ManagerSaveParam managerSaveParam;

	/**
	 * Gets the value of the managerSaveParam property.
	 * 
	 * @return possible object is {@link ManagerSaveParam }
	 * 
	 */
	public ManagerSaveParam getManagerSaveParam() {
		return managerSaveParam;
	}

	/**
	 * Sets the value of the managerSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link ManagerSaveParam }
	 * 
	 */
	public void setManagerSaveParam(ManagerSaveParam value) {
		this.managerSaveParam = value;
	}

}
