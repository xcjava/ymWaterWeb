package com.ymsino.water.service.comm.conDebug;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.ymsino.water.service.comm.conDebug package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _DebugResponse_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "debugResponse");
	private final static QName _Debug_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "debug");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ymsino.water.service.comm.conDebug
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link DebugResponse }
	 * 
	 */
	public DebugResponse createDebugResponse() {
		return new DebugResponse();
	}

	/**
	 * Create an instance of {@link Debug }
	 * 
	 */
	public Debug createDebug() {
		return new Debug();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DebugResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "debugResponse")
	public JAXBElement<DebugResponse> createDebugResponse(DebugResponse value) {
		return new JAXBElement<DebugResponse>(_DebugResponse_QNAME, DebugResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Debug }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "debug")
	public JAXBElement<Debug> createDebug(Debug value) {
		return new JAXBElement<Debug>(_Debug_QNAME, Debug.class, null, value);
	}

}
