package com.nextgear.tannerinterviewproject.contract;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ContractRepository extends CrudRepository<Contract, Long> {
    @Query(value = "Select * FROM contracts WHERE contractApproved = true", nativeQuery = true)
    List<Contract> findApprovedContracts();
}
