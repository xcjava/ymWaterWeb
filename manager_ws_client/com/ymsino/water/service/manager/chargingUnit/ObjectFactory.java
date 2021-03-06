package com.ymsino.water.service.manager.chargingUnit;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.ymsino.water.service.manager.chargingUnit package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _CloseStatus_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "closeStatus");
	private final static QName _CloseStatusResponse_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "closeStatusResponse");
	private final static QName _OpenStatusResponse_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "openStatusResponse");
	private final static QName _Save_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "save");
	private final static QName _GetCountResponse_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "getCountResponse");
	private final static QName _Modify_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "modify");
	private final static QName _GetListpagerResponse_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "getListpagerResponse");
	private final static QName _DeleteResponse_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "deleteResponse");
	private final static QName _SaveResponse_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "saveResponse");
	private final static QName _GetByUnitIdResponse_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "getByUnitIdResponse");
	private final static QName _Delete_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "delete");
	private final static QName _ModifyResponse_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "modifyResponse");
	private final static QName _OpenStatus_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "openStatus");
	private final static QName _GetListpager_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "getListpager");
	private final static QName _GetByUnitId_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "getByUnitId");
	private final static QName _GetCount_QNAME = new QName("http://api.service.manager.esb.ymsino.com/", "getCount");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ymsino.water.service.manager.chargingUnit
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link OpenStatusResponse }
	 * 
	 */
	public OpenStatusResponse createOpenStatusResponse() {
		return new OpenStatusResponse();
	}

	/**
	 * Create an instance of {@link SaveResponse }
	 * 
	 */
	public SaveResponse createSaveResponse() {
		return new SaveResponse();
	}

	/**
	 * Create an instance of {@link ChargingUnitSaveParam }
	 * 
	 */
	public ChargingUnitSaveParam createChargingUnitSaveParam() {
		return new ChargingUnitSaveParam();
	}

	/**
	 * Create an instance of {@link GetCount }
	 * 
	 */
	public GetCount createGetCount() {
		return new GetCount();
	}

	/**
	 * Create an instance of {@link GetListpager }
	 * 
	 */
	public GetListpager createGetListpager() {
		return new GetListpager();
	}

	/**
	 * Create an instance of {@link ModifyResponse }
	 * 
	 */
	public ModifyResponse createModifyResponse() {
		return new ModifyResponse();
	}

	/**
	 * Create an instance of {@link Save }
	 * 
	 */
	public Save createSave() {
		return new Save();
	}

	/**
	 * Create an instance of {@link CloseStatus }
	 * 
	 */
	public CloseStatus createCloseStatus() {
		return new CloseStatus();
	}

	/**
	 * Create an instance of {@link GetListpagerResponse }
	 * 
	 */
	public GetListpagerResponse createGetListpagerResponse() {
		return new GetListpagerResponse();
	}

	/**
	 * Create an instance of {@link Delete }
	 * 
	 */
	public Delete createDelete() {
		return new Delete();
	}

	/**
	 * Create an instance of {@link QueryParam }
	 * 
	 */
	public QueryParam createQueryParam() {
		return new QueryParam();
	}

	/**
	 * Create an instance of {@link DeleteResponse }
	 * 
	 */
	public DeleteResponse createDeleteResponse() {
		return new DeleteResponse();
	}

	/**
	 * Create an instance of {@link Modify }
	 * 
	 */
	public Modify createModify() {
		return new Modify();
	}

	/**
	 * Create an instance of {@link ChargingUnitModifyParam }
	 * 
	 */
	public ChargingUnitModifyParam createChargingUnitModifyParam() {
		return new ChargingUnitModifyParam();
	}

	/**
	 * Create an instance of {@link CloseStatusResponse }
	 * 
	 */
	public CloseStatusResponse createCloseStatusResponse() {
		return new CloseStatusResponse();
	}

	/**
	 * Create an instance of {@link OpenStatus }
	 * 
	 */
	public OpenStatus createOpenStatus() {
		return new OpenStatus();
	}

	/**
	 * Create an instance of {@link GetByUnitIdResponse }
	 * 
	 */
	public GetByUnitIdResponse createGetByUnitIdResponse() {
		return new GetByUnitIdResponse();
	}

	/**
	 * Create an instance of {@link ChargingUnitReturn }
	 * 
	 */
	public ChargingUnitReturn createChargingUnitReturn() {
		return new ChargingUnitReturn();
	}

	/**
	 * Create an instance of {@link GetByUnitId }
	 * 
	 */
	public GetByUnitId createGetByUnitId() {
		return new GetByUnitId();
	}

	/**
	 * Create an instance of {@link GetCountResponse }
	 * 
	 */
	public GetCountResponse createGetCountResponse() {
		return new GetCountResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CloseStatus }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "closeStatus")
	public JAXBElement<CloseStatus> createCloseStatus(CloseStatus value) {
		return new JAXBElement<CloseStatus>(_CloseStatus_QNAME, CloseStatus.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CloseStatusResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "closeStatusResponse")
	public JAXBElement<CloseStatusResponse> createCloseStatusResponse(CloseStatusResponse value) {
		return new JAXBElement<CloseStatusResponse>(_CloseStatusResponse_QNAME, CloseStatusResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link OpenStatusResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "openStatusResponse")
	public JAXBElement<OpenStatusResponse> createOpenStatusResponse(OpenStatusResponse value) {
		return new JAXBElement<OpenStatusResponse>(_OpenStatusResponse_QNAME, OpenStatusResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "save")
	public JAXBElement<Save> createSave(Save value) {
		return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetCountResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "getCountResponse")
	public JAXBElement<GetCountResponse> createGetCountResponse(GetCountResponse value) {
		return new JAXBElement<GetCountResponse>(_GetCountResponse_QNAME, GetCountResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Modify }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "modify")
	public JAXBElement<Modify> createModify(Modify value) {
		return new JAXBElement<Modify>(_Modify_QNAME, Modify.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetListpagerResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "getListpagerResponse")
	public JAXBElement<GetListpagerResponse> createGetListpagerResponse(GetListpagerResponse value) {
		return new JAXBElement<GetListpagerResponse>(_GetListpagerResponse_QNAME, GetListpagerResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "deleteResponse")
	public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
		return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "saveResponse")
	public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
		return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetByUnitIdResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "getByUnitIdResponse")
	public JAXBElement<GetByUnitIdResponse> createGetByUnitIdResponse(GetByUnitIdResponse value) {
		return new JAXBElement<GetByUnitIdResponse>(_GetByUnitIdResponse_QNAME, GetByUnitIdResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "delete")
	public JAXBElement<Delete> createDelete(Delete value) {
		return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ModifyResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "modifyResponse")
	public JAXBElement<ModifyResponse> createModifyResponse(ModifyResponse value) {
		return new JAXBElement<ModifyResponse>(_ModifyResponse_QNAME, ModifyResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link OpenStatus }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "openStatus")
	public JAXBElement<OpenStatus> createOpenStatus(OpenStatus value) {
		return new JAXBElement<OpenStatus>(_OpenStatus_QNAME, OpenStatus.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetListpager }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "getListpager")
	public JAXBElement<GetListpager> createGetListpager(GetListpager value) {
		return new JAXBElement<GetListpager>(_GetListpager_QNAME, GetListpager.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetByUnitId }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "getByUnitId")
	public JAXBElement<GetByUnitId> createGetByUnitId(GetByUnitId value) {
		return new JAXBElement<GetByUnitId>(_GetByUnitId_QNAME, GetByUnitId.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetCount }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://api.service.manager.esb.ymsino.com/", name = "getCount")
	public JAXBElement<GetCount> createGetCount(GetCount value) {
		return new JAXBElement<GetCount>(_GetCount_QNAME, GetCount.class, null, value);
	}

}
