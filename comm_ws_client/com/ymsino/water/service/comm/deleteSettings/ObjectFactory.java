package com.ymsino.water.service.comm.deleteSettings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.ymsino.water.service.comm.deleteSettings package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _DeleteSettingsResponse_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "deleteSettingsResponse");
	private final static QName _DeleteSettings_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "deleteSettings");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ymsino.water.service.comm.deleteSettings
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link DeleteSettingsResponse }
	 * 
	 */
	public DeleteSettingsResponse createDeleteSettingsResponse() {
		return new DeleteSettingsResponse();
	}

	/**
	 * Create an instance of {@link DeleteSettings }
	 * 
	 */
	public DeleteSettings createDeleteSettings() {
		return new DeleteSettings();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSettingsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "deleteSettingsResponse")
	public JAXBElement<DeleteSettingsResponse> createDeleteSettingsResponse(DeleteSettingsResponse value) {
		return new JAXBElement<DeleteSettingsResponse>(_DeleteSettingsResponse_QNAME, DeleteSettingsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSettings }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "deleteSettings")
	public JAXBElement<DeleteSettings> createDeleteSettings(DeleteSettings value) {
		return new JAXBElement<DeleteSettings>(_DeleteSettings_QNAME, DeleteSettings.class, null, value);
	}

}
