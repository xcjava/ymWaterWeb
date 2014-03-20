package com.ymsino.water.service.data.collectTask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for collectTaskSaveParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="collectTaskSaveParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="concHardwareIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endHour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="endMinute" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="executeTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startHour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startMinute" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="suppCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "collectTaskSaveParam", propOrder = { "chargingUnitId", "collectType", "concHardwareIds", "endHour", "endMinute", "executeTag", "name", "priority", "source", "startHour", "startMinute", "suppCount", "type" })
public class CollectTaskSaveParam {

	protected String chargingUnitId;
	protected String collectType;
	protected String concHardwareIds;
	protected Integer endHour;
	protected Integer endMinute;
	protected String executeTag;
	protected String name;
	protected String priority;
	protected String source;
	protected Integer startHour;
	protected Integer startMinute;
	protected Integer suppCount;
	protected String type;

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
	 * Gets the value of the collectType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCollectType() {
		return collectType;
	}

	/**
	 * Sets the value of the collectType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCollectType(String value) {
		this.collectType = value;
	}

	/**
	 * Gets the value of the concHardwareIds property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConcHardwareIds() {
		return concHardwareIds;
	}

	/**
	 * Sets the value of the concHardwareIds property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConcHardwareIds(String value) {
		this.concHardwareIds = value;
	}

	/**
	 * Gets the value of the endHour property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getEndHour() {
		return endHour;
	}

	/**
	 * Sets the value of the endHour property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setEndHour(Integer value) {
		this.endHour = value;
	}

	/**
	 * Gets the value of the endMinute property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getEndMinute() {
		return endMinute;
	}

	/**
	 * Sets the value of the endMinute property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setEndMinute(Integer value) {
		this.endMinute = value;
	}

	/**
	 * Gets the value of the executeTag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExecuteTag() {
		return executeTag;
	}

	/**
	 * Sets the value of the executeTag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExecuteTag(String value) {
		this.executeTag = value;
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
	 * Gets the value of the priority property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * Sets the value of the priority property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPriority(String value) {
		this.priority = value;
	}

	/**
	 * Gets the value of the source property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Sets the value of the source property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSource(String value) {
		this.source = value;
	}

	/**
	 * Gets the value of the startHour property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getStartHour() {
		return startHour;
	}

	/**
	 * Sets the value of the startHour property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setStartHour(Integer value) {
		this.startHour = value;
	}

	/**
	 * Gets the value of the startMinute property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getStartMinute() {
		return startMinute;
	}

	/**
	 * Sets the value of the startMinute property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setStartMinute(Integer value) {
		this.startMinute = value;
	}

	/**
	 * Gets the value of the suppCount property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getSuppCount() {
		return suppCount;
	}

	/**
	 * Sets the value of the suppCount property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setSuppCount(Integer value) {
		this.suppCount = value;
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
