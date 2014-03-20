package com.ymsino.water.service.data.collectTask;

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
 *         &lt;element name="collectTaskSaveParam" type="{http://api.service.data.esb.ymsino.com/}collectTaskSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "collectTaskSaveParam" })
public class Save {

	protected CollectTaskSaveParam collectTaskSaveParam;

	/**
	 * Gets the value of the collectTaskSaveParam property.
	 * 
	 * @return possible object is {@link CollectTaskSaveParam }
	 * 
	 */
	public CollectTaskSaveParam getCollectTaskSaveParam() {
		return collectTaskSaveParam;
	}

	/**
	 * Sets the value of the collectTaskSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link CollectTaskSaveParam }
	 * 
	 */
	public void setCollectTaskSaveParam(CollectTaskSaveParam value) {
		this.collectTaskSaveParam = value;
	}

}
