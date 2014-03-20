package com.ymsino.water.service.manager.manager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for managerModifyParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="managerModifyParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "managerModifyParam", propOrder = { "chargingUnitId", "departmentId", "email", "managerId", "name", "password", "tel" })
public class ManagerModifyParam {

	protected String chargingUnitId;
	protected String departmentId;
	protected String email;
	protected String managerId;
	protected String name;
	protected String password;
	protected String tel;

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
	 * Gets the value of the departmentId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDepartmentId() {
		return departmentId;
	}

	/**
	 * Sets the value of the departmentId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDepartmentId(String value) {
		this.departmentId = value;
	}

	/**
	 * Gets the value of the email property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the value of the email property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmail(String value) {
		this.email = value;
	}

	/**
	 * Gets the value of the managerId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getManagerId() {
		return managerId;
	}

	/**
	 * Sets the value of the managerId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setManagerId(String value) {
		this.managerId = value;
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

}
