package com.ymsino.water.service.freesettle.userWallet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for userWalletReturn complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userWalletReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cashAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="healthSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="healthStatus" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="modifyTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userWalletReturn", propOrder = { "cashAmount", "healthSign", "healthStatus", "modifyTimestamp" })
public class UserWalletReturn {

	protected Long cashAmount;
	protected String healthSign;
	protected Short healthStatus;
	protected Long modifyTimestamp;

	/**
	 * Gets the value of the cashAmount property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCashAmount() {
		return cashAmount;
	}

	/**
	 * Sets the value of the cashAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCashAmount(Long value) {
		this.cashAmount = value;
	}

	/**
	 * Gets the value of the healthSign property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHealthSign() {
		return healthSign;
	}

	/**
	 * Sets the value of the healthSign property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHealthSign(String value) {
		this.healthSign = value;
	}

	/**
	 * Gets the value of the healthStatus property.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getHealthStatus() {
		return healthStatus;
	}

	/**
	 * Sets the value of the healthStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setHealthStatus(Short value) {
		this.healthStatus = value;
	}

	/**
	 * Gets the value of the modifyTimestamp property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getModifyTimestamp() {
		return modifyTimestamp;
	}

	/**
	 * Sets the value of the modifyTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setModifyTimestamp(Long value) {
		this.modifyTimestamp = value;
	}

}
