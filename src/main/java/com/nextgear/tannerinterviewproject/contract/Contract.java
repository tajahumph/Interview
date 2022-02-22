package com.nextgear.tannerinterviewproject.contract;

import java.util.UUID;
import java.util.Date;

public class Contract 
{
    private final UUID contractId;
    private String name;


    private int businessNumber;
    private int amountRequested;
    private final boolean acceptDeny;
    private final String contractActivationDate;

    public Contract() 
    {
        this.contractId = UUID.randomUUID();
        this.name = "Place Holder";
        this.businessNumber = 0;
        this.amountRequested = 0;
        this.acceptDeny = false;
        this.contractActivationDate = "";
    }

    public Contract(String name, int businessNumber, int amountRequested)
    {
        this.contractId = UUID.randomUUID();
        this.name = name;
        this.businessNumber = businessNumber;
        this.amountRequested = amountRequested;
        if(amountRequested < 50000)
        {
            Date currentDate = new Date();
            this.contractActivationDate = currentDate.toString();
            this.acceptDeny = true;
        }
        else
        {
            this.contractActivationDate = "";
            this.acceptDeny = false;
        }

    }

    public Contract(UUID contractId, String name, int businessNumber, int amountRequested)
    {
        this.contractId = contractId;
        this.name = name;
        this.businessNumber = businessNumber;
        this.amountRequested = amountRequested;
        if(amountRequested < 50000)
        {
            Date currentDate = new Date();
            this.contractActivationDate = currentDate.toString();
            this.acceptDeny = true;
        }
        else
        {
            this.contractActivationDate = "";
            this.acceptDeny = false;
        }
    }

    public UUID getContractId()
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

    public boolean isAcceptDeny() {
        return acceptDeny;
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
