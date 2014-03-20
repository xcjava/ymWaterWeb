package com.ymsino.water.service.freesettle.userWallet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for recharge complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sysRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recharge", propOrder = { "uid", "price", "sysRemark" })
public class Recharge {

	protected Long uid;
	protected Long price;
	protected String sysRemark;

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
	 * Gets the value of the sysRemark property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSysRemark() {
		return sysRemark;
	}

	/**
	 * Sets the value of the sysRemark property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSysRemark(String value) {
		this.sysRemark = value;
	}

}
