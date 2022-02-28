package org.hdcd.repository;

import org.hdcd.domain.PdsFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PdsFileRepository extends JpaRepository<PdsFile, Long> {
	
	public List<PdsFile> findByFullName(String fullName);
	
}
