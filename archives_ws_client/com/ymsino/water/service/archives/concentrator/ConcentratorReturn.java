package com.ymsino.water.service.archives.concentrator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for concentratorReturn complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="concentratorReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="algorithmKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="algorithmNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionStatus" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="collectionType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="communication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="communicationCost" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="costTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dayFreezeStartHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dayFreezeStartMinute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exceedFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forwardTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gatewayIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gatewayPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gprsNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gpsLatitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gpsLongitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heartbeatCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logicCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthFreezeStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthFreezeStartHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryCommPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proXyIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proXyPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relaySystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resendTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reserveIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reservePort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rtsClose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rtsOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rtsTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="statuteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalCommPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalNoRespTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transmissionDelay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concentratorReturn", propOrder = { "actualFlow", "address",
		"algorithmKey", "algorithmNum", "areaCode", "channelId",
		"chargingUnitId", "city", "collectionAddress", "collectionId",
		"collectionName", "collectionStatus", "collectionType",
		"communication", "communicationCost", "costTimestamp",
		"createTimestamp", "dayFreezeStartHour", "dayFreezeStartMinute",
		"district", "exceedFlow", "forwardTerminal", "gatewayIp",
		"gatewayPort", "gprsNum", "gpsLatitude", "gpsLongitude", "hardwareId",
		"heartbeatCycle", "logicCode", "meterType", "monthFreezeStartDate",
		"monthFreezeStartHour", "name", "parentUnits", "password",
		"primaryCommPassword", "primaryIp", "primaryPort", "proXyIp",
		"proXyPort", "province", "relaySystem", "relayType", "resendTime",
		"reserveIp", "reservePort", "responseTimeout", "rtsClose", "rtsOpen",
		"rtsTimeout", "serial", "simSN", "smsNum", "startTimeout",
		"startTimestamp", "status", "statuteType", "street", "tel",
		"terminalCommPassword", "terminalId", "terminalIp",
		"terminalLocationCode", "terminalNoRespTimeout", "terminalNum",
		"terminalPost", "transmissionDelay" })
public class ConcentratorReturn {

	protected String actualFlow;
	protected String address;
	protected String algorithmKey;
	protected String algorithmNum;
	protected String areaCode;
	protected String channelId;
	protected String chargingUnitId;
	protected String city;
	protected String collectionAddress;
	protected String collectionId;
	protected String collectionName;
	protected Short collectionStatus;
	protected Short collectionType;
	protected String communication;
	protected Long communicationCost;
	protected Long costTimestamp;
	protected Long createTimestamp;
	protected String dayFreezeStartHour;
	protected String dayFreezeStartMinute;
	protected String district;
	protected String exceedFlow;
	protected String forwardTerminal;
	protected String gatewayIp;
	protected String gatewayPort;
	protected String gprsNum;
	protected String gpsLatitude;
	protected String gpsLongitude;
	protected String hardwareId;
	protected String heartbeatCycle;
	protected String logicCode;
	protected String meterType;
	protected String monthFreezeStartDate;
	protected String monthFreezeStartHour;
	protected String name;
	protected String parentUnits;
	protected String password;
	protected String primaryCommPassword;
	protected String primaryIp;
	protected String primaryPort;
	protected String proXyIp;
	protected String proXyPort;
	protected String province;
	protected String relaySystem;
	protected String relayType;
	protected Integer resendTime;
	protected String reserveIp;
	protected String reservePort;
	protected String responseTimeout;
	protected String rtsClose;
	protected String rtsOpen;
	protected String rtsTimeout;
	protected String serial;
	protected String simSN;
	protected String smsNum;
	protected String startTimeout;
	protected Long startTimestamp;
	protected Short status;
	protected String statuteType;
	protected String street;
	protected String tel;
	protected String terminalCommPassword;
	protected String terminalId;
	protected String terminalIp;
	protected String terminalLocationCode;
	protected String terminalNoRespTimeout;
	protected String terminalNum;
	protected String terminalPost;
	protected String transmissionDelay;

