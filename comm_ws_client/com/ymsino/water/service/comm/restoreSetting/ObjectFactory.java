package com.ymsino.water.service.comm.restoreSetting;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.ymsino.water.service.comm.restoreSetting package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _RestoreSettingsResponse_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "restoreSettingsResponse");
	private final static QName _RestoreSettings_QNAME = new QName("http://api.service.comm.esb.ymsino.com/", "restoreSettings");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ymsino.water.service.comm.restoreSetting
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link RestoreSettingsResponse }
	 * 
	 */
	public RestoreSettingsResponse createRestoreSettingsResponse() {
		return new RestoreSettingsResponse();
	}

	/**
	 * Create an instance of {@link RestoreSettings }
	 * 
	 */
	public RestoreSettings createRestoreSettings() {
		return new RestoreSettings();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link RestoreSettingsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "restoreSettingsResponse")
	public JAXBElement<RestoreSettingsResponse> createRestoreSettingsResponse(RestoreSettingsResponse value) {
		return new JAXBElement<RestoreSettingsResponse>(_RestoreSettingsResponse_QNAME, RestoreSettingsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link RestoreSettings }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.comm.esb.ymsino.com/", name = "restoreSettings")
	public JAXBElement<RestoreSettings> createRestoreSettings(RestoreSettings value) {
		return new JAXBElement<RestoreSettings>(_RestoreSettings_QNAME, RestoreSettings.class, null, value);
	}

}
