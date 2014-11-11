package com.ymsino.water.view.web.archives;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.date.DateUtil;
import com.gmail.xcjava.base.hql.QueryCondition;
import com.gmail.xcjava.base.hql.QueryParamWriter;
import com.gmail.xcjava.base.io.FilesTool;
import com.gmail.xcjava.base.io.PropertyReader;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.archives.concentrator.ConcentratorReturn;
import com.ymsino.water.service.archives.concentrator.ConcentratorService;
import com.ymsino.water.service.archives.concentrator.QueryParam;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;

public class DownloadConcentratorList extends ActionSupport {

	private static final long serialVersionUID = 4681544453198372257L;
	private ConcentratorService concentratorService;
	private ChargingUnitService chargingUnitService;
	private String chargingUnitId;	//收费单位id
	private String name; 			//集中器名称
	private String hardwareId;		//集中器ID(区域码areaCode+逻辑地址logicCode)
	private int recordCount;
	private List<ConcentratorReturn> list = new ArrayList<ConcentratorReturn>();
	@Override
	public String execute() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String managerUnitId = (String)session.getAttribute("sessionUnitId");
		
		String exportCount = PropertyReader.getProperties("config.properties").getProperty("exportCount");
		
		QueryParamWriter qpw = new QueryParamWriter();
		if(!StringUtil.isEmpty(managerUnitId)){
			qpw.addQueryParam("parentUnits", "%|"+managerUnitId+"|%", QueryCondition.QC_LIKE);
		}
		if(!StringUtil.isEmpty(chargingUnitId)){
			qpw.addQueryParam("chargingUnitId", chargingUnitId, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(name)){
			qpw.addQueryParam("name", name, QueryCondition.QC_EQ);
		}
		if(!StringUtil.isEmpty(hardwareId)){
			try {
				String areaCode = hardwareId.substring(0, 4);
				String logicCode = hardwareId.substring(4, 8);
				qpw.addQueryParam("areaCode", areaCode, QueryCondition.QC_EQ);
				qpw.addQueryParam("logicCode", logicCode, QueryCondition.QC_EQ);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		QueryParam qpm = new QueryParam();
		qpm.setQueryCon(qpw.getQueryCon());
		qpm.setQueryLink(qpw.getQueryLink());
		qpm.setQueryValue(qpw.getQueryValue());
		list = concentratorService.getListpager(qpm,0, Integer.MAX_VALUE);
		recordCount = concentratorService.getCount(qpm);
		
		if(recordCount > Integer.parseInt(exportCount)){
			response.getWriter().print("对不起，超出导出数量限制"+exportCount);
			return null;
		}
		LinkedHashMap<String,LinkedHashMap<String,String>> linkedHashMap = new LinkedHashMap<String,LinkedHashMap<String,String>>();
		for(int i = 0; i < list.size();i++){
			ConcentratorReturn concentrator = list.get(i);
			if(concentrator == null) continue;
			ChargingUnitReturn chargingUnit = chargingUnitService.getByUnitId(concentrator.getChargingUnitId());
			
			LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
			map.put("集中器编号", StringUtil.isEmpty(concentrator.getAreaCode()+""+concentrator.getLogicCode()) ? "" : concentrator.getAreaCode()+""+concentrator.getLogicCode());
			map.put("集中器名称", StringUtil.isEmpty(concentrator.getName()) ? "" : concentrator.getName());
			map.put("电话号码", StringUtil.isEmpty(concentrator.getTel()) ? "" : concentrator.getTel());
			map.put("省", StringUtil.isEmpty(concentrator.getProvince()) ? "" : concentrator.getProvince());
			map.put("市", StringUtil.isEmpty(concentrator.getCity()) ? "" : concentrator.getCity());
			map.put("区县", StringUtil.isEmpty(concentrator.getDistrict()) ? "" : concentrator.getDistrict());
			map.put("街道", StringUtil.isEmpty(concentrator.getStreet()) ? "" : concentrator.getStreet());
			map.put("通讯地址", StringUtil.isEmpty(concentrator.getAddress()) ? "" : concentrator.getAddress());
			map.put("收费单位", chargingUnit == null ? "" : chargingUnit.getName());
			map.put("安装地址", StringUtil.isEmpty(concentrator.getCollectionAddress()) ? "" : concentrator.getCollectionAddress());
			map.put("终端端口号", StringUtil.isEmpty(concentrator.getTerminalPost()) ? "" : concentrator.getTerminalPost());
			map.put("创建时间", concentrator.getCreateTimestamp() == null ? "" : DateUtil.format(new Date(concentrator.getCreateTimestamp()), "yyyy-MM-dd HH:mm:ss"));
			linkedHashMap.put(String.valueOf(i), map);
		}
		try {
			response.addHeader("Content-Disposition", "attachment;filename=\"" + "report.xls" + "\"");
			FilesTool.writeToExcel(linkedHashMap, null, response);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	public String getChargingUnitId() {
		return chargingUnitId;
	}
	public void setChargingUnitId(String chargingUnitId) {
		this.chargingUnitId = chargingUnitId;
	}
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}
	public String getHardwareId() {
		return hardwareId;
	}
	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ConcentratorReturn> getList() {
		return list;
	}
	public void setList(List<ConcentratorReturn> list) {
		this.list = list;
	}
	public void setConcentratorService(ConcentratorService concentratorService) {
		this.concentratorService = concentratorService;
	}

}
