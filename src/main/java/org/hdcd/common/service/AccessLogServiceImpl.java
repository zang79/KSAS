package org.hdcd.common.service;

import lombok.RequiredArgsConstructor;
import org.hdcd.common.domain.AccessLog;
import org.hdcd.common.repository.AccessLogRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AccessLogServiceImpl implements AccessLogService {

	private final AccessLogRepository repository;

	@Override
	public void register(AccessLog accessLog) throws Exception {
		repository.save(accessLog);
	}

	@Override
	public List<AccessLog> list() throws Exception {
		return repository.findAll(Sort.by(Direction.DESC, "logNo"));
	}

}
