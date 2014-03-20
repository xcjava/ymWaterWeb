package com.ymsino.water.service.comm.readData;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.ymsino.water.service.comm.readData package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _ReadDataByDateResponse_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "readDataByDateResponse");
	private final static QName _ReadDataByDate_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "readDataByDate");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ymsino.water.service.comm.readData
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
	 * Create an instance of {@link ReadDataByDateResponse }
	 * 
	 */
	public ReadDataByDateResponse createReadDataByDateResponse() {
		return new ReadDataByDateResponse();
	}

	/**
	 * Create an instance of {@link ReadDataByDate }
	 * 
	 */
	public ReadDataByDate createReadDataByDate() {
		return new ReadDataByDate();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ReadDataByDateResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "readDataByDateResponse")
	public JAXBElement<ReadDataByDateResponse> createReadDataByDateResponse(ReadDataByDateResponse value) {
		return new JAXBElement<ReadDataByDateResponse>(_ReadDataByDateResponse_QNAME, ReadDataByDateResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ReadDataByDate }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "readDataByDate")
	public JAXBElement<ReadDataByDate> createReadDataByDate(ReadDataByDate value) {
		return new JAXBElement<ReadDataByDate>(_ReadDataByDate_QNAME, ReadDataByDate.class, null, value);
	}

}
