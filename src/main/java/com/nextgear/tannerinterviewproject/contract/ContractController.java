package com.nextgear.tannerinterviewproject.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/interview")
public class ContractController {
    
    @Autowired
    private ContractService contractService;

    @GetMapping("/contracts") //Return all approved contracts
    public List<Contract> getApprovedContracts()
    {
            return contractService.getApprovedContracts();
    }

    @GetMapping("/contract/{id}") //Return a single contract
    public Contract getContract(@PathVariable Long contractId)
    {
        return contractService.getContract(contractId);
    }

    @PostMapping("/createContract") //Create new contracts
    public void createContract(@RequestBody Contract contract)
    {
        System.out.println(contract.getName());
        contractService.createContract(contract);
    }

    @PutMapping("/updateContract/{id}") //update existing contracts, *Not Done
    public void updateContract(@RequestBody Contract contract, Long contractId)
    {
        contractService.updateContract(contract, contractId);
    }

    @DeleteMapping("/deleteContract/{id}")
    public void deleteContract(@PathVariable Long contractId)
    {
        contractService.deleteContract(contractId);
        //return new ResponseEntity<String>("Contract " + contractId + " successfully deleted", null);
    }

}
