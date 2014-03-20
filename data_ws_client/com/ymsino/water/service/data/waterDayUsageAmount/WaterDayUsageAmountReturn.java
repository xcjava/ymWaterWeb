package com.ymsino.water.service.data.waterDayUsageAmount;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for waterDayUsageAmountReturn complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waterDayUsageAmountReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="concHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="freezeMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="freezeYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="meterHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usageAmount1" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount10" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount11" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount12" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount13" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount14" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount15" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount16" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount17" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount18" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount19" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount2" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount20" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount21" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount22" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount23" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount24" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount25" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount26" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount27" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount28" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount29" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount3" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount30" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usageAmount31" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "waterDayUsageAmountReturn", propOrder = { "chargingUnitId", "concHardwareId", "createTimestamp", "freezeMonth", "freezeYear", "id", "meterHardwareId", "parentUnits", "usageAmount1", "usageAmount10", "usageAmount11", "usageAmount12", "usageAmount13", "usageAmount14", "usageAmount15", "usageAmount16", "usageAmount17", "usageAmount18", "usageAmount19", "usageAmount2", "usageAmount20", "usageAmount21", "usageAmount22", "usageAmount23", "usageAmount24", "usageAmount25", "usageAmount26", "usageAmount27", "usageAmount28", "usageAmount29", "usageAmount3", "usageAmount30", "usageAmount31", "usageAmount4", "usageAmount5", "usageAmount6", "usageAmount7", "usageAmount8", "usageAmount9", "userId", "waterCustomerId" })
public class WaterDayUsageAmountReturn {

	protected String chargingUnitId;
	protected String concHardwareId;
	protected Long createTimestamp;
	protected String freezeMonth;
	protected String freezeYear;
	protected Long id;
	protected String meterHardwareId;
	protected String parentUnits;
	protected Float usageAmount1;
	protected Float usageAmount10;
	protected Float usageAmount11;
	protected Float usageAmount12;
	protected Float usageAmount13;
	protected Float usageAmount14;
	protected Float usageAmount15;
	protected Float usageAmount16;
	protected Float usageAmount17;
	protected Float usageAmount18;
	protected Float usageAmount19;
	protected Float usageAmount2;
	protected Float usageAmount20;
	protected Float usageAmount21;
	protected Float usageAmount22;
	protected Float usageAmount23;
	protected Float usageAmount24;
	protected Float usageAmount25;
	protected Float usageAmount26;
	protected Float usageAmount27;
	protected Float usageAmount28;
	protected Float usageAmount29;
	protected Float usageAmount3;
	protected Float usageAmount30;
	protected Float usageAmount31;
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
	 * Gets the value of the freezeMonth property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFreezeMonth() {
		return freezeMonth;
	}

	/**
	 * Sets the value of the freezeMonth property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFreezeMonth(String value) {
		this.freezeMonth = value;
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
	 * Gets the value of the usageAmount13 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount13() {
		return usageAmount13;
	}

	/**
	 * Sets the value of the usageAmount13 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount13(Float value) {
		this.usageAmount13 = value;
	}

	/**
	 * Gets the value of the usageAmount14 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount14() {
		return usageAmount14;
	}

	/**
	 * Sets the value of the usageAmount14 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount14(Float value) {
		this.usageAmount14 = value;
	}

	/**
	 * Gets the value of the usageAmount15 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount15() {
		return usageAmount15;
	}

	/**
	 * Sets the value of the usageAmount15 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount15(Float value) {
		this.usageAmount15 = value;
	}

	/**
	 * Gets the value of the usageAmount16 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount16() {
		return usageAmount16;
	}

	/**
	 * Sets the value of the usageAmount16 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount16(Float value) {
		this.usageAmount16 = value;
	}

	/**
	 * Gets the value of the usageAmount17 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount17() {
		return usageAmount17;
	}

	/**
	 * Sets the value of the usageAmount17 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount17(Float value) {
		this.usageAmount17 = value;
	}

	/**
	 * Gets the value of the usageAmount18 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount18() {
		return usageAmount18;
	}

	/**
	 * Sets the value of the usageAmount18 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount18(Float value) {
		this.usageAmount18 = value;
	}

	/**
	 * Gets the value of the usageAmount19 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount19() {
		return usageAmount19;
	}

	/**
	 * Sets the value of the usageAmount19 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount19(Float value) {
		this.usageAmount19 = value;
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
	 * Gets the value of the usageAmount20 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount20() {
		return usageAmount20;
	}

	/**
	 * Sets the value of the usageAmount20 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount20(Float value) {
		this.usageAmount20 = value;
	}

	/**
	 * Gets the value of the usageAmount21 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount21() {
		return usageAmount21;
	}

	/**
	 * Sets the value of the usageAmount21 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount21(Float value) {
		this.usageAmount21 = value;
	}

	/**
	 * Gets the value of the usageAmount22 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount22() {
		return usageAmount22;
	}

	/**
	 * Sets the value of the usageAmount22 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount22(Float value) {
		this.usageAmount22 = value;
	}

	/**
	 * Gets the value of the usageAmount23 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount23() {
		return usageAmount23;
	}

	/**
	 * Sets the value of the usageAmount23 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount23(Float value) {
		this.usageAmount23 = value;
	}

	/**
	 * Gets the value of the usageAmount24 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount24() {
		return usageAmount24;
	}

	/**
	 * Sets the value of the usageAmount24 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount24(Float value) {
		this.usageAmount24 = value;
	}

	/**
	 * Gets the value of the usageAmount25 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount25() {
		return usageAmount25;
	}

	/**
	 * Sets the value of the usageAmount25 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount25(Float value) {
		this.usageAmount25 = value;
	}

	/**
	 * Gets the value of the usageAmount26 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount26() {
		return usageAmount26;
	}

	/**
	 * Sets the value of the usageAmount26 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount26(Float value) {
		this.usageAmount26 = value;
	}

	/**
	 * Gets the value of the usageAmount27 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount27() {
		return usageAmount27;
	}

	/**
	 * Sets the value of the usageAmount27 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount27(Float value) {
		this.usageAmount27 = value;
	}

	/**
	 * Gets the value of the usageAmount28 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount28() {
		return usageAmount28;
	}

	/**
	 * Sets the value of the usageAmount28 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount28(Float value) {
		this.usageAmount28 = value;
	}

	/**
	 * Gets the value of the usageAmount29 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount29() {
		return usageAmount29;
	}

	/**
	 * Sets the value of the usageAmount29 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount29(Float value) {
		this.usageAmount29 = value;
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
	 * Gets the value of the usageAmount30 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount30() {
		return usageAmount30;
	}

	/**
	 * Sets the value of the usageAmount30 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount30(Float value) {
		this.usageAmount30 = value;
	}

	/**
	 * Gets the value of the usageAmount31 property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getUsageAmount31() {
		return usageAmount31;
	}

	/**
	 * Sets the value of the usageAmount31 property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setUsageAmount31(Float value) {
		this.usageAmount31 = value;
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
