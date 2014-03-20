package com.ymsino.water.service.manager.priceTemplate;

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
 *         &lt;element name="priceTemplateSaveParam" type="{http://api.service.manager.esb.ymsino.com/}priceTemplateSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "priceTemplateSaveParam" })
public class Save {

	protected PriceTemplateSaveParam priceTemplateSaveParam;

	/**
	 * Gets the value of the priceTemplateSaveParam property.
	 * 
	 * @return possible object is {@link PriceTemplateSaveParam }
	 * 
	 */
	public PriceTemplateSaveParam getPriceTemplateSaveParam() {
		return priceTemplateSaveParam;
	}

	/**
	 * Sets the value of the priceTemplateSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link PriceTemplateSaveParam }
	 * 
	 */
	public void setPriceTemplateSaveParam(PriceTemplateSaveParam value) {
		this.priceTemplateSaveParam = value;
	}

}
