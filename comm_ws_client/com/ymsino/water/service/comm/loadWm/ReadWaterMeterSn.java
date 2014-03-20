package com.ymsino.water.service.comm.loadWm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for readWaterMeterSn complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readWaterMeterSn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="concHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wmSn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readWaterMeterSn", propOrder = { "concHardwareId", "wmSn", "count" })
public class ReadWaterMeterSn {

	protected String concHardwareId;
	protected Integer wmSn;
	protected Integer count;

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
	 * Gets the value of the wmSn property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getWmSn() {
		return wmSn;
	}

	/**
	 * Sets the value of the wmSn property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setWmSn(Integer value) {
		this.wmSn = value;
	}

	/**
	 * Gets the value of the count property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * Sets the value of the count property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCount(Integer value) {
		this.count = value;
	}

}
