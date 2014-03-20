package com.ymsino.water.service.manager.department;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for modify complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modify">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departmentModifyParam" type="{http://api.service.manager.esb.ymsino.com/}departmentModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "departmentModifyParam" })
public class Modify {

	protected DepartmentModifyParam departmentModifyParam;

	/**
	 * Gets the value of the departmentModifyParam property.
	 * 
	 * @return possible object is {@link DepartmentModifyParam }
	 * 
	 */
	public DepartmentModifyParam getDepartmentModifyParam() {
		return departmentModifyParam;
	}

	/**
	 * Sets the value of the departmentModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link DepartmentModifyParam }
	 * 
	 */
	public void setDepartmentModifyParam(DepartmentModifyParam value) {
		this.departmentModifyParam = value;
	}

}
