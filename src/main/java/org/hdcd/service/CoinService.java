package org.hdcd.service;

import org.hdcd.domain.ChargeCoin;
import org.hdcd.domain.PayCoin;

import java.util.List;

public interface CoinService {

	public void charge(ChargeCoin chargeCoin) throws Exception;

	public List<ChargeCoin> list(Long userNo) throws Exception;
	
	public List<PayCoin> listPayHistory(Long userNo) throws Exception;
	
}
