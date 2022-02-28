package org.hdcd.common.service;

import org.hdcd.common.domain.PerformanceLog;

import java.util.List;

public interface PerformanceLogService {

	public void register(PerformanceLog performanceLog) throws Exception;
	
	public List<PerformanceLog> list() throws Exception;

}
