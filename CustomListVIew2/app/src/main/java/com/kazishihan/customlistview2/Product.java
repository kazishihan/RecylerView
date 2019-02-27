package com.kazishihan.customlistview2;


public class Product {

    private String name;
    private String details;
    private String prise;


    public Product()
    {

    }

    public Product(String name, String details, String prise) {
        this.name = name;
        this.details = details;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public String getPrise() {
        return prise;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setPrise(String prise) {
        this.prise = prise;
    }
}
