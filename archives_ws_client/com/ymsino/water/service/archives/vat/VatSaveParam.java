package com.ymsino.water.service.archives.vat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for vatSaveParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="vatSaveParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="vatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vatBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vatNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vatSaveParam", propOrder = { "chargingUnitId", "regAddress",
		"tel", "uid", "vatAccount", "vatBank", "vatName", "vatNum" })
public class VatSaveParam {

	protected String chargingUnitId;
	protected String regAddress;
	protected String tel;
	protected Long uid;
	protected String vatAccount;
	protected String vatBank;
	protected String vatName;
	protected String vatNum;

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
	 * Gets the value of the regAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRegAddress() {
		return regAddress;
	}

	/**
	 * Sets the value of the regAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRegAddress(String value) {
		this.regAddress = value;
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
	 * Gets the value of the vatAccount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVatAccount() {
		return vatAccount;
	}

	/**
	 * Sets the value of the vatAccount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVatAccount(String value) {
		this.vatAccount = value;
	}

	/**
	 * Gets the value of the vatBank property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVatBank() {
		return vatBank;
	}

	/**
	 * Sets the value of the vatBank property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVatBank(String value) {
		this.vatBank = value;
	}

	/**
	 * Gets the value of the vatName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVatName() {
		return vatName;
	}

	/**
	 * Sets the value of the vatName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVatName(String value) {
		this.vatName = value;
	}

	/**
	 * Gets the value of the vatNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVatNum() {
		return vatNum;
	}

	/**
	 * Sets the value of the vatNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVatNum(String value) {
		this.vatNum = value;
	}

}
