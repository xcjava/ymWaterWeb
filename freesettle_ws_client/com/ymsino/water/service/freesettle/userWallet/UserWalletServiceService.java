package com.ymsino.water.service.freesettle.userWallet;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390- Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * UserWalletServiceService service = new UserWalletServiceService();
 * UserWalletService portType = service.getUserWalletServicePort();
 * portType.getByUid(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "UserWalletServiceService", targetNamespace = "http://api.service.freesettle.esb.ymsino.com/", wsdlLocation = "http://127.0.0.1:8882/ws/userWalletService?wsdl")
public class UserWalletServiceService extends Service {

	private final static URL USERWALLETSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ymsino.water.service.freesettle.userWallet.UserWalletServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ymsino.water.service.freesettle.userWallet.UserWalletServiceService.class.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:8882/ws/userWalletService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8882/ws/userWalletService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		USERWALLETSERVICESERVICE_WSDL_LOCATION = url;
	}

	public UserWalletServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public UserWalletServiceService() {
		super(USERWALLETSERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.freesettle.esb.ymsino.com/", "UserWalletServiceService"));
	}

	/**
	 * 
	 * @return returns UserWalletService
	 */
	@WebEndpoint(name = "UserWalletServicePort")
	public UserWalletService getUserWalletServicePort() {
		return super.getPort(new QName("http://api.service.freesettle.esb.ymsino.com/", "UserWalletServicePort"), UserWalletService.class);
	}

}