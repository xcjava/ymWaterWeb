package com.ymsino.water.service.archives.waterCustomer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.ymsino.water.service.archives.waterCustomer package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _GetCountResponse_QNAME = new QName(
			"http://api.service.archives.esb.ymsino.com/", "getCountResponse");
	private final static QName _SaveResponse_QNAME = new QName(
			"http://api.service.archives.esb.ymsino.com/", "saveResponse");
	private final static QName _Save_QNAME = new QName(
			"http://api.service.archives.esb.ymsino.com/", "save");
	private final static QName _Modidy_QNAME = new QName(
			"http://api.service.archives.esb.ymsino.com/", "modidy");
	private final static QName _ModidyResponse_QNAME = new QName(
			"http://api.service.archives.esb.ymsino.com/", "modidyResponse");
	private final static QName _GetCount_QNAME = new QName(
			"http://api.service.archives.esb.ymsino.com/", "getCount");
	private final static QName _GetListpagerResponse_QNAME = new QName(
			"http://api.service.archives.esb.ymsino.com/",
			"getListpagerResponse");
	private final static QName _GetListpager_QNAME = new QName(
			"http://api.service.archives.esb.ymsino.com/", "getListpager");
	private final static QName _GetByIdResponse_QNAME = new QName(
			"http://api.service.archives.esb.ymsino.com/", "getByIdResponse");
	private final static QName _GetById_QNAME = new QName(
			"http://api.service.archives.esb.ymsino.com/", "getById");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.ymsino.water.service.archives.waterCustomer
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Save }
	 * 
	 */
	public Save createSave() {
		return new Save();
	}

	/**
	 * Create an instance of {@link QueryParam }
	 * 
	 */
	public QueryParam createQueryParam() {
		return new QueryParam();
	}

	/**
	 * Create an instance of {@link GetCountResponse }
	 * 
	 */
	public GetCountResponse createGetCountResponse() {
		return new GetCountResponse();
	}

	/**
	 * Create an instance of {@link SaveResponse }
	 * 
	 */
	public SaveResponse createSaveResponse() {
		return new SaveResponse();
	}

	/**
	 * Create an instance of {@link GetById }
	 * 
	 */
	public GetById createGetById() {
		return new GetById();
	}

	/**
	 * Create an instance of {@link GetCount }
	 * 
	 */
	public GetCount createGetCount() {
		return new GetCount();
	}

	/**
	 * Create an instance of {@link WaterCustomerReturn }
	 * 
	 */
	public WaterCustomerReturn createWaterCustomerReturn() {
		return new WaterCustomerReturn();
	}

	/**
	 * Create an instance of {@link WaterCustomerSaveParam }
	 * 
	 */
	public WaterCustomerSaveParam createWaterCustomerSaveParam() {
		return new WaterCustomerSaveParam();
	}

	/**
	 * Create an instance of {@link WaterCustomerModifyParam }
	 * 
	 */
	public WaterCustomerModifyParam createWaterCustomerModifyParam() {
		return new WaterCustomerModifyParam();
	}

	/**
	 * Create an instance of {@link Modidy }
	 * 
	 */
	public Modidy createModidy() {
		return new Modidy();
	}

	/**
	 * Create an instance of {@link ModidyResponse }
	 * 
	 */
	public ModidyResponse createModidyResponse() {
		return new ModidyResponse();
	}

	/**
	 * Create an instance of {@link GetByIdResponse }
	 * 
	 */
	public GetByIdResponse createGetByIdResponse() {
		return new GetByIdResponse();
	}

	/**
	 * Create an instance of {@link GetListpager }
	 * 
	 */
	public GetListpager createGetListpager() {
		return new GetListpager();
	}

	/**
	 * Create an instance of {@link GetListpagerResponse }
	 * 
	 */
	public GetListpagerResponse createGetListpagerResponse() {
		return new GetListpagerResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetCountResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.archives.esb.ymsino.com/", name = "getCountResponse")
	public JAXBElement<GetCountResponse> createGetCountResponse(
			GetCountResponse value) {
		return new JAXBElement<GetCountResponse>(_GetCountResponse_QNAME,
				GetCountResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.archives.esb.ymsino.com/", name = "saveResponse")
	public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
		return new JAXBElement<SaveResponse>(_SaveResponse_QNAME,
				SaveResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.archives.esb.ymsino.com/", name = "save")
	public JAXBElement<Save> createSave(Save value) {
		return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Modidy }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.archives.esb.ymsino.com/", name = "modidy")
	public JAXBElement<Modidy> createModidy(Modidy value) {
		return new JAXBElement<Modidy>(_Modidy_QNAME, Modidy.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ModidyResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.archives.esb.ymsino.com/", name = "modidyResponse")
	public JAXBElement<ModidyResponse> createModidyResponse(ModidyResponse value) {
		return new JAXBElement<ModidyResponse>(_ModidyResponse_QNAME,
				ModidyResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetCount }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.archives.esb.ymsino.com/", name = "getCount")
	public JAXBElement<GetCount> createGetCount(GetCount value) {
		return new JAXBElement<GetCount>(_GetCount_QNAME, GetCount.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetListpagerResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.archives.esb.ymsino.com/", name = "getListpagerResponse")
	public JAXBElement<GetListpagerResponse> createGetListpagerResponse(
			GetListpagerResponse value) {
		return new JAXBElement<GetListpagerResponse>(
				_GetListpagerResponse_QNAME, GetListpagerResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetListpager }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.archives.esb.ymsino.com/", name = "getListpager")
	public JAXBElement<GetListpager> createGetListpager(GetListpager value) {
		return new JAXBElement<GetListpager>(_GetListpager_QNAME,
				GetListpager.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.archives.esb.ymsino.com/", name = "getByIdResponse")
	public JAXBElement<GetByIdResponse> createGetByIdResponse(
			GetByIdResponse value) {
		return new JAXBElement<GetByIdResponse>(_GetByIdResponse_QNAME,
				GetByIdResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.archives.esb.ymsino.com/", name = "getById")
	public JAXBElement<GetById> createGetById(GetById value) {
		return new JAXBElement<GetById>(_GetById_QNAME, GetById.class, null,
				value);
	}

}
