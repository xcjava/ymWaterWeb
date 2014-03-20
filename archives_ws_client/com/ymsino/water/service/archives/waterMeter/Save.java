package com.ymsino.water.service.archives.waterMeter;

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
 *         &lt;element name="waterMeterSaveParam" type="{http://api.service.archives.esb.ymsino.com/}waterMeterSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "waterMeterSaveParam" })
public class Save {

	protected WaterMeterSaveParam waterMeterSaveParam;

	/**
	 * Gets the value of the waterMeterSaveParam property.
	 * 
	 * @return possible object is {@link WaterMeterSaveParam }
	 * 
	 */
	public WaterMeterSaveParam getWaterMeterSaveParam() {
		return waterMeterSaveParam;
	}

	/**
	 * Sets the value of the waterMeterSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link WaterMeterSaveParam }
	 * 
	 */
	public void setWaterMeterSaveParam(WaterMeterSaveParam value) {
		this.waterMeterSaveParam = value;
	}

}
