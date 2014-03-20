package com.ymsino.water.service.manager.chargingUnit;

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
 *         &lt;element name="chargingUnitSaveParam" type="{http://api.service.manager.esb.ymsino.com/}chargingUnitSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "chargingUnitSaveParam" })
public class Save {

	protected ChargingUnitSaveParam chargingUnitSaveParam;

	/**
	 * Gets the value of the chargingUnitSaveParam property.
	 * 
	 * @return possible object is {@link ChargingUnitSaveParam }
	 * 
	 */
	public ChargingUnitSaveParam getChargingUnitSaveParam() {
		return chargingUnitSaveParam;
	}

	/**
	 * Sets the value of the chargingUnitSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link ChargingUnitSaveParam }
	 * 
	 */
	public void setChargingUnitSaveParam(ChargingUnitSaveParam value) {
		this.chargingUnitSaveParam = value;
	}

}
