package com.ymsino.water.service.archives.vat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * VatServiceService service = new VatServiceService();
 * VatService portType = service.getVatServicePort();
 * portType.save(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "VatServiceService", targetNamespace = "http://api.service.archives.esb.ymsino.com/", wsdlLocation = "http://127.0.0.1:8882/ws/vatService?wsdl")
public class VatServiceService extends Service {

	private final static URL VATSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.ymsino.water.service.archives.vat.VatServiceService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ymsino.water.service.archives.vat.VatServiceService.class
					.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:8882/ws/vatService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8882/ws/vatService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		VATSERVICESERVICE_WSDL_LOCATION = url;
	}

	public VatServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public VatServiceService() {
		super(VATSERVICESERVICE_WSDL_LOCATION, new QName(
				"http://api.service.archives.esb.ymsino.com/",
				"VatServiceService"));
	}

	/**
	 * 
	 * @return returns VatService
	 */
	@WebEndpoint(name = "VatServicePort")
	public VatService getVatServicePort() {
		return super.getPort(
				new QName("http://api.service.archives.esb.ymsino.com/",
						"VatServicePort"), VatService.class);
	}

}
