package com.ymsino.water.service.comm.loadWm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for meterSnVo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterSnVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterSn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterSnVo", propOrder = { "meterId", "meterSn" })
public class MeterSnVo {

	protected String meterId;
	protected Integer meterSn;

	/**
	 * Gets the value of the meterId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMeterId() {
		return meterId;
	}

	/**
	 * Sets the value of the meterId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMeterId(String value) {
		this.meterId = value;
	}

	/**
	 * Gets the value of the meterSn property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMeterSn() {
		return meterSn;
	}

	/**
	 * Sets the value of the meterSn property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMeterSn(Integer value) {
		this.meterSn = value;
	}

}
