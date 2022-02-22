package com.nextgear.tannerinterviewproject.contract;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService 
{
    @Autowired
    private ContractRepository contractRepository;

    public List<Contract> getApprovedContracts()
    {
        List<Contract> contracts = new ArrayList<>();
        List<Contract> approvedContract = new ArrayList<>();
        contractRepository.findAll().forEach(contracts::add);
        for(Contract contract : contracts)
        {
            if(contract.isContractApproved())
            {
                approvedContract.add(contract);
            }
        }
        return contracts;
        //return  contractRepository.findApprovedContracts();
    }

    public Contract getContract(Long id)
    {
        Optional<Contract> contract = contractRepository.findById(id);
        return contract.get();
    }

    public void createContract(Contract contract)
    {
        Contract contract1 = contractRepository.save(contract);
        System.out.println(contract1.getName());
    }

    public void updateContract(Contract contract, Long id)
    {
        contractRepository.save(contract);
    }

    public void deleteContract(Long id)
    {
        contractRepository.deleteById(id);
    }
}
