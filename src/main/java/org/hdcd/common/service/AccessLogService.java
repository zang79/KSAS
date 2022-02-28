package org.hdcd.common.service;

import org.hdcd.common.domain.AccessLog;

import java.util.List;

public interface AccessLogService {

	public void register(AccessLog accessLog) throws Exception;
	
	public List<AccessLog> list() throws Exception;

}
