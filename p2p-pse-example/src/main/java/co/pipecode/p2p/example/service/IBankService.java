package co.pipecode.p2p.example.service;

import java.util.List;

import co.pipecode.p2p.client.entities.Bank;

public interface IBankService {

	List<Bank> getBanks() throws Exception;
}
