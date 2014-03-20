package com.ymsino.water.service.comm.testMeterCode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.ymsino.water.service.comm.testMeterCode package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _TestMeterCode_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "testMeterCode");
	private final static QName _TestMeterCodeResponse_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "testMeterCodeResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ymsino.water.service.comm.testMeterCode
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link TestMeterCode }
	 * 
	 */
	public TestMeterCode createTestMeterCode() {
		return new TestMeterCode();
	}

	/**
	 * Create an instance of {@link TestMeterCodeResponse }
	 * 
	 */
	public TestMeterCodeResponse createTestMeterCodeResponse() {
		return new TestMeterCodeResponse();
	}

	/**
	 * Create an instance of {@link MeterDataVo }
	 * 
	 */
	public MeterDataVo createMeterDataVo() {
		return new MeterDataVo();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TestMeterCode }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "testMeterCode")
	public JAXBElement<TestMeterCode> createTestMeterCode(TestMeterCode value) {
		return new JAXBElement<TestMeterCode>(_TestMeterCode_QNAME, TestMeterCode.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TestMeterCodeResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "testMeterCodeResponse")
	public JAXBElement<TestMeterCodeResponse> createTestMeterCodeResponse(TestMeterCodeResponse value) {
		return new JAXBElement<TestMeterCodeResponse>(_TestMeterCodeResponse_QNAME, TestMeterCodeResponse.class, null, value);
	}

}
