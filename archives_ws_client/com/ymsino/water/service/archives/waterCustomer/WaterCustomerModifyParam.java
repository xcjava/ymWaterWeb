package com.ymsino.water.service.archives.waterCustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for waterCustomerModifyParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="waterCustomerModifyParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="basicWaterPriceCalc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="busiAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closeTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contractCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highEnergySectors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ladderFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maturityTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="meterSegmentNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notifyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pricStrategyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceTemplateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turnForMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waterNature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waterPointsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waterPointsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waterPriceIndustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="withoutWaterMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waterCustomerModifyParam", propOrder = {
		"basicWaterPriceCalc", "billType", "busiAddress", "businessType",
		"category", "chargingUnitId", "closeTimestamp", "contractCapacity",
		"customNum", "customerId", "customerName", "customerStatus",
		"customerType", "highEnergySectors", "ladderFlag", "maturityTimestamp",
		"meterSegmentNum", "notifyType", "oldUserId", "openTimestamp",
		"pricStrategyType", "priceTemplateId", "remark", "settlementType",
		"turnForMark", "uid", "userId", "userName", "waterNature",
		"waterPointsName", "waterPointsType", "waterPriceIndustry",
		"withoutWaterMark", "workStatus" })
public class WaterCustomerModifyParam {

	protected String basicWaterPriceCalc;
	protected String billType;
	protected String busiAddress;
	protected String businessType;
	protected String category;
	protected String chargingUnitId;
	protected Long closeTimestamp;
	protected String contractCapacity;
	protected String customNum;
	protected String customerId;
	protected String customerName;
	protected String customerStatus;
	protected String customerType;
	protected String highEnergySectors;
	protected String ladderFlag;
	protected Long maturityTimestamp;
	protected String meterSegmentNum;
	protected String notifyType;
	protected String oldUserId;
	protected Long openTimestamp;
	protected String pricStrategyType;
	protected Long priceTemplateId;
	protected String remark;
	protected String settlementType;
	protected String turnForMark;
	protected Long uid;
	protected String userId;
	protected String userName;
	protected String waterNature;
	protected String waterPointsName;
	protected String waterPointsType;
	protected String waterPriceIndustry;
	protected String withoutWaterMark;
	protected String workStatus;

