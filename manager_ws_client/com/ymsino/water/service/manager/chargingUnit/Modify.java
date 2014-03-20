package com.ymsino.water.service.manager.chargingUnit;

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
 *         &lt;element name="chargingUnitModifyParam" type="{http://api.service.manager.esb.ymsino.com/}chargingUnitModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "chargingUnitModifyParam" })
public class Modify {

	protected ChargingUnitModifyParam chargingUnitModifyParam;

	/**
	 * Gets the value of the chargingUnitModifyParam property.
	 * 
	 * @return possible object is {@link ChargingUnitModifyParam }
	 * 
	 */
	public ChargingUnitModifyParam getChargingUnitModifyParam() {
		return chargingUnitModifyParam;
	}

	/**
	 * Sets the value of the chargingUnitModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link ChargingUnitModifyParam }
	 * 
	 */
	public void setChargingUnitModifyParam(ChargingUnitModifyParam value) {
		this.chargingUnitModifyParam = value;
	}

}
