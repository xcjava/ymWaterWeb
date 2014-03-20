package com.ymsino.water.service.manager.department;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for save complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="save">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departmentSaveParam" type="{http://api.service.manager.esb.ymsino.com/}departmentSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "departmentSaveParam" })
public class Save {

	protected DepartmentSaveParam departmentSaveParam;

	/**
	 * Gets the value of the departmentSaveParam property.
	 * 
	 * @return possible object is {@link DepartmentSaveParam }
	 * 
	 */
	public DepartmentSaveParam getDepartmentSaveParam() {
		return departmentSaveParam;
	}

	/**
	 * Sets the value of the departmentSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link DepartmentSaveParam }
	 * 
	 */
	public void setDepartmentSaveParam(DepartmentSaveParam value) {
		this.departmentSaveParam = value;
	}

}
