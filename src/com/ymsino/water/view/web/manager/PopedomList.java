package com.ymsino.water.view.web.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Element;

import net.sf.json.JSONObject;

import com.gmail.xcjava.base.io.PropertyReader;
import com.gmail.xcjava.base.str.Dom4jUtil;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.department.DepartmentReturn;
import com.ymsino.water.service.manager.department.DepartmentService;

public class PopedomList extends ActionSupport {

	private static final long serialVersionUID = 9064957894840068088L;

	private DepartmentService departmentService;
	private String deptId;
	private JSONObject popedoms = null;
	private String message;
	private List<Map<String,Object>> popedom_data = null;
	private String popedomFilePath;//权限数据xml路径
	@Override
	public String execute() throws Exception {
		popedom_data = this.getPopedomData();
		if(StringUtil.isEmpty(deptId)){
			message = "部门不存在！";
			return ERROR;
		}
		DepartmentReturn department = departmentService.getByDeptId(deptId);
		
		if(department == null){
			message = "部门不存在！";
			return ERROR;
		}
		
		if(!StringUtil.isEmpty(department.getPopedomJson())){
			popedoms = JSONObject.fromObject(department.getPopedomJson());
		}
		
		return SUCCESS;
	}
	
	//读取权限数据
	public List<Map<String, Object>> getPopedomData() {
		if(popedom_data == null)
			this.readPopedomXML();
		return popedom_data;
	}
	//刷新权限数据
	public void refreshPopedomData() {
		this.readPopedomXML();
	}
	
	@SuppressWarnings("rawtypes")
	public void readPopedomXML(){
		try {
			String rootPath = PropertyReader.getProperties("config.properties").getProperty("webRoot");
			String xmlPath = PropertyReader.getProperties("config.properties").getProperty(popedomFilePath);
			popedom_data = new ArrayList<Map<String,Object>>();
			Dom4jUtil dom4j = new Dom4jUtil();
			dom4j.read(rootPath+xmlPath);
			
			String nodePath = "//root/module";
			List list = dom4j.getNodes(nodePath);
			for(int i=0; i<list.size(); i++){
				Map<String, Object> map = new HashMap<String, Object>();
				
				Element element = (Element) list.get(i);
				nodePath = "//root/module[@id='" + element.attributeValue("id") + "']/name";
				Element n = dom4j.getElement(nodePath);
				map.put("name", n.getText());
				
				nodePath = "//root/module[@id='" + element.attributeValue("id") + "']/columns/column";
				List cList = dom4j.getNodes(nodePath);
				List<Map<String,Object>> cs = new ArrayList<Map<String,Object>>();
				for(int j=0; j<cList.size(); j++){
					Map<String, Object> c = new HashMap<String, Object>();
					
					Element e = (Element) cList.get(j);
					nodePath = "//root/module[@id='" + element.attributeValue("id") + "']/columns/column[@id='" + e.attributeValue("id") + "']/columnName";
					Element columnName = dom4j.getElement(nodePath);
					c.put("columnName", columnName.getText());
					nodePath = "//root/module[@id='" + element.attributeValue("id") + "']/columns/column[@id='" + e.attributeValue("id") + "']/columnCode";
					Element columnCode = dom4j.getElement(nodePath);
					c.put("columnCode", columnCode.getText());
					
					nodePath = "//root/module[@id='" + element.attributeValue("id") + "']/columns/column[@id='" + e.attributeValue("id") + "']/popedoms/popedom";
					List pList = dom4j.getNodes(nodePath);
					List<Map<String,String>> ps = new ArrayList<Map<String,String>>();
					for(int k=0; k<pList.size(); k++){
						Map<String, String> p = new HashMap<String, String>();
						Element pe = (Element) pList.get(k);
						p.put("instruction", pe.elementText("instruction"));
						p.put("operaCode", pe.elementText("operaCode"));
						ps.add(p);
					}
					c.put("popedoms", ps);
					cs.add(c);
				}
				map.put("columns", cs);
				popedom_data.add(map);
			}
			dom4j.close();
		} catch (Exception e) {
			popedom_data = null;
		}
	}

	public JSONObject getPopedoms() {
		return popedoms;
	}

	public void setPopedoms(JSONObject popedoms) {
		this.popedoms = popedoms;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Map<String, Object>> getPopedom_data() {
		return popedom_data;
	}

	public void setPopedom_data(List<Map<String, Object>> popedomData) {
		popedom_data = popedomData;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public void setPopedomFilePath(String popedomFilePath) {
		this.popedomFilePath = popedomFilePath;
	}

}
