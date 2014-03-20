package com.ymsino.water.service.data.testDynamicData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for testDynamicDataReturn complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testDynamicDataReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batteryVoltage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="concHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="magneticAttack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterReading" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="parentUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valveStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waterCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testDynamicDataReturn", propOrder = { "batteryVoltage", "chargingUnitId", "concHardwareId", "createTimestamp", "dataType", "errorStatus", "id", "magneticAttack", "meterHardwareId", "meterReading", "parentUnits", "replyStatus", "userId", "valveStatus", "waterCustomerId" })
public class TestDynamicDataReturn {

	protected Float batteryVoltage;
	protected String chargingUnitId;
	protected String concHardwareId;
	protected Long createTimestamp;
	protected String dataType;
	protected String errorStatus;
	protected Long id;
	protected String magneticAttack;
	protected String meterHardwareId;
	protected Float meterReading;
	protected String parentUnits;
	protected String replyStatus;
	protected String userId;
	protected String valveStatus;
	protected String waterCustomerId;

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
	 * Gets the value of the chargingUnitId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChargingUnitId() {
		return chargingUnitId;
	}

	/**
	 * Sets the value of the chargingUnitId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setChargingUnitId(String value) {
		this.chargingUnitId = value;
	}

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
	 * Gets the value of the createTimestamp property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCreateTimestamp() {
		return createTimestamp;
	}

	/**
	 * Sets the value of the createTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCreateTimestamp(Long value) {
		this.createTimestamp = value;
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
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setId(Long value) {
		this.id = value;
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
	 * Gets the value of the meterHardwareId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMeterHardwareId() {
		return meterHardwareId;
	}

	/**
	 * Sets the value of the meterHardwareId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMeterHardwareId(String value) {
		this.meterHardwareId = value;
	}

	/**
	 * Gets the value of the meterReading property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getMeterReading() {
		return meterReading;
	}

	/**
	 * Sets the value of the meterReading property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setMeterReading(Float value) {
		this.meterReading = value;
	}

	/**
	 * Gets the value of the parentUnits property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParentUnits() {
		return parentUnits;
	}

	/**
	 * Sets the value of the parentUnits property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParentUnits(String value) {
		this.parentUnits = value;
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
	 * Gets the value of the userId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the value of the userId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserId(String value) {
		this.userId = value;
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

	/**
	 * Gets the value of the waterCustomerId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWaterCustomerId() {
		return waterCustomerId;
	}

	/**
	 * Sets the value of the waterCustomerId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWaterCustomerId(String value) {
		this.waterCustomerId = value;
	}

}
