package com.ymsino.water.service.manager.department;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for departmentSaveParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="departmentSaveParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargingUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentDeptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="popedomJson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "departmentSaveParam", propOrder = { "chargingUnitId", "deptId", "linkAddr", "linkMan", "linkTel", "name", "parentDeptId", "popedomJson", "remark" })
public class DepartmentSaveParam {

	protected String chargingUnitId;
	protected String deptId;
	protected String linkAddr;
	protected String linkMan;
	protected String linkTel;
	protected String name;
	protected String parentDeptId;
	protected String popedomJson;
	protected String remark;

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
	 * Gets the value of the deptId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeptId() {
		return deptId;
	}

	/**
	 * Sets the value of the deptId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeptId(String value) {
		this.deptId = value;
	}

	/**
	 * Gets the value of the linkAddr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLinkAddr() {
		return linkAddr;
	}

	/**
	 * Sets the value of the linkAddr property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLinkAddr(String value) {
		this.linkAddr = value;
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
	 * Gets the value of the linkTel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLinkTel() {
		return linkTel;
	}

	/**
	 * Sets the value of the linkTel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLinkTel(String value) {
		this.linkTel = value;
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
	 * Gets the value of the parentDeptId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParentDeptId() {
		return parentDeptId;
	}

	/**
	 * Sets the value of the parentDeptId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParentDeptId(String value) {
		this.parentDeptId = value;
	}

	/**
	 * Gets the value of the popedomJson property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPopedomJson() {
		return popedomJson;
	}

	/**
	 * Sets the value of the popedomJson property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPopedomJson(String value) {
		this.popedomJson = value;
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

}
