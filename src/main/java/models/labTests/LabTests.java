package models.labTests;

import org.apache.commons.csv.CSVRecord;

import java.util.HashMap;

public class LabTests {
    private String idNum;
    private int idType;
    private String firstName;
    private String lastName;
    private String resultDate;
    private String birthDate;
    private String labCode;
    private String stickerNumber;
    private int resultTestCorona;
    private String variant;
    private String testType;
    private HashMap<String, Object> properties = new HashMap<>();

    public LabTests(String idNum, int idType, String firstName, String lastName, String resultDate, String birthDate, String labCode,
                    String stickerNumber, int resultTestCorona, String variant, String testType){
        this.idNum = idNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.resultDate = resultDate;
        this.birthDate = birthDate;
        this.labCode = labCode;
        this.stickerNumber = stickerNumber;
        this.resultTestCorona = resultTestCorona;
        this.variant = variant;
        this.testType = testType;
    }

    public LabTests(HashMap<String, Object> properties) {
        this.properties = properties;
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

    public String getResultDate() {
        return resultDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getLabCode() {
        return labCode;
    }

    public String getStickerNumber() {
        return stickerNumber;
    }

    public int getResultTestCorona() {
        return resultTestCorona;
    }

    public String getVariant() {
        return variant;
    }

    public String getTestType() {
        return testType;
    }

    public Object getProperty(String key) {
        return this.properties.getOrDefault(key, null);
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

    public void setResultDate(String resultDate) {
        this.resultDate = resultDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }

    public void setStickerNumber(String stickerNumber) {
        this.stickerNumber = stickerNumber;
    }

    public void setResultTestCorona(int resultTestCorona) {
        this.resultTestCorona = resultTestCorona;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public Object setProperty(String key, Object value) {
        return this.properties.put(key, value);
    }
}
