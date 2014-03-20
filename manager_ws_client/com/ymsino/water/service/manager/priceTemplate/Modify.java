package com.ymsino.water.service.manager.priceTemplate;

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
 *         &lt;element name="priceTemplateModifyParam" type="{http://api.service.manager.esb.ymsino.com/}priceTemplateModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "priceTemplateModifyParam" })
public class Modify {

	protected PriceTemplateModifyParam priceTemplateModifyParam;

	/**
	 * Gets the value of the priceTemplateModifyParam property.
	 * 
	 * @return possible object is {@link PriceTemplateModifyParam }
	 * 
	 */
	public PriceTemplateModifyParam getPriceTemplateModifyParam() {
		return priceTemplateModifyParam;
	}

	/**
	 * Sets the value of the priceTemplateModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link PriceTemplateModifyParam }
	 * 
	 */
	public void setPriceTemplateModifyParam(PriceTemplateModifyParam value) {
		this.priceTemplateModifyParam = value;
	}

}
