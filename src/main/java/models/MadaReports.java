package models;

public class MadaReports {
    private String mdaCode;
    private String idNum;
    private int idType;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private int buildingNumber;
    private String barCode;
    private String getDate;
    private String takeDate;
    private String resultDate;

    public String getMdaCode() {
        return mdaCode;
    }

    public String getIdNum() {
        return idNum;
    }

    public int getIdType() {
        return idType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public String getBarCode() {
        return barCode;
    }

    public String getGetDate() {
        return getDate;
    }

    public String getTakeDate() {
        return takeDate;
    }

    public String getResultDate() {
        return resultDate;
    }

    public void setMdaCode(String mdaCode) {
        this.mdaCode = mdaCode;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
    }

    public void setTakeDate(String takeDate) {
        this.takeDate = takeDate;
    }

    public void setResultDate(String resultDate) {
        this.resultDate = resultDate;
    }
}
