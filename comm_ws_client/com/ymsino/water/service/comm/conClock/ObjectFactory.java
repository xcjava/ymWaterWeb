package com.ymsino.water.service.comm.conClock;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.ymsino.water.service.comm.conClock package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _ReadClock_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "readClock");
	private final static QName _SetupClockResponse_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "setupClockResponse");
	private final static QName _SetupClock_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "setupClock");
	private final static QName _ReadClockResponse_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "readClockResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ymsino.water.service.comm.conClock
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ReadClock }
	 * 
	 */
	public ReadClock createReadClock() {
		return new ReadClock();
	}

	/**
	 * Create an instance of {@link SetupClock }
	 * 
	 */
	public SetupClock createSetupClock() {
		return new SetupClock();
	}

	/**
	 * Create an instance of {@link SetupClockResponse }
	 * 
	 */
	public SetupClockResponse createSetupClockResponse() {
		return new SetupClockResponse();
	}

	/**
	 * Create an instance of {@link ReadClockResponse }
	 * 
	 */
	public ReadClockResponse createReadClockResponse() {
		return new ReadClockResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ReadClock }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "readClock")
	public JAXBElement<ReadClock> createReadClock(ReadClock value) {
		return new JAXBElement<ReadClock>(_ReadClock_QNAME, ReadClock.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SetupClockResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "setupClockResponse")
	public JAXBElement<SetupClockResponse> createSetupClockResponse(SetupClockResponse value) {
		return new JAXBElement<SetupClockResponse>(_SetupClockResponse_QNAME, SetupClockResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SetupClock }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "setupClock")
	public JAXBElement<SetupClock> createSetupClock(SetupClock value) {
		return new JAXBElement<SetupClock>(_SetupClock_QNAME, SetupClock.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ReadClockResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "readClockResponse")
	public JAXBElement<ReadClockResponse> createReadClockResponse(ReadClockResponse value) {
		return new JAXBElement<ReadClockResponse>(_ReadClockResponse_QNAME, ReadClockResponse.class, null, value);
	}

}
