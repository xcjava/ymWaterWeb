package com.ymsino.water.service.freesettle.userWallet;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.ymsino.water.service.freesettle.userWallet package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _RechargeResponse_QNAME = new QName("http://api.service.freesettle.esb.ymsino.com/", "rechargeResponse");
	private final static QName _Recharge_QNAME = new QName("http://api.service.freesettle.esb.ymsino.com/", "recharge");
	private final static QName _DeductionResponse_QNAME = new QName("http://api.service.freesettle.esb.ymsino.com/", "deductionResponse");
	private final static QName _GetByUid_QNAME = new QName("http://api.service.freesettle.esb.ymsino.com/", "getByUid");
	private final static QName _GetByUidResponse_QNAME = new QName("http://api.service.freesettle.esb.ymsino.com/", "getByUidResponse");
	private final static QName _Deduction_QNAME = new QName("http://api.service.freesettle.esb.ymsino.com/", "deduction");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ymsino.water.service.freesettle.userWallet
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link GetByUidResponse }
	 * 
	 */
	public GetByUidResponse createGetByUidResponse() {
		return new GetByUidResponse();
	}

	/**
	 * Create an instance of {@link GetByUid }
	 * 
	 */
	public GetByUid createGetByUid() {
		return new GetByUid();
	}

	/**
	 * Create an instance of {@link DeductionResponse }
	 * 
	 */
	public DeductionResponse createDeductionResponse() {
		return new DeductionResponse();
	}

	/**
	 * Create an instance of {@link UserWalletReturn }
	 * 
	 */
	public UserWalletReturn createUserWalletReturn() {
		return new UserWalletReturn();
	}

	/**
	 * Create an instance of {@link Deduction }
	 * 
	 */
	public Deduction createDeduction() {
		return new Deduction();
	}

	/**
	 * Create an instance of {@link Recharge }
	 * 
	 */
	public Recharge createRecharge() {
		return new Recharge();
	}

	/**
	 * Create an instance of {@link RechargeResponse }
	 * 
	 */
	public RechargeResponse createRechargeResponse() {
		return new RechargeResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link RechargeResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.freesettle.esb.ymsino.com/", name = "rechargeResponse")
	public JAXBElement<RechargeResponse> createRechargeResponse(RechargeResponse value) {
		return new JAXBElement<RechargeResponse>(_RechargeResponse_QNAME, RechargeResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Recharge }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.freesettle.esb.ymsino.com/", name = "recharge")
	public JAXBElement<Recharge> createRecharge(Recharge value) {
		return new JAXBElement<Recharge>(_Recharge_QNAME, Recharge.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeductionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.freesettle.esb.ymsino.com/", name = "deductionResponse")
	public JAXBElement<DeductionResponse> createDeductionResponse(DeductionResponse value) {
		return new JAXBElement<DeductionResponse>(_DeductionResponse_QNAME, DeductionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetByUid }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.freesettle.esb.ymsino.com/", name = "getByUid")
	public JAXBElement<GetByUid> createGetByUid(GetByUid value) {
		return new JAXBElement<GetByUid>(_GetByUid_QNAME, GetByUid.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetByUidResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.freesettle.esb.ymsino.com/", name = "getByUidResponse")
	public JAXBElement<GetByUidResponse> createGetByUidResponse(GetByUidResponse value) {
		return new JAXBElement<GetByUidResponse>(_GetByUidResponse_QNAME, GetByUidResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Deduction }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.freesettle.esb.ymsino.com/", name = "deduction")
	public JAXBElement<Deduction> createDeduction(Deduction value) {
		return new JAXBElement<Deduction>(_Deduction_QNAME, Deduction.class, null, value);
	}

}
