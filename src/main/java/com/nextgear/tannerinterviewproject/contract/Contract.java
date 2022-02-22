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
@Table(name = "contracts")
public class Contract implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contractId", nullable = false, updatable = false)
    private Long contractId;
    @Column(name = "name") 
    private String name;
    @Column(name = "businessNumber") 
    private int businessNumber;
    @Column(name = "amountRequested")
    private float amountRequested;
    @Column(name = "contractApproved", updatable = false)
    private boolean contractApproved;
    @Column(name = "contractActivationDate", updatable = false)
    private String contractActivationDate;

    public Contract() 
    {
        this.name = "Place Holder";
        this.businessNumber = 0;
        this.amountRequested = 0;
        this.contractApproved = false;
        this.contractActivationDate = "";
    }

    public Contract(String name, int businessNumber, int amountRequested)
    {
        this.name = name;
        this.businessNumber = businessNumber;
        this.amountRequested = amountRequested;
        if(this.amountRequested < 50000)
        {
            Date currentDate = new Date();
            this.contractActivationDate = currentDate.toString();
            this.contractApproved = true;
        }
        else
        {
            this.contractActivationDate = "";
            this.contractApproved = false;
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
    public float getAmountRequested() {
        return amountRequested;
    }

    public boolean isContractApproved() {
        return contractApproved;
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
