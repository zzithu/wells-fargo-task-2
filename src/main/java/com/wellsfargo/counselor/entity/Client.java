package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;

public class Client {


    private long ClientId;
    private long advisorId;
    
    //Valid reason to not allow null, so copying
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email; 

    //Basic Constructors    
    protected Client() {

    }

    public Client(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /*
     * The way the structure is setup leads me to understand there are two things possible to do
     *
     * :First create the portfolio and just leave it as a instance variable
     * :Second, store only the portfolioID in the case for using it in a database
     * aka key searches
     * 
     */

    //private Portfolio clientPortfolio = new Portfolio( 1, 99999999 );
    
    //In this case we get to do things like clientPortfolio.getElement(number), or clientPortfolio.getCreationDate();


    //Or
    private long ClientPortfolioID = 3134; //Some long key for lookups later :p
    //which requires calls I am more unfamiliar with :(

}
