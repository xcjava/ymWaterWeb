package com.ymsino.water.service.archives.waterMeter;

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
 *         &lt;element name="waterMeterModifyParam" type="{http://api.service.archives.esb.ymsino.com/}waterMeterModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "waterMeterModifyParam" })
public class Modify {

	protected WaterMeterModifyParam waterMeterModifyParam;

	/**
	 * Gets the value of the waterMeterModifyParam property.
	 * 
	 * @return possible object is {@link WaterMeterModifyParam }
	 * 
	 */
	public WaterMeterModifyParam getWaterMeterModifyParam() {
		return waterMeterModifyParam;
	}

	/**
	 * Sets the value of the waterMeterModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link WaterMeterModifyParam }
	 * 
	 */
	public void setWaterMeterModifyParam(WaterMeterModifyParam value) {
		this.waterMeterModifyParam = value;
	}

}
