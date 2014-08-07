package com.ymsino.water.service.comm.readData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for meterDataVo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterDataVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batteryVoltage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="magneticAttack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="meterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="realDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valveStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterDataVo", propOrder = { "batteryVoltage", "dataType", "errorStatus", "magneticAttack", "measure", "meterId", "readDateStr", "realDateStr", "replyStatus", "valveStatus" })
public class MeterDataVo {

	protected Float batteryVoltage;
	protected String dataType;
	protected String errorStatus;
	protected String magneticAttack;
	protected Float measure;
	protected String meterId;
	protected String readDateStr;
	protected String realDateStr;
	protected String replyStatus;
	protected String valveStatus;

	/**
	 * Gets the value of the batteryVoltage property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getBatteryVoltage() {
		return batteryVoltage;
	}

	/**
	 * Sets the value of the batteryVoltage property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setBatteryVoltage(Float value) {
		this.batteryVoltage = value;
	}

	/**
	 * Gets the value of the dataType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * Sets the value of the dataType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDataType(String value) {
		this.dataType = value;
	}

	/**
	 * Gets the value of the errorStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrorStatus() {
		return errorStatus;
	}

	/**
	 * Sets the value of the errorStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setErrorStatus(String value) {
		this.errorStatus = value;
	}

	/**
	 * Gets the value of the magneticAttack property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMagneticAttack() {
		return magneticAttack;
	}

	/**
	 * Sets the value of the magneticAttack property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMagneticAttack(String value) {
		this.magneticAttack = value;
	}

	/**
	 * Gets the value of the measure property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getMeasure() {
		return measure;
	}

	/**
	 * Sets the value of the measure property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setMeasure(Float value) {
		this.measure = value;
	}

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
	 * Gets the value of the readDateStr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReadDateStr() {
		return readDateStr;
	}

	/**
	 * Sets the value of the readDateStr property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReadDateStr(String value) {
		this.readDateStr = value;
	}

	/**
	 * Gets the value of the realDateStr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRealDateStr() {
		return realDateStr;
	}

	/**
	 * Sets the value of the realDateStr property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRealDateStr(String value) {
		this.realDateStr = value;
	}

	/**
	 * Gets the value of the replyStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReplyStatus() {
		return replyStatus;
	}

	/**
	 * Sets the value of the replyStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReplyStatus(String value) {
		this.replyStatus = value;
	}

	/**
	 * Gets the value of the valveStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValveStatus() {
		return valveStatus;
	}

	/**
	 * Sets the value of the valveStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValveStatus(String value) {
		this.valveStatus = value;
	}

}
