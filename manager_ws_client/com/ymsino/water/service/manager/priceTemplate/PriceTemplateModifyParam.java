package com.ymsino.water.service.manager.priceTemplate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for priceTemplateModifyParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priceTemplateModifyParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="level1Cost" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="level1Num" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="level2Cost" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="level2Num" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="level3Cost" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="level3Num" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="level4Cost" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="level4Num" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceTemplateModifyParam", propOrder = { "billingPeriod", "chargingUnitId", "endTimestamp", "id", "level1Cost", "level1Num", "level2Cost", "level2Num", "level3Cost", "level3Num", "level4Cost", "level4Num", "name", "remark", "startTimestamp", "type" })
public class PriceTemplateModifyParam {

	protected String billingPeriod;
	protected String chargingUnitId;
	protected Long endTimestamp;
	protected Long id;
	protected Long level1Cost;
	protected Float level1Num;
	protected Long level2Cost;
	protected Float level2Num;
	protected Long level3Cost;
	protected Float level3Num;
	protected Long level4Cost;
	protected Float level4Num;
	protected String name;
	protected String remark;
	protected Long startTimestamp;
	protected String type;

	/**
	 * Gets the value of the billingPeriod property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBillingPeriod() {
		return billingPeriod;
	}

	/**
	 * Sets the value of the billingPeriod property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBillingPeriod(String value) {
		this.billingPeriod = value;
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
	 * Gets the value of the endTimestamp property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	/**
	 * Sets the value of the endTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setEndTimestamp(Long value) {
		this.endTimestamp = value;
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
	 * Gets the value of the level1Cost property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getLevel1Cost() {
		return level1Cost;
	}

	/**
	 * Sets the value of the level1Cost property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setLevel1Cost(Long value) {
		this.level1Cost = value;
	}

	/**
	 * Gets the value of the level1Num property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getLevel1Num() {
		return level1Num;
	}

	/**
	 * Sets the value of the level1Num property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setLevel1Num(Float value) {
		this.level1Num = value;
	}

	/**
	 * Gets the value of the level2Cost property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getLevel2Cost() {
		return level2Cost;
	}

	/**
	 * Sets the value of the level2Cost property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setLevel2Cost(Long value) {
		this.level2Cost = value;
	}

	/**
	 * Gets the value of the level2Num property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getLevel2Num() {
		return level2Num;
	}

	/**
	 * Sets the value of the level2Num property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setLevel2Num(Float value) {
		this.level2Num = value;
	}

	/**
	 * Gets the value of the level3Cost property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getLevel3Cost() {
		return level3Cost;
	}

	/**
	 * Sets the value of the level3Cost property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setLevel3Cost(Long value) {
		this.level3Cost = value;
	}

	/**
	 * Gets the value of the level3Num property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getLevel3Num() {
		return level3Num;
	}

	/**
	 * Sets the value of the level3Num property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setLevel3Num(Float value) {
		this.level3Num = value;
	}

	/**
	 * Gets the value of the level4Cost property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getLevel4Cost() {
		return level4Cost;
	}

	/**
	 * Sets the value of the level4Cost property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setLevel4Cost(Long value) {
		this.level4Cost = value;
	}

	/**
	 * Gets the value of the level4Num property.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getLevel4Num() {
		return level4Num;
	}

	/**
	 * Sets the value of the level4Num property.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setLevel4Num(Float value) {
		this.level4Num = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the remark property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * Sets the value of the remark property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRemark(String value) {
		this.remark = value;
	}

	/**
	 * Gets the value of the startTimestamp property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	/**
	 * Sets the value of the startTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setStartTimestamp(Long value) {
		this.startTimestamp = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

}
