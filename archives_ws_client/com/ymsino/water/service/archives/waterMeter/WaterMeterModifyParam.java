package com.ymsino.water.service.archives.waterMeter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for waterMeterModifyParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="waterMeterModifyParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alarmVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="childHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closeWarn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="concHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constant" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialYards" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="nature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="purcAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="radioFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showWarn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "waterMeterModifyParam", propOrder = { "alarmVolume",
		"chargingUnitId", "childHardwareId", "closeWarn", "concHardwareId",
		"constant", "dataType", "hardwareId", "initialYards", "nature",
		"price", "purcAmount", "radioFrequency", "showWarn", "uid", "userId",
		"userName", "waterCustomerId" })
public class WaterMeterModifyParam {

	protected String alarmVolume;
	protected String chargingUnitId;
	protected String childHardwareId;
	protected String closeWarn;
	protected String concHardwareId;
	protected Integer constant;
	protected String dataType;
	protected String hardwareId;
	protected Float initialYards;
	protected String nature;
	protected Long price;
	protected String purcAmount;
	protected String radioFrequency;
	protected String showWarn;
	protected Long uid;
	protected String userId;
	protected String userName;
	protected String waterCustomerId;

	/**
	 * Gets the value of the alarmVolume property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlarmVolume() {
		return alarmVolume;
	}

	/**
	 * Sets the value of the alarmVolume property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlarmVolume(String value) {
		this.alarmVolume = value;
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
	 * Gets the value of the childHardwareId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChildHardwareId() {
		return childHardwareId;
	}

	/**
	 * Sets the value of the childHardwareId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setChildHardwareId(String value) {
		this.childHardwareId = value;
	}

	/**
	 * Gets the value of the closeWarn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCloseWarn() {
		return closeWarn;
	}

	/**
	 * Sets the value of the closeWarn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCloseWarn(String value) {
		this.closeWarn = value;
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
	 * Gets the value of the constant property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getConstant() {
		return constant;
	}

	/**
	 * Sets the value of the constant property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setConstant(Integer value) {
		this.constant = value;
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
	 * Gets the value of the hardwareId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHardwareId() {
		return hardwareId;
	}

	/**
	 * Sets the value of the hardwareId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHardwareId(String value) {
		this.hardwareId = value;
	}

	/**
	 * Gets the value of the initialYards property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getInitialYards() {
		return initialYards;
	}

	/**
	 * Sets the value of the initialYards property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setInitialYards(Float value) {
		this.initialYards = value;
	}

	/**
	 * Gets the value of the nature property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNature() {
		return nature;
	}

	/**
	 * Sets the value of the nature property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNature(String value) {
		this.nature = value;
	}

	/**
	 * Gets the value of the price property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getPrice() {
		return price;
	}

	/**
	 * Sets the value of the price property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setPrice(Long value) {
		this.price = value;
	}

	/**
	 * Gets the value of the purcAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPurcAmount() {
		return purcAmount;
	}

	/**
	 * Sets the value of the purcAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPurcAmount(String value) {
		this.purcAmount = value;
	}

	/**
	 * Gets the value of the radioFrequency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRadioFrequency() {
		return radioFrequency;
	}

	/**
	 * Sets the value of the radioFrequency property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRadioFrequency(String value) {
		this.radioFrequency = value;
	}

	/**
	 * Gets the value of the showWarn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShowWarn() {
		return showWarn;
	}

	/**
	 * Sets the value of the showWarn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setShowWarn(String value) {
		this.showWarn = value;
	}

	/**
	 * Gets the value of the uid property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getUid() {
		return uid;
	}

	/**
	 * Sets the value of the uid property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setUid(Long value) {
		this.uid = value;
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
	 * Gets the value of the userName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the value of the userName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserName(String value) {
		this.userName = value;
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
