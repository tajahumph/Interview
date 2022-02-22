package com.nextgear.tannerinterviewproject.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/contract")
public class ContractController {
    
    private final ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService)
    {
        this.contractService = contractService;
    }

    @GetMapping
    public List<Contract> getContracts()
    {
        return contractService.getContract();
    }

}