	/**
	 * Gets the value of the basicWaterPriceCalc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBasicWaterPriceCalc() {
		return basicWaterPriceCalc;
	}

	/**
	 * Sets the value of the basicWaterPriceCalc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBasicWaterPriceCalc(String value) {
		this.basicWaterPriceCalc = value;
	}

	/**
	 * Gets the value of the billType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBillType() {
		return billType;
	}

	/**
	 * Sets the value of the billType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBillType(String value) {
		this.billType = value;
	}

	/**
	 * Gets the value of the busiAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBusiAddress() {
		return busiAddress;
	}

	/**
	 * Sets the value of the busiAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBusiAddress(String value) {
		this.busiAddress = value;
	}

	/**
	 * Gets the value of the businessType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBusinessType() {
		return businessType;
	}

	/**
	 * Sets the value of the businessType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBusinessType(String value) {
		this.businessType = value;
	}

	/**
	 * Gets the value of the category property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the value of the category property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCategory(String value) {
		this.category = value;
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
	 * Gets the value of the closeTimestamp property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCloseTimestamp() {
		return closeTimestamp;
	}

	/**
	 * Sets the value of the closeTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCloseTimestamp(Long value) {
		this.closeTimestamp = value;
	}

	/**
	 * Gets the value of the contractCapacity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContractCapacity() {
		return contractCapacity;
	}

	/**
	 * Sets the value of the contractCapacity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContractCapacity(String value) {
		this.contractCapacity = value;
	}

	/**
	 * Gets the value of the customNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomNum() {
		return customNum;
	}

	/**
	 * Sets the value of the customNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomNum(String value) {
		this.customNum = value;
	}

	/**
	 * Gets the value of the customerId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * Sets the value of the customerId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerId(String value) {
		this.customerId = value;
	}

	/**
	 * Gets the value of the customerName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * Sets the value of the customerName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerName(String value) {
		this.customerName = value;
	}

	/**
	 * Gets the value of the customerStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerStatus() {
		return customerStatus;
	}

	/**
	 * Sets the value of the customerStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerStatus(String value) {
		this.customerStatus = value;
	}

	/**
	 * Gets the value of the customerType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerType() {
		return customerType;
	}

	/**
	 * Sets the value of the customerType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerType(String value) {
		this.customerType = value;
	}

	/**
	 * Gets the value of the highEnergySectors property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHighEnergySectors() {
		return highEnergySectors;
	}

	/**
	 * Sets the value of the highEnergySectors property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHighEnergySectors(String value) {
		this.highEnergySectors = value;
	}

	/**
	 * Gets the value of the ladderFlag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLadderFlag() {
		return ladderFlag;
	}

	/**
	 * Sets the value of the ladderFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLadderFlag(String value) {
		this.ladderFlag = value;
	}

	/**
	 * Gets the value of the maturityTimestamp property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getMaturityTimestamp() {
		return maturityTimestamp;
	}

	/**
	 * Sets the value of the maturityTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setMaturityTimestamp(Long value) {
		this.maturityTimestamp = value;
	}

	/**
	 * Gets the value of the meterSegmentNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMeterSegmentNum() {
		return meterSegmentNum;
	}

	/**
	 * Sets the value of the meterSegmentNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMeterSegmentNum(String value) {
		this.meterSegmentNum = value;
	}

	/**
	 * Gets the value of the notifyType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNotifyType() {
		return notifyType;
	}

	/**
	 * Sets the value of the notifyType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNotifyType(String value) {
		this.notifyType = value;
	}

	/**
	 * Gets the value of the oldUserId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOldUserId() {
		return oldUserId;
	}

	/**
	 * Sets the value of the oldUserId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOldUserId(String value) {
		this.oldUserId = value;
	}

	/**
	 * Gets the value of the openTimestamp property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getOpenTimestamp() {
		return openTimestamp;
	}

	/**
	 * Sets the value of the openTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setOpenTimestamp(Long value) {
		this.openTimestamp = value;
	}

	/**
	 * Gets the value of the pricStrategyType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPricStrategyType() {
		return pricStrategyType;
	}

	/**
	 * Sets the value of the pricStrategyType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPricStrategyType(String value) {
		this.pricStrategyType = value;
	}

	/**
	 * Gets the value of the priceTemplateId property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getPriceTemplateId() {
		return priceTemplateId;
	}

	/**
	 * Sets the value of the priceTemplateId property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setPriceTemplateId(Long value) {
		this.priceTemplateId = value;
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
	 * Gets the value of the settlementType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSettlementType() {
		return settlementType;
	}

	/**
	 * Sets the value of the settlementType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSettlementType(String value) {
		this.settlementType = value;
	}

	/**
	 * Gets the value of the turnForMark property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTurnForMark() {
		return turnForMark;
	}

	/**
	 * Sets the value of the turnForMark property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTurnForMark(String value) {
		this.turnForMark = value;
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
	 * Gets the value of the waterNature property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWaterNature() {
		return waterNature;
	}

	/**
	 * Sets the value of the waterNature property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWaterNature(String value) {
		this.waterNature = value;
	}

	/**
	 * Gets the value of the waterPointsName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWaterPointsName() {
		return waterPointsName;
	}

	/**
	 * Sets the value of the waterPointsName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWaterPointsName(String value) {
		this.waterPointsName = value;
	}

	/**
	 * Gets the value of the waterPointsType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWaterPointsType() {
		return waterPointsType;
	}

	/**
	 * Sets the value of the waterPointsType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWaterPointsType(String value) {
		this.waterPointsType = value;
	}

	/**
	 * Gets the value of the waterPriceIndustry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWaterPriceIndustry() {
		return waterPriceIndustry;
	}

	/**
	 * Sets the value of the waterPriceIndustry property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWaterPriceIndustry(String value) {
		this.waterPriceIndustry = value;
	}

	/**
	 * Gets the value of the withoutWaterMark property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWithoutWaterMark() {
		return withoutWaterMark;
	}

	/**
	 * Sets the value of the withoutWaterMark property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWithoutWaterMark(String value) {
		this.withoutWaterMark = value;
	}

	/**
	 * Gets the value of the workStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWorkStatus() {
		return workStatus;
	}

	/**
	 * Sets the value of the workStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWorkStatus(String value) {
		this.workStatus = value;
	}

}
