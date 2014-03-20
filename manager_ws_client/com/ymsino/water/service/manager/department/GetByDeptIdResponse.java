package com.ymsino.water.service.manager.department;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getByDeptIdResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByDeptIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://api.service.manager.esb.ymsino.com/}departmentReturn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByDeptIdResponse", propOrder = { "_return" })
public class GetByDeptIdResponse {

	@XmlElement(name = "return")
	protected DepartmentReturn _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link DepartmentReturn }
	 * 
	 */
	public DepartmentReturn getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link DepartmentReturn }
	 * 
	 */
	public void setReturn(DepartmentReturn value) {
		this._return = value;
	}

}
