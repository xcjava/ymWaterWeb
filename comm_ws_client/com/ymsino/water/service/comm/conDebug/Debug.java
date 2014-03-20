package com.ymsino.water.service.comm.conDebug;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for debug complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="debug">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="concHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waterMeterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waterMeterSn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "debug", propOrder = { "concHardwareId", "waterMeterId", "waterMeterSn" })
public class Debug {

	protected String concHardwareId;
	protected String waterMeterId;
	protected Integer waterMeterSn;

	/**
	 * Gets the value of the concHardwareId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConcHardwareId() {
		return concHardwareId;
	}

	/**
	 * Sets the value of the concHardwareId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConcHardwareId(String value) {
		this.concHardwareId = value;
	}

	/**
	 * Gets the value of the waterMeterId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWaterMeterId() {
		return waterMeterId;
	}

	/**
	 * Sets the value of the waterMeterId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWaterMeterId(String value) {
		this.waterMeterId = value;
	}

	/**
	 * Gets the value of the waterMeterSn property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getWaterMeterSn() {
		return waterMeterSn;
	}

	/**
	 * Sets the value of the waterMeterSn property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setWaterMeterSn(Integer value) {
		this.waterMeterSn = value;
	}

}
