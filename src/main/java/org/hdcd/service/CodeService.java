package org.hdcd.service;

import org.hdcd.dto.CodeLabelValue;

import java.util.List;

public interface CodeService {

	public List<CodeLabelValue> getGroupCodeList() throws Exception;
	
	public List<CodeLabelValue> getCodeList(String groupCode) throws Exception;
	
}
