package com.ymsino.water.service.manager.manager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for modify complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modify">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managerModifyParam" type="{http://api.service.manager.esb.ymsino.com/}managerModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "managerModifyParam" })
public class Modify {

	protected ManagerModifyParam managerModifyParam;

	/**
	 * Gets the value of the managerModifyParam property.
	 * 
	 * @return possible object is {@link ManagerModifyParam }
	 * 
	 */
	public ManagerModifyParam getManagerModifyParam() {
		return managerModifyParam;
	}

	/**
	 * Sets the value of the managerModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link ManagerModifyParam }
	 * 
	 */
	public void setManagerModifyParam(ManagerModifyParam value) {
		this.managerModifyParam = value;
	}

}
