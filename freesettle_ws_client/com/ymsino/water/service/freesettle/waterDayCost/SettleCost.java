package com.ymsino.water.service.freesettle.waterDayCost;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for settleCost complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="settleCost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayCostId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "settleCost", propOrder = { "dayCostId" })
public class SettleCost {

	protected Long dayCostId;

	/**
	 * Gets the value of the dayCostId property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getDayCostId() {
		return dayCostId;
	}

	/**
	 * Sets the value of the dayCostId property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setDayCostId(Long value) {
		this.dayCostId = value;
	}

}
