package com.ymsino.water.service.archives.busiAddress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for busiAddressReturn complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="busiAddressReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="linkMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="road" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storiedBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="village" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "busiAddressReturn", propOrder = { "city", "createTimestamp",
		"district", "floor", "id", "linkMan", "province", "residential",
		"road", "roomNo", "storiedBuilding", "street", "uid", "unit", "village" })
public class BusiAddressReturn {

	protected String city;
	protected Long createTimestamp;
	protected String district;
	protected String floor;
	protected Long id;
	protected String linkMan;
	protected String province;
	protected String residential;
	protected String road;
	protected String roomNo;
	protected String storiedBuilding;
	protected String street;
	protected Long uid;
	protected String unit;
	protected String village;

	/**
	 * Gets the value of the city property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the value of the city property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCity(String value) {
		this.city = value;
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
	 * Gets the value of the district property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * Sets the value of the district property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDistrict(String value) {
		this.district = value;
	}

	/**
	 * Gets the value of the floor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFloor() {
		return floor;
	}

	/**
	 * Sets the value of the floor property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFloor(String value) {
		this.floor = value;
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
	 * Gets the value of the linkMan property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLinkMan() {
		return linkMan;
	}

	/**
	 * Sets the value of the linkMan property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLinkMan(String value) {
		this.linkMan = value;
	}

	/**
	 * Gets the value of the province property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * Sets the value of the province property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProvince(String value) {
		this.province = value;
	}

	/**
	 * Gets the value of the residential property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResidential() {
		return residential;
	}

	/**
	 * Sets the value of the residential property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResidential(String value) {
		this.residential = value;
	}

	/**
	 * Gets the value of the road property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRoad() {
		return road;
	}

	/**
	 * Sets the value of the road property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRoad(String value) {
		this.road = value;
	}

	/**
	 * Gets the value of the roomNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRoomNo() {
		return roomNo;
	}

	/**
	 * Sets the value of the roomNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRoomNo(String value) {
		this.roomNo = value;
	}

	/**
	 * Gets the value of the storiedBuilding property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStoriedBuilding() {
		return storiedBuilding;
	}

	/**
	 * Sets the value of the storiedBuilding property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStoriedBuilding(String value) {
		this.storiedBuilding = value;
	}

	/**
	 * Gets the value of the street property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Sets the value of the street property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStreet(String value) {
		this.street = value;
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
	 * Gets the value of the unit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * Sets the value of the unit property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUnit(String value) {
		this.unit = value;
	}

	/**
	 * Gets the value of the village property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVillage() {
		return village;
	}

	/**
	 * Sets the value of the village property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVillage(String value) {
		this.village = value;
	}

}
