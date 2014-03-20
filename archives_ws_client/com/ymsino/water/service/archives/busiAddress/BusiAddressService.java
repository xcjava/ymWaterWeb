package com.ymsino.water.service.archives.busiAddress;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "BusiAddressService", targetNamespace = "http://api.service.archives.esb.ymsino.com/")
public interface BusiAddressService {

	/**
	 * 保存业务地址
	 * 
	 * @param busiAddressSaveParam
	 * @return returns java.lang.Long
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "save", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.busiAddress.Save")
	@ResponseWrapper(localName = "saveResponse", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.busiAddress.SaveResponse")
	public Long save(
			@WebParam(name = "busiAddressSaveParam", targetNamespace = "") BusiAddressSaveParam busiAddressSaveParam);

	/**
	 * 根据查询参数获取业务地址分页列表
	 * 
	 * @param queryParam
	 * @param startRow
	 * @param pageSize
	 * @return returns
	 *         java.util.List<com.ymsino.water.service.archives.busiAddress
	 *         .BusiAddressReturn>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getListpager", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.busiAddress.GetListpager")
	@ResponseWrapper(localName = "getListpagerResponse", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.busiAddress.GetListpagerResponse")
	public List<BusiAddressReturn> getListpager(
			@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam,
			@WebParam(name = "startRow", targetNamespace = "") Integer startRow,
			@WebParam(name = "pageSize", targetNamespace = "") Integer pageSize);

	/**
	 * 根据id获取业务地址
	 * 
	 * @param id
	 * @return returns
	 *         com.ymsino.water.service.archives.busiAddress.BusiAddressReturn
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getById", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.busiAddress.GetById")
	@ResponseWrapper(localName = "getByIdResponse", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.busiAddress.GetByIdResponse")
	public BusiAddressReturn getById(
			@WebParam(name = "id", targetNamespace = "") Long id);

	/**
	 * 根据查询参数获取业务地址总记录数
	 * 
	 * @param queryParam
	 * @return returns java.lang.Integer
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getCount", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.busiAddress.GetCount")
	@ResponseWrapper(localName = "getCountResponse", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.busiAddress.GetCountResponse")
	public Integer getCount(
			@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam);

	/**
	 * 修改业务地址
	 * 
	 * @param busiAddressModifyParam
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "modify", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.busiAddress.Modify")
	@ResponseWrapper(localName = "modifyResponse", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.busiAddress.ModifyResponse")
	public Boolean modify(
			@WebParam(name = "busiAddressModifyParam", targetNamespace = "") BusiAddressModifyParam busiAddressModifyParam);

	/**
	 * 删除业务地址
	 * 
	 * @param id
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "delete", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.busiAddress.Delete")
	@ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.busiAddress.DeleteResponse")
	public Boolean delete(@WebParam(name = "id", targetNamespace = "") Long id);

}
