package com.ymsino.water.service.archives.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for userReturn complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="userReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="credFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credInvalidTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="credName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credValidTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="economicType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="industrial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="road" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storiedBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="village" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warnPrice" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userReturn", propOrder = { "address", "addressType",
		"chargingUnitId", "city", "createTimestamp", "credFilePath",
		"credInvalidTimestamp", "credName", "credNum", "credType",
		"credValidTimestamp", "district", "economicType", "floor", "id",
		"industrial", "name", "parentUnits", "postcode", "province",
		"residential", "road", "roomNo", "storiedBuilding", "street", "unit",
		"userId", "village", "warnPrice" })
public class UserReturn {

	protected String address;
	protected String addressType;
	protected String chargingUnitId;
	protected String city;
	protected Long createTimestamp;
	protected String credFilePath;
	protected Long credInvalidTimestamp;
	protected String credName;
	protected String credNum;
	protected String credType;
	protected Long credValidTimestamp;
	protected String district;
	protected String economicType;
	protected String floor;
	protected Long id;
	protected String industrial;
	protected String name;
	protected String parentUnits;
	protected String postcode;
	protected String province;
	protected String residential;
	protected String road;
	protected String roomNo;
	protected String storiedBuilding;
	protected String street;
	protected String unit;
	protected String userId;
	protected String village;
	protected Long warnPrice;

	/**
	 * Gets the value of the address property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the value of the address property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddress(String value) {
		this.address = value;
	}

	/**
	 * Gets the value of the addressType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddressType() {
		return addressType;
	}

	/**
	 * Sets the value of the addressType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddressType(String value) {
		this.addressType = value;
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
	 * Gets the value of the credFilePath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCredFilePath() {
		return credFilePath;
	}

	/**
	 * Sets the value of the credFilePath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCredFilePath(String value) {
		this.credFilePath = value;
	}

	/**
	 * Gets the value of the credInvalidTimestamp property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCredInvalidTimestamp() {
		return credInvalidTimestamp;
	}

	/**
	 * Sets the value of the credInvalidTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCredInvalidTimestamp(Long value) {
		this.credInvalidTimestamp = value;
	}

	/**
	 * Gets the value of the credName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCredName() {
		return credName;
	}

	/**
	 * Sets the value of the credName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCredName(String value) {
		this.credName = value;
	}

	/**
	 * Gets the value of the credNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCredNum() {
		return credNum;
	}

	/**
	 * Sets the value of the credNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCredNum(String value) {
		this.credNum = value;
	}

	/**
	 * Gets the value of the credType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCredType() {
		return credType;
	}

	/**
	 * Sets the value of the credType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCredType(String value) {
		this.credType = value;
	}

	/**
	 * Gets the value of the credValidTimestamp property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCredValidTimestamp() {
		return credValidTimestamp;
	}

	/**
	 * Sets the value of the credValidTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCredValidTimestamp(Long value) {
		this.credValidTimestamp = value;
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
	 * Gets the value of the economicType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEconomicType() {
		return economicType;
	}

	/**
	 * Sets the value of the economicType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEconomicType(String value) {
		this.economicType = value;
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
	 * Gets the value of the industrial property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIndustrial() {
		return industrial;
	}

	/**
	 * Sets the value of the industrial property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIndustrial(String value) {
		this.industrial = value;
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
	 * Gets the value of the postcode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * Sets the value of the postcode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPostcode(String value) {
		this.postcode = value;
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

	/**
	 * Gets the value of the warnPrice property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getWarnPrice() {
		return warnPrice;
	}

	/**
	 * Sets the value of the warnPrice property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setWarnPrice(Long value) {
		this.warnPrice = value;
	}

}
