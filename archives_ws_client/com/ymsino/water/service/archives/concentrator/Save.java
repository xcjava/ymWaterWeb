package com.ymsino.water.service.archives.concentrator;

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
 *         &lt;element name="concentratorSaveParam" type="{http://api.service.archives.esb.ymsino.com/}concentratorSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "concentratorSaveParam" })
public class Save {

	protected ConcentratorSaveParam concentratorSaveParam;

	/**
	 * Gets the value of the concentratorSaveParam property.
	 * 
	 * @return possible object is {@link ConcentratorSaveParam }
	 * 
	 */
	public ConcentratorSaveParam getConcentratorSaveParam() {
		return concentratorSaveParam;
	}

	/**
	 * Sets the value of the concentratorSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link ConcentratorSaveParam }
	 * 
	 */
	public void setConcentratorSaveParam(ConcentratorSaveParam value) {
		this.concentratorSaveParam = value;
	}

}
