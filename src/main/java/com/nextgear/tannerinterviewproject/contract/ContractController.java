package com.nextgear.tannerinterviewproject.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/contract")
public class ContractController {
    
    @Autowired
    private final ContractService contractService;

    public ContractController(ContractService contractService)
    {
        this.contractService = contractService;
    }

    @GetMapping("contracts") //Return all approved contracts, *Not done
    public List<Contract> getContracts()
    {
        return contractService.getContracts();
    }

    @GetMapping("contract/{id}") //Return a single contract, *Not Done
    public Contract getContract(@PathVariable Long contractId)
    {
        return contractService.getContract(contractId);
    }

    @PostMapping //Create new contracts, *Not Done
    public void createContract(Contract contract)
    {

    }

    @PutMapping //update existing contracts, *Not Done
    public void updateContract(Contract contract)
    {}

}
