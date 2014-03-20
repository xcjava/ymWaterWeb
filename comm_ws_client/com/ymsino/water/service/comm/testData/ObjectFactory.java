package com.ymsino.water.service.comm.testData;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.ymsino.water.service.comm.testData package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _TestDataResponse_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "testDataResponse");
	private final static QName _TestData_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "testData");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ymsino.water.service.comm.testData
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link MeterDataVo }
	 * 
	 */
	public MeterDataVo createMeterDataVo() {
		return new MeterDataVo();
	}

	/**
	 * Create an instance of {@link TestDataResponse }
	 * 
	 */
	public TestDataResponse createTestDataResponse() {
		return new TestDataResponse();
	}

	/**
	 * Create an instance of {@link TestData }
	 * 
	 */
	public TestData createTestData() {
		return new TestData();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TestDataResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "testDataResponse")
	public JAXBElement<TestDataResponse> createTestDataResponse(TestDataResponse value) {
		return new JAXBElement<TestDataResponse>(_TestDataResponse_QNAME, TestDataResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TestData }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "testData")
	public JAXBElement<TestData> createTestData(TestData value) {
		return new JAXBElement<TestData>(_TestData_QNAME, TestData.class, null, value);
	}

}
