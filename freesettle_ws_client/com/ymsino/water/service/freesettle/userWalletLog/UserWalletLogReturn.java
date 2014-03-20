package com.ymsino.water.service.freesettle.userWalletLog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for userWalletLogReturn complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userWalletLogReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="logType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="sysRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="usePrice" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userWalletLogReturn", propOrder = { "createTimestamp", "id", "logType", "sysRemark", "uid", "usePrice" })
public class UserWalletLogReturn {

	protected Long createTimestamp;
	protected Long id;
	protected Short logType;
	protected String sysRemark;
	protected Long uid;
	protected Long usePrice;

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
	 * Gets the value of the logType property.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getLogType() {
		return logType;
	}

	/**
	 * Sets the value of the logType property.
	 * 
	 * @param value
	 *            allowed object is {@link Short }
	 * 
	 */
	public void setLogType(Short value) {
		this.logType = value;
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
	 * Gets the value of the usePrice property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getUsePrice() {
		return usePrice;
	}

	/**
	 * Sets the value of the usePrice property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setUsePrice(Long value) {
		this.usePrice = value;
	}

}
