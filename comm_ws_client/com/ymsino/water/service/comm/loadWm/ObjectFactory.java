package com.ymsino.water.service.comm.loadWm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.ymsino.water.service.comm.loadWm package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _ReadWaterMeterSnResponse_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "readWaterMeterSnResponse");
	private final static QName _LoadWm_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "loadWm");
	private final static QName _LoadWmResponse_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "loadWmResponse");
	private final static QName _ReadWaterMeterSn_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "readWaterMeterSn");
	private final static QName _Test_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "test");
	private final static QName _TestResponse_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "testResponse");
	private final static QName _InterruptedException_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "InterruptedException");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ymsino.water.service.comm.loadWm
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Test }
	 * 
	 */
	public Test createTest() {
		return new Test();
	}

	/**
	 * Create an instance of {@link TestResponse }
	 * 
	 */
	public TestResponse createTestResponse() {
		return new TestResponse();
	}

	/**
	 * Create an instance of {@link ReadWaterMeterSn }
	 * 
	 */
	public ReadWaterMeterSn createReadWaterMeterSn() {
		return new ReadWaterMeterSn();
	}

	/**
	 * Create an instance of {@link InterruptedException }
	 * 
	 */
	public InterruptedException createInterruptedException() {
		return new InterruptedException();
	}

	/**
	 * Create an instance of {@link LoadWmResponse }
	 * 
	 */
	public LoadWmResponse createLoadWmResponse() {
		return new LoadWmResponse();
	}

	/**
	 * Create an instance of {@link LoadWm }
	 * 
	 */
	public LoadWm createLoadWm() {
		return new LoadWm();
	}

	/**
	 * Create an instance of {@link MeterSnVo }
	 * 
	 */
	public MeterSnVo createMeterSnVo() {
		return new MeterSnVo();
	}

	/**
	 * Create an instance of {@link ReadWaterMeterSnResponse }
	 * 
	 */
	public ReadWaterMeterSnResponse createReadWaterMeterSnResponse() {
		return new ReadWaterMeterSnResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ReadWaterMeterSnResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "readWaterMeterSnResponse")
	public JAXBElement<ReadWaterMeterSnResponse> createReadWaterMeterSnResponse(ReadWaterMeterSnResponse value) {
		return new JAXBElement<ReadWaterMeterSnResponse>(_ReadWaterMeterSnResponse_QNAME, ReadWaterMeterSnResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoadWm }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "loadWm")
	public JAXBElement<LoadWm> createLoadWm(LoadWm value) {
		return new JAXBElement<LoadWm>(_LoadWm_QNAME, LoadWm.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoadWmResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "loadWmResponse")
	public JAXBElement<LoadWmResponse> createLoadWmResponse(LoadWmResponse value) {
		return new JAXBElement<LoadWmResponse>(_LoadWmResponse_QNAME, LoadWmResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ReadWaterMeterSn }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "readWaterMeterSn")
	public JAXBElement<ReadWaterMeterSn> createReadWaterMeterSn(ReadWaterMeterSn value) {
		return new JAXBElement<ReadWaterMeterSn>(_ReadWaterMeterSn_QNAME, ReadWaterMeterSn.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "test")
	public JAXBElement<Test> createTest(Test value) {
		return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "testResponse")
	public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
		return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InterruptedException }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "InterruptedException")
	public JAXBElement<InterruptedException> createInterruptedException(InterruptedException value) {
		return new JAXBElement<InterruptedException>(_InterruptedException_QNAME, InterruptedException.class, null, value);
	}

}
