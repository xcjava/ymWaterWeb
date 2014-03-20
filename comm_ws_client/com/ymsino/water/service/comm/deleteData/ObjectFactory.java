package com.ymsino.water.service.comm.deleteData;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.ymsino.water.service.comm.deleteData package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _DeleteDataResponse_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "deleteDataResponse");
	private final static QName _DeleteData_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "deleteData");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ymsino.water.service.comm.deleteData
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link DeleteDataResponse }
	 * 
	 */
	public DeleteDataResponse createDeleteDataResponse() {
		return new DeleteDataResponse();
	}

	/**
	 * Create an instance of {@link DeleteData }
	 * 
	 */
	public DeleteData createDeleteData() {
		return new DeleteData();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDataResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "deleteDataResponse")
	public JAXBElement<DeleteDataResponse> createDeleteDataResponse(DeleteDataResponse value) {
		return new JAXBElement<DeleteDataResponse>(_DeleteDataResponse_QNAME, DeleteDataResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteData }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "deleteData")
	public JAXBElement<DeleteData> createDeleteData(DeleteData value) {
		return new JAXBElement<DeleteData>(_DeleteData_QNAME, DeleteData.class, null, value);
	}

}
