package com.ymsino.water.service.data.waterMonthUsageAmount;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for waterMonthUsageAmountReturn complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waterMonthUsageAmountReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="concHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="freezeYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="meterHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usageAmount1" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount10" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount11" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount12" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount2" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount3" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount4" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount5" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount6" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount7" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount8" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount9" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "waterMonthUsageAmountReturn", propOrder = { "chargingUnitId", "concHardwareId", "createTimestamp", "freezeYear", "id", "meterHardwareId", "parentUnits", "usageAmount1", "usageAmount10", "usageAmount11", "usageAmount12", "usageAmount2", "usageAmount3", "usageAmount4", "usageAmount5", "usageAmount6", "usageAmount7", "usageAmount8", "usageAmount9", "userId", "waterCustomerId" })
public class WaterMonthUsageAmountReturn {

	protected String chargingUnitId;
	protected String concHardwareId;
	protected Long createTimestamp;
	protected String freezeYear;
	protected Long id;
	protected String meterHardwareId;
	protected String parentUnits;
	protected Float usageAmount1;
	protected Float usageAmount10;
	protected Float usageAmount11;
	protected Float usageAmount12;
	protected Float usageAmount2;
	protected Float usageAmount3;
	protected Float usageAmount4;
	protected Float usageAmount5;
	protected Float usageAmount6;
	protected Float usageAmount7;
	protected Float usageAmount8;
	protected Float usageAmount9;
	protected String userId;
	protected String waterCustomerId;

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
	 * Gets the value of the freezeYear property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFreezeYear() {
		return freezeYear;
	}

	/**
	 * Sets the value of the freezeYear property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFreezeYear(String value) {
		this.freezeYear = value;
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
	 * Gets the value of the usageAmount1 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount1() {
		return usageAmount1;
	}

	/**
	 * Sets the value of the usageAmount1 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount1(Float value) {
		this.usageAmount1 = value;
	}

	/**
	 * Gets the value of the usageAmount10 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount10() {
		return usageAmount10;
	}

	/**
	 * Sets the value of the usageAmount10 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount10(Float value) {
		this.usageAmount10 = value;
	}

	/**
	 * Gets the value of the usageAmount11 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount11() {
		return usageAmount11;
	}

	/**
	 * Sets the value of the usageAmount11 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount11(Float value) {
		this.usageAmount11 = value;
	}

	/**
	 * Gets the value of the usageAmount12 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount12() {
		return usageAmount12;
	}

	/**
	 * Sets the value of the usageAmount12 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount12(Float value) {
		this.usageAmount12 = value;
	}

	/**
	 * Gets the value of the usageAmount2 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount2() {
		return usageAmount2;
	}

	/**
	 * Sets the value of the usageAmount2 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount2(Float value) {
		this.usageAmount2 = value;
	}

	/**
	 * Gets the value of the usageAmount3 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount3() {
		return usageAmount3;
	}

	/**
	 * Sets the value of the usageAmount3 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount3(Float value) {
		this.usageAmount3 = value;
	}

	/**
	 * Gets the value of the usageAmount4 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount4() {
		return usageAmount4;
	}

	/**
	 * Sets the value of the usageAmount4 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount4(Float value) {
		this.usageAmount4 = value;
	}

	/**
	 * Gets the value of the usageAmount5 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount5() {
		return usageAmount5;
	}

	/**
	 * Sets the value of the usageAmount5 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount5(Float value) {
		this.usageAmount5 = value;
	}

	/**
	 * Gets the value of the usageAmount6 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount6() {
		return usageAmount6;
	}

	/**
	 * Sets the value of the usageAmount6 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount6(Float value) {
		this.usageAmount6 = value;
	}

	/**
	 * Gets the value of the usageAmount7 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount7() {
		return usageAmount7;
	}

	/**
	 * Sets the value of the usageAmount7 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount7(Float value) {
		this.usageAmount7 = value;
	}

	/**
	 * Gets the value of the usageAmount8 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount8() {
		return usageAmount8;
	}

	/**
	 * Sets the value of the usageAmount8 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount8(Float value) {
		this.usageAmount8 = value;
	}

	/**
	 * Gets the value of the usageAmount9 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount9() {
		return usageAmount9;
	}

	/**
	 * Sets the value of the usageAmount9 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount9(Float value) {
		this.usageAmount9 = value;
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
