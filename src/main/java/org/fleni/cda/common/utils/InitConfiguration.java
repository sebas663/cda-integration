package org.fleni.cda.common.utils;

import java.util.HashMap;

import org.fleni.cda.externalreport.model.entity.ExternalReportType;
import org.fleni.cda.externalreport.model.service.IExternalReportTypeService;
import org.fleni.cda.oid.model.entity.ConvertMasterType;
import org.fleni.cda.oid.model.service.ICodeSystemService;
import org.fleni.cda.oid.model.service.IConvertMasterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class InitConfiguration implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	private IConvertMasterTypeService convertMasterTypeService;
	@Autowired
	private ICodeSystemService codeSystemService;
	@Autowired
	private IExternalReportTypeService externalReportTypeService;
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		try {
			ParametricData.LST_CONVERT_MASTER_TYPE = convertMasterTypeService.getAllConvertMasterType();
			System.out.println("Load an startup lst ConvertMasterType size " + ParametricData.LST_CONVERT_MASTER_TYPE.size());
			ParametricData.LST_EXTERNAL_REPORT_TYPE = externalReportTypeService.getAllExternalReportType();
			System.out.println("Load an startup lst ExternalReportType size " + ParametricData.LST_EXTERNAL_REPORT_TYPE.size());
			ParametricData.LST_CODE_SYSTEM = codeSystemService.getAllConvertMasterType();
			System.out.println("Load an startup lst CodeSystem size " + ParametricData.LST_CODE_SYSTEM.size());
			populateMaps();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 */
	private void populateMaps() {
		ParametricData.MAP_CONVERT_MASTER_TYPE = new HashMap<>();
		ParametricData.MAP_EXTERNAL_REPORT_TYPE = new HashMap<>();
		ParametricData.MAP_EXTERNAL_REPORT_TYPE_BY_KEY = new HashMap<>();
		for (ConvertMasterType c : ParametricData.LST_CONVERT_MASTER_TYPE) {
			ParametricData.MAP_CONVERT_MASTER_TYPE.put(
					c.getDiscriminator() + "-" + c.getNameSystemExternal() + "-" + c.getTypeMasterSystemExternal(), c);
		}
		for (ExternalReportType c : ParametricData.LST_EXTERNAL_REPORT_TYPE) {
			ParametricData.MAP_EXTERNAL_REPORT_TYPE.put(c.getExternalReportName(), c);
		}
		for (ExternalReportType c : ParametricData.LST_EXTERNAL_REPORT_TYPE) {
			ParametricData.MAP_EXTERNAL_REPORT_TYPE_BY_KEY.put(c.getId(),c);
		}
		
	}
}
