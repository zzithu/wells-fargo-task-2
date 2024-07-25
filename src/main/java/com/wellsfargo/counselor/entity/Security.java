package com.wellsfargo.counselor.entity;

import java.sql.Date;

public class Security {
    
    //Need portfolio ID for a database, otherwise not really important
    private long securityID;
    private long portfolioID;

    //Other information
    private String name;
    private String category;

    //don't need too much precision
    private float purchasePrice;
    private Date purchaseDate;

    //assume whole number
    private int quantity;

   
    //Its not that weird to assume you have a portfolioid if youre adding to a specific instance, otherwise
    //the other method allows for easy local testing.
    public Security(long portfolioID, String name, String category, float purchasePrice, Date purchaseDate, int quantity){
        this.securityID = createID();
        this.portfolioID = portfolioID;

        this.name = name;
        this.category = category;
        //I assume you have this, or some machine inputting has this
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        //I have no protections from nulls 0)_(0
        this.quantity = quantity;
    }


    //getters and setters
    public long getSecurityID()
    {
        return securityID;
    }

    public long getportfolioID()
    {
        return portfolioID;
    }
    
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }


    private long createID() {
        //insert id creation method
        return 1;
    }
}
