package org.fleni.cda.externalreport.remoting.server;

import java.util.Comparator;
import java.util.Date;

import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;

public class ExternalReportInfoComparatorAsc implements Comparator<ExternalReportInfo> {
	/**
     * Método sobrecargado que se encarga de comparar por fechas.
     * @param e1 Date fchComparar1
     * @param e2 Date fchComparar2
     * @return +1, 0, -1 si la fecha 2 es anterior, igual o posterior que la fecha 1
     */
	@Override
    public int compare(ExternalReportInfo obj1, ExternalReportInfo obj2) {
    	Date fchComparar1 = obj1.getReportDate();
    	Date fchComparar2 = obj2.getReportDate();
    	if (fchComparar1.before(fchComparar2)) {
            return -1;
        } else if (fchComparar1.after(fchComparar2)) {
            return +1;
        } else {
            return 0;
        }
    }

}
