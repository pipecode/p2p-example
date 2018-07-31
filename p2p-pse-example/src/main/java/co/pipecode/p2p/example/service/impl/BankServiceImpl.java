package co.pipecode.p2p.example.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.pipecode.p2p.client.PSEClient;
import co.pipecode.p2p.client.entities.Bank;
import co.pipecode.p2p.example.service.IBankService;

@Service
public class BankServiceImpl implements IBankService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BankServiceImpl.class);

	@Autowired
	private PSEClient pseClient;

	@Override
	public List<Bank> getBanks() throws Exception {
		try {
			return pseClient.getBackList();
		} catch (Exception ex) {
			LOGGER.error("Error al obtener la lista de bancos: " + ex);
			throw new Exception(ex);
		}
	}

}
