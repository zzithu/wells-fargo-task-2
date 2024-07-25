package com.wellsfargo.counselor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Portfolio {
    private long portfolioID;
    private Date creationDate;
    private List<Security> securities;

    // Constructor
    public Portfolio() {
        //We can make some sort of generation formula for later :p
        //Either make key creation unique or have one general (Wouldn't work unless all same type)
        this.portfolioID = CreateKey();
        
        this.creationDate = new Date();
        //adaptive amount of securities
        this.securities = new ArrayList<>();
    }

    // Methods to manage securities
    public void addSecurity(Security security) {
        securities.add(security);
    }

    //since porfolio is a seperate class, youre not directly dealing with the array list
    public Security getSecurity(int index) {
        return securities.get(index);
    }
    public Security removeSecurity(int index) {
        return securities.remove(index);
    }

    public Date getCreationDate() {
        return creationDate;
    }

    
    @Override
    public String toString() {
        return "Portfolio{key='" + portfolioID + "', creationDate=" + creationDate + ", securities=" + securities + "}";
    }

    //Temporary
    private long CreateKey() {
        //insert
        return 1;
    }
}

