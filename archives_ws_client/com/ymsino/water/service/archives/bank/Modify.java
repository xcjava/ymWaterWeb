package com.ymsino.water.service.archives.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for modify complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="modify">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankModifyParam" type="{http://api.service.archives.esb.ymsino.com/}bankModifyParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify", propOrder = { "bankModifyParam" })
public class Modify {

	protected BankModifyParam bankModifyParam;

	/**
	 * Gets the value of the bankModifyParam property.
	 * 
	 * @return possible object is {@link BankModifyParam }
	 * 
	 */
	public BankModifyParam getBankModifyParam() {
		return bankModifyParam;
	}

	/**
	 * Sets the value of the bankModifyParam property.
	 * 
	 * @param value
	 *            allowed object is {@link BankModifyParam }
	 * 
	 */
	public void setBankModifyParam(BankModifyParam value) {
		this.bankModifyParam = value;
	}

}
