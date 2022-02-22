package com.nextgear.tannerinterviewproject.contract;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "contract")
public class Contract implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long contractId;
    private String name;
    private int businessNumber;
    private int amountRequested;
    @Column(updatable = false)
    private final boolean approved;
    @Column(updatable = false)
    private final String contractActivationDate;

    public Contract() 
    {
        //this.contractId = UUID.randomUUID();
        this.name = "Place Holder";
        this.businessNumber = 0;
        this.amountRequested = 0;
        this.approved = false;
        this.contractActivationDate = "";
    }

    public Contract(String name, int businessNumber, int amountRequested)
    {
        //this.contractId = UUID.randomUUID();
        this.name = name;
        this.businessNumber = businessNumber;
        this.amountRequested = amountRequested;
        if(amountRequested < 50000)
        {
            Date currentDate = new Date();
            this.contractActivationDate = currentDate.toString();
            this.approved = true;
        }
        else
        {
            this.contractActivationDate = "";
            this.approved = false;
        }

    }

    public Long getContractId()
    {
        return contractId;
    }

    public String getName()
    {
        return name;
    }

    public int getBusinessNumber()
    {
        return businessNumber;
    }
    public int getAmountRequested() {
        return amountRequested;
    }

    public boolean isApproved() {
        return approved;
    }

    public String getContractActivationDate() {
        return contractActivationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBusinessNumber(int businessNumber) {
        this.businessNumber = businessNumber;
    }

    public void setAmountRequested(int amountRequested) {
        this.amountRequested = amountRequested;
}
}
