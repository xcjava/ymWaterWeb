package com.ymsino.water.service.archives.concentrator;

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
@WebService(name = "ConcentratorService", targetNamespace = "http://api.service.archives.esb.ymsino.com/")
public interface ConcentratorService {

	/**
	 * 保存集中器
	 * 
	 * @param concentratorSaveParam
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "save", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.concentrator.Save")
	@ResponseWrapper(localName = "saveResponse", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.concentrator.SaveResponse")
	public Boolean save(
			@WebParam(name = "concentratorSaveParam", targetNamespace = "") ConcentratorSaveParam concentratorSaveParam);

	/**
	 * 根据集中器编号获取集中器
	 * 
	 * @param hardwareId
	 * @return returns
	 *         com.ymsino.water.service.archives.concentrator.ConcentratorReturn
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getById", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.concentrator.GetById")
	@ResponseWrapper(localName = "getByIdResponse", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.concentrator.GetByIdResponse")
	public ConcentratorReturn getById(
			@WebParam(name = "hardwareId", targetNamespace = "") String hardwareId);

	/**
	 * 根据查询参数获取集中器总记录数
	 * 
	 * @param queryParam
	 * @return returns java.lang.Integer
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getCount", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.concentrator.GetCount")
	@ResponseWrapper(localName = "getCountResponse", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.concentrator.GetCountResponse")
	public Integer getCount(
			@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam);

	/**
	 * 修改集中器
	 * 
	 * @param concentratorModifyParam
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "modify", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.concentrator.Modify")
	@ResponseWrapper(localName = "modifyResponse", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.concentrator.ModifyResponse")
	public Boolean modify(
			@WebParam(name = "concentratorModifyParam", targetNamespace = "") ConcentratorModifyParam concentratorModifyParam);

	/**
	 * 根据查询参数获取集中器分页列表
	 * 
	 * @param queryParam
	 * @param startRow
	 * @param pageSize
	 * @return returns
	 *         java.util.List<com.ymsino.water.service.archives.concentrator
	 *         .ConcentratorReturn>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getListpager", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.concentrator.GetListpager")
	@ResponseWrapper(localName = "getListpagerResponse", targetNamespace = "http://api.service.archives.esb.ymsino.com/", className = "com.ymsino.water.service.archives.concentrator.GetListpagerResponse")
	public List<ConcentratorReturn> getListpager(
			@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam,
			@WebParam(name = "startRow", targetNamespace = "") Integer startRow,
			@WebParam(name = "pageSize", targetNamespace = "") Integer pageSize);

}
