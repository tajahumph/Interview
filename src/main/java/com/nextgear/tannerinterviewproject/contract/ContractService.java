package com.nextgear.tannerinterviewproject.contract;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ContractService 
{
    public List<Contract> getContract()
    {
        return List.of(new Contract("Bob A. Fett", 501, 49999));
    }
}
