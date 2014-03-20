package com.ymsino.water.service.freesettle.waterMonthCost;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for waterMonthCostReturn complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waterMonthCostReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="concHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cost1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost10" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost11" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost12" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost6" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost7" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost8" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost9" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="freezeYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="meterHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "waterMonthCostReturn", propOrder = { "chargingUnitId", "concHardwareId", "cost1", "cost10", "cost11", "cost12", "cost2", "cost3", "cost4", "cost5", "cost6", "cost7", "cost8", "cost9", "createTimestamp", "freezeYear", "id", "meterHardwareId", "parentUnits", "userId", "waterCustomerId" })
public class WaterMonthCostReturn {

	protected String chargingUnitId;
	protected String concHardwareId;
	protected Long cost1;
	protected Long cost10;
	protected Long cost11;
	protected Long cost12;
	protected Long cost2;
	protected Long cost3;
	protected Long cost4;
	protected Long cost5;
	protected Long cost6;
	protected Long cost7;
	protected Long cost8;
	protected Long cost9;
	protected Long createTimestamp;
	protected String freezeYear;
	protected Long id;
	protected String meterHardwareId;
	protected String parentUnits;
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
	 * Gets the value of the cost1 property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCost1() {
		return cost1;
	}

	/**
	 * Sets the value of the cost1 property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCost1(Long value) {
		this.cost1 = value;
	}

	/**
	 * Gets the value of the cost10 property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCost10() {
		return cost10;
	}

	/**
	 * Sets the value of the cost10 property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCost10(Long value) {
		this.cost10 = value;
	}

	/**
	 * Gets the value of the cost11 property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCost11() {
		return cost11;
	}

	/**
	 * Sets the value of the cost11 property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCost11(Long value) {
		this.cost11 = value;
	}

	/**
	 * Gets the value of the cost12 property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCost12() {
		return cost12;
	}

	/**
	 * Sets the value of the cost12 property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCost12(Long value) {
		this.cost12 = value;
	}

	/**
	 * Gets the value of the cost2 property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCost2() {
		return cost2;
	}

	/**
	 * Sets the value of the cost2 property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCost2(Long value) {
		this.cost2 = value;
	}

	/**
	 * Gets the value of the cost3 property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCost3() {
		return cost3;
	}

	/**
	 * Sets the value of the cost3 property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCost3(Long value) {
		this.cost3 = value;
	}

	/**
	 * Gets the value of the cost4 property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCost4() {
		return cost4;
	}

	/**
	 * Sets the value of the cost4 property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCost4(Long value) {
		this.cost4 = value;
	}

	/**
	 * Gets the value of the cost5 property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCost5() {
		return cost5;
	}

	/**
	 * Sets the value of the cost5 property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCost5(Long value) {
		this.cost5 = value;
	}

	/**
	 * Gets the value of the cost6 property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCost6() {
		return cost6;
	}

	/**
	 * Sets the value of the cost6 property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCost6(Long value) {
		this.cost6 = value;
	}

	/**
	 * Gets the value of the cost7 property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCost7() {
		return cost7;
	}

	/**
	 * Sets the value of the cost7 property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCost7(Long value) {
		this.cost7 = value;
	}

	/**
	 * Gets the value of the cost8 property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCost8() {
		return cost8;
	}

	/**
	 * Sets the value of the cost8 property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCost8(Long value) {
		this.cost8 = value;
	}

	/**
	 * Gets the value of the cost9 property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCost9() {
		return cost9;
	}

	/**
	 * Sets the value of the cost9 property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCost9(Long value) {
		this.cost9 = value;
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
