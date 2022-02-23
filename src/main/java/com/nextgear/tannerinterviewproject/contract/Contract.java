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
    @Column(name = "contract_id", nullable = false, updatable = false)
    private Long contractId;
    @Column(name = "name") 
    private String name;
    @Column(name = "business_number") 
    private int businessNumber;
    @Column(name = "amount_requested")
    private float amountRequested;
    @Column(name = "contract_approved")
    private boolean contractApproved;
    @Column(name = "contract_activation_date")
    private Date contractActivationDate;

    public Contract() 
    {
        this.name = "Place Holder";
        this.businessNumber = 0;
        this.amountRequested = 0;
        this.contractApproved = false;
    }

    public Contract(String enteredName, int enteredBusinessNumber, Float enteredAmountRequested)
    {
        this.name = enteredName;
        this.businessNumber = enteredBusinessNumber;
        this.amountRequested = enteredAmountRequested;
        System.out.println(enteredAmountRequested);

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
    public float getAmountRequested() 
    {
        return amountRequested;
    }

    public boolean isContractApproved() 
    {
        return contractApproved;
    }

    public Date getContractActivationDate() 
    {
        return contractActivationDate;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setBusinessNumber(int businessNumber) 
    {
        this.businessNumber = businessNumber;
    }

    public void setAmountRequested(int amountRequested) 
    {
        this.amountRequested = amountRequested;
    }

    public void setApproved(Boolean approved)
    {
        this.contractApproved = approved;
    }
}
