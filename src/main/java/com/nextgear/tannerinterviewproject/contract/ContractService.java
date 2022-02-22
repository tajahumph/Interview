package com.nextgear.tannerinterviewproject.contract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ContractService 
{
    private List<Contract> contracts = new ArrayList<>(
        Arrays.asList(
            new Contract("Bob A. Fett", 1, 40000),
            new Contract("Tony Stark", 2, 10000000),
            new Contract("Sam Wilson", 3, 39999),
            new Contract("Miles Morales", 4, 50000)
        )
    ); //add contracts from DB later

    public List<Contract> getContracts()
    {
        return List.of(new Contract("Bob A. Fett", 501, 49999));
    }

    public Contract getContract()
    {
        return new Contract("Bob A. Fett", 501, 23000);
    }

    public Contract getContract(Long id)
    {
        return contracts.stream().filter(contract -> contract.getContractId().equals(id)).findFirst().get();
    }
}
