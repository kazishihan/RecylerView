package com.kazishihan.dclean;
public class AddCleaner {

    String id;
    String binNumber;
    String cleanerName;
    String binLocation;
    String cleanerNumber;

    public AddCleaner()
    {

    }

    public AddCleaner(String id, String binNumber, String cleanerName, String binLocation, String cleanerNumber) {
        this.id=id;
        this.binNumber = binNumber;
        this.cleanerName = cleanerName;
        this.binLocation = binLocation;
        this.cleanerNumber = cleanerNumber;

    }

    public String getId() {
        return id;
    }

    public String getBinNumber() {
        return binNumber;
    }

    public String getCleanerName() {
        return cleanerName;
    }

    public String getBinLocation() {
        return binLocation;
    }

    public String getCleanerNumber() {
        return cleanerNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    public void setCleanerName(String cleanerName) {
        this.cleanerName = cleanerName;
    }

    public void setBinLocation(String binLocation) {
        this.binLocation = binLocation;
    }

    public void setCleanerNumber(String cleanerNumber) {
        this.cleanerNumber = cleanerNumber;
    }
}