	/**
	 * Gets the value of the actualFlow property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getActualFlow() {
		return actualFlow;
	}

	/**
	 * Sets the value of the actualFlow property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setActualFlow(String value) {
		this.actualFlow = value;
	}

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
	 * Gets the value of the algorithmKey property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlgorithmKey() {
		return algorithmKey;
	}

	/**
	 * Sets the value of the algorithmKey property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlgorithmKey(String value) {
		this.algorithmKey = value;
	}

	/**
	 * Gets the value of the algorithmNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlgorithmNum() {
		return algorithmNum;
	}

	/**
	 * Sets the value of the algorithmNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlgorithmNum(String value) {
		this.algorithmNum = value;
	}

	/**
	 * Gets the value of the areaCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * Sets the value of the areaCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAreaCode(String value) {
		this.areaCode = value;
	}

	/**
	 * Gets the value of the channelId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * Sets the value of the channelId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setChannelId(String value) {
		this.channelId = value;
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
	 * Gets the value of the collectionAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCollectionAddress() {
		return collectionAddress;
	}

	/**
	 * Sets the value of the collectionAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCollectionAddress(String value) {
		this.collectionAddress = value;
	}

	/**
	 * Gets the value of the collectionId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCollectionId() {
		return collectionId;
	}

	/**
	 * Sets the value of the collectionId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCollectionId(String value) {
		this.collectionId = value;
	}

	/**
	 * Gets the value of the collectionName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCollectionName() {
		return collectionName;
	}

	/**
	 * Sets the value of the collectionName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCollectionName(String value) {
		this.collectionName = value;
	}

	/**
	 * Gets the value of the collectionStatus property.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getCollectionStatus() {
		return collectionStatus;
	}

	/**
	 * Sets the value of the collectionStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setCollectionStatus(Short value) {
		this.collectionStatus = value;
	}

	/**
	 * Gets the value of the collectionType property.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getCollectionType() {
		return collectionType;
	}

	/**
	 * Sets the value of the collectionType property.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setCollectionType(Short value) {
		this.collectionType = value;
	}

	/**
	 * Gets the value of the communication property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCommunication() {
		return communication;
	}

	/**
	 * Sets the value of the communication property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCommunication(String value) {
		this.communication = value;
	}

	/**
	 * Gets the value of the communicationCost property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCommunicationCost() {
		return communicationCost;
	}

	/**
	 * Sets the value of the communicationCost property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCommunicationCost(Long value) {
		this.communicationCost = value;
	}

	/**
	 * Gets the value of the costTimestamp property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCostTimestamp() {
		return costTimestamp;
	}

	/**
	 * Sets the value of the costTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCostTimestamp(Long value) {
		this.costTimestamp = value;
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
	 * Gets the value of the dayFreezeStartHour property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDayFreezeStartHour() {
		return dayFreezeStartHour;
	}

	/**
	 * Sets the value of the dayFreezeStartHour property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDayFreezeStartHour(String value) {
		this.dayFreezeStartHour = value;
	}

	/**
	 * Gets the value of the dayFreezeStartMinute property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDayFreezeStartMinute() {
		return dayFreezeStartMinute;
	}

	/**
	 * Sets the value of the dayFreezeStartMinute property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDayFreezeStartMinute(String value) {
		this.dayFreezeStartMinute = value;
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
	 * Gets the value of the exceedFlow property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExceedFlow() {
		return exceedFlow;
	}

	/**
	 * Sets the value of the exceedFlow property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExceedFlow(String value) {
		this.exceedFlow = value;
	}

	/**
	 * Gets the value of the forwardTerminal property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getForwardTerminal() {
		return forwardTerminal;
	}

	/**
	 * Sets the value of the forwardTerminal property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setForwardTerminal(String value) {
		this.forwardTerminal = value;
	}

	/**
	 * Gets the value of the gatewayIp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGatewayIp() {
		return gatewayIp;
	}

	/**
	 * Sets the value of the gatewayIp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGatewayIp(String value) {
		this.gatewayIp = value;
	}

	/**
	 * Gets the value of the gatewayPort property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGatewayPort() {
		return gatewayPort;
	}

	/**
	 * Sets the value of the gatewayPort property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGatewayPort(String value) {
		this.gatewayPort = value;
	}

	/**
	 * Gets the value of the gprsNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGprsNum() {
		return gprsNum;
	}

	/**
	 * Sets the value of the gprsNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGprsNum(String value) {
		this.gprsNum = value;
	}

	/**
	 * Gets the value of the gpsLatitude property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGpsLatitude() {
		return gpsLatitude;
	}

	/**
	 * Sets the value of the gpsLatitude property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGpsLatitude(String value) {
		this.gpsLatitude = value;
	}

	/**
	 * Gets the value of the gpsLongitude property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGpsLongitude() {
		return gpsLongitude;
	}

	/**
	 * Sets the value of the gpsLongitude property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGpsLongitude(String value) {
		this.gpsLongitude = value;
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
	 * Gets the value of the heartbeatCycle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHeartbeatCycle() {
		return heartbeatCycle;
	}

	/**
	 * Sets the value of the heartbeatCycle property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHeartbeatCycle(String value) {
		this.heartbeatCycle = value;
	}

	/**
	 * Gets the value of the logicCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLogicCode() {
		return logicCode;
	}

	/**
	 * Sets the value of the logicCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLogicCode(String value) {
		this.logicCode = value;
	}

	/**
	 * Gets the value of the meterType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMeterType() {
		return meterType;
	}

	/**
	 * Sets the value of the meterType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMeterType(String value) {
		this.meterType = value;
	}

	/**
	 * Gets the value of the monthFreezeStartDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMonthFreezeStartDate() {
		return monthFreezeStartDate;
	}

	/**
	 * Sets the value of the monthFreezeStartDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMonthFreezeStartDate(String value) {
		this.monthFreezeStartDate = value;
	}

	/**
	 * Gets the value of the monthFreezeStartHour property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMonthFreezeStartHour() {
		return monthFreezeStartHour;
	}

	/**
	 * Sets the value of the monthFreezeStartHour property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMonthFreezeStartHour(String value) {
		this.monthFreezeStartHour = value;
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
	 * Gets the value of the password property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the value of the password property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPassword(String value) {
		this.password = value;
	}

	/**
	 * Gets the value of the primaryCommPassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrimaryCommPassword() {
		return primaryCommPassword;
	}

	/**
	 * Sets the value of the primaryCommPassword property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrimaryCommPassword(String value) {
		this.primaryCommPassword = value;
	}

	/**
	 * Gets the value of the primaryIp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrimaryIp() {
		return primaryIp;
	}

	/**
	 * Sets the value of the primaryIp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrimaryIp(String value) {
		this.primaryIp = value;
	}

	/**
	 * Gets the value of the primaryPort property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrimaryPort() {
		return primaryPort;
	}

	/**
	 * Sets the value of the primaryPort property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrimaryPort(String value) {
		this.primaryPort = value;
	}

	/**
	 * Gets the value of the proXyIp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProXyIp() {
		return proXyIp;
	}

	/**
	 * Sets the value of the proXyIp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProXyIp(String value) {
		this.proXyIp = value;
	}

	/**
	 * Gets the value of the proXyPort property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProXyPort() {
		return proXyPort;
	}

	/**
	 * Sets the value of the proXyPort property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProXyPort(String value) {
		this.proXyPort = value;
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
	 * Gets the value of the relaySystem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRelaySystem() {
		return relaySystem;
	}

	/**
	 * Sets the value of the relaySystem property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRelaySystem(String value) {
		this.relaySystem = value;
	}

	/**
	 * Gets the value of the relayType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRelayType() {
		return relayType;
	}

	/**
	 * Sets the value of the relayType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRelayType(String value) {
		this.relayType = value;
	}

	/**
	 * Gets the value of the resendTime property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getResendTime() {
		return resendTime;
	}

	/**
	 * Sets the value of the resendTime property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setResendTime(Integer value) {
		this.resendTime = value;
	}

	/**
	 * Gets the value of the reserveIp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReserveIp() {
		return reserveIp;
	}

	/**
	 * Sets the value of the reserveIp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReserveIp(String value) {
		this.reserveIp = value;
	}

	/**
	 * Gets the value of the reservePort property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReservePort() {
		return reservePort;
	}

	/**
	 * Sets the value of the reservePort property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReservePort(String value) {
		this.reservePort = value;
	}

	/**
	 * Gets the value of the responseTimeout property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResponseTimeout() {
		return responseTimeout;
	}

	/**
	 * Sets the value of the responseTimeout property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResponseTimeout(String value) {
		this.responseTimeout = value;
	}

	/**
	 * Gets the value of the rtsClose property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRtsClose() {
		return rtsClose;
	}

	/**
	 * Sets the value of the rtsClose property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRtsClose(String value) {
		this.rtsClose = value;
	}

	/**
	 * Gets the value of the rtsOpen property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRtsOpen() {
		return rtsOpen;
	}

	/**
	 * Sets the value of the rtsOpen property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRtsOpen(String value) {
		this.rtsOpen = value;
	}

	/**
	 * Gets the value of the rtsTimeout property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRtsTimeout() {
		return rtsTimeout;
	}

	/**
	 * Sets the value of the rtsTimeout property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRtsTimeout(String value) {
		this.rtsTimeout = value;
	}

	/**
	 * Gets the value of the serial property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSerial() {
		return serial;
	}

	/**
	 * Sets the value of the serial property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSerial(String value) {
		this.serial = value;
	}

	/**
	 * Gets the value of the simSN property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSimSN() {
		return simSN;
	}

	/**
	 * Sets the value of the simSN property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSimSN(String value) {
		this.simSN = value;
	}

	/**
	 * Gets the value of the smsNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSmsNum() {
		return smsNum;
	}

	/**
	 * Sets the value of the smsNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSmsNum(String value) {
		this.smsNum = value;
	}

	/**
	 * Gets the value of the startTimeout property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStartTimeout() {
		return startTimeout;
	}

	/**
	 * Sets the value of the startTimeout property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStartTimeout(String value) {
		this.startTimeout = value;
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
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setStatus(Short value) {
		this.status = value;
	}

	/**
	 * Gets the value of the statuteType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatuteType() {
		return statuteType;
	}

	/**
	 * Sets the value of the statuteType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatuteType(String value) {
		this.statuteType = value;
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
	 * Gets the value of the tel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * Sets the value of the tel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTel(String value) {
		this.tel = value;
	}

	/**
	 * Gets the value of the terminalCommPassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTerminalCommPassword() {
		return terminalCommPassword;
	}

	/**
	 * Sets the value of the terminalCommPassword property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTerminalCommPassword(String value) {
		this.terminalCommPassword = value;
	}

	/**
	 * Gets the value of the terminalId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTerminalId() {
		return terminalId;
	}

	/**
	 * Sets the value of the terminalId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTerminalId(String value) {
		this.terminalId = value;
	}

	/**
	 * Gets the value of the terminalIp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTerminalIp() {
		return terminalIp;
	}

	/**
	 * Sets the value of the terminalIp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTerminalIp(String value) {
		this.terminalIp = value;
	}

	/**
	 * Gets the value of the terminalLocationCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTerminalLocationCode() {
		return terminalLocationCode;
	}

	/**
	 * Sets the value of the terminalLocationCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTerminalLocationCode(String value) {
		this.terminalLocationCode = value;
	}

	/**
	 * Gets the value of the terminalNoRespTimeout property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTerminalNoRespTimeout() {
		return terminalNoRespTimeout;
	}

	/**
	 * Sets the value of the terminalNoRespTimeout property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTerminalNoRespTimeout(String value) {
		this.terminalNoRespTimeout = value;
	}

	/**
	 * Gets the value of the terminalNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTerminalNum() {
		return terminalNum;
	}

	/**
	 * Sets the value of the terminalNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTerminalNum(String value) {
		this.terminalNum = value;
	}

	/**
	 * Gets the value of the terminalPost property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTerminalPost() {
		return terminalPost;
	}

	/**
	 * Sets the value of the terminalPost property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTerminalPost(String value) {
		this.terminalPost = value;
	}

	/**
	 * Gets the value of the transmissionDelay property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransmissionDelay() {
		return transmissionDelay;
	}

	/**
	 * Sets the value of the transmissionDelay property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransmissionDelay(String value) {
		this.transmissionDelay = value;
	}

}
