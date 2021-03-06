/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csiro.flower.dao;

import com.csiro.flower.model.CtrlMonitoringResultSet;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author kho01f
 */
public interface CtrlStatsDao {

    public void saveCtrlStatus(int ctrlFkId, String ctrlName, String ctrlStatus, Timestamp date);
    
    public void updateCtrlStatus(int ctrlFkId, String ctrlName, String ctrlStatus, Timestamp date);

    public String getCtrlStatus(int ctrlFkId, String ctrlName);

    public void saveCtrlMonitoringStats(int ctrlFkId, String ctrlName,
            double error, long date, double k0, double measurementTargetValue,
            double uk0, double uk1, int roundedUk1);

    public List<CtrlMonitoringResultSet> getCtrlMonitoringStats(
            int ctrlFkId, String ctrlName, long startDate);
}
