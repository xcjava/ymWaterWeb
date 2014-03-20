package com.ymsino.water.service.archives.concentrator;

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
 *         &lt;element name="concentratorModifyParam" type="{http://api.service.archives.esb.ymsino.com/}concentratorModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "concentratorModifyParam" })
public class Modify {

	protected ConcentratorModifyParam concentratorModifyParam;

	/**
	 * Gets the value of the concentratorModifyParam property.
	 * 
	 * @return possible object is {@link ConcentratorModifyParam }
	 * 
	 */
	public ConcentratorModifyParam getConcentratorModifyParam() {
		return concentratorModifyParam;
	}

	/**
	 * Sets the value of the concentratorModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link ConcentratorModifyParam }
	 * 
	 */
	public void setConcentratorModifyParam(ConcentratorModifyParam value) {
		this.concentratorModifyParam = value;
	}

}
