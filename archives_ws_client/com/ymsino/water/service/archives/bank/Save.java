package com.ymsino.water.service.archives.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for save complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="save">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankSaveParam" type="{http://api.service.archives.esb.ymsino.com/}bankSaveParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = { "bankSaveParam" })
public class Save {

	protected BankSaveParam bankSaveParam;

	/**
	 * Gets the value of the bankSaveParam property.
	 * 
	 * @return possible object is {@link BankSaveParam }
	 * 
	 */
	public BankSaveParam getBankSaveParam() {
		return bankSaveParam;
	}

	/**
	 * Sets the value of the bankSaveParam property.
	 * 
	 * @param value
	 *            allowed object is {@link BankSaveParam }
	 * 
	 */
	public void setBankSaveParam(BankSaveParam value) {
		this.bankSaveParam = value;
	}

}
