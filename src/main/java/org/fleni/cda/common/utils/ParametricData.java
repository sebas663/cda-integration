package org.fleni.cda.common.utils;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.fleni.cda.externalreport.model.entity.ExternalReportType;
import org.fleni.cda.oid.model.entity.CodeSystem;
import org.fleni.cda.oid.model.entity.ConvertMasterType;

public class ParametricData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6310804611716809081L;
	/**
	 * 
	 */
	public static List<ConvertMasterType> LST_CONVERT_MASTER_TYPE;
	/**
	 * 
	 */
	public static Map<String,ConvertMasterType> MAP_CONVERT_MASTER_TYPE;
	/**
	 * 
	 */
	public static List<ExternalReportType> LST_EXTERNAL_REPORT_TYPE;
	/**
	 * 
	 */
	public static Map<String,ExternalReportType> MAP_EXTERNAL_REPORT_TYPE;
	/**
	 * 
	 */
	public static Map<Long,ExternalReportType> MAP_EXTERNAL_REPORT_TYPE_BY_KEY;
	/**
	 * 
	 */
	public static List<CodeSystem> LST_CODE_SYSTEM;
}
