package com.nextgear.tannerinterviewproject.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public Contract getContract(@PathVariable Long id)
    {
        return contractService.getContract(id);
    }

    @PostMapping("/createContract")
    public ResponseEntity<String> createContract(@RequestBody Contract contract)
    {
        contractService.createContract(contract);

        return new ResponseEntity<String>("Create request successful.", HttpStatus.OK);
    }

    @PutMapping("/updateContract") //update existing contracts, *Not Done
    public ResponseEntity<String> updateContract(@RequestBody Contract contract)
    {
        if(contract.getContractId() == null || contract.getName() == "Place Holder" || contract.getBusinessNumber() == 0 || contract.getAmountRequested() == 0)
        {
            return new ResponseEntity<String>("Update request failed.", HttpStatus.BAD_REQUEST);
        }
        contractService.updateContract(contract);
        return new ResponseEntity<String>("Update request successful.", HttpStatus.OK);
    }

    @DeleteMapping("/deleteContract/{id}")
    public ResponseEntity<String> deleteContract(@PathVariable Long id)
    {
        try{
            contractService.deleteContract(id);
            return new ResponseEntity<String>(String.format("Contract %s successfully deleted", id), HttpStatus.OK);
    
        }
        catch(Exception e)
        {
            return new ResponseEntity<String>("The delete request was unsuccessful.", HttpStatus.BAD_REQUEST);
        }
    }
}
