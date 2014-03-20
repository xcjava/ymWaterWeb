package com.ymsino.water.service.data.collectTask;

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
 *         &lt;element name="collectTaskModifyParam" type="{http://api.service.data.esb.ymsino.com/}collectTaskModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "collectTaskModifyParam" })
public class Modify {

	protected CollectTaskModifyParam collectTaskModifyParam;

	/**
	 * Gets the value of the collectTaskModifyParam property.
	 * 
	 * @return possible object is {@link CollectTaskModifyParam }
	 * 
	 */
	public CollectTaskModifyParam getCollectTaskModifyParam() {
		return collectTaskModifyParam;
	}

	/**
	 * Sets the value of the collectTaskModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link CollectTaskModifyParam }
	 * 
	 */
	public void setCollectTaskModifyParam(CollectTaskModifyParam value) {
		this.collectTaskModifyParam = value;
	}

}
